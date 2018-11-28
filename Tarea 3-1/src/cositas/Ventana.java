//hecho por Daniel Rubio A01633924
package cositas;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

import javax.swing.*;

import figuras.increibles.Figura;

public class Ventana extends JFrame {
	
	//CONSTANTES
	//VALORES UTILIZADOS CUANDO HAY UN VALOR RECURRENTE
	//usualmente no van a cambiar
	
	public static final int EJEMPLO = 1;
	public static final int EJEMPLO_DOS = 2;
	
	private AreaDibujo areaDibujo;
	private PanelBotones botones;
	private ConfiguradorDibujo config;
	private JMenuBar barra;
	private JMenu archivo;
	private JMenuItem guardar, abrir;
	private JFileChooser chooser;
	
	public Ventana() {
		super("Paint");
		setSize(1200, 800);
		setLocation(100, 100);
		
		barra = new JMenuBar();
		archivo = new JMenu("Archivo");
		guardar = new JMenuItem("Guardar");
		abrir = new JMenuItem("Abrir");
		
		barra.add(archivo);
		archivo.add(guardar);
		archivo.add(abrir);
		
		botones = new PanelBotones();
		areaDibujo = new AreaDibujo(botones);
		
		chooser = new JFileChooser();
		
		guardar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int resultado = chooser.showSaveDialog(Ventana.this);
				if (resultado == JFileChooser.APPROVE_OPTION) {
					String path = chooser.getSelectedFile().getPath() + ".txt";
					try {
						FileWriter fw = new FileWriter(path);
						BufferedWriter bw = new BufferedWriter(fw);
						PrintWriter pw = new PrintWriter(bw);
						
						LinkedList<Figura> listaFiguras = areaDibujo.getFiguras();
						for(int i = 0; i < listaFiguras.size(); i++) {
							pw.println(listaFiguras.get(i));
						}
						pw.close();
						
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
				
			}
		});
		
		abrir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int resultado = chooser.showOpenDialog(Ventana.this);
				if (resultado == JFileChooser.APPROVE_OPTION) {
					File archivo = chooser.getSelectedFile().getAbsoluteFile();
					areaDibujo.convertir(archivo);
				}
			}
		});
		setLayout(new BorderLayout());
		add(botones, BorderLayout.WEST);
		add(areaDibujo, BorderLayout.CENTER);
		setJMenuBar(barra);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public void paint(Graphics g) {  //source, override/implement methods para buscar todo lo que hay de metodos
		super.paint(g);
	}
	
}
