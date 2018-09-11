//actividad realizada por Daniel Rubio Camacho A01633924

public class Actividad1 {

    public static void main(String[] args) {

        //todas las clases y sus atributos
        Elefantes dumbo;
        dumbo = new Elefantes();
        dumbo.cantidadDeColmillos = 0;
        dumbo.cantidadDePatas = 4;
        dumbo.peso = 950;

        Elefantes mamaDeDumbo;
        mamaDeDumbo = new Elefantes();
        mamaDeDumbo.cantidadDeColmillos = 0;
        mamaDeDumbo.cantidadDePatas = 4;
        mamaDeDumbo.peso = 4000;

        Serpientes ka;
        ka = new Serpientes();
        ka.largoDeSerpiente = 10;
        ka.especieDeSerpiente = "piton";
        ka.color = "cafe";
        Serpientes quetzalcoatl;
        quetzalcoatl = new Serpientes();
        quetzalcoatl.largoDeSerpiente = 5000;
        quetzalcoatl.especieDeSerpiente = "emplumada";
        quetzalcoatl.color = "multicolor";

        Ventilador rowenta;
        rowenta = new Ventilador();
        rowenta.cuantasVelocidades = 3;
        rowenta.numeroDeAspas = 6;
        rowenta.tipoDeVentilador = "piso";
        Ventilador taurus;
        taurus = new Ventilador();
        taurus.cuantasVelocidades = 5;
        taurus.numeroDeAspas = 8;
        taurus.tipoDeVentilador = "techo";

        //comportamiento de cada clase

        //clase elefante
        String nombrePersona = "Daniel";
        int peso = dumbo.peso;
        int cantidadDePatas = dumbo.cantidadDePatas;
        int cantidadDeColmillos = dumbo.cantidadDeColmillos;
        dumbo.estampida(nombrePersona, peso, cantidadDePatas, cantidadDeColmillos);
        dumbo.beberAgua("Dumbo");

        peso = mamaDeDumbo.peso;
        cantidadDePatas = mamaDeDumbo.cantidadDePatas;
        cantidadDeColmillos = mamaDeDumbo.cantidadDeColmillos;
        mamaDeDumbo.estampida(nombrePersona, peso, cantidadDePatas, cantidadDeColmillos);
        mamaDeDumbo.beberAgua("la mama de Dumbo");

        //clase serpiente
        String queVaComer = "un niño humano";
        int largoDeSerpiente = ka.largoDeSerpiente;
        String color = ka.color;
        String especieDeSerpiente = ka.especieDeSerpiente;
        ka.mordida(nombrePersona, largoDeSerpiente);
        ka.comer(queVaComer, especieDeSerpiente, color);

        largoDeSerpiente = quetzalcoatl.largoDeSerpiente;
        color = quetzalcoatl.color;
        especieDeSerpiente = quetzalcoatl.especieDeSerpiente;
        queVaComer = "a esos mugrientos olmecas";
        quetzalcoatl.mordida(nombrePersona, largoDeSerpiente);
        quetzalcoatl.comer(queVaComer, especieDeSerpiente, color);

        //clase ventilador
        String accion = "prender";
        int numeroVelocidad = 2;
        String tipoDeVentilador = rowenta.tipoDeVentilador;
        int cuantasVelocidades = rowenta.cuantasVelocidades;
        int numeroDeAspas = rowenta.numeroDeAspas;
        rowenta.encendidoApagado(nombrePersona, accion, tipoDeVentilador);
        rowenta.velocidad(numeroVelocidad, cuantasVelocidades, numeroDeAspas);

        tipoDeVentilador = taurus.tipoDeVentilador;
        cuantasVelocidades = taurus.cuantasVelocidades;
        numeroDeAspas = taurus.numeroDeAspas;
        accion = "apagar";
        numeroVelocidad = 4;
        taurus.encendidoApagado(nombrePersona, accion, tipoDeVentilador);
        taurus.velocidad(numeroVelocidad, cuantasVelocidades, numeroDeAspas);
    }
}
