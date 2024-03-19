package ma.emsi.gestion_hopital.services;

import ma.emsi.gestion_hopital.entities.Patient;
import ma.emsi.gestion_hopital.enums.GroupeSanguin;

import java.util.List;

public interface PatientService {
    Patient newPatient(Patient p);
    Patient editPhone(String cin, String phone);
    Patient deleteByCin(String cin);
    Patient searchByCin(String cin);
    List<Patient> searchByGSanguin(GroupeSanguin groupeSanguin);
    List<Patient> searchForAllPatient();
}
