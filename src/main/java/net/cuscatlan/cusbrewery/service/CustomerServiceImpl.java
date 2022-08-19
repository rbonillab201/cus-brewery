package net.cuscatlan.cusbrewery.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import net.cuscatlan.cusbrewery.web.model.CustomerDTO;

/**
 * @author Renato Oswaldo Bonilla (rBonilla) el día 16 ago. 2022
 *
 */
@Slf4j
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

	@Override
	public CustomerDTO savedCustomer(CustomerDTO customerDTO) {
		// TODO Auto-generated method stub
		return CustomerDTO.builder()
				.customerId(UUID.randomUUID())
				.build();
	}

	@Override
	public void updateCustomerById(CustomerDTO customerDTO, UUID customerId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCutomerById(UUID customerId) {
		// TODO Auto-generated method stub
		log.debug("Se ha borrado el cliente.." + customerId);
	}

}
