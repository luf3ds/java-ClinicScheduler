import java.util.Scanner;

class Agendar 
{
    public void agendar() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do paciente: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o dia da semana para agendar (ex:2 - segunda-feira): ");
        int dia = scanner.nextInt();
        System.out.println("Agendado para: " + dia + " - " + nome);
    }
}
