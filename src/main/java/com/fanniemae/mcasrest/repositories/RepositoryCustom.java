package com.fanniemae.mcasrest.repositories;

import com.fanniemae.mcasrest.domain.LenderProfile;

public interface RepositoryCustom<T> {
	 T findByUnid(String unid);
}
