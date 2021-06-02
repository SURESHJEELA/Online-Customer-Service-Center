package com.cg.ocsc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.ocsc.entities.Issues;

@Repository
public interface IssuesDao  extends JpaRepository<Issues, Integer> {
	
}
