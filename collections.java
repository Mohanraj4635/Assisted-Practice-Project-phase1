package collections;
import java.util.*;
public class collections {
	public static void main(String[] args) {
	
			System.out.println("ArrayList");
			ArrayList<String> city=new ArrayList<String>();   
		      city.add("Covai");//
		      city.add("Chennai");    	   
		      System.out.println(city);  
			
		      System.out.println("\n");
		      System.out.println("Vector");
		      Vector<Integer> vec = new Vector();
		      vec.addElement(1000); 
		      vec.addElement(2000); 
		      System.out.println(vec);

		      System.out.println("\n");
		      System.out.println("LinkedList");
		      LinkedList<String> names=new LinkedList<String>();  
		      names.add("My");  
		      names.add("Kalai");  	      
		      Iterator<String> itr=names.iterator();  
		      while(itr.hasNext()){  
		      System.out.println(itr.next());  
		       
		     
		       System.out.println("\n");
		       System.out.println("HashSet");
		       HashSet<Integer> set=new HashSet<Integer>();  
		       set.add(200);  
		       set.add(300);  
		       set.add(400);
		       set.add(500);
		       System.out.println(set);
		       
		      
		       System.out.println("\n");
		       System.out.println("LinkedHashSet");
		       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
		       set2.add(0);  
		       set2.add(1);  
		       set2.add(2);
		       set2.add(3);	       
		       System.out.println(set2);
		      	} 
	}
	
}