package net.cuscatlan.cusbrewery.web.controller;

import java.util.UUID;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
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
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@PostMapping
	public ResponseEntity saveCustomer(@RequestBody CustomerDTO customerDTO){
		
		CustomerDTO customerSaved = customerService.savedCustomer(customerDTO);
		HttpHeaders headers = new HttpHeaders();
		headers.add("Ubicación", customerSaved.getCustomerId().toString());
		return new ResponseEntity("/api/v1/customer" + headers, HttpStatus.CREATED);
		
	}
	
	@SuppressWarnings({ "rawtypes"})
	@PutMapping("/{customerId}")
	public ResponseEntity updateCustomer(@RequestBody CustomerDTO customerDTO, @PathVariable("customerId") UUID customerId) {
		customerService.updateCustomerById(customerDTO, customerId);
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}
	
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	@DeleteMapping("/{customerId}")
	void deleteCustomer(@PathVariable("customerId") UUID customerId) {
		customerService.deleteCutomerById(customerId);
		
	}

}
