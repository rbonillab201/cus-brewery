package net.cuscatlan.cusbrewery.service;

import java.util.UUID;
import org.springframework.stereotype.Service;
import net.cuscatlan.cusbrewery.web.model.BeerDTO;

@Service
public class BeerServiceImpl implements BeerService {

	@Override
	public BeerDTO getBeerById(UUID beerId) {
		// TODO Auto-generated method stub
		return BeerDTO.builder()
				.beerId(UUID.randomUUID())
				.beerName("Suprema")
				.beerType("Pilsen")
				.build();
	}

}
