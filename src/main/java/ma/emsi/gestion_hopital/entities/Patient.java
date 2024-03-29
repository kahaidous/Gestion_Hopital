package ma.emsi.gestion_hopital.entities;

import jakarta.persistence.*;
import lombok.*;
import ma.emsi.gestion_hopital.enums.GroupeSanguin;

import java.util.Date;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Data //@Getter + @Setter + ...
//@Table(name = "") ==> Renommer la table
public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(nullable = false, length = 20)
    private String nom;
    @Column(length = 8, updatable = false, unique = true, nullable = false)
    private String cin;
    private GroupeSanguin grpSanguin;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;

    private String phoneNumber;
}
