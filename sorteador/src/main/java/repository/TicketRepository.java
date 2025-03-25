package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import model.Ticket;
import java.util.Optional;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
    Optional<Ticket> findByNumero(int numero);

    Integer findMaxNumeroBilhete();
}
