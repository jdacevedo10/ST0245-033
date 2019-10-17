
public class binarytree {
	
	public Node root;

    public void insert(int n) {
        if (root == null) {
            root = new Node(n);
        } else {
            insertAux(root, n);
        }
    }

    private void insertAux(Node node, int n) {
        if (node == null) {
            node = new Node(n);
        }
        if (n > node.data) {
            if (node.right == null) {
                node.right = new Node(n);
            }
            insertAux(node.right, n);
        }
        if (n < node.data) {
            if (node.left == null) {
                node.left = new Node(n);
            }
            insertAux(node.left, n);
        }
    }

    public boolean buscar(int n) {
        return buscarAux(root, n);
    }
    
	private boolean buscarAux(Node node, int n) {
	   if (node == null) {
            return false;
        }
        if (n == node.data) {
            return true;
        }
        if(n < node.data){
		return buscarAux(node.left, n);
	}else{
		return buscarAux(node.right, n);
	}
    }
	
    public void borrar(int n) {
        borrarAux(root, n);
    }

     private Node borrarAux(Node node, int n) {
    }



    /*
	 

	private void recursivePrintAUX(Node node)
	{
		if (node != null)
		{
			recursivePrintAUX(node.left);
			recursivePrintAUX(node.right);
			System.out.println(node.data);
		}
		
	}

	public void recursivePrint()
	{
		recursivePrintAUX(root);
	}
		
}
