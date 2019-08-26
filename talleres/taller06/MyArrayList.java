import java.util.ArrayList;
import java.util.Arrays;
public class MyArrayList {
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private int array[];

    /**
     * El metodo constructor se utiliza para incializar
     * variables a valores neutros como 0 o null.
     * El contructor no lleva parámetros en este caso.
     */
    public MyArrayList() {
	array = new int[DEFAULT_CAPACITY];
	size = 0;
    }


    /**
     * Tiene la intención de retornar la longitud del objeto
     * @return longitud del objeto
     *
     * El size esta influenciado por las funciones add y del
     */
    public int size() {
        return size;
    }

    /**
     * @param e el elemento a guardar
     * Agrega un elemento e a la última posición de la lista
     *
     */
    public void add(int e) {
	add( size , e);
    }
    public void delete(int e)
    {
        delete(size, e);
    }


    /**
     * @param i es un íncide donde se encuentra el elemento posicionado
     * Retorna el elemento que se encuentra en la posición i de la lista.
     *
     */
    public int get(int i) {
	if (i < size && i >= 0) {
	    return array[i];
	}else {
	    throw new IndexOutOfBoundsException("Index : " + i);
	}
    }


    /**
     * @param index es la posicion en la cual se va agregar el elemento
     * @param e el elemento a guardar
     * Agrega un elemento e en la posición index de la lista
     *
     */
    public void add(int index, int e) {
	if ( index < size && index >= 0) {
	  for (int i = 0; i< size; i++) {
		if (i == size && size == array.length) {
		    extend();
		}
		/*if (i == index) {
		    int swap =  ;
		    array[i] = e;
		    array[i + 1] = swap;
		    i++;
		    size++;
		}*/
	    }
	  for(int i = size;i>=0;i-- )
	    {
	        array[i+1]=array[i];
	       }
	}else if (index > size && index <=0) {
	    array[index] = e;
	    size++;
	    if (size == array.length) {
		extend();
	    }
	}
    }
     public void delete(int index, int e) {
	if ( index < size && index >= 0) {
	  
	  for(int i = size;i>=0;i-- )
	    {
	        array[i]=array[i+1];
	       }
	}else if (index > size && index <=0) {
	    array[index] = e;
	    size++;
	    if (size == array.length) {
		extend();
	    }
	}
    }

    private void extend() {
        int [] array2 =  new int[array.length * 2 ];
        for (int i = 0; i < size; i++) {
            array[2] = array[i];
        }
        array = array2;
    }
}
