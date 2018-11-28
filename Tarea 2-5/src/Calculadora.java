//Realizado por Daniel Rubio
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame implements ActionListener{

	private JButton nueve, ocho, siete, seis, cinco, cuatro, tres, dos, uno, cero, sumar, multiplicar, igual, dividir, restar, reiniciar;
	private JPanel panelNumeros, panelOperaciones, panelIgualCero, panelSalida;
	private JTextField salida, salida2;
	private double resultado = 0, x, xDos, operacion = 0, cont=0;
	
	public Calculadora(String title) {
		super(title);
		setSize(720, 600);
		setLocation(100, 100);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		
		//botones
		nueve = new JButton("9");
		nueve.setFont(new Font("Times New Roman", Font.BOLD, 35));
		nueve.setForeground(Color.WHITE);
		nueve.setBackground(Color.BLACK);
		nueve.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (salida.getText().equals("0")){
					salida.setText("");
					}
				salida.setText(salida.getText() + "9");
				salida2.setText(salida2.getText() + "9");
				x = Double.parseDouble(salida.getText());
			}
			
		});
		ocho = new JButton("8");
		ocho.setFont(new Font("Times New Roman", Font.BOLD, 35));
		ocho.setForeground(Color.WHITE);
		ocho.setBackground(Color.BLACK);
		ocho.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (salida.getText().equals("0")){
					salida.setText("");
					}
				salida.setText(salida.getText() + "8");
				salida2.setText(salida2.getText() + "8");
				x = Double.parseDouble(salida.getText());
			}
			
		});
		siete = new JButton("7");
		siete.setFont(new Font("Times New Roman", Font.BOLD, 35));
		siete.setForeground(Color.WHITE);
		siete.setBackground(Color.BLACK);
		siete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (salida.getText().equals("0")){
					salida.setText("");
					}
				salida.setText(salida.getText() + "7");
				salida2.setText(salida2.getText() + "7");
				x = Double.parseDouble(salida.getText());
			}
			
		});
		seis = new JButton("6");
		seis.setFont(new Font("Times New Roman", Font.BOLD, 35));
		seis.setForeground(Color.WHITE);
		seis.setBackground(Color.BLACK);
		seis.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (salida.getText().equals("0")){
					salida.setText("");
					}
				salida.setText(salida.getText() + "6");
				salida2.setText(salida2.getText() + "6");
				x = Double.parseDouble(salida.getText());
			}
			
		});
		cinco = new JButton("5");
		cinco.setFont(new Font("Times New Roman", Font.BOLD, 35));
		cinco.setForeground(Color.WHITE);
		cinco.setBackground(Color.BLACK);
		cinco.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (salida.getText().equals("0")){
					salida.setText("");
					}
				salida.setText(salida.getText() + "5");
				salida2.setText(salida2.getText() + "5");
				x = Double.parseDouble(salida.getText());
			}
			
		});
		cuatro = new JButton("4");
		cuatro.setFont(new Font("Times New Roman", Font.BOLD, 35));
		cuatro.setForeground(Color.WHITE);
		cuatro.setBackground(Color.BLACK);
		cuatro.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (salida.getText().equals("0")){
					salida.setText("");
					}
				salida.setText(salida.getText() + "4");
				salida2.setText(salida2.getText() + "4");
				x = Double.parseDouble(salida.getText());
			}
			
		});
		tres = new JButton("3");
		tres.setFont(new Font("Times New Roman", Font.BOLD, 35));
		tres.setForeground(Color.WHITE);
		tres.setBackground(Color.BLACK);
		tres.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (salida.getText().equals("0")){
					salida.setText("");
					}
				salida.setText(salida.getText() + "3");
				salida2.setText(salida2.getText() + "3");
				x = Double.parseDouble(salida.getText());
			}
			
		});
		dos = new JButton("2");
		dos.setFont(new Font("Times New Roman", Font.BOLD, 35));
		dos.setForeground(Color.WHITE);
		dos.setBackground(Color.BLACK);
		dos.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (salida.getText().equals("0")){
					salida.setText("");
					}
				salida.setText(salida.getText() + "2");
				salida2.setText(salida2.getText() + "2");
				x = Double.parseDouble(salida.getText());
			}
			
		});
		uno = new JButton("1");
		uno.setFont(new Font("Times New Roman", Font.BOLD, 35));
		uno.setForeground(Color.WHITE);
		uno.setBackground(Color.BLACK);
		uno.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (salida.getText().equals("0")){
					salida.setText("");
					}
				salida.setText(salida.getText() + "1");
				salida2.setText(salida2.getText() + "1");
				x = Double.parseDouble(salida.getText());
			}
			
		});
		cero = new JButton("0");
		cero.setFont(new Font("Times New Roman", Font.BOLD, 35));
		cero.setForeground(Color.WHITE);
		cero.setBackground(Color.BLACK);
		cero.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (salida.getText().equals("0") && cont==0){
					salida.setText("");
					}
				salida.setText(salida.getText() + "0");
				salida2.setText(salida2.getText() + "0");
				x = Double.parseDouble(salida.getText());
				cont=1;
			}
			
		});
		sumar = new JButton("+");
		sumar.setFont(new Font("Times New Roman", Font.BOLD, 45));
		sumar.setForeground(Color.WHITE);
		sumar.setBackground(Color.BLACK);
		sumar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				x = Double.parseDouble(salida.getText());
				salida2.setText(salida2.getText() + " + ");
				salida.setText("");
				xDos = x;
				operacion = 1;
			}
		});
		multiplicar = new JButton("x");
		multiplicar.setFont(new Font("Times New Roman", Font.BOLD, 45));
		multiplicar.setForeground(Color.WHITE);
		multiplicar.setBackground(Color.BLACK);
		multiplicar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				x = Double.parseDouble(salida.getText());
				salida2.setText(salida2.getText() + " x ");
				salida.setText("");
				xDos = x;
				operacion = 2;
				
			}
		});
		dividir = new JButton("/");
		dividir.setFont(new Font("Times New Roman", Font.BOLD, 45));
		dividir.setForeground(Color.WHITE);
		dividir.setBackground(Color.BLACK);
		dividir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				x = Double.parseDouble(salida.getText());
				salida2.setText(salida2.getText() + " / ");
				salida.setText("");
				xDos = x;
				operacion = 3;
			}
		});
		restar = new JButton("-");
		restar.setFont(new Font("Times New Roman", Font.BOLD, 45));
		restar.setForeground(Color.WHITE);
		restar.setBackground(Color.BLACK);
		restar.addActionListener(new ActionListener(
				) {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				x = Double.parseDouble(salida.getText());
				salida2.setText(salida2.getText() + " - ");
				salida.setText("");
				xDos = x;
				operacion = 4;
				
			}
		});
		igual = new JButton("=");
		igual.setFont(new Font("Times New Roman", Font.BOLD, 45));
		igual.setForeground(Color.WHITE);
		igual.setBackground(Color.BLACK);
		igual.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (operacion==1) {
					resultado = x+xDos;
					salida2.setText(salida2.getText() + " = " + resultado + " ");
					salida.setText(resultado + "");
				} else if (operacion==2) {
					resultado = x*xDos;
					salida2.setText(salida2.getText() + " = " + resultado + " ");
					salida.setText(resultado + "");
				} else if (operacion==3) {
					if (x==0) {
						salida.setText("CANT DIVIDE BY 0");
					} //caso curioso, esto lo tenia cuando mis x eran int, entonces daba un error, pero ahora 5/0 o 0/5 da un valor
					resultado = xDos/x;
					salida2.setText(salida2.getText() + " = " + resultado + " ");
					salida.setText(resultado + "");
				} else if (operacion==4) {
					resultado = xDos-x;
					salida2.setText(salida2.getText() + " = " + resultado + " ");
					salida.setText(resultado + "");
				}
				
			}
		});
		reiniciar = new JButton("C/E");
		reiniciar.setFont(new Font("Times New Roman", Font.BOLD, 35));
		reiniciar.setForeground(Color.BLACK);
		reiniciar.setBackground(Color.RED);
		reiniciar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				salida.setText("0");
				salida2.setText("");
				x = 0;
				xDos = 0;
				cont=0;
				
			}
		});
		//panel de numeros 1-9
		panelNumeros = new JPanel();
		panelNumeros.setLayout(new GridLayout(3, 3));
		panelNumeros.add(siete);
		panelNumeros.add(ocho);
		panelNumeros.add(nueve);
		panelNumeros.add(cuatro);
		panelNumeros.add(cinco);
		panelNumeros.add(seis);
		panelNumeros.add(uno);
		panelNumeros.add(dos);
		panelNumeros.add(tres);
		
		//panel con 0 y =
		panelIgualCero = new JPanel(new GridLayout(1,3));
		panelIgualCero.setPreferredSize(new Dimension(50, 100));
		panelIgualCero.add(cero);
		panelIgualCero.add(igual);
		panelIgualCero.add(reiniciar);
		
		//panel con operaciones
		panelOperaciones = new JPanel(new GridLayout(2,2));
		panelOperaciones.setPreferredSize(new Dimension(250, 250));
		panelOperaciones.add(sumar);
		panelOperaciones.add(multiplicar);
		panelOperaciones.add(dividir);
		panelOperaciones.add(restar);
		
		//textField
		salida = new JTextField();
		salida.setPreferredSize(new Dimension(100, 100));
		salida.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		salida.setBackground(Color.lightGray);;
		salida2 = new JTextField();
		salida2.setPreferredSize(new Dimension(10, 10));
		salida2.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		panelSalida = new JPanel(new GridLayout(2, 1));
		panelSalida.add(salida2);
		panelSalida.add(salida);
		
		//añadir a la ventana
		add(panelNumeros, BorderLayout.CENTER);
		add(panelSalida, BorderLayout.NORTH);
		add(panelIgualCero, BorderLayout.SOUTH);
		add(panelOperaciones, BorderLayout.EAST);
		salida.setText("0");
		setVisible(true);
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
