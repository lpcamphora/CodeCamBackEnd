package org.codecam.backend;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class SenhaService {

    private String senhaGerada;

    public SenhaService() {
        gerarNovaSenha();
    }

    public void gerarNovaSenha() {
        this.senhaGerada = String.format("%03d", new Random().nextInt(1000));
    }

    public String getSenhaGerada() {
        return senhaGerada;
    }

    public boolean validarSenha(String senha) {
        return senhaGerada.equals(senha);
    }
}
