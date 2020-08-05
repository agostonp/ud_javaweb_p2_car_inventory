package com.udacity.pricing.domain.price;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.concurrent.ThreadLocalRandom;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Implements the pricing service to get prices for each vehicle.
 */
@Component
public class PriceGenerator {
	private static final Logger log = LoggerFactory.getLogger(PriceGenerator.class); 
    private final PriceRepository priceRepository;

    public PriceGenerator(PriceRepository priceRepository) {
        this.priceRepository = priceRepository;
    }

    @PostConstruct
    public void generateRandomPrices() {
        log.info("##### PriceGenerator bean created");
        for(Long i=1L; i<=20L; i++) {
            Price price = new Price("USD", randomPrice(), i);
            priceRepository.save(price);
            log.info("##### Random price added to database:" + price);
        }
    }

    /**
     * Gets a random price to fill in for a given vehicle ID.
     * @return random price for a vehicle
     */
    private BigDecimal randomPrice() {
        return new BigDecimal(ThreadLocalRandom.current().nextDouble(1, 5))
                .multiply(new BigDecimal(5000d)).setScale(2, RoundingMode.HALF_UP);
    }

}
