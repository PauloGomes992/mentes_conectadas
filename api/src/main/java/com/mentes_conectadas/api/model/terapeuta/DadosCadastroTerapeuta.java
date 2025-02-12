package com.mentes_conectadas.api.model.terapeuta;


public record DadosCadastroTerapeuta(
        
        String nome,
        String cpf,
        String dataDeNascimento,
        String email,
        String telefone,
        String crp,
        String abordagem) {

}
