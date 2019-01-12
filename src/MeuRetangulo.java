import java.awt.Color;
import java.awt.Graphics;

public class MeuRetangulo extends MinhaForma {
	
	private boolean preenchido;
	
	public MeuRetangulo() {
		
		this(0, 0, 0, 0, Color.BLACK, false);
		
	}

	public MeuRetangulo(int x1, int y1, int x2, int y2, Color cor, boolean preenchido) {
		super(x1, y1, x2, y2, cor);
		this.preenchido = preenchido;
	}
	
	public void desenha(Graphics g) {
		
		g.setColor(getCor());
		g.drawRect(retornaXCimaEsquerda(), retornaYCimaEsquerda(), retornaLargura(), retornaAltura());
		
		if(isPreenchido() == true) {
			g.fillRect(retornaXCimaEsquerda(), retornaYCimaEsquerda(), retornaLargura(), retornaAltura());
		}
		
	}
	
	public int retornaXCimaEsquerda() {
		return getX1() < getX2() ? getX1() : getX2();
	}
	
	public int retornaYCimaEsquerda() {
		return getY1() < getY2() ? getY1() : getY2();
	}
	
	public int retornaAltura() {
		return Math.abs(getX1() - getX2());
	}
	
	public int retornaLargura() {
		return Math.abs(getY1() - getY2());
	}


	public boolean isPreenchido() {
		return preenchido;
	}

	public void setPreenchido(boolean preenchido) {
		this.preenchido = preenchido;
	}
	
	

}
