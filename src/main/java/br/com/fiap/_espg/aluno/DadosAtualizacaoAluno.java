package br.com.fiap._espg.aluno;

import br.com.fiap._espg.endereco.DadosEnderecoAluno;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoAluno(

        @NotNull
        Long id,
        String nomeAluno,
        String telefoneAluno,
        DadosEnderecoAluno enderecoAluno) {
}
