import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        ListarAgenda listarAgenda = new ListarAgenda();
        Agendar agendar = new Agendar(listarAgenda);

        while (true)
        {
            System.out.println("\n1: Agendar");
            System.out.println("2: Listar agenda");
            System.out.println("3: Sair");
            System.out.print("Selecione uma opção: ");

            int opcao = scanner.nextInt();

            switch (opcao)
            {
                case 1:
                    agendar.agendar();
                    break;

                case 2:
                    listarAgenda.listar();
                    break;

                case 3:
                    System.out.println("Saindo...");
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    return;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}