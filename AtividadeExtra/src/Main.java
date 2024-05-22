import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {

        Obra obra = new Obra("Adao", "Michelangelo", 1800, "Escultura", "Barroco");

        GerenciadorObras.adicionarObra(obra);

        
        ArrayList<Obra> lista = GerenciadorObras.listarObras();
        for (Obra obra2 : lista) {
            System.out.println(obra2);
        }
    }
}
