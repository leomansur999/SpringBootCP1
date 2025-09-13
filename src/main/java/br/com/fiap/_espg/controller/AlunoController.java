package br.com.fiap._espg.controller;


import br.com.fiap._espg.aluno.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    AlunoRepository AlunoRepository;

    @PostMapping
    @Transactional
    public void cadastrarAluno(@RequestBody @Valid DadosCadastroAluno dadosAluno) {
        AlunoRepository.save(new Aluno(dadosAluno));
    }

    @GetMapping
    public Page<DadosListagemAluno> listarAlunos(@PageableDefault(size = 10, sort = {"nomeAluno"}) Pageable paginacao) {
        return AlunoRepository.findAll(paginacao).map(DadosListagemAluno::new);
    }

    @PutMapping
    @Transactional
    public void atualizarAluno(@RequestBody @Valid DadosAtualizacaoAluno dadosAluno) {
        Aluno aluno = AlunoRepository.getReferenceById(dadosAluno.id());
        aluno.atualizarInformacoesAluno(dadosAluno);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void exluirAluno(@PathVariable Long id) {
        Aluno aluno = AlunoRepository.getReferenceById(id);
        aluno.excluirAluno();
    }
}
