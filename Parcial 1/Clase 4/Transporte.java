public class Transporte {

    //modificador de acceso
    // public - todo el mundo puede accederlo
    // private - solo la Clase
    // protected - solo la clase y sus subclases o cualquier clase que pertenezca a su arbol
    protected float capacidadInKg;
    protected float velocidadMaxima;

    private void setCapacidadInKg(float capacidadInKg) { this.capacidadInKg = capacidadInKg; }
    public float getCapacidadInKg() { return capacidadInKg; }

    private void setVelocidadMaxima(float velocidadMaxima) { this.velocidadMaxima = velocidadMaxima; }
    public float getVelocidadMaxima() { return velocidadMaxima; }

    public Transporte(float capacidadInKg, float velocidadMaxima) {
        this.capacidadInKg = capacidadInKg;
        this.velocidadMaxima = velocidadMaxima;
    }
    public Transporte() {
        System.out.println("Default transporte");
        capacidadInKg = 5;
        velocidadMaxima = 100;
    }

    public void desplazarse(){
        System.out.println("Moviéndome...");
    }
}
