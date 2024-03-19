package ma.emsi.gestion_hopital;

import ma.emsi.gestion_hopital.entities.Patient;
import ma.emsi.gestion_hopital.enums.GroupeSanguin;
import ma.emsi.gestion_hopital.repos.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class GestionHopitalApplication implements CommandLineRunner {
    @Autowired
    PatientRepo patientRepo;
    public static void main(String[] args) {
        SpringApplication.run(GestionHopitalApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //L'insertion

        for (int i=1; i<=5;i++)
            patientRepo.save(new Patient(null,"Ahmed"
                    ,"BL12345"+i, GroupeSanguin.B,new Date(),"060000"));

        //Modification du nom
        Patient p4 = patientRepo.findById(4).get();
        p4.setNom("Mohamed");
        p4.setGrpSanguin(GroupeSanguin.B);
        patientRepo.save(p4);

        //Vérification du changement
        System.out.println(patientRepo.findById(4).get().getNom());

        List<Patient> patients= patientRepo.findAll();
        for (Patient p:patients) {
            System.out.println("Nom : " + p.getNom()
            + " - GS: " + p.getGrpSanguin());
        }

        //Supression
        patientRepo.deleteById(3);
        if(patientRepo.existsById(3))
            System.out.println(patientRepo.findById(3));
        System.out.println("Patient n'existe pas!");

        patientRepo.findById(10).orElse(null);
    }
}
