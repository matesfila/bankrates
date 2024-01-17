package com.tatrabanka.zadanie.matusfila.bankrates.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.math.BigDecimal;

/**
 * matus 1/15/2024 12:32 AM
 */
@Entity(name = "rate")
public class Rate {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, length = 3)
    private String currency1;

    @Column(nullable = false, length = 3)
    private String currency2;

    @Column(precision = 32, scale=5)
    private BigDecimal exchangeRate;

    public Rate() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCurrency1() {
        return currency1;
    }

    public void setCurrency1(String currency1) {
        this.currency1 = currency1;
    }

    public String getCurrency2() {
        return currency2;
    }

    public void setCurrency2(String currency2) {
        this.currency2 = currency2;
    }

    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
}