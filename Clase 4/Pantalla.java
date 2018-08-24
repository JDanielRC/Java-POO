public class Pantalla {

    private float tamano;

    private void setTamano(float tamano) { this.tamano=tamano; }
    public float getTamano() { return tamano ;}

    public Pantalla(float tamano){
        this.tamano = tamano;
    }
    public void encenderse(){
        System.out.println("Encendiendo...");
    }

    public void romper(){
        this.tamano = 0;
    }
}
