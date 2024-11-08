package riccardomamoli.gestione_eventi_final.entities;


import jakarta.persistence.*;
import riccardomamoli.gestione_eventi_final.enums.Ruolo;

import java.time.LocalDate;
import java.util.List;

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

    private List<Partecipazione> partecipazioni;

    public Utente(){}

    public Utente(String nomeUtente, String cognomeUtente, LocalDate dataNascita, String usernameUtente, Ruolo ruolo) {
        this.nomeUtente = nomeUtente;
        this.cognomeUtente = cognomeUtente;
        this.dataNascita = dataNascita;
        this.usernameUtente = usernameUtente;
        this.ruolo = ruolo;
    }

    public Long getId() {
        return id;
    }

    public String getNomeUtente() {
        return nomeUtente;
    }

    public void setNomeUtente(String nomeUtente) {
        this.nomeUtente = nomeUtente;
    }

    public String getCognomeUtente() {
        return cognomeUtente;
    }

    public void setCognomeUtente(String cognomeUtente) {
        this.cognomeUtente = cognomeUtente;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }

    public String getUsernameUtente() {
        return usernameUtente;
    }

    public void setUsernameUtente(String usernameUtente) {
        this.usernameUtente = usernameUtente;
    }

    public Ruolo getRuolo() {
        return ruolo;
    }

    public void setRuolo(Ruolo ruolo) {
        this.ruolo = ruolo;
    }

    public List<Partecipazione> getPartecipazioni() {
        return partecipazioni;
    }

    public void setPartecipazioni(List<Partecipazione> partecipazioni) {
        this.partecipazioni = partecipazioni;
    }

    @Override
    public String toString() {
        return "Utente{" +
                "id=" + id +
                ", nomeUtente='" + nomeUtente + '\'' +
                ", cognomeUtente='" + cognomeUtente + '\'' +
                ", dataNascita=" + dataNascita +
                ", usernameUtente='" + usernameUtente + '\'' +
                ", ruolo=" + ruolo +
                ", partecipazioni=" + partecipazioni +
                '}';
    }
}
