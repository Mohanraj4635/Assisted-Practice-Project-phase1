package Innerclass;

public class innerlocalclass {
void Check(String locker_key) {
		
		
		if(locker_key.equals("Kalai@143")) {
			
			class Inner {
				
				
				void validate() {
					System.out.println("Found");
				}
				
				
			}
			
			Inner inner= new Inner();
			inner.validate();


		}
		else {
			
			System.out.println("Not Valid");
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		innerlocalclass outer= new innerlocalclass();
		outer.Check("Kalai@143");
		
		
	}
}

