/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheiros;

import java.io.Serializable;

/**
 *
 * @author aluno20005
 */
class Aluno implements Serializable{
    private String nome;
    private int idade;
    private String corFavorita;

    public Aluno() {
    }

    public Aluno(String nome, int idade, String corFavorita) {
        this.nome = nome;
        this.idade = idade;
        this.corFavorita = corFavorita;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCorFavorita() {
        return corFavorita;
    }

    public void setCorFavorita(String corFavorita) {
        this.corFavorita = corFavorita;
    }

    @Override
    public String toString() {
        return getNome();
    }
    
}
