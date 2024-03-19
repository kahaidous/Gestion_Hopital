package ma.emsi.gestion_hopital.services;

import ma.emsi.gestion_hopital.entities.Patient;
import ma.emsi.gestion_hopital.enums.GroupeSanguin;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PatientServiceImpl implements PatientService {
    @Override
    public Patient newPatient(Patient p) {
        return null;
    }

    @Override
    public Patient editPhone(String cin, String phone) {
        return null;
    }

    @Override
    public Patient deleteByCin(String cin) {
        return null;
    }

    @Override
    public Patient searchByCin(String cin) {
        return null;
    }

    @Override
    public List<Patient> searchByGSanguin(GroupeSanguin groupeSanguin) {
        return null;
    }

    @Override
    public List<Patient> searchForAllPatient() {
        return null;
    }
}
