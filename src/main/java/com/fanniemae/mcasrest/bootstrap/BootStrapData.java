package com.fanniemae.mcasrest.bootstrap;

import com.fanniemae.mcasrest.domain.LenderProfile;
import com.fanniemae.mcasrest.repositories.LenderProfileRepository;
import com.fanniemae.mcasrest.utilities.Utils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Date;
import java.util.Calendar;

@Component
public class BootStrapData implements CommandLineRunner {
	private final LenderProfileRepository lenderProfileRepository;

	public BootStrapData(LenderProfileRepository lenderProfileRepository) {
		this.lenderProfileRepository = lenderProfileRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Loading Lender Profile Data....");


		String filename = "C:\\Temp\\generateXML\\CSV\\LenderProfiles3.csv";
		String cvsSplitBy = ",";
		BufferedReader br;
		String dataLine;
		int iteration = 0;
		br = new BufferedReader(new FileReader(filename));
		while ((dataLine = br.readLine()) != null) {
			if (iteration == 0) {
				// Skip header row
				iteration++;
				continue;
			}
			// use comma as separator
			String[] dataArray = dataLine.split(cvsSplitBy);
			LenderProfile lp = new LenderProfile();
			lp.setUnid(dataArray[0]);
			lp.setLender_number(dataArray[1]);
			lp.setLender_name(dataArray[2]);
			lp.setLp_name(dataArray[3]);
			lp.setLp_lastname(dataArray[4]);
			lp.setLp_prefix(dataArray[5]);
			lp.setLp_title(dataArray[6]);
			lp.setLp_address(dataArray[7]);
			lp.setLp_address2(dataArray[8]);
			lp.setLp_city(dataArray[9]);
			lp.setLp_state(dataArray[10]);
			lp.setLp_zip(dataArray[11]);
			lp.setLp_phone(dataArray[12]);
			lp.setLp_fax(dataArray[13]);
			lp.setLp_region(dataArray[14]);
			lp.setAuthor(dataArray[15]);
			//lp.setLp_cam({dataArray[16]});
			lp.setCreation_date(Utils.stringToDate(dataArray[17], "MM/dd/yyyy"));
			lp.setModdate(Utils.stringToDate(dataArray[18], "MM/dd/yyyy"));
			lp.setLp_status_seller(dataArray[19]);
			lp.setTeam_codes(dataArray[20]);
			lenderProfileRepository.save(lp);
			iteration++;

		}
		System.out.println(iteration + " Lender Profiles loaded...");

	}
}
