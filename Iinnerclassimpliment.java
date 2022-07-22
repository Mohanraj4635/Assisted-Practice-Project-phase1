package Innerclass;

public class Iinnerclassimpliment {
public void dispaly() {
		
		class Inner{
			
			int a=12;
			
			void print() 
			{
				System.out.println("Method of inner class");
				System.out.println("Value of a : "+a);
			}
			
		}
		
		Inner inner= new Inner();
		inner.print();
		
		
		
	}
	
	public static void main(String[] args) {
		
		Iinnerclassimpliment outer= new Iinnerclassimpliment();
		outer.dispaly();
		
	}
	
	
}
