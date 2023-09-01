package com.rooba.vehicleapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rooba.vehicleapp.model.Charges;

public interface ChargesRepository extends JpaRepository<Charges, Integer> {

}
