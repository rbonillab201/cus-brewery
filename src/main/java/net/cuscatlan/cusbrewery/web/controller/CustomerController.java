package net.cuscatlan.cusbrewery.web.controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.cuscatlan.cusbrewery.service.CustomerService;
import net.cuscatlan.cusbrewery.web.model.CustomerDTO;

/**
 * @author Renato Oswaldo Bonilla (rBonilla) el día 16 ago. 2022
 *
 */

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {
	
	private final CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	@GetMapping("/{customerId}")
	public ResponseEntity<CustomerDTO> getCustomer(@PathVariable("") UUID customerId){
		
		return new ResponseEntity<>(customerService.getCustomerById(customerId),HttpStatus.OK);
		
	}

}
