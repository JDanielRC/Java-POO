//actividad realizada por Daniel Rubio Camacho A01633924

public class Ventilador {

    //atributos
    public String tipoDeVentilador;
    public int numeroDeAspas;
    public int cuantasVelocidades;

    //comportamiento
    public void encendidoApagado(String nombrePersona, String accion, String tipoDeVentilador){
        if(accion == "prender") {
            System.out.println("" + nombrePersona + " ha encendido el ventilador de " + tipoDeVentilador);
        }
        else if(accion == "apagar") {
            System.out.println("" + nombrePersona + " ha apagado el ventilador de " + tipoDeVentilador);
        }
    }
    public void velocidad(int numeroVelocidad, int cuantasVelocidades, int numeroDeAspas){
        System.out.println("El ventilador tiene " + cuantasVelocidades + " velocidades");
        System.out.println("Has puesto el ventilador en su velocidad " + numeroVelocidad + ", wow, con sus " + numeroDeAspas + " sí que da mucho aire");
    }
}
