import java.util.Scanner;

class Agendar
{
    ListarAgenda listarAgenda;

    public Agendar(ListarAgenda listarAgenda)
    {
        this.listarAgenda = listarAgenda;
    }


    public void agendar()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do paciente: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o dia da semana para agendar (2 = segunda-feira): ");
        int dia = scanner.nextInt();

        while (dia < 2 || dia > 6)
        {
            System.out.println("Dia inválido.");
            System.out.print("Digite um número entre 2 e 6: ");
            dia = scanner.nextInt();
        }

        System.out.print("Digite o horário para agendar (8 a 11): ");
        int horario = scanner.nextInt();

        while (horario < 8 || horario > 11)
        {
            System.out.println("Horário inválido.");
            System.out.print("Digite um horário entre 8 e 11: ");
            horario = scanner.nextInt();
        }

        listarAgenda.adicionar(nome, dia, horario);

        System.out.println("Agendado: " + nome + " - dia " + dia + " às " + horario + ":00");
    }
}