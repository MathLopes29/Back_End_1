/**
* IPI - Imposto sobre Produto Industrializado
* @author Matheus Lopes
*/

import javax.swing.JOptionPane;

public class Imposto {
    public static void main(String[] args) {
		
		float IPI = (float) 0.15, T_IMPOSTO, CODIGO_1, CODIGO_2;
		int VPECA_UM, QTDE_1, VPECA_DOIS, QTDE_2;
		
		
		CODIGO_1 = Integer.parseInt(JOptionPane.showInputDialog("INFORME O CODIGO DA 1° PECA:"));
		JOptionPane.showMessageDialog(null,"Codigo do produto " + CODIGO_1);
		VPECA_UM = Integer.parseInt(JOptionPane.showInputDialog("INFORME O VALOR DA 1° PECA:"));
		JOptionPane.showMessageDialog(null,"Valor do produto " + VPECA_UM);
		QTDE_1 = Integer.parseInt(JOptionPane.showInputDialog("INFORME O QUANTIDADE DA 1° PECA:"));
		JOptionPane.showMessageDialog(null,"Quantidade do produto " + QTDE_1);
		
		CODIGO_2 = Integer.parseInt(JOptionPane.showInputDialog("INFORME O CODIGO DA 2° PECA:"));
		JOptionPane.showMessageDialog(null,"Codigo do produto " + CODIGO_2);
		VPECA_DOIS = Integer.parseInt(JOptionPane.showInputDialog("INFORME O VALOR DA 2° PECA:"));
		JOptionPane.showMessageDialog(null,"Valor do produto " + VPECA_DOIS);
		QTDE_2 = Integer.parseInt(JOptionPane.showInputDialog("INFORME O QUANTIDADE DA 2° PECA:"));
		JOptionPane.showMessageDialog(null,"Quantidade do produto " + QTDE_2);
		
		T_IMPOSTO = (int) ((VPECA_UM * QTDE_1 + VPECA_DOIS * QTDE_2) * IPI);
		
		JOptionPane.showMessageDialog(null, "O TOTAL DE IPI A SER PAGO E: R$" + T_IMPOSTO);
		
		
		
	}
}
