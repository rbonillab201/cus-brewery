package net.cuscatlan.cusbrewery.service;

import java.util.UUID;

import net.cuscatlan.cusbrewery.web.model.BeerDTO;

public interface BeerService {

	BeerDTO getBeerById(UUID beerId);
	
}
