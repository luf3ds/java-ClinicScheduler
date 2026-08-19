class ListarAgenda
{
    
    public void listar()
    {
        String[] agenda = {"segunda-feira", "terça-feira", "quarta-feira", "quinta-feira", "sexta-feira"};
        System.out.println("Listando agenda...");

        for (String dia : agenda) 
        {
            System.out.println(dia);
        }

    }

}