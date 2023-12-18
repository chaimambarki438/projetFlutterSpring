package org.isetn.entities;

import java.util.List;

public class AbsenceInfo {
	    private List<Absence> absences;
	    private int totalAbsences;

	    public AbsenceInfo(List<Absence> absences, int totalAbsences) {
	        this.absences = absences;
	        this.totalAbsences = totalAbsences;
	    }

	    public List<Absence> getAbsences() {
	        return absences;
	    }

	    public int getTotalAbsences() {
	        return totalAbsences;
	    }
	}