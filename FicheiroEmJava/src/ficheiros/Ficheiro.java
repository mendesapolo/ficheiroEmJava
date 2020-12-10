/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheiros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author aluno20005
 */
public class Ficheiro {

    public static void escrever(String content, File fileName) {
        try (
                FileWriter fw = new FileWriter(fileName);
                BufferedWriter bw = new BufferedWriter(fw)) {

            bw.write(content);
            bw.flush();

        } catch (IOException ex) {
            System.err.println("Erro: " + ex.getMessage());
        }
    }

    public static String ler(File fileName) {
            String content = "";
        try (
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr)) {
            while(br.ready()){
                content += br.readLine()+"\n";
            }
        } catch (IOException ex) {
            System.err.println("Erro: " + ex.getMessage());
        }finally{
            return content.trim();
        }
    }

    public static void escrever(String content, String nomeFicheiro) {
        try {
            File fl = new File(nomeFicheiro);
            try (
                    FileWriter fw = new FileWriter(fl);
                    BufferedWriter bw = new BufferedWriter(fw)) {
                bw.write(content);
            }
        } catch (IOException ex) {
            System.err.println("Erro: " + ex.getMessage());
        }
    }

    public static void ler(String nomeFicheiro) {
        try {
            File fl = new File(nomeFicheiro);
            try (
                    FileReader fr = new FileReader(fl);
                    BufferedReader br = new BufferedReader(fr)) {
                System.out.println(br.readLine());
            }
        } catch (IOException ex) {
            System.err.println("Erro: " + ex.getMessage());
        }
    }
}
