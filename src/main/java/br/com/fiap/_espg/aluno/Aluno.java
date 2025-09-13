package br.com.fiap._espg.aluno;

import br.com.fiap._espg.endereco.EnderecoAluno;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "alunos")
@Entity(name = "Aluno")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Boolean ativo = true;
    String nomeAluno;
    String emailAluno;
    String cpfAluno;
    String telefoneAluno;

    @Embedded
    EnderecoAluno enderecoAluno;

    public Aluno(DadosCadastroAluno dadosAluno) {
        this.nomeAluno = dadosAluno.nomeAluno();
        this.emailAluno = dadosAluno.emailAluno();
        this.telefoneAluno = dadosAluno.telefoneAluno();
        this.cpfAluno = dadosAluno.cpfAluno();
        this.enderecoAluno = new EnderecoAluno(dadosAluno.enderecoAluno());

    }

    public Long getId() {
        return id;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public String getEmailAluno() {
        return emailAluno;
    }

    public String getCpfAluno() {
        return cpfAluno;
    }

    public String getEnderecoAluno() {
        return getEnderecoAluno();
    }

    public void atualizarInformacoesAluno(@Valid DadosAtualizacaoAluno dadosAluno) {
        if(dadosAluno.nomeAluno() != null) {
            this.nomeAluno = dadosAluno.nomeAluno();
        }
        if(dadosAluno.telefoneAluno() != null) {
            this.telefoneAluno = dadosAluno.telefoneAluno();
        }
        if(dadosAluno.enderecoAluno() != null) {
            this.enderecoAluno.atualizarInformacoesAluno(dadosAluno.enderecoAluno());
        }
    }

    public void excluirAluno() {
        this.ativo = false;
    }
}
