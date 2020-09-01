package org.openmrs.module.amrsovc.models;

import org.openmrs.BaseOpenmrsData;
import org.openmrs.Patient;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "patient_relations")
public class PatientRelations extends BaseOpenmrsData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "todo_id")
	private Integer relation_id;
	
	@Basic
	@Column(name = "relation_type")
	private String relationType;
	
	@ManyToOne
	@JoinColumn(name = "patient_id")
	private Patient patient_id;
	
	public PatientRelations() {
		
	}
	
	public PatientRelations(Integer relation_id, String relatioType, Patient patient_id) {
		this.relation_id = relation_id;
		this.relationType = relatioType;
		this.patient_id = patient_id;
	}
	
	@Override
	public Integer getId() {
		return getRelation_id();
	}
	
	@Override
	public void setId(Integer id) {
		setRelation_id(id);
	}
	
	public Integer getRelation_id() {
		return relation_id;
	}
	
	public void setRelation_id(Integer relation_id) {
		this.relation_id = relation_id;
	}
	
	public String getRelationType() {
		return relationType;
	}
	
	public void setRelationType(String relationType) {
		this.relationType = relationType;
	}
	
	public Patient getPatient_id() {
		return patient_id;
	}
	
	public void setPatient_id(Patient patient_id) {
		this.patient_id = patient_id;
	}
}
