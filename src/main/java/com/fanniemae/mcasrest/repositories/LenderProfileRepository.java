package com.fanniemae.mcasrest.repositories;

import com.fanniemae.mcasrest.domain.LenderProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LenderProfileRepository extends JpaRepository<LenderProfile, Long> {

	LenderProfile findByUnid(String unid);
}
