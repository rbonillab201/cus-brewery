package net.cuscatlan.cusbrewery.web.controller;

import java.util.UUID;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import net.cuscatlan.cusbrewery.service.BeerService;
import net.cuscatlan.cusbrewery.web.model.BeerDTO;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

	private final BeerService beerService;
	

	public BeerController(BeerService beerService) {
		this.beerService = beerService;
	}


	@GetMapping("/{beerId}")
	public ResponseEntity<BeerDTO> getBeer(@PathVariable("beerId") UUID beerId ){
		
		return new ResponseEntity<>(beerService.getBeerById(beerId),HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity saveBeer(BeerDTO beerDTO) {
		
		BeerDTO savedBeer = beerService.saveBeer(beerDTO);
		HttpHeaders headers = new HttpHeaders(); 
		headers.add("Ubicación", savedBeer.getBeerId().toString());		
		return new ResponseEntity("/api/v1/beer" + headers,HttpStatus.CREATED);
	}
	
	
	
	
}
