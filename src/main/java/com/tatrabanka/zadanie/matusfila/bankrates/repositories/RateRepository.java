package com.tatrabanka.zadanie.matusfila.bankrates.repositories;

import com.tatrabanka.zadanie.matusfila.bankrates.models.Rate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

/**
 * matus 1/15/2024 12:37 AM
 */
@Repository
public interface RateRepository extends JpaRepository<Rate, Long> {

    @Query("select r.exchangeRate from rate r where r.currency1 = :currencyFrom and r.currency2 = :currencyTo")
    public BigDecimal findRate(@Param("currencyFrom") String currencyFrom, @Param("currencyTo") String currencyTo);

}
