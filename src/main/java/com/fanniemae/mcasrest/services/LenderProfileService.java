package com.fanniemae.mcasrest.services;

import com.fanniemae.mcasrest.domain.LenderProfile;

import java.util.List;

public interface LenderProfileService {
	LenderProfile findLenderProfileById(Long id);
	LenderProfile findLenderProfileByUnid(String unid);
	List<LenderProfile> findAllLenderProfiles();
}
