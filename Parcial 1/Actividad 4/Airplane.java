//actividad realizada por Juan Daniel Rubio Camacho A01633924
public class Airplane extends Vehicle {

    private String aerolinea;
    private int puertasDeEmergencia;

    private void setAerolinea(String aerolinea) { this.aerolinea = aerolinea;}
    public String getAerolinea() { return aerolinea; }

    private void setpuertasDeEmergencia(int puertasDeEmergencia) { this.puertasDeEmergencia = puertasDeEmergencia;}
    public int getPuertasDeEmergencia() { return puertasDeEmergencia; }

    public Airplane() {
        super();
        aerolinea = "Volaris";
        puertasDeEmergencia = 6;
    }

    public Airplane(double speed, int asientos, String aerolinea, int puertasDeEmergencia) {
        super(speed, asientos);
        this.aerolinea = aerolinea;
        this.puertasDeEmergencia = puertasDeEmergencia;
    }

    public void volar(String aerolinea) {
        System.out.println("Volando con la aerolínea " +aerolinea);
    }
}
