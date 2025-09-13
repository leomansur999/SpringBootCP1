package br.com.fiap._espg.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class EnderecoAluno {
    String logradouroAluno;
    String numeroAnulo;
    String complementoAluno;
    String bairroAluno;
    String cidadeAluno;
    String ufAluno;
    String cepAluno;

    public EnderecoAluno(DadosEnderecoAluno dadosAluno) {
        this.logradouroAluno = dadosAluno.logradouroAluno();
        this.numeroAnulo = dadosAluno.numeroAluno();
        this.complementoAluno = dadosAluno.complementoAluno();
        this.bairroAluno = dadosAluno.bairroAluno();
        this.cidadeAluno = dadosAluno.cidadeAluno();
        this.ufAluno = dadosAluno.ufAluno();
        this.cepAluno = dadosAluno.cepAluno();
    }

    public String getLogradouroAluno() {
        return logradouroAluno;
    }

    public String getNumeroAluno() {
        return numeroAnulo;
    }

    public String getComplementoAluno() {
        return complementoAluno;
    }

    public String getBairroAluno() {
        return bairroAluno;
    }

    public String getCidadeAluno() {
        return cidadeAluno;
    }

    public String getUfAluno() {
        return ufAluno;
    }

    public String getCepAluno() {
        return cepAluno;
    }

    public void atualizarInformacoesAluno(DadosEnderecoAluno dadosAluno) {
        if(dadosAluno.logradouroAluno() != null) {
            this.logradouroAluno = dadosAluno.logradouroAluno();
        }
        if(dadosAluno.numeroAluno() != null) {
            this.numeroAnulo = dadosAluno.numeroAluno();
        }
        if(dadosAluno.complementoAluno() != null) {
            this.complementoAluno = dadosAluno.complementoAluno();
        }
        if(dadosAluno.bairroAluno() != null) {
            this.bairroAluno = dadosAluno.bairroAluno();
        }
        if(dadosAluno.cidadeAluno() != null) {
            this.cidadeAluno = dadosAluno.cidadeAluno();
        }
        if(dadosAluno.ufAluno() != null) {
            this.ufAluno = dadosAluno.ufAluno();
        }
        if(dadosAluno.cepAluno() != null) {
            this.cepAluno = dadosAluno.cepAluno();
        }
    }
}
