public class ExpresoTec extends Autobus {

    private String ruta;

    private void setRuta(String ruta) { this.ruta = ruta; }
    public String getRuta() {return ruta; }

    public ExpresoTec() {
        System.out.println("Default expreso tec");
        this.ruta = "Lopez Mateos";
    }
    public ExpresoTec(String ruta){
        //como todos son iguales podemos hacer un superconstructor que inicialice todo
        super(2000, 150, 40);
        this.ruta = ruta;
    }
}
