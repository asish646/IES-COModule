package com.ies.co.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ies.co.entity.EligibilityDetails;

public interface EligibilityDetailsRepository extends JpaRepository<EligibilityDetails, Serializable>{

}
