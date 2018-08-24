//actividad realizada por Daniel Rubio Camacho A01633924

public class Clase2b {

    //método principal

    public static void main(String[] args) {

    //objetos = instancias
    //declaracion - identica a Variables
    //el idiom de variables permanece - nombre de objetos en minuscula

    Perrito firulais; //voy a tener un perrito que se llame firulais

    //objetos deben ser inicializados
    //los objetos "nacen"
    firulais = new Perrito(); //aquí ya "nace" firulais, es decir, ya está en el programa
    Perrito fifi = new Perrito(); //aquí es la declaracion y ya igual nace (declaramos e inicializamos)

    //para acceder a un miembro(variable = atributo - comportamiento) de un objeto usamos el punto (firulais.cantidadDePatas)
    firulais.cantidadDePatas = 3;
    fifi.cantidadDePatas = 4;

    firulais.raza = "Callejero";
    fifi.raza = "French poodle";

    System.out.println(firulais.cantidadDePatas);
    System.out.println(fifi.raza);

    firulais.cantidadDePatas = fifi.cantidadDePatas;
    fifi.ladrar("Mayra");
    firulais.ladrar("Eduardo");

    //para ejecutar el programa es en cmd java Clase2b
    //para entrar a ciertas carpetas desde cmd es cd (nombrecarpeta)
    //para ir una carpeta atrás es con cd ..
    //para ver el directorio es dir
    }
}
