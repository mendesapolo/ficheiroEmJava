/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheiros;

import java.io.File;

/**
 *
 * @author aluno20005
 */
public class AppMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String arquivo = "src/arq/dados_1.txt";
        String arquivo2 = "src/arq/dados_serial.mendes";
        String conteudo = "Este é meu conteudo, que foi bem escrito";
        File fl = new File(arquivo);
        File fl2 = new File(arquivo2);
        //Ficheiro.escrever(conteudo, arquivo);
        
        System.out.println("----------------------------------------------");
        String content = Ficheiro.ler(fl);
        System.out.println(content);
        
        
        
        Aluno[] alunos = {
            new Aluno("Ana", 12, "Lilas"),
            new Aluno("Florindo", 8, "Laranja"),
            new Aluno("Claudia", 15, "Verde"),
            new Aluno("Anastacio", 17, "Amarelo"),
        };
        
        System.out.println("---------------------------------------------->>");
        FicheiroSerial.escrever(fl2, alunos);
        
        Aluno[] allAlunos = FicheiroSerial.ler(fl2);
        
        if(allAlunos != null){
            int i = 0;
            for(Aluno aluno : allAlunos){
                i++;
                System.out.println(i+" - "+aluno);
            }
        }
    }
}
