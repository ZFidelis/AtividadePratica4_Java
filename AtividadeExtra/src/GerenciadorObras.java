import java.io.*;
import java.util.ArrayList;

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

}
