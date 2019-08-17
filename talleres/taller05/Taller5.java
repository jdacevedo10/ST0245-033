public class Taller5 
{
    public static void main(String[] args) 
    {
        //Ejercicio1
        System.out.println("Arreglo ordenado: "+insertionSort(new int[]{7,8,5,2,4,6,3}));
        //Ejercicio2
        System.out.println("Suma del arreglo: "+suma(new int[]{2,4,6,8,10}));
        //Ejercicio3
        mul(10);
    }
    
     public static int[] insertionSort(int[] array)
    {
     int i, j, aux;
     i=0;
     while (i<array.length)
     {
         aux = array[i];
         j = i-1;
         while (j>=0 && array[j]>aux)
         {
             array[j+1]= array[j];
             j=j-1;
         }
         array[j+1] = aux;
         i=i+1;
     }
     return array;
    }
    
    public static int suma(int[] array)
    {
         long star = System.currentTimeMillis();
        int sum = 0;
        for(int i = 0; i<array.length;i++)
        {
           
            sum = sum + array[i];

        }
            long end = System.currentTimeMillis();
            System.out.println(Math.sqrt(end-star));
        return sum;
    }
    
    public static void mul(int num)
    {
        for (int i = 0; i<=num;i++)
        {
            long start = System.currentTimeMillis();
            for(int j = 0 ; j<=num; j++)
            {
                System.out.println("MUL: "+i+"*"+j+" = "+i*j);
            }
            long end = System.currentTimeMillis();
            System.out.println(Math.sqrt(end-start));
        }
        
    }
}
