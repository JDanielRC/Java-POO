import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;

public class Ventana extends JFrame {
	
	//CONSTANTES
	//VALORES UTILIZADOS CUANDO HAY UN VALOR RECURRENTE
	//usualmente no van a cambiar
	
	public static final int EJEMPLO = 1;
	public static final int EJEMPLO_DOS = 2;
	
	private AreaDibujo areaDibujo;
	private PanelBotones botones;
	private ConfiguradorDibujo config;
	
	public Ventana() {
		super("Paint");
		setSize(800, 800);
		setLocation(100, 100);
		
		botones = new PanelBotones();
		areaDibujo = new AreaDibujo(botones);
		setLayout(new BorderLayout());
		add(botones, BorderLayout.WEST);
		add(areaDibujo, BorderLayout.CENTER);
		
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public void paint(Graphics g) {  //source, override/implement methods para buscar todo lo que hay de metodos
		super.paint(g);
	}
	
}
