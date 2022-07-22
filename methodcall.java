package methods;

public class methodcall {

		public void methodDisplay() {
			System.out.println("Display method called");
		 }
		 
		 public int methodNumber() {
			 
			 int a=12;
			 return a;
		 }
		
		 public static void main(String[] args) {
			 
			 methodcall obj= new methodcall();
			 obj.methodDisplay();
			 
			 int result=obj.methodNumber();
			 
			 System.out.println(result);
	}
	}

