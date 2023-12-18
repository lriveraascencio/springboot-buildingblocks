package com.stacksimplify.restservices.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stacksimplify.restservices.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{
	Optional<Order> findByOrderid(Long orderid);
}
