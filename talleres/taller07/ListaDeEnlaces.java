import java.lang.IndexOutOfBoundsException; 
import java.util.*;
public class LinkedListMauricio {
    private Node first;
    private int size;
    public LinkedListMauricio()
    {
        size = 0;
        first = null;   
    }
    private Node getNode(int index) throws IndexOutOfBoundsException 
      {
            if (index >= 0 && index < size) {
                Node temp = first;
                for (int i = 0; i < index; i++) {
                    temp = temp.next;
                }
                return temp;
            } else {
                throw new IndexOutOfBoundsException();
            }
        }
    public int get(int index) throws IndexOutOfBoundsException {
            Node temp = getNode(index);
            return temp.data;
        }
    public int size()
    {
        return size;
    }     
    public void insert(int data, int index)
    {
        Node antes = this.getNode(index-1);
        Node nuevo = new Node(data);
	nuevo.next = antes.next;	
	antes.next = nuevo;
	size++;
    }       
    public void remove(int index)
    {
        Node antes = this.getNode(index-1);
        antes.next = (antes.next).next;
        size--;
    }    
    public boolean contains(int data)
    {
        Node temp = first;
        for(int i = 0; i<size;i++)
        {
           if (temp.data == data)
             return true;
           temp = temp.next;  
        }    
        return false;
    }  
}
