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
@Table(name = "BATCH_RUN_DTLS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BatchRunDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "BATCH_RUN_SEQ")
	private Integer batchRunSequence;
	@Column(name = "BATCH_NAME")
	private String batchName;
	@Column(name = "BATCH_RUN_STATUS")
	private String batchRunStatus;
	@Column(name = "START_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date startDate;
	@Column(name = "END_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date endDate;
	@Column(name = "INSTANCE_NUM")
	private Integer instanceNumber;
	
}
