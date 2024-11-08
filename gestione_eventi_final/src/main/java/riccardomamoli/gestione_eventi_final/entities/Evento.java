package riccardomamoli.gestione_eventi_final.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEvento;

    private String nomeEvento;

    private String descrizioneEvento;

    private LocalDateTime dataEvento;

    private String luogoEvento;

    private int postiDisponibili;

    @OneToMany(mappedBy = "evento", cascade = CascadeType.ALL)
    private List<Partecipazione> partecipazioni;



}
