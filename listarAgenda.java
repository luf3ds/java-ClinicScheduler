class ListarAgenda
{
    String[][] agenda = new String[5][4];

    String[] dias = 
    {
        "segunda-feira",
        "terça-feira",
        "quarta-feira",
        "quinta-feira",
        "sexta-feira"
    };

    String[] horarios = 
    {
        "8:00",
        "9:00",
        "10:00",
        "11:00"
    };


    public void adicionar(String nome, int dia, int horario)
    {
        int indexDia = dia - 2;
        int indexHorario = horario - 8;

        agenda[indexDia][indexHorario] = nome;
    }


    public void listar()
    {
        System.out.println("Listando agenda...");

        for (int i = 0; i < agenda.length; i++)
        {
            System.out.println("\n" + dias[i]);

            for (int j = 0; j < agenda[i].length; j++)
            {
                if (agenda[i][j] == null)
                {
                    System.out.println(horarios[j] + " - Livre");
                }
                else
                {
                    System.out.println(horarios[j] + " - " + agenda[i][j]);
                }
            }
        }
    }
}