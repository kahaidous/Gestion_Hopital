package ma.emsi.gestion_hopital.repos;

import ma.emsi.gestion_hopital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepo extends JpaRepository<Patient,Integer> {
}
