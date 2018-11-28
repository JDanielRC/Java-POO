//hecho por Daniel Rubio A01633924
package cositas;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;

import javax.swing.*;

public class PanelBotones extends JPanel implements ConfiguradorDibujo {
	
	private JButton circulo, rectangulo, texto, colorBoton, lapiz;
	private JTextField tipoGuardado;
	private Color color = Color.BLACK;
	private int tipoFigura = 3;
	
	public PanelBotones() {
		setLayout(new GridLayout(6,1));
		setMaximumSize(new Dimension(400, 400));

	    circulo = new JButton("Círculo");
	    circulo.setPreferredSize(new Dimension(150,150));
	    rectangulo = new JButton("Rectángulo");
	    rectangulo.setPreferredSize(new Dimension(150,150));
	    texto = new JButton("Texto");
	    texto.setPreferredSize(new Dimension(150,150));
	    colorBoton = new JButton("Color");
	    colorBoton.setPreferredSize(new Dimension(150,150));
	    tipoGuardado = new JTextField("Tipo");
	    tipoGuardado.setPreferredSize(new Dimension(150,150));
	    lapiz = new JButton("Lápiz");
	    lapiz.setPreferredSize(new Dimension(150,150));
	    
	    
	    
	    
	    colorBoton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				color = JColorChooser.showDialog(PanelBotones.this, "Elige un color", Color.BLACK);
			}
		
		});
	    
	    
	    circulo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				setFigura(ConfiguradorDibujo.CIRCULO);
			}
		});
	    
	    rectangulo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				setFigura(ConfiguradorDibujo.RECTANGULO);
			}
		});
	    
	    texto.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setFigura(ConfiguradorDibujo.TEXTO);
			}
		});
	    lapiz.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				setFigura(ConfiguradorDibujo.LAPIZ);
				
			}
		});
	    
	    add(circulo);
	    add(rectangulo);
	    add(texto);
	    add(lapiz);
	    add(tipoGuardado);
	    add(colorBoton);
	}
	private void setFigura(int tipoFigura) {
    	this.tipoFigura= tipoFigura;
    	switch(tipoFigura) {
    		case ConfiguradorDibujo.CIRCULO:
    			tipoGuardado.setText("Círculo");
    			break;
    		case ConfiguradorDibujo.RECTANGULO:
    			tipoGuardado.setText("Rectángulo");
    			break;
    		case ConfiguradorDibujo.TEXTO:
    			tipoGuardado.setText("Texto");
    		case ConfiguradorDibujo.LAPIZ:
    			tipoGuardado.setText("Lapiz");
    	}
    } 

	@Override
	public int getFigura() {
		return tipoFigura;
	}

	@Override
	public Color getColor() {
		return color;
	}
}