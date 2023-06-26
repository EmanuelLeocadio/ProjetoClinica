package br.com.tech4me.clinica.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tech4me.clinica.model.DadosMedico;
import br.com.tech4me.clinica.model.DadosProcedimento;

@RestController
@RequestMapping("/procedimentos")

public class ProcedimentoController {
    
    List<DadosProcedimento> procedimentos = new ArrayList();

    @GetMapping
    private List<DadosProcedimento> obterListaProcedimentos() {
        return procedimentos;
    }

      @GetMapping("/{descricao}")
    private String requisicaoComParametro(@PathVariable String descricao) {
        return String.format(" descricao %s", descricao);
    }

    @PostMapping
    private String requisicaoPost(@RequestBody DadosProcedimento dadosProcedimento) {
        return String.format("Requisição post dados do procedimento: %s", dadosProcedimento);
    }
}
