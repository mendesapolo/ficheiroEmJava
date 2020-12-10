/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheiros;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author aluno20005
 */
public class FicheiroSerial {
    
    public static void escrever(File file, Aluno[] alunos){
        try(
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos)){
            oos.writeObject(alunos);
        } catch (IOException ex) {
            System.out.println("ERRO: "+ex.getMessage());
        }
    }
    
    public static Aluno[] ler(File file){
        Aluno[] alunos = null;
        try(
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis)){
            
            alunos = (Aluno[]) ois.readObject();
            
        } catch (IOException ex) {
            System.out.println("ERRO: "+ex.getMessage());
        }finally{
            return alunos;
        }
    }
    
}
