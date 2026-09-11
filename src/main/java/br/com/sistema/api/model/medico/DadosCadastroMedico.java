package br.com.sistema.api.model.medico;

import br.com.sistema.api.model.endereco.DadosCadastroEndereco;

public record DadosCadastroMedico(
    String nome,
    String email,
    String telefone,
    String crm,
    Especialidade especialidade,
    DadosCadastroEndereco endereco
) {

    
}
