package br.com.fiap._espg.aluno;

import br.com.fiap._espg.endereco.DadosEnderecoAluno;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroAluno(

        @NotBlank
        String nomeAluno,

        @NotBlank
        @Email
        String emailAluno,

        @NotBlank
        String telefoneAluno,

        @NotBlank
        @Pattern(regexp = "\\d{11}")
        String cpfAluno,

        @NotNull
        @Valid
        DadosEnderecoAluno enderecoAluno) {
}
