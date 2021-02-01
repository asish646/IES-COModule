package com.ies.co.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ies.co.entity.BatchSummery;

public interface BatchSummeryRepository extends JpaRepository<BatchSummery, Serializable> {

}
