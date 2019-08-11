package com.fanniemae.mcasrest.controllers;

import com.fanniemae.mcasrest.domain.LenderProfile;
import com.fanniemae.mcasrest.services.LenderProfileService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(LenderProfileController.BASE_URL)
public class LenderProfileController {
	public static final String BASE_URL = "/api/v1/lenderprofiles";
	private final LenderProfileService lenderProfileService;

	public LenderProfileController(LenderProfileService lenderProfileService) {
		this.lenderProfileService = lenderProfileService;
	}

	@GetMapping
	List<LenderProfile> getAllLenderProfiles() {
		System.out.println("Running getAllLenderProfiles");
		return lenderProfileService.findAllLenderProfiles();
	}

	@GetMapping("/id/{id}")
	LenderProfile getLenderProfilebyId(@PathVariable Long id) {
		System.out.println("Running getLenderProfilebyId");
		return lenderProfileService.findLenderProfileById(id);
	}

	@GetMapping("/unid/{unid}")
	LenderProfile getLenderProfilebyUnid(@PathVariable String unid) {
		System.out.println("Running getLenderProfilebyUnid");
		return lenderProfileService.findLenderProfileByUnid(unid);
	}
}
