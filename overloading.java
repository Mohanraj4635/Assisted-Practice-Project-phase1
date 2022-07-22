package methods;

public class overloading {

	int add(int a, int b) {
		return a+b;
	}
	int add(int a, int b,int c) {
		return a+b+c;
	}
	float add(float a, float b) {
		return a+b;
	}
	
	double add(double a, double b) {
		return a+b;
	}
	
	 public static void main(String[] args) {
		overloading obj= new overloading();
		System.out.println("Addition of 10 and 5 is :"+obj.add(10, 5));
		System.out.println("Addition of 13.5 and 8.25 :"+obj.add(13.5f,8.25f));
		System.out.println("Addition of 4 double :"+obj.add(4.5, 10.5));
		System.out.println("Addition of 5 int: "+obj.add(5, 10, 15));

}
}