package net.cuscatlan.cusbrewery.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import net.cuscatlan.cusbrewery.web.model.CustomerDTO;

/**
 * @author Renato Oswaldo Bonilla (rBonilla) el día 16 ago. 2022
 *
 */
@Service
public class CustomerServiceImpl implements CustomerService {

	@Override
	public CustomerDTO getCustomerById(UUID customerId) {
		// TODO Auto-generated method stub
		return CustomerDTO.builder()
				.customerId(UUID.randomUUID())
				.name("Renato O. Bonilla")
				.build();
	}

}
