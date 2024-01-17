package com.tatrabanka.zadanie.matusfila.bankrates.services;

import com.tatrabanka.zadanie.matusfila.bankrates.models.Rate;
import com.tatrabanka.zadanie.matusfila.bankrates.repositories.RateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * matus 1/15/2024 12:38 AM
 */
@Service
public class RateService {

    @Autowired
    private RateRepository rateRepository;

    public List<Rate> list() {
        return rateRepository.findAll();
    }

    public BigDecimal getRate(String currencyFrom, String currencyTo) {
        return rateRepository.findRate(currencyFrom, currencyTo);
    }
}