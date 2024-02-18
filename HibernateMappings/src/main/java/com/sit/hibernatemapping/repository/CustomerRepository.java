package com.sit.hibernatemapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event.ID;

import com.sit.hibernatemapping.enetity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
