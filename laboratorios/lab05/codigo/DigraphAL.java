import java.util.ArrayList;
import java.util.LinkedList;
import javafx.util.Pair;
/**
 * 
 * @author Mauricio Toro 
 * @version 1
 */
public class DigraphAL extends Graphs
{

    ArrayList<LinkedList<Pareja>> list = new ArrayList<>();
    
    public DigraphAL(int size)
    {
        super(size);
        for(int i=0; i<size;i++)
	{
            list.add(new LinkedList());
        }
    }

    public void addArc(int source, int destination, int weight)
    {
        Pareja pair = new Pareja(destination, weight);
        LinkedList<Pareja> a = list.get(source);
        a.add(pair);
        list.add(source, a);
    }

    public int getWeight(int source, int destination)
    {
        LinkedList<Pareja> a = list.get(source);
        for(int i=0;i<a.size();i++)
	{
            if(a.get(i).vertice == destination){
                return a.get(i).peso;
        }
            break;
        }
        return 0;
    }

    public ArrayList<Integer> getSuccessors(int vertice)
    {
        LinkedList<Pareja> a = list.get(vertice);
        ArrayList<Integer>sucesores = new ArrayList<>();
        for(int i=0; i<a.size();i++)
	{
            if(a.get(i).peso!=0)
		{
                	sucesores.add(a.get(i).vertice);
            	}
        }
        return sucesores;
    }
}