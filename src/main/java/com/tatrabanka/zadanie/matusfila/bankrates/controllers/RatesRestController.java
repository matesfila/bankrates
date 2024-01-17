package com.tatrabanka.zadanie.matusfila.bankrates.controllers;

import com.tatrabanka.zadanie.matusfila.bankrates.models.Rate;
import com.tatrabanka.zadanie.matusfila.bankrates.services.RateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

/**
 * matus 1/11/2024 7:14 PM
 */
@RestController
public class RatesRestController {

    @Autowired
    RateService ratesService;

    @GetMapping("/getRates")
    public List<Rate> getRates() {
        return ratesService.list();
    }

    @GetMapping("/computeRate")
    public BigDecimal computeRate(String currencyFrom, String currencyTo, float value) {
        return ratesService.getRate(currencyFrom, currencyTo).multiply(new BigDecimal(value));
    }



}
