import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;
import javax.swing.border.Border;

public class Ventana extends JFrame {
	
	private static String titulo = "Agenda Contactos";
	private JPanel nombre, apellido, numero, correo, opciones, panelDatos, datoAgenda;
	private JMenuBar barraMenu;
	private JButton nuevoContacto, guardar, cargar, aceptar, cancelar;
	private JFrame añadir;
	private JLabel nombreLabel, apellidoLabel, numeroLabel, correoLabel, labelTitulo, nombreAgenda, apellidoAgenda, numeroAgenda, correoAgenda;
	private JTextField nombreArea, apellidoArea, numeroArea, correoArea;
	private Border border;
	private JTextArea menuAgenda;
	private int n = 0;
	private JFileChooser chooser;
	
	public Ventana() {
		super(titulo);
		setSize(800, 600);
		setLocation(300, 300);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		border = BorderFactory.createLineBorder(Color.BLACK, 2);
		barraMenu = new JMenuBar();
		menuAgenda = new JTextArea();
		chooser = new JFileChooser();

		nuevoContacto = new JButton("Nuevo Contacto");
		nuevoContacto.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				añadir = new JFrame("Nuevo Contacto");
				añadir.setSize(600, 400);
				añadir.setLocation(500, 500);
				añadir.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
				añadir.setVisible(true);
				
				nombre = new JPanel(new GridLayout(2, 1));
				nombreLabel = new JLabel("Nombre", SwingConstants.CENTER);
				nombreLabel.setBorder(border);
				nombreLabel.setFont(new Font("Times New Roman", Font.PLAIN, 24));
				nombreArea = new JTextField();
				nombre.add(nombreLabel);
				nombre.add(nombreArea);
				
				apellido = new JPanel(new GridLayout(2, 1));
				apellidoLabel = new JLabel("Apellido", SwingConstants.CENTER);
				apellidoLabel.setBorder(border);
				apellidoLabel.setFont(new Font("Times New Roman", Font.PLAIN, 24));
				apellidoArea = new JTextField();
				apellido.add(apellidoLabel);
				apellido.add(apellidoArea);
				
				numero = new JPanel(new GridLayout(2, 1));
				numeroLabel = new JLabel("Número", SwingConstants.CENTER);
				numeroLabel.setBorder(border);
				numeroLabel.setFont(new Font("Times New Roman", Font.PLAIN, 24));
				numeroArea = new JTextField();
				numero.add(numeroLabel);
				numero.add(numeroArea);
				
				correo = new JPanel(new GridLayout(2, 1));
				correoLabel = new JLabel("Correo", SwingConstants.CENTER);
				correoLabel.setBorder(border);
				correoLabel.setFont(new Font("Times New Roman", Font.PLAIN, 24));
				correoArea = new JTextField();
				correo.add(correoLabel);
				correo.add(correoArea);
				
				opciones = new JPanel(new GridLayout(1, 2));
				opciones.setSize(200, 200);
				aceptar = new JButton("Aceptar");
				aceptar.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						String datoNombre = nombreArea.getText();
						String datoApellido = apellidoArea.getText();
						String datoNumero = numeroArea.getText();
						String datoCorreo = correoArea.getText();
						
						n = n+1;
						menuAgenda.append("Contacto " + n + ": " + datoNombre + "  |  " + datoApellido + "  |  " + datoNumero + "  |  " + datoCorreo + "\n");
						menuAgenda.setFont(new Font("Times New Roman", Font.PLAIN, 24));
						añadir.setVisible(false);
					}
				});
				
				cancelar = new JButton("Cancelar");
				cancelar.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						añadir.setVisible(false);
					}
				});
				opciones.add(aceptar);
				opciones.add(cancelar);
				
				labelTitulo = new JLabel("Contacto", SwingConstants.CENTER);
				labelTitulo.setFont(new Font("Times New Roman", Font.PLAIN, 30));
				
				añadir.setLayout(new BorderLayout());
				panelDatos = new JPanel(new GridLayout(2, 2));
				panelDatos.add(nombre);
				panelDatos.add(apellido);
				panelDatos.add(numero);
				panelDatos.add(correo);
				
				añadir.add(panelDatos, BorderLayout.CENTER);
				añadir.add(opciones, BorderLayout.SOUTH);
				añadir.add(labelTitulo, BorderLayout.NORTH);
			}
		});
		
		guardar = new JButton("Guardar lista");
		guardar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int resultado = chooser.showSaveDialog(Ventana.this);
				if (resultado == JFileChooser.APPROVE_OPTION) {
					String ruta = chooser.getSelectedFile().getPath() + ".txt";
					try {
						FileWriter fr = new FileWriter(ruta);
						menuAgenda.write(fr);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
			}
		});
		cargar = new JButton("Cargar lista");
		cargar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int resultado = chooser.showOpenDialog(Ventana.this);
				if (resultado == JFileChooser.APPROVE_OPTION) {
					File archivo = chooser.getSelectedFile();
					BufferedReader br;
					try {
						br = new BufferedReader(new FileReader(archivo));
						String linea = br.readLine();
						while (linea != null) {
							menuAgenda.append(linea + "\n");
							linea = br.readLine();
						}
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
			}
		});
		
		
		setJMenuBar(barraMenu);
		barraMenu.add(nuevoContacto);
		barraMenu.add(guardar);
		barraMenu.add(cargar);
		add(menuAgenda, BorderLayout.CENTER);
		setVisible(true);
	}
}
