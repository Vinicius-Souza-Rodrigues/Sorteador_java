package model;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Gera o ID automaticamente
    private Long id;

    private String nome_dono;
    private int numero;

    @Column(name = "data_aquisicao")  // Mapeia a coluna do banco com o nome específico
    private LocalDate data_aquisicao;  // Utiliza LocalDate para data

}
