//actividad realizada por Juan Daniel Rubio Camacho A01633924
public class Sportscar extends Car {

    private String marca;
    private int numeroCilindros;

    private void setMarca(String marca) { this.marca = marca;}
    public String getMarca() { return marca; }

    private void setNumeroCilindros(int numeroCilindros) { this.numeroCilindros = numeroCilindros; }
    public int getNumeroCilindros() { return numeroCilindros; }

    public Sportscar() {
        super();
        marca = "Toyota";
        numeroCilindros = 4;
    }
    public Sportscar(double speed, int asientos, int numeroLlantas, int year, String marca, int numeroCilindros) {
        super(speed, asientos, numeroLlantas, year);
        this.marca = marca;
        this.numeroCilindros = numeroCilindros;
    }

    public void pisarFondo(String marca, double speed) {
        System.out.println("El carro " +marca+ " pisa a fondo hasta una velocidad de " +speed+ " km/h");
    }
}
