package figuras.increibles;

import java.awt.Color;
import java.util.LinkedList;
import figuras.increibles.*;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public abstract class Figura {
	// queremos valores parecidos, pero no crear nuevos objetos
	
	private int x, y, tipo;
	private Color color;
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public Color getColor() {
		return color;
	}
	public int getTipo() {
		return tipo;
	}
	
	public Figura(int x, int y, Color color, int tipo) {
		this.x = x;
		this.y = y;
		this.color = color;
		this.tipo = tipo;
	}
	
	public abstract void dibujar(Graphics g);
	
	public String toString() {
		return x + "," + y + "," + tipo + "," + color.getRed() + "," + color.getGreen() + "," + color.getBlue();
	}
}
