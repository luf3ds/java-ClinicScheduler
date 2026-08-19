import java.util.Scanner;

class Agendar 
{
    public void agendar() 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome do paciente: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o dia da semana para agendar (ex:2 = segunda-feira): ");
        int dia = scanner.nextInt();

        while (dia < 2 || dia > 5) //verifica se o dia é válido (2 a 5 correspondem a segunda a sexta-feira)
        {
            System.out.println("Dia inválido. Por favor, escolha um número entre 1 e 5 (Segunda - Sexta).");
            System.out.print("Digite o dia da semana para agendar (ex:2 = segunda-feira): ");
            dia = scanner.nextInt();
        }

        System.out.print("Digite o horário para agendar (ex: \"8\" para 8:00): ");
        int horario = scanner.nextInt();

        while (horario < 8 || horario > 11) //verifica se o horário é válido (8 a 11 correspondem a 8:00 a 11:00)
        {
            System.out.println("Horário inválido. Por favor, escolha um horário entre 8:00 e 11:00.");
            System.out.print("Digite o horário para agendar (ex: \"8\" para 8:00): ");
            horario = scanner.nextInt();
        }

        System.out.println("Agendado para: " + dia + " - " + nome + " - " + horario);

    }
}
