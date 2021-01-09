package com.udacity.PricingMicroservice.repository;

import com.udacity.PricingMicroservice.entity.Price;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//@Repository
//@EnableJpaRepositories
public interface PriceRepository extends CrudRepository<Price, Long> {
    Price findByVehicleId(long vehicleId);
}
