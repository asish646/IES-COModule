package com.ies.co.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "BATCH_SUMMARY")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BatchSummery {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "SUMMARY_ID")
	private Integer id;
	@Column(name = "BATCH_NAME")
	private String batchName;
	@Column(name = "FAILURE_TRIGGER_COUNT")
	private Integer failureTriggerCount;
	@Column(name = "SUCCESS_TRIGGER_COUNT")
	private Integer successTriggerCount;
	@Column(name = "TOTAL_TRIGGER_PROCESSED")
	private Integer totalTriggerProcessed;
}
