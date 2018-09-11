//actividad realizada por Daniel Rubio A01633924
public class Car {

    private String modelo;
    private int year;

    public String getModelo() { return modelo; }
    private void setModelo(String modelo) {this.modelo = modelo;}

    public int getYear() { return year; }
    private void setYear(int year) {this.year = year;}

    public Car() {
        System.out.println("Constructor default");
        modelo = "Fiesta";
        year = 2004;
    }

    public Car(String modelo, int year) {
        this.modelo=modelo;
        this.year=year;
    }
    public void arrancado(int velocidad){
        System.out.println("Y el auto arrrrrraaanca con una velocidad de " + velocidad + " kilómetros por hora!");
    }
    public void presumir(String modelo, int year){
        System.out.println("Tengo un grandioso " + modelo + " del año " + year + " y tu no. JA.");
    }
}
