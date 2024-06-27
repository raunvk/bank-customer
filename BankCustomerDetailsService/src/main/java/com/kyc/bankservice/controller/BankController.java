package com.kyc.bankservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kyc.bankservice.entity.Customer;
import com.kyc.bankservice.service.BankService;

@RestController
@RequestMapping("/customerdetails")
public class BankController {
	
	@Autowired
	BankService service;
	
	@PostMapping("/add")
	public ResponseEntity<String> addCustomer(@RequestBody Customer customer){
		int accNo = service.addCustomer(customer);
		return new ResponseEntity<String>("Customer Successfully Added with Account No. " + accNo, HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Customer>> findAllCustomers(){
		List<Customer> customer = service.findAllCustomers();
		return new ResponseEntity<List<Customer>>(customer, HttpStatus.OK);
	}
	
	@GetMapping("/find/{accNo}")
	public ResponseEntity<Optional<Customer>> findCustomerByAccNo(@PathVariable int accNo){
		Optional<Customer> customer = service.findCustomerByAccNo(accNo);
		return new ResponseEntity<Optional<Customer>>(customer, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{accNo}")
	public ResponseEntity<String> deleteCustomerByAccNo(@PathVariable int accNo){
		service.delCustomerByAccNo(accNo);
		return new ResponseEntity<String>("Customer has been Successfully Deleted", HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/all")
	public ResponseEntity<String> deleteAllCustomers(){
		service.delAllCustomers();
		return new ResponseEntity<String>("All Customer Details have been Successfully Deleted", HttpStatus.OK);
	}
	
	@GetMapping("/kyc/{accNo}/{aadharNo}")
	public ResponseEntity<String> knowYourCustomer(@PathVariable int accNo, @PathVariable String aadharNo){
		service.knowYourCustomer(accNo, aadharNo);
		return new ResponseEntity<String>("KYC Successfully Verified", HttpStatus.OK);
	}
	
	@GetMapping("/panvalidate/{accNo}/{panNo}")
	public ResponseEntity<String> validatePanCard(@PathVariable int accNo, @PathVariable String panNo){
		service.validatePanCard(accNo, panNo);
		return new ResponseEntity<String>("PAN Successfully Validated", HttpStatus.OK);
	}
}
	