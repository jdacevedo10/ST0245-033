public class BinaryTree 
{
	public Node root;
 
	public BinaryTree()
	{
  root = null;
	}
	private int max2(int i, int j)
	{
		if (i > j)
			return i;
		return j;
	}
	
	private int maxheightAUX(Node node)
	{
		if (node == null)
			return 0;
		else 
			return max2(maxheightAUX(node.left), maxheightAUX(node.right))+1;
	}
	
	public int maxheight()
	{
	   return maxheightAUX(root);
	}
	
	
    private boolean inser(Node nodo, String nom, String g){
        if(nodo.data == nom){
            return false;
        }
        if(g.equalsIgnoreCase("mujer")){
            if(nodo.left == null){
                nodo.left = new Node(nom);
                return true;
            }
            else{
                return inser(nodo.left, nom, g);
            }
        }
        if(g.equalsIgnoreCase("hombre")){
            if(nodo.right == null){
                nodo.right = new Node(nom);
                return true;
            }
            else{
                return inser(nodo.right, nom, g);
            }
        }
        return false;
    }
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
