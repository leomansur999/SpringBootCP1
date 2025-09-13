package br.com.fiap._espg.aluno;

public record DadosListagemAluno(
        Long id,
        String nomeAluno,
        String emailAluno,
        String cpfAluno) {

    public DadosListagemAluno(Aluno aluno) {
    this(aluno.getId(), aluno.getNomeAluno(), aluno.getEmailAluno(), aluno.getCpfAluno());
    }
}