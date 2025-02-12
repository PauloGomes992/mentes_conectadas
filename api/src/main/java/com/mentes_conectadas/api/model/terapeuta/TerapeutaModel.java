package com.mentes_conectadas.api.model.terapeuta;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "terapeutas")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode(of = "id")
public class TerapeutaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cpf;
    private String dataDeNascimento;
    private String email;
    private String telefone;
    private String crp;
    private String abordagem;


   

    public TerapeutaModel(String nome, String cpf, String dataDeNascimento,String email,  String telefone, String crp,String abordagem) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
        this.email = email;
        this.telefone = telefone;
        this.crp = crp;
        this.abordagem = abordagem;
    }
    
}
