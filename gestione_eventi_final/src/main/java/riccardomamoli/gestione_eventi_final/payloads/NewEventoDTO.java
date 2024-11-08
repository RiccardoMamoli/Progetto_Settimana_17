package riccardomamoli.gestione_eventi_final.payloads;



import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record NewEventoDTO(
        @NotEmpty(message = "Il nome dell'evento è obbligatorio!")
        @Size(min = 2, max = 30, message = "Il nome dell'evento deve essere compreso tra 2 e 30 caratteri!")
        String nomeEvento,
        @NotEmpty(message = "La descrizione dell'evento è obbligatoria!")
        @Size(min = 2, max = 40, message = "La descrizione deve essere compreso tra 2 e 40 caratteri!")
        String descrizioneEvento,
        @NotEmpty(message = "Il luogo dell'evento è obbligatorio!")
        String luogoEvento,
        @NotNull(message = "Inserire il numero di posti disponibili!")
        Integer postiDisponibili) {
}