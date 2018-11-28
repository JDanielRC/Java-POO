package cositas;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.print.attribute.standard.Media;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;


public class Ventana extends JFrame{
	
	
	private JMenuBar barra;
	private JMenu file, edicion, tiposLetra, help;
	private JMenuItem save, load, tamanoLetra, timesNew, arial, calibri, comicSans, noHelp, nuevo, acercaDe;
	private JTextArea texto;
	private JFileChooser chooser;
	private String tipoDeLetra = "Calibri";
	private int tamano = 12;
	private FileWriter fw;
	private File archivo;
	private static String titulo = "Sin título: Bloc de Notas";
	private JScrollPane scroll;
	
	public Ventana() {
		super(titulo);
		setSize(600, 720);
		setLocation(400, 200);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setTitle(titulo);
		
		ImageIcon imagen = new ImageIcon("notepad.png");
		this.setIconImage(imagen.getImage());
		barra = new JMenuBar();
		file = new JMenu("File");
		chooser = new JFileChooser();
		edicion = new JMenu("Edición");
		tiposLetra = new JMenu("Tipos de letra");
		help = new JMenu("Help");
		
		//items
		noHelp = new JMenuItem("'Help'");
		noHelp.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame("Help :(");
				ImageIcon icon = new ImageIcon("help.jpg");
				JLabel label = new JLabel(icon);
				frame.add(label);
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				frame.pack();
				frame.setLocation(600, 300);
				frame.setVisible(true);
				String soundName = "help2.wav";    
				AudioInputStream audioInputStream;
				try {
					audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
					Clip clip = AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				} catch (UnsupportedAudioFileException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (LineUnavailableException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		save = new JMenuItem("Save");
		
		save.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int resultado = chooser.showSaveDialog(Ventana.this);
				if (resultado == JFileChooser.APPROVE_OPTION) {
					JOptionPane.showMessageDialog(null, "Guardado en: " + chooser.getSelectedFile().getPath());
					titulo = chooser.getSelectedFile().getName();
					Ventana.this.setTitle(titulo);
					String path = chooser.getSelectedFile().getPath() + ".hw26";
					try {
						fw = new FileWriter(path);
						texto.write(fw);
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		
		load = new JMenuItem("Load");
		load.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int resultado = chooser.showOpenDialog(Ventana.this);
				if (resultado == JFileChooser.APPROVE_OPTION) {
					JOptionPane.showMessageDialog(null, "Cargado desde: " + chooser.getSelectedFile().getPath());
					texto.setText("");
					archivo = chooser.getSelectedFile();
					titulo = chooser.getSelectedFile().getName();
					Ventana.this.setTitle(titulo);
					BufferedReader in;
					if (archivo != null) {
						try {
							in = new BufferedReader(new FileReader(archivo));
							String linea = in.readLine();
							while(linea != null){
							  texto.append(linea + "\n");
							  linea = in.readLine();
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
			}
		});
		
		nuevo = new JMenuItem("Nuevo");
		nuevo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (texto.getText().length() != 0) {
					JOptionPane.showMessageDialog(null, "¿Desea guardar su documento antes de crear uno nuevo?");
					int resultado = chooser.showSaveDialog(Ventana.this);
					if (resultado == JFileChooser.APPROVE_OPTION) {
						JOptionPane.showMessageDialog(null, "Guardado en: " + chooser.getSelectedFile().getPath());
						String path = chooser.getSelectedFile().getPath() + ".hw26";
						try {
							fw = new FileWriter(path);
							texto.write(fw);
						} catch (IOException e1) {
							e1.printStackTrace();
						}
						texto.setText("");
						
					} else if (resultado == JFileChooser.CANCEL_OPTION) {
							texto.setText("");
							Ventana.this.setTitle("Sin título: Bloc de Notas");
					}
				}
				
			}
		});
		
		acercaDe = new JMenuItem("Acerca de este bloc de notas");
		acercaDe.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Realizado por Juan Daniel Rubio Camacho A01633924");
			}
		});
		
		tamanoLetra = new JMenuItem("Tamaño Letra");
		tamanoLetra.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tamano = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamaño de letra"));
				texto.setFont(new Font(tipoDeLetra, Font.PLAIN, tamano));
			}
		});
		timesNew = new JMenuItem("Times New Roman");
		timesNew.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				texto.setFont(new Font("Times New Roman", Font.PLAIN, tamano));
				tipoDeLetra = "Times New Roman";
			}
		});
		arial = new JMenuItem("Arial");
		arial.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				texto.setFont(new Font("Arial", Font.PLAIN, tamano));
				tipoDeLetra = "Arial";
			}
		});
		calibri = new JMenuItem("Calibri");
		calibri.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				texto.setFont(new Font("Calibri", Font.PLAIN, tamano));
				tipoDeLetra = "Arial";
			}
		});
		comicSans = new JMenuItem("Comic Sans");
		comicSans.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				texto.setFont(new Font("Comic Sans", Font.PLAIN, tamano));
				tipoDeLetra = "Comic Sans";
				
			}
		});
		
		//area de texto y scroll
		texto = new JTextArea();
		scroll = new JScrollPane(texto);
		
		//añadir a los menus
		barra.add(file);
		barra.add(edicion);
		barra.add(help);
		help.add(noHelp);
		help.add(acercaDe);
		edicion.add(tiposLetra);
		edicion.add(tamanoLetra);
		tiposLetra.add(arial);
		tiposLetra.add(calibri);
		tiposLetra.add(timesNew);
		tiposLetra.add(comicSans);
		file.add(nuevo);
		file.add(save);
		file.add(load);
		
		//añadir a la ventana
		setJMenuBar(barra);
		barra.setPreferredSize(new Dimension(50, 50));
		file.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		edicion.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		help.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		add(scroll, BorderLayout.CENTER);
		setVisible(true);
		
	}
}
