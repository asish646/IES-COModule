package com.ies.co.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ies.co.entity.BatchRunDetails;

public interface BatchRunDetailsRepository extends JpaRepository<BatchRunDetails, Serializable>{

}
