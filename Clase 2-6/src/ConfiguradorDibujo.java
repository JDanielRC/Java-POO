import java.awt.*;

public interface ConfiguradorDibujo {
	
	public static final int CIRCULO = 0;
	public static final int RECTANGULO = 1;
	public static final int TEXTO = 2;
	
	public int getFigura();
	public Color getColor();
}
