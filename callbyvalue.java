package methods;

public class callbyvalue {
	int num=25;

	void operation(int num) {
		this.num=num*10/100;
	}
	public static void main(String[] args) {
		
		callbyvalue obj= new callbyvalue();
		
		System.out.println("Value of num before function called: "+obj.num);
		
		obj.operation(150);
		System.out.println("Value of num after function called: "+obj.num);
	}
}
