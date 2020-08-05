package com.udacity.pricing.domain.price;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Represents the price of a given vehicle, including currency.
 */
@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class Price {
    private String currency;
    private BigDecimal price;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long vehicleId;
}
