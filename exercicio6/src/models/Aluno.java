/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Ciber - 09
 */
public class Aluno {
    private String nome;
    private String curso;
    private int id;
    
    //Construto vazio
    public Aluno(){}
    
    public Aluno(String nome, String curso, int id){
        this.curso = curso;
        this.id = id;
        this.nome = nome;
    }
    
    
    //Getters e setters
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getCurso(){
        return this.curso;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }
    
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
}
