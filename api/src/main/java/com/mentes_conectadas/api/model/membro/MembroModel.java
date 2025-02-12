package com.mentes_conectadas.api.model.membro;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "membros")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode(of = "id")
public class MembroModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cpf;
    private String dataDeNascimento;
    private String email;
    private String telefone;
    private String profissao;

   

    public MembroModel(String nome, String cpf, String dataDeNascimento,String email,  String telefone, String profissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
        this.email = email;
        this.telefone = telefone;
        this.profissao = profissao;
    }
    
}
