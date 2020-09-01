package org.openmrs.module.amrsovc.api.dao;

import org.openmrs.module.amrsovc.models.PatientRelations;

import java.util.List;

public interface PatientRelationsDao {
	
	List<PatientRelations> getAllRelationships();
}
