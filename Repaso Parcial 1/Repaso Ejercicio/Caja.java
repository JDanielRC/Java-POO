public class Caja {

    private Poligono base;
    private double altura, volumen, superficie;

    public Poligono getBase() {return base;}
    public double getAltura() {return altura;}
    public double getVolumen() {return volumen();}
    public double getSuperficie() {return superficie();}

    public Caja(Poligono base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public Caja(int nLados, double lado, double altura, String color) throws ExcepcionPoligono{
        this.base = new Poligono(nLados, lado, color);
        this.altura = altura;
    }

    public double volumen(){
        this.volumen = base.calculoArea() * this.altura;
        return this.volumen;
    }
    public double superficie(){
        this.superficie = (base.calculoArea()*2) + (base.getLado() * this.altura) * base.getNLados();
        return this.superficie;
    }
}
