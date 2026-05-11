package com.foodtruck.api.repository;

import com.foodtruck.api.model.PerformanceFinanceira;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerformanceRepository extends JpaRepository<PerformanceFinanceira, Long> {
}
