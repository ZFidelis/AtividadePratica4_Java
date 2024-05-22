import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {

        Obra obra = new Obra("Adao", "Michelangelo", 1800, "Escultura", "Barroco");
        Obra obra2 = new Obra("Adel", "Michelangelo", 1800, "Escultura", "Barroco");

        // Cadastrar
        try {
            GerenciadorObras.adicionarObra(obra);
            GerenciadorObras.adicionarObra(obra2);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // Listar Todos
        try{
            System.out.println("Obras na Lista");
            ArrayList<Obra> lista = GerenciadorObras.listarObras();
            for (Obra obraT : lista) {
                System.out.println(obraT);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        // Buscar
        try {
            Obra temp = GerenciadorObras.buscarObra("Adao");
            System.out.println("Obra encontrada:");
            System.out.println(temp);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        // Remover
        try {
            GerenciadorObras.excluirObra("Adesl");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Listar Todos
        try{
            System.out.println("Obras na Lista");
            ArrayList<Obra> lista = GerenciadorObras.listarObras();
            for (Obra obraT : lista) {
                System.out.println(obraT);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Modificar
        try{
            GerenciadorObras.atualizarObra("Adao");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Listar Todos
        try{
            System.out.println("Obras na Lista");
            ArrayList<Obra> lista = GerenciadorObras.listarObras();
            for (Obra obraT : lista) {
                System.out.println(obraT);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
