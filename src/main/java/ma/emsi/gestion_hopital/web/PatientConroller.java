package ma.emsi.gestion_hopital.web;

import ma.emsi.gestion_hopital.entities.Patient;
import ma.emsi.gestion_hopital.services.PatientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // Création API Rest
public class PatientConroller {
    PatientService patientService;
    public PatientConroller(PatientService patientService) {
        this.patientService = patientService;
    }
    @GetMapping("/patient/all")
    List<Patient> patients(){
        return patientService.searchForAllPatient();
    }

    @GetMapping("/patient/{cin}")
    Patient patientCin(@PathVariable String cin){
        return patientService.searchByCin(cin);
    }
}
