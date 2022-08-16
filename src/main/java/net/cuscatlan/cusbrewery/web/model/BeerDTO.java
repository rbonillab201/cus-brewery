package net.cuscatlan.cusbrewery.web.model;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BeerDTO {
	
	private UUID beerId;
	private String beerName;
	private String beerType;
	private Long upc;

}
