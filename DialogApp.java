package Unidade6;

import javax.swing.JOptionPane;

public class DialogApp {

	public static void main(String[] args) {

		JOptionPane. showMessageDialog(null, "Iniciando a Aplicação...","Intalação Concluida",JOptionPane.INFORMATION_MESSAGE);
		String nome = JOptionPane.showInputDialog("Digite seu Nome:");
		int resposta = JOptionPane.showConfirmDialog(null, "O nome " +nome+ "Foi informado. Salvar as alterações?");
		JOptionPane. showMessageDialog(null,""+	resposta);
		 
		
	}

}
