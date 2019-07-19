public class Contador
{
    private int cuenta;
    private final String id;

    public Contador(String id)
    {
        this.id = id;
        cuenta = 0;
    }

    public int Incrementos(int incremeto, int veces)
    {
        for (int i = 0; i<veces; i++)
        {
            cuenta = cuenta+ incremeto;
        }

        return cuenta;
    }

    public int ValorActual()
    {
        return cuenta;
    }

    public  String toString()
    {
        return "ID: "+id+" "+cuenta;
    }
}
