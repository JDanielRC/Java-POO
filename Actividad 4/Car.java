//actividad realizada por Juan Daniel Rubio Camacho A01633924
public class Car extends Vehicle {

    protected int numeroLlantas;
    protected int year;

    private void setNumeroLlantas(int numeroLlantas) { this.numeroLlantas = numeroLlantas; }
    public int getNumeroLlantas() { return numeroLlantas;}

    private void setYear(int year) { this.year = year;}
    public int getYear() { return year; }

    public Car() {
        super();
        numeroLlantas = 4;
        year = 2009;
    }

    public Car(double speed, int asientos, int numeroLlantas, int year) {
        super(speed, asientos);
        this.numeroLlantas = numeroLlantas;
        this.year = year;
    }

    public void arrancar(double speed) {
        System.out.println("El carro arranca a una velocidad de " +speed+ ( " km/h"));
    }

}
