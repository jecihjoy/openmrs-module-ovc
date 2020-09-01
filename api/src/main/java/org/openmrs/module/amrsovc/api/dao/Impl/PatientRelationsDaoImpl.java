package org.openmrs.module.amrsovc.api.dao.Impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.openmrs.Patient;
import org.openmrs.api.context.Context;
import org.openmrs.module.amrsovc.api.dao.PatientRelationsDao;
import org.openmrs.module.amrsovc.models.PatientRelations;

import java.util.ArrayList;
import java.util.List;

public class PatientRelationsDaoImpl implements PatientRelationsDao {
	
	Log log = LogFactory.getLog(PatientRelationsDaoImpl.class);
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	@Override
	public List<PatientRelations> getAllRelationships() {
		List<PatientRelations> patientRelations = new ArrayList<>();
		PatientRelations relations = new PatientRelations();
		Patient patient = Context.getPatientService().getPatientByUuid("5b741d20-1359-11df-a1f1-0026b9348838");
		relations.setPatient_id(patient);
		relations.setRelation_id(1);
		relations.setRelationType("Father");
		patientRelations.add(relations);
		return patientRelations;
	}
}
