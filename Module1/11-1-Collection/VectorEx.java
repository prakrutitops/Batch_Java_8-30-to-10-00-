import java.util.Vector;

public class VectorEx 
{
	public static void main(String[] args) 
	{
		
		Vector v =new Vector<>(5);
		
		
		v.add("a");
		v.add("b");
		v.add("c");
		v.add("d");
		
		//addElement
		
		System.out.println(v.capacity());
		System.out.println(v.size());
		
		if(v.contains("a1"))
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
		
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		
	}
}
