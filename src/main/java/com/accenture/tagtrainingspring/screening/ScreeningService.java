package com.accenture.tagtrainingspring.screening;

import com.accenture.tagtrainingspring.patient.Patient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScreeningService {

    public boolean isPatientScreening(Screening screening, Patient patient) {
        return screening.getId() == patient.getId();
    }

    public List<Screening> getScreenings() {
        return null;
    }

}
