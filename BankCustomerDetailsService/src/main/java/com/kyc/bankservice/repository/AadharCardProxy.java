package com.kyc.bankservice.repository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.kyc.bankservice.dto.Aadhar;
import org.springframework.cloud.openfeign.FeignClient;


//@FeignClient(name="aadhar-card-service", url="http://localhost:8856/aadhar/aadhardetails")
@FeignClient("aadhar-card-service")
public interface AadharCardProxy {
	@GetMapping("/aadhar/aadhardetails/find/{aadharNo}")
	Aadhar findAadharByAadharNo(@PathVariable String aadharNo);
}
