package arrays;
public class arrayimplement{

public static void main(String[] args) {
		int array[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println("First element : "+array[0][0]);
		System.out.println("Second element: "+array[0][1]);
		System.out.println("Third element : "+array[0][2]);
		
		for (int row=0; row<3; row++) {
			
			for(int col=0;col<3;col++) {
				
				System.out.print(array[row][col]+"\t");
			}
			System.out.println();
			
		}
	}

}