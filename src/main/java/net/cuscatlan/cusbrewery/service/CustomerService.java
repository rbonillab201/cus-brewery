package net.cuscatlan.cusbrewery.service;

import java.util.UUID;

import net.cuscatlan.cusbrewery.web.model.CustomerDTO;

/**
 * @author Renato Oswaldo Bonilla (rBonilla) el día 16 ago. 2022
 *
 */

public interface CustomerService {
	
	CustomerDTO getCustomerById(UUID customerId);
	CustomerDTO savedCustomer(CustomerDTO customerDTO);
	void updateCustomerById(CustomerDTO customerDTO, UUID customerId);
	void deleteCutomerById(UUID customerId);

}
