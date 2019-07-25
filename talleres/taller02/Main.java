public class Main
{
  public static void main(String[] args)
  {
   
    System.out.print("El maximo común divisor es: "+ euclides(20,10));
    System.out.println("\n"+sumag(0,new int []{2,5,6},10));
    combinaciones("abc");
  }

  public static int euclides(int a, int b)
  {
    if(b==0)
    {
      return a;
    }else
    {
      return euclides(b,a%b);
    }
  }
  
  public static boolean sumag(int a, int pesos[], int resultado)
  {
    if(a>=pesos.length)
    {
      return resultado == 0;
    }
    else
    {
      return sumag(a+1, pesos, resultado-pesos[a]) || sumag(a+1,pesos, resultado);
    }
  }

 public static void combinaciones(String s)
 {
  combinacionesAux("",s);
 }
 private static void combinacionesAux(String a, String s)
 {
  if(s.length()==0) 
  {
    System.out.println(a);
  }else
  {
    combinacionesAux( a + s.charAt(0), s.substring(1));
	  combinacionesAux( a, s.substring(1));
  }
 }
  
}