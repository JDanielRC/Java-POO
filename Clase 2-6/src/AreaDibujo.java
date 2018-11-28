import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class AreaDibujo extends JPanel implements MouseListener {
	
	private ConfiguradorDibujo config;
	
	public AreaDibujo(ConfiguradorDibujo config) {
		addMouseListener(this); //sin esto no sirve el mouselistener
		this.config = config;
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		//g.setColor(Color.BLUE);
		g.setColor(config.getColor());
		g.drawOval(10, 35, 100, 100);
		g.setColor(new Color(255, 177, 0)); //aqui se cambia el color que estamos usando
		g.drawRect(10, 150, 100, 100);
		g.setColor(new Color(120, 150, 20));
		g.drawString("salu2", 30, 400);
	}

	@Override
	public void mouseClicked(MouseEvent e) { 
		// TODO Auto-generated method stub
		System.out.println(e.getXOnScreen());
		System.out.println(e.getYOnScreen());
		System.out.println(e.getX());
		System.out.println(e.getY());
		System.out.println("click");
		// punto de origen en la gui es en el panel arriba a la izquierda, el extremo total
		repaint();
		
	}

	@Override
	public void mouseEntered(MouseEvent e) { 
		// TODO Auto-generated method stub
		System.out.println("entered");
	}

	@Override
	public void mouseExited(MouseEvent e) { 
		// TODO Auto-generated method stub
		System.out.println("exited");
		
	}

	@Override
	public void mousePressed(MouseEvent e) { 
		// TODO Auto-generated method stub
		System.out.println("pressed");
	}

	@Override
	public void mouseReleased(MouseEvent e) { //soltar el click
		// TODO Auto-generated method stub
		System.out.println("released");
	}
	
}
