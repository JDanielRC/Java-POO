import java.util.*;
public class Poligono extends Figura {

    private int nLados;
    private double lado;
    private double apotema;
    private double anguloInterno;

    public int getNLados() {return nLados;}
    public double getLado() {return lado;}


    public Poligono(int nLados, double lado, String color) throws ExcepcionPoligono{
        super(color);
        if (nLados < 2 || lado<=0){
            throw new ExcepcionPoligono();
        } else {
            this.nLados = nLados;
            this.lado = lado;
        }
    }

    public Poligono(){
        super();
        this.nLados = 3;
        this.lado = 1;
    }

    public double calculoApotema(){
        double cot = 1/Math.tan(calculoAngulo()/2);
        this.apotema = (this.lado/2)*cot;
        return this.apotema;
    }

    public double calculoAngulo(){
        this.anguloInterno = 2*Math.PI/this.nLados;
        return this.anguloInterno;
    }
    public double calculoArea(){
        return (this.nLados*this.lado)*calculoApotema()/2;
    }
}
