package org.openmrs.module.amrsovc.api;

import org.openmrs.module.amrsovc.models.PatientRelations;

import java.util.List;

public interface PatientRelationsService {
	
	List<PatientRelations> getAllRelationships();
}
