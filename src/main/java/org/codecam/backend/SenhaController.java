package org.codecam.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/senha")
public class SenhaController {

    @Autowired
    private SenhaService senhaService;

    @GetMapping
    public String getSenha() {
        return senhaService.getSenhaGerada();
    }

    @PostMapping("/validar")
    public String validarSenha(@RequestBody String senha) {
        if (senhaService.validarSenha(senha)) {
            return "✅ Acesso permitido!";
        } else {
            return "❌ Senha incorreta!";
        }
    }

    @PostMapping("/nova")
    public String novaSenha() {
        senhaService.gerarNovaSenha();
        return senhaService.getSenhaGerada();
    }
}
