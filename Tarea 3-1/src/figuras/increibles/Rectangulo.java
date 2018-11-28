package figuras.increibles;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangulo extends Figura {

	public Rectangulo(int x, int y, Color color, int tipo) {
		super(x, y, color, tipo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dibujar(Graphics g) {
		g.setColor(getColor());
		g.drawRect(getX(), getY(), 100, 100);
	}

}
