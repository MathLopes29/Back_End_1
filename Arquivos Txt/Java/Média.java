import javax.swing.JOptionPane;
import java.util.Scanner;

public class Media{
	
	public static void main (String[] args){
	
		Scanner s = new Scanner (System.in);
		
			int N1 = 8, N2 = 9, N3 = 7, N4 = 4, N5 = 5, N6 = 6;
			int M1,M2,MT;
		
		System.out.println("\n===================================\t");
		System.out.println("\nNota 1 = " + N1);
		System.out.println("\nNota 2 = " + N2);
		System.out.println("\nNota 3 = " + N3);
		
		M1 = ((N1 + N2 + N3) /3);
		System.out.println("\nMedia Aritmetica = " + M1);
		
		System.out.println("\n===================================\t");
		System.out.println("\nNota 4 = " + N4);
		System.out.println("\nNota 5 = " + N5);
		System.out.println("\nNota 6 = " + N6);
	
		M2 = ((N4 + N5 + N6) /3);
		System.out.println("\nMedia Aritmetica = " + M2);
	
		MT = (M1 + M2);
		System.out.println("\n===================================\t");
		System.out.println("\nMedia aritmetica total =  " + MT);
		
		
	}
}
