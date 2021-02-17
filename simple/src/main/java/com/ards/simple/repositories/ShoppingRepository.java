package com.ards.simple.repositories;

import com.ards.simple.entities.Shopping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingRepository extends JpaRepository<Shopping, String> {
}
