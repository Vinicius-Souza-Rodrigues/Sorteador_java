package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    Pessoa findByNome(String nome);

    boolean existsByNome(String nome);

}
