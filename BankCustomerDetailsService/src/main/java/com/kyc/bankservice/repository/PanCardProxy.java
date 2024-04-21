package com.kyc.bankservice.repository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.kyc.bankservice.dto.Pan;
import org.springframework.cloud.openfeign.FeignClient;


//@FeignClient(name="pan-card-service", url="http://localhost:8854/pan/pandetails")
@FeignClient("pan-card-service")
public interface PanCardProxy {
	@GetMapping("/pan/pandetails/find/{panNo}")
	Pan findPanByPanNo(@PathVariable String panNo);
}
