package ma.emsi.gestion_hopital.services;

import ma.emsi.gestion_hopital.entities.Patient;
import ma.emsi.gestion_hopital.enums.GroupeSanguin;
import ma.emsi.gestion_hopital.repos.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PatientServiceImpl implements PatientService {

    PatientRepo patientRepo;
    public PatientServiceImpl(PatientRepo patientRepo) {
        this.patientRepo = patientRepo;
    }

    @Override
    public Patient newPatient(Patient p) {
        return patientRepo.save(p);
    }

    @Override
    public Patient editPhone(String cin, String phone) {
        Patient patientToBeEdited =
                patientRepo.findByCin(cin);
        if(patientToBeEdited != null){
            //Effectuer les modifs
            patientToBeEdited.setPhoneNumber(phone);
            return patientRepo.save(patientToBeEdited);
        }
        return null;
    }

    @Override
    public Patient deleteByCin(String cin) {
        return patientRepo.deleteByCin(cin);
    }

    @Override
    public Patient searchByCin(String cin) {
        Patient p = patientRepo.findByCin(cin);
        if(p == null )
            return null;
        return p;
    }

    @Override
    public List<Patient> searchByGSanguin(GroupeSanguin groupeSanguin) {
        return patientRepo.findPatientByGrpSanguin(groupeSanguin);
    }

    @Override
    public List<Patient> searchForAllPatient() {
        return patientRepo.findAll();
    }
}
