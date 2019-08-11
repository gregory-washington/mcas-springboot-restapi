package com.fanniemae.mcasrest.services;

import com.fanniemae.mcasrest.domain.LenderProfile;
import com.fanniemae.mcasrest.repositories.LenderProfileRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LenderProfileServiceImpl implements LenderProfileService {
	private final LenderProfileRepository lenderProfileRepository;

	public LenderProfileServiceImpl(LenderProfileRepository lenderProfileRepository) {
		this.lenderProfileRepository = lenderProfileRepository;
	}

	@Override
	public LenderProfile findLenderProfileById(Long id) {
		return lenderProfileRepository.findById(id).get();
	}

	@Override
	public LenderProfile findLenderProfileByUnid(String unid) {
		return lenderProfileRepository.findByUnid(unid);
	}

	@Override
	public List<LenderProfile> findAllLenderProfiles() {

		return lenderProfileRepository.findAll();
	}
}
