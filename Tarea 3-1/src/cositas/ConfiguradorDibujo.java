//hecho por Daniel Rubio A01633924
package cositas;
import java.awt.Color;

public interface ConfiguradorDibujo {
	
	public static final int CIRCULO = 0;
	public static final int RECTANGULO = 1;
	public static final int TEXTO = 2;
	public static final int LAPIZ = 3;
	
	public int getFigura();
	public Color getColor();
}
