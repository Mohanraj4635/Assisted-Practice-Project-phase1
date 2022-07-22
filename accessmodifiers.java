package project;

public class accessmodifiers {

		public void methodPublic() {
			System.out.println("Is a public method");
		}
		
		private void methodPrivate() {
			System.out.println("Is a private method");
		}
		
		void methodDefault() {
			System.out.println("Is a default method");
		}
		
		protected void methodProtected() {
			System.out.println("Is a protected method");
		}
		
		//same class able to aceess all types of modifiers
		public static void main(String [] args) {
			
			accessmodifiers obj= new  accessmodifiers();
			
			obj.methodDefault();
			obj.methodPrivate();
			obj.methodProtected();
			obj.methodPublic();
			
		
		}
	}
