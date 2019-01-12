import java.awt.BorderLayout;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class DesenhoTeste {

	public static void main(String[] args) {
		
		int quant;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira quantas formas devem ser desenhadas.");
		quant = input.nextInt();
		
		DesenhoPanel panel = new DesenhoPanel(quant);
		JFrame app = new JFrame();
		JLabel status = new JLabel(panel.retornaStatus());
		
		
		
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.add(panel);
		app.add(status, BorderLayout.SOUTH);
		app.setSize(300, 300);
		app.setVisible(true);

	}

}
