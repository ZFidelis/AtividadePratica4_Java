package controller;
import java.io.*;
import java.util.ArrayList;

import model.Obra;

public class GerenciadorObras {
    private static final String ARQUIVO = "obras.txt";

    public static void adicionarObra(Obra obra) throws IOException{
        try (FileWriter fw = new FileWriter(ARQUIVO,true); BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(obra + "\n");
        }
    }

    public static ArrayList<Obra> listarObras() throws IOException, Exception {

        ArrayList<Obra> listaObras = new ArrayList<>();
        
        try (FileReader fr = new FileReader(ARQUIVO); BufferedReader br = new BufferedReader(fr)) {
            
            String linha;
            while((linha = br.readLine())!=null) {
                Obra tempObra = Obra.fromString(linha);
                listaObras.add(tempObra);
            }
        }

        if (listaObras.isEmpty()) {
            throw new Exception("\nNenhuma Obra foi cadastrada");
        }

        return listaObras;
    } 

    public static Obra buscarObra(String titulo) throws Exception {
        ArrayList<Obra> listaObras = listarObras();

        for (Obra tempObra : listaObras) {
            if (tempObra.getTitulo().equals(titulo)) {
                return tempObra;
            }
        }

        throw new Exception("\nA Obra '" + titulo + "' não foi localizada!");
    }


    public static void excluirObra(String titulo) throws Exception, IOException {
        ArrayList<Obra> listaObras = listarObras();

        boolean encontrou = false;
        for (Obra tempObra : listaObras) {
            if (tempObra.getTitulo().equals(titulo)) {
                listaObras.remove(tempObra);
                encontrou = true;
                break;
            }
        }

        if (!encontrou) {
            throw new Exception("A Obra '" + titulo + "' não foi localizada");
        }

        
        try (FileWriter fw = new FileWriter(ARQUIVO); BufferedWriter bw = new BufferedWriter(fw)) {
            for (Obra tempObra : listaObras) {
                bw.write(tempObra + "\n");
            }
        }
    }

    public static void atualizarObra(String titulo) throws Exception, IOException {
        ArrayList<Obra> listaObras = listarObras();

        int pos = 0;
        boolean encontrou = false;
        for (Obra tempObra : listaObras) {
            if (tempObra.getTitulo().equals(titulo)) {
                pos = listaObras.indexOf(tempObra);
                encontrou = true;
                break;
            }
        }
        
        if (encontrou){
            listaObras.get(pos).setTitulo("Jeref");
            try (FileWriter fw = new FileWriter(ARQUIVO); BufferedWriter bw = new BufferedWriter(fw)) {
                for (Obra tempObra : listaObras) {
                    bw.write(tempObra + "\n");
                }
            }
        }
        else {
            throw new Exception("A Obra '" + titulo + "' não foi localizada");
        }
    }
}
