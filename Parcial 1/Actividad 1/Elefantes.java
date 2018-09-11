public class Elefantes {

    //atributos
    public int cantidadDePatas;
    public int cantidadDeColmillos;
    public int peso;

    //comportamiento
    public void estampida(String nombrePersona, int peso, int cantidadDePatas, int cantidadDeColmillos){
        System.out.println("Cuidado " + nombrePersona);
        System.out.println("¡Un elefante de " + peso + " kilos viene cargando hacia ti con sus " + cantidadDePatas + " patas y " + cantidadDeColmillos + " colmillos");
    }
    public void beberAgua(String nombreElefante){
        System.out.println("Cuidado con " + nombreElefante + ", está bebiendo agua, no lo asusten.");
    }
}
