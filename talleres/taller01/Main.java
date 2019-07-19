public class Main
{
    public static void main(String[] args)
    {
        //Clase punto
        Punto punto = new Punto(12,6);
        System.out.println("Clase punto: ");
        System.out.println("cordenada X: "+punto.CordenadaX()+", Codenada Y: "+punto.CordenadaY());
        System.out.println("Radio: "+ punto.Radio());
        System.out.println("Angulo: "+ punto.Angulo());
        System.out.println("Distancia: "+ punto.Distancia(6,3)+"\n");

        //Clase Date
        Date fecha = new Date(11,05,1999);
        System.out.println("Clase Date: ");
        System.out.println("Comparcion de fecha: "+ fecha.Comparar(new Date(28,12,1965)));
        System.out.println("Fecha: "+ fecha.toString());
        System.out.println("Dia: "+ fecha.day());
        System.out.println("Mes: "+ fecha.mon());
        System.out.println("Año: "+ fecha.year()+"\n");

        //clase contador
        Contador contador = new Contador("Contador =");
        System.out.println("Clase Contador: ");
        System.out.println(contador.Incrementos(5,3));
        System.out.println(contador.ValorActual());
        System.out.println(contador.toString());

    }
}
