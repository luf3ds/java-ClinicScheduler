import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1: Agendar: ");
        System.out.println("2: Listar agenda: ");
        System.out.println("3: Sair: ");
        System.out.print("selecione uma opção: ");

        int opcao = scanner.nextInt();

        switch (opcao) 
        {
            case 1:
                Agendar agendar = new Agendar();
                agendar.agendar();
                break;
            case 2:
                ListarAgenda listarAgenda = new ListarAgenda();
                listarAgenda.listar();
                break;
            case 3:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
}