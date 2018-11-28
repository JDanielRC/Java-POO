// 2 librerias par GUI en java
// awt (la viejita)
// swing (la nueva) (incluye o usa awt)

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

// para tener una ventana es necesario heredar de JFrame
public class Ventana extends JFrame implements ActionListener {
	
	//widgets - elementos de GUI
	private JButton b1, b2, b3, b4;
	private JTextField textField;
	private JLabel label;
	private JPanel panelBotones; //paneles dentro de paneles dentro de paneles, osea poner este panel en una region, de manera que sea como botones de la calculadora en una region
	
	public Ventana(String title) {
		super(title);
		setSize(640, 480);
		setLocation(100, 100);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //cuando invocamos directamente el nombre, es porque es estatico
		
		//setLayout(new GridLayout(4, 1));
		setLayout(new BorderLayout());
		
		b1 = new JButton("botoncito 1");
		b2 = new JButton("botoncito 2");
		b3 = new JButton("botoncito 3");
		b4 = new JButton("botoncito 4");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		// CLASE ANONIMA
				// existe la posibilidad de declarar una clase de uso unico
				// que implemente una interfaz o herede de una clase abstracta
				
				//estamos declarando una clase aqui abajo, existe unicamente para el boton 4
				b4.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {
						// nota: this 
						// this - se refiere a la clase anonima
						// Ventana.this - referencia al objeto ventana que contiene esta clase
						// esta clase
						System.out.println("Es un cuatro");
					}
					
				});
		b4.addActionListener(this);
		
		textField = new JTextField();
		
		panelBotones = new JPanel();
		panelBotones.setLayout(new GridLayout(2, 2));
		panelBotones.add(b1);
		panelBotones.add(b2);
		panelBotones.add(b3);
		panelBotones.add(b4);
		
		add(textField, BorderLayout.NORTH);
		add(panelBotones, BorderLayout.CENTER);
		
		setVisible(true);
		
		
		//label = new JLabel("Labelcita");
		//label.setHorizontalAlignment(SwingConstants.CENTER);
		
		//add(b1, BorderLayout.NORTH);
		//add(b2, BorderLayout.WEST);
		//add(textField, BorderLayout.CENTER);
		//add(label, BorderLayout.SOUTH);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
		if (e.getActionCommand().equals("1")) {
			System.out.println("UNO");
		}
		if (e.getSource() == b2) {
			System.out.println("DOS");
			textField.setText("HOLA");
		}
	}

}
