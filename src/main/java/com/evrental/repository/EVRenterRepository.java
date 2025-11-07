package com.evrental.repository;

import com.evrental.model.EVRenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EVRenterRepository extends JpaRepository<EVRenter, Long> {
}
