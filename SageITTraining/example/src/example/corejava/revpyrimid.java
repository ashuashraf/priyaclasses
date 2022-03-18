package example.corejava;

public class revpyrimid {
	public static void main(String[] args) {
		int numbers=6;
		
		for(int i = numbers; i>=1; i--) {
			for(int j=i; j<=numbers; j++) {
				System.out.print(" ");
			}
			for (int j=1; j<=(2*i-1);j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
