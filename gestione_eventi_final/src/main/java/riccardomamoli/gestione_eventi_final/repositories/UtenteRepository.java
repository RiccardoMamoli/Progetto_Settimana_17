package riccardomamoli.gestione_eventi_final.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import riccardomamoli.gestione_eventi_final.entities.Utente;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Long> {
}
