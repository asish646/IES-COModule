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
@Table(name = "eligibility_details")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EligibilityDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "ed_trace_id")
	private Integer traceId;
	@Column(name = "benefit_amt")
	private String benefitAmount;
	@Column(name = "case_num")
	private Integer caseNumber;
	@Column(name = "create_dt")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;
	@Column(name = "update_dt")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDate;
	@Column(name = "plan_start_dt")
	private String planStartDate;
	@Column(name = "plan_end_dt")
	private String planEndDate;
	@Column(name = "denial_reason")
	private String denialReason;
	@Column(name = "plan_name")
	private String planName;
	@Column(name = "plan_status")
	private String planStatus;
	
}
