package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import model.Pessoa;
import java.util.Optional;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
