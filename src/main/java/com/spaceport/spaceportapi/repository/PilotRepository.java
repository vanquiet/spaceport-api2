package com.spaceport.spaceportapi.repository;

import com.spaceport.spaceportapi.model.Pilot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PilotRepository extends JpaRepository<Pilot, Integer> {
}
