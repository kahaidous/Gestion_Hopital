package ma.emsi.gestion_hopital.repos;

import ma.emsi.gestion_hopital.entities.Patient;
import ma.emsi.gestion_hopital.enums.GroupeSanguin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PatientRepo extends JpaRepository<Patient,Integer> {
    List<Patient> findPatientByGrpSanguin(GroupeSanguin grp);
    Patient deleteByCin(String cin);
}
