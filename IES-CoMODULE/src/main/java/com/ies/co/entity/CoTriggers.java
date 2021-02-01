package com.ies.co.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "co_triggers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CoTriggers {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "trg_id")
	private Integer id;
	@Column(name = "case_num")
	private Integer caseNumber;
	@Column(name = "create_dt")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;
	@Column(name = "update_dt")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDate;
	@Column(name = "trg_status")
	private String triggerStatus;
}
