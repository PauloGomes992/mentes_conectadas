package com.mentes_conectadas.api.model.membro;


public record DadosCadastroMembro(
        
        String nome,
        String cpf,
        String dataDeNascimento,
        String email,
        String telefone,
        String profissao) {

}
