package service;

import model.Pessoa;
import model.Ticket;
import java.time.LocalDate;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.PessoaRepository;
import repository.TicketRepository;

@Service
public class AtribuirTicket {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private TicketRepository ticketRepository;

    public Ticket comprarBilhete(String nome) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        pessoaRepository.save(pessoa);

        Ticket novoBilhete = new Ticket();
        novoBilhete.setNumero(obterProximoNumeroBilhete());
        novoBilhete.setDataAquisicao(LocalDate.now());
        novoBilhete.setPessoa(pessoa);

        return ticketRepository.save(novoBilhete);
    }

    private int obterProximoNumeroBilhete() {
        Integer maxNumero = ticketRepository.findMaxNumeroBilhete();
        return (maxNumero == null) ? 1 : maxNumero + 1;
    }
}
