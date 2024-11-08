package riccardomamoli.gestione_eventi_final.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import riccardomamoli.gestione_eventi_final.entities.Utente;
import riccardomamoli.gestione_eventi_final.exceptions.BadRequestException;
import riccardomamoli.gestione_eventi_final.exceptions.NotFoundException;
import riccardomamoli.gestione_eventi_final.payloads.NewUtenteDTO;
import riccardomamoli.gestione_eventi_final.repositories.UtenteRepository;

public class UtenteService {
    @Autowired
    private UtenteRepository utenteRepository;

    @Autowired
    private PasswordEncoder bcrypt;

    public Utente salvaUtente(NewUtenteDTO body) {

        this.utenteRepository.findByEmailUtente(body.emailUtente()).ifPresent(
                user -> {
                    throw new BadRequestException("Email " + body.emailUtente() + " già in uso!");
                }
        );

        this.utenteRepository.findByEmailUtente(body.usernameUtente()).ifPresent(
                user -> {
                    throw new BadRequestException("Username " + body.usernameUtente() + " già in uso!");
                }
        );

        Utente newUtente = new Utente(
                body.nomeUtente(),
                body.cognomeUtente(),
                body.dataNascita(),
                body.usernameUtente(),
                body.emailUtente(),
                bcrypt.encode(body.passwordUtente()),
                body.ruolo()
        );

        Utente savedUtente = this.utenteRepository.save(newUtente);

        return savedUtente;
    }

    public Utente findByEmail(String email) {
        return this.utenteRepository.findByEmailUtente(email).orElseThrow(() -> new NotFoundException("L'utente con email " + email + " non è stato trovato"));
    }

    public Utente findById(Long id) {
        return this.utenteRepository.findById(id).orElseThrow(() -> new NotFoundException(id));
    }
}
