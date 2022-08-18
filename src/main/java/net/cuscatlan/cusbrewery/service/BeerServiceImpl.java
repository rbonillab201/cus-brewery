package net.cuscatlan.cusbrewery.service;

import java.util.UUID;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import net.cuscatlan.cusbrewery.web.model.BeerDTO;

@Slf4j
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

	@Override
	public BeerDTO saveBeer(BeerDTO beerDTO) {
		// TODO Auto-generated method stub
		return BeerDTO.builder()
				.beerId(UUID.randomUUID())
				.build();
	}

	@Override
	public void updateBeer(BeerDTO beerDTO, UUID beerId ) {
		// TODO hay que completarlo, llegado el momento
		
	}

	@Override
	public void deleteBeer(UUID beerId) {
		// TODO Auto-generated method stub
		log.debug("Se ha borrado el registro " + beerId.toString());
	}

}
