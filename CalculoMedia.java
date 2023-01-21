package calculo_media;

import javax.swing.JOptionPane;

public class CalculoMedia {

	public static void main(String[] args) {
		
		String notaUm = JOptionPane.showInputDialog("Digite a primeira nota: ");
		String notaDois = JOptionPane.showInputDialog("Digite a segunda nota: ");
		String notaTres = JOptionPane.showInputDialog("Digite a terceira nota: ");
		String notaQuatro = JOptionPane.showInputDialog("Digite a quarta nota: ");
		String notaCinco = JOptionPane.showInputDialog("Digite a quinta nota: ");
		
		double nota1 = Double.parseDouble(notaUm);
		double nota2 = Double.parseDouble(notaDois);
		double nota3 = Double.parseDouble(notaTres);
		double nota4 = Double.parseDouble(notaQuatro);
		double nota5 = Double.parseDouble(notaCinco);
		
		double media = ((nota1 + nota2 + nota3 + nota4 + nota5)/5);
		
		System.out.println(media);
		
		JOptionPane.showMessageDialog(null, "A média das cinco notas é: " + media + ". Sua menção é " + gerarMencao(media));
			
	}
	
	static String gerarMencao(double media) {
		
		String mencao = "";
		
		if (media >= 7.0) {
			
			mencao = "APROVADO";
			
		} else if (media >= 5.0) {
			
			mencao = "RECUPERAÇÂO";
			
		}
		else if (media < 5.0) {
			
			mencao = "REPROVADO";
			
		}
		
		return mencao;
	}
	
}
