package com.fanniemae.mcasrest.repositories;

import com.fanniemae.mcasrest.domain.Master;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MasterRepository extends JpaRepository<Master, Long> {

	Master findByUnid(String unid);
}
