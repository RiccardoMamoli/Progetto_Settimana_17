package riccardomamoli.gestione_eventi_final.entities;


import jakarta.persistence.*;
import riccardomamoli.gestione_eventi_final.enums.Ruolo;

import java.time.LocalDate;

@Entity
@Table(name = "utenti")
public class Utente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeUtente;
    private String cognomeUtente;
    private LocalDate dataNascita;
    private String usernameUtente;

    @Enumerated(EnumType.STRING)
    private Ruolo ruolo;
}
