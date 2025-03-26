package service;

import lombok.RequiredArgsConstructor;
import model.Pessoa;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Service;
import repository.PessoaRepository;

@Service
@RequiredArgsConstructor
public class CriarUser {

    private final PessoaRepository usuarioRepository;

    public Pessoa UserCreate(String nome, String email) {
        Pessoa UserExistente = usuarioRepository.findByNome(nome).orElseThrow(() -> new Exception("Mensagem de erro"));
    }


}
