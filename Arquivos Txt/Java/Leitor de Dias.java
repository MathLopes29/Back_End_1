/**
* Leitor de Dias, Messes e Anos .. utilizando JOptionPane e System.out.println
* @author Matheus Lopes
*/

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Leitor {
	
    public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		int Total, Ano, Messes;
		
	
		/* USANDO INTEFACE GRAFICA 
		
		JOptionPane.showMessageDialog(null,"INFORME SUA IDADE EM ANOS, MESES E DIAS");

        	int ANO_USER = Integer.parseInt(JOptionPane.showInputDialog("Quantos Anos:"));
        	int MES_USER = Integer.parseInt(JOptionPane.showInputDialog("Quantos Meses"));
		int DIAS_USER = Integer.parseInt(JOptionPane.showInputDialog("Quantos Dias:"));
		
		MES = (MES * MES_USER);
		ANO = (ANO * ANO_USER);
		TOTAL = (ANO + MES + DIAS_USER);
		
		JOptionPane.showMessageDialog(null, ANO_USER +" Anos "+ MES_USER +" Meses e "+ DIAS_USER +" Dias = "+TOTAL +" Dias.");
       */
	   
	   
	    System.out.println("\nQual sua idade ?");  			
		Integer idade = Integer.parseInt(s.nextLine());	   
		System.out.println("\nVoce tem " + idade + " anos");
		
		System.out.println("\nQue Mes ?");  			
		Integer mes = Integer.parseInt(s.nextLine());	   
		System.out.println("\nEstamos no mes " + mes );
		
		System.out.println("\nQue dia e hoje ?");  			
		Integer dia = Integer.parseInt(s.nextLine());	   
		System.out.println("\nHoje e dia " + dia );
		
		Messes = (mes = (mes * 30));
		Ano = (idade = (365 * idade));
		Total = (idade + mes + dia);
		
		System.out.println("\nTotal de Dias " + Total);


	   
	}
}
