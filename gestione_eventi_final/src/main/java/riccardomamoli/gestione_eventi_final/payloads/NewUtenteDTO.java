package riccardomamoli.gestione_eventi_final.payloads;

import jakarta.validation.constraints.NotEmpty;


public record NewUtenteDTO(

            @NotEmpty(message = "Il nome dell'utente è obbligatorio!")
            String nomeUtente,
            @NotEmpty(message = "Il conome dell'utente è obbligatorio!")
            String cognomeUtente) {
}
