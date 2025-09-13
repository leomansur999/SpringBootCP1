package br.com.fiap._espg.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosEnderecoAluno(

        @NotBlank
        String logradouroAluno,
        String numeroAluno,
        String complementoAluno,

        @NotBlank
        String bairroAluno,

        @NotBlank
        String cidadeAluno,

        @NotBlank
        String ufAluno,

        @NotBlank
        @Pattern(regexp = "\\d{8}")
        String cepAluno) {
}
