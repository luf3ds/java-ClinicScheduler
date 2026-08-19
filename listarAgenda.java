class ListarAgenda
{
    
    public void listar()
    {
        String[][] agenda = 
        {
        {"segunda-feira", "8:00", "9:00", "10:00", "11:00"},
        {"terça-feira", "8:00", "9:00", "10:00", "11:00"},
        {"quarta-feira", "8:00", "9:00", "10:00", "11:00"},
        {"quinta-feira", "8:00", "9:00", "10:00", "11:00"},
        {"sexta-feira", "8:00", "9:00", "10:00", "11:00"}
        
};
        System.out.println("Listando agenda...");

        for (String[] dia : agenda)
        {
            for (String horario : dia)
            {
                System.out.println(horario);
            }
        }

    }

}