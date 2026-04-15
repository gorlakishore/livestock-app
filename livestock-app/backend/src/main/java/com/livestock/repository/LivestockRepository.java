package com.livestock.repository;

import com.livestock.model.Livestock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivestockRepository extends JpaRepository<Livestock, Long> {
}
