import java.util.ArrayList;
import java.util.Scanner;

class Vulnerabilidade {
    String cve; // Código identificador da falha
    String sistemaAfetado;
    String severidade; // Baixa, Média, Alta, Crítica

    public Vulnerabilidade(String cve, String sistemaAfetado, String severidade) {
        this.cve = cve;
        this.sistemaAfetado = sistemaAfetado;
        this.severidade = severidade;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Vulnerabilidade> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- SISTEMA DE CYBERSECURITY ---");
            System.out.println("1. Cadastrar Nova Vulnerabilidade");
            System.out.println("2. Listar Falhas Registradas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            if (opcao == 1) {
                System.out.print("Código CVE (Ex: CVE-2026-1234): ");
                String cve = scanner.nextLine();
                System.out.print("Sistema/Servidor Afetado: ");
                String sistema = scanner.nextLine();
                System.out.print("Severidade (Baixa/Media/Alta/Critica): ");
                String severidade = scanner.nextLine();

                lista.add(new Vulnerabilidade(cve, sistema, severidade));
                System.out.println("Vulnerabilidade cadastrada com sucesso!");

            } else if (opcao == 2) {
                if (lista.isEmpty()) {
                    System.out.println("Nenhuma vulnerabilidade registrada até o momento.");
                } else {
                    System.out.println("\n--- RELATÓRIO DE FALHAS DIGITAIS ---");
                    for (Vulnerabilidade v : lista) {
                        System.out.println("ID: " + v.cve + " | Alvo: " + v.sistemaAfetado + " | Nível: " + v.severidade);
                    }
                }
            }
        } while (opcao != 3);

        System.out.println("Encerrando o sistema de monitoramento.");
        scanner.close();
    }
}
