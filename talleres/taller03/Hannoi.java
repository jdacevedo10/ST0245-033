class Puntos 
{
  public void Hannoi(int discos, int torre1, int torre2, int torre3)
  {
      if(discos==1)
      {
        System.out.println("De torre "+torre1+" a torre "+torre3);
      }else
      {
        Hannoi(discos-1, torre1, torre3, torre2);
        System.out.println("De torre "+torre1+" a torre "+torre3);
        Hannoi(discos-1, torre2, torre1,torre3);
      }
  }
}
