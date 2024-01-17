package com.tatrabanka.zadanie.matusfila.bankrates;

import com.tatrabanka.zadanie.matusfila.bankrates.controllers.RatesRestController;
import com.tatrabanka.zadanie.matusfila.bankrates.models.Rate;
import com.tatrabanka.zadanie.matusfila.bankrates.services.RateService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class BankratesApplicationTests {

	@Autowired
	private RateService ratesService;

	@Autowired
	private RatesRestController restService;

	@Test
	public void allRatesExists() {
		List<Rate> rates = ratesService.list();
		Assertions.assertEquals(30, rates.size());
	}

	@Test
	public void testRateValues() {
		BigDecimal rate = ratesService.getRate("EUR", "USD");
		Assertions.assertEquals(new BigDecimal("1.09"), rate.round(new MathContext(3)));

		rate = ratesService.getRate("EUR", "CZK");
		Assertions.assertEquals(new BigDecimal("24.714"), rate.round(new MathContext(5)));
	}

	@Test
	public void testFindRate() {
		BigDecimal rate = ratesService.getRate("EUR", "USD");
		Assertions.assertEquals(new BigDecimal("1.09"), rate.round(new MathContext(3)));

		rate = ratesService.getRate("EUR", "CZK");
		Assertions.assertEquals(new BigDecimal("24.714"), rate.round(new MathContext(5)));
	}

	@Test
	public void testComputeRate() {
		BigDecimal value = restService.computeRate("EUR", "USD", 10);
		Assertions.assertEquals(new BigDecimal("10.94500"), value);

		value = restService.computeRate("EUR", "IDR", 10);
		Assertions.assertEquals(new BigDecimal("170316.20000"), value);

		value = restService.computeRate("EUR", "ZAR", 10);
		Assertions.assertEquals(new BigDecimal("204.31000"), value);
	}
}
