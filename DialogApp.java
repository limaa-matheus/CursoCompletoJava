package Unidade6;

import javax.swing.JOptionPane;

public class DialogApp {

	public static void main(String[] args) {

		JOptionPane. showMessageDialog(null, "Iniciando a Aplica��o...","Intala��o Concluida",JOptionPane.INFORMATION_MESSAGE);
		String nome = JOptionPane.showInputDialog("Digite seu Nome:");
		int resposta = JOptionPane.showConfirmDialog(null, "O nome " +nome+ "Foi informado. Salvar as altera��es?");
		JOptionPane. showMessageDialog(null,""+	resposta);
		 
		
	}

}
