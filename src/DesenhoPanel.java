import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;
import java.util.Arrays;

import javax.swing.JPanel;

public class DesenhoPanel extends JPanel{
	
	private SecureRandom aleatorio = new SecureRandom();
	private MinhaForma[] formas;

	
	public DesenhoPanel(int quantidade) {
		
		if(quantidade < 3) {
			throw new IllegalArgumentException("quantidade precisa ser >= 3.");
		}
		
		setBackground(Color.WHITE);
		
		formas = new MinhaForma[quantidade];
		
		for(int i = 0; i < formas.length; i++) {
			
			final int sorteiaForma = aleatorio.nextInt(3);
			
			final int x1 = aleatorio.nextInt(300);
			final int y1 = aleatorio.nextInt(300);
			final int x2 = aleatorio.nextInt(300);
			final int y2 = aleatorio.nextInt(300);
			final Color cor = new Color(aleatorio.nextInt(256), aleatorio.nextInt(256), aleatorio.nextInt(256));
			final boolean preenchido = aleatorio.nextBoolean();
			
			if(i == 0 || i == 1 || i == 2) {
				
				if(i == 0) {
					
					formas[i] = new MinhaLinha(x1, y1, x2, y2, cor);
					
				}else if(i == 1) {
					
					formas[i] = new MinhaCircunferencia(x1, y1, x2, y2, cor, preenchido);
					
				}else if( i == 2) {
					
					formas[i] = new MeuRetangulo(x1, y1, x2, y2, cor, preenchido);
					
				}
				
			}else {
				
				if(sorteiaForma == 0) {
					
					formas[i] = new MinhaLinha(x1, y1, x2, y2, cor);
					
				}else if(sorteiaForma == 1) {
					
					formas[i] = new MinhaCircunferencia(x1, y1, x2, y2, cor, preenchido);
					
				}else if(sorteiaForma == 2) {
					
					formas[i] = new MeuRetangulo(x1, y1, x2, y2, cor, preenchido);
					
				}
				
			}
			

		}
		
		
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		
		for(MinhaForma formaAtual : getFormas()) {
			
			formaAtual.desenha(g);
			
		}
		

		
	}

	public SecureRandom getAleatorio() {
		return aleatorio;
	}

	public void setAleatorio(SecureRandom aleatorio) {
		this.aleatorio = aleatorio;
	}
	
	public MinhaForma[] getFormas() {
		return formas;
	}

	public void setFormas(MinhaForma[] formas) {
		this.formas = formas;
	}

	public String retornaStatus() {
		
		int linhas = 0;
		int ret = 0;
		int circ = 0;
		
		for(MinhaForma formaAtual : getFormas()) {
			
			if(formaAtual instanceof MeuRetangulo) {
				
				ret++;
				
			}else if(formaAtual instanceof MinhaCircunferencia) {
				
				circ++;
				
			}else if(formaAtual instanceof MinhaLinha) {
				
				linhas++;
				
			}
			
		}
		
		return String.format("Linhas: %d, Circunferências: %d, Retângulos: %d", linhas, circ, ret);
		
	}
	
}
