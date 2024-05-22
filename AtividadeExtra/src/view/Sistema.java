package view;
import java.io.IOException;
import java.util.ArrayList;

import controller.*;
import model.Obra;

public class Sistema {
    public static void executar() {

        int op = 1;
        while(op != 0) {
            exibirMenu();
            op = Console.lerInt();
            verificarOpcao(op);
        }
    }

    private static void exibirMenu() {
        System.out.println("\n---Gerenciamento de Museu---");
        System.out.println("1) Cadastrar");
        System.out.println("2) Buscar");
        System.out.println("3) Listar todos");
        System.out.println("4) Apagar");
        System.out.println("5) Renomear");
        System.out.println("0) Sair");
        System.out.print("Sua opção: ");

    }

    private static void verificarOpcao(int op) {
        switch (op) {
            case 1:
                cadastrarObra();
                break;
            case 2:
                buscarObra();
                break;
            case 3:
                listarTodos();
                break;
            case 4:
                apagarObra();
                break;
            case 5:
                renomearObra();
                break;
            case 0: 
                System.out.println("\nO Programa foi finalizado...");
                break;
        
            default:
                System.out.println("\nOpção inválida Digite novamente:");
                break;
        }
    }

    private static void cadastrarObra() {

        System.out.print("Título da Obra: ");
        String titulo = Console.lerString();
        System.out.print("Autor da Obra: ");
        String artista = Console.lerString();
        System.out.print("Ano da Criação da Obra: ");
        int ano = Console.lerInt();
        System.out.print("Tipo da Obra: ");
        String tipo = Console.lerString();
        System.out.print("Seção da Obra: ");
        String secao = Console.lerString();
        Obra obra = new Obra(titulo, artista, ano, tipo, secao);
        try {
            GerenciadorObras.adicionarObra(obra);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void buscarObra() {

        System.out.print("Título da Obra que deseja encontrar: ");
        String titulo = Console.lerString();
        try {
            Obra temp = GerenciadorObras.buscarObra(titulo);
            System.out.println("Obra encontrada:");
            System.out.println(temp);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void listarTodos() {
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

    private static void apagarObra() {
        System.out.print("Título da Obra que deseja excluir: ");
        String titulo = Console.lerString();
        try {
            GerenciadorObras.excluirObra(titulo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void renomearObra() {
        System.out.print("Título da Obra que deseja renomear: ");
        String titulo = Console.lerString();
        try {
            GerenciadorObras.atualizarObra(titulo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
