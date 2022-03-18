package example.corejava;

public class pascalpattern {

	public static void main(String[] args) {
		int rows=5;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");	
			}
			System.out.println();
			
			for(int i1=rows;i1>=0;i1--) {
				for (int j=0;j<=i1;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			
		}
		
	}

}
