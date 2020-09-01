package org.openmrs.module.amrsovc.api.impl;

import org.openmrs.module.amrsovc.api.PatientRelationsService;
import org.openmrs.module.amrsovc.api.dao.PatientRelationsDao;
import org.openmrs.module.amrsovc.models.PatientRelations;
import java.util.List;

public class PatientRelationsServiceImpl implements PatientRelationsService {
	
	private PatientRelationsDao patientRelationsDao;
	
	public void setPatientRelationsDao(PatientRelationsDao patientRelationsDao) {
		this.patientRelationsDao = patientRelationsDao;
	}
	
	@Override
	public List<PatientRelations> getAllRelationships() {
		return patientRelationsDao.getAllRelationships();
	}
}
