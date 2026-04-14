package com.livestock.repository;

import com.livestock.model.Livestock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivestockRepository extends JpaRepository<Livestock, Long> {
}
