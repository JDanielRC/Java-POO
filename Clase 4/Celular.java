public class Celular {

    private String modelo;
    private Pantalla pantalla;

    private void setModelo(String mode) { this.modelo=modelo; }
    public String getModelo() { return modelo; }

    private void setPantalla(Pantalla pantalla) { this.pantalla = pantalla; }
    public Pantalla getPantalla() { return pantalla; }

    public Celular(String modelo, Pantalla pantalla){
        this.modelo = modelo;
        this.pantalla = pantalla;
    }
    public boolean tengoMasPantalla(Celular elOtro){

        return this.getPantalla().getTamano() > elOtro.getPantalla().getTamano();
        //o

        //if(this.getPantalla().getTamano() > elOtro.getPantalla().getTamano()){return true} return false
    }
}
