package com.kyc.panservice.service;

import java.util.List;
import java.util.Optional;

import com.kyc.panservice.entity.Pan;

public interface PanService {
	
	String addPan(Pan pan);
	List<Pan> findAllPan();
	void delPanByPanNo(Pan pan);
	void delPanByPanNo2(String panNo);
	void delAllPan();
	Pan findPanByPanNo(String panNo);
	Optional<Pan> findPanByPanNo2(String panNo);
}
