package com.ies.co.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "CO_PDFS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CoPdfs {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "CO_PDF_ID")
	private Integer id;
	@Column(name = "PLAN_STATUS")
	private String planStatus;
	@Column(name = "CASE_NUMBER")
	private String caseNumber;
	@Column(name = "PDF_DOCUMENT")
	@Lob
	private Byte[] pdfDocument;
	@Column(name = "PLAN_NAME")
	private String planName;
	
}
