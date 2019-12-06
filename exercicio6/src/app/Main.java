/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import models.Aluno;

/**
 *
 * @author USUARIO
 */
public class Main {

    public static void main(String[] args) {
        Aluno a = new Aluno();

        String sql = "INSERT INTO cadastro(nome, curso, id) VALUES (?,?, ?)";

        a.setNome("Teste");
        a.setCurso("Teste");
        a.setId(1);

    }
}
