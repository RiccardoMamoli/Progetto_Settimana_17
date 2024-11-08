package riccardomamoli.gestione_eventi_final.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

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

    public Evento(){}

    public Evento(String nomeEvento, String descrizioneEvento, LocalDateTime dataEvento, String luogoEvento, int postiDisponibili) {
        this.nomeEvento = nomeEvento;
        this.descrizioneEvento = descrizioneEvento;
        this.dataEvento = dataEvento;
        this.luogoEvento = luogoEvento;
        this.postiDisponibili = postiDisponibili;
    }

    public Long getIdEvento() {
        return idEvento;
    }


    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public String getDescrizioneEvento() {
        return descrizioneEvento;
    }

    public void setDescrizioneEvento(String descrizioneEvento) {
        this.descrizioneEvento = descrizioneEvento;
    }

    public LocalDateTime getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(LocalDateTime dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getLuogoEvento() {
        return luogoEvento;
    }

    public void setLuogoEvento(String luogoEvento) {
        this.luogoEvento = luogoEvento;
    }

    public int getPostiDisponibili() {
        return postiDisponibili;
    }

    public void setPostiDisponibili(int postiDisponibili) {
        this.postiDisponibili = postiDisponibili;
    }

    public List<Partecipazione> getPartecipazioni() {
        return partecipazioni;
    }

    public void setPartecipazioni(List<Partecipazione> partecipazioni) {
        this.partecipazioni = partecipazioni;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "idEvento=" + idEvento +
                ", nomeEvento='" + nomeEvento + '\'' +
                ", descrizioneEvento='" + descrizioneEvento + '\'' +
                ", dataEvento=" + dataEvento +
                ", luogoEvento='" + luogoEvento + '\'' +
                ", postiDisponibili=" + postiDisponibili +
                ", partecipazioni=" + partecipazioni +
                '}';
    }
}
