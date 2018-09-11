//HERENCIA
//especializacion
// - crear una clase que es un subconjunto especifico de otras
// - por logica del subconjunto tiene acceso a atributos y comportamiento
//del superconjunto (subclase/superclase)
//relacions "IS A" o "ES UN"
public class Autobus extends Transporte{

    private int cantidadDeAsientos;

    private void setCantidadDeAsientos(int cantidadDeAsientos) { this.cantidadDeAsientos = cantidadDeAsientos; }
    public int getCantidadDeAsientos() { return cantidadDeAsientos; }

    //SIEMPRE invocamos a un supercontructor
    //si no es explicito invocamos el default
    //superconstructor - constructor de la superclase

    //cuando no definimos constructor - default vacío

    public Autobus() {
        //sigo sin invocar constructor, sin embaro se invoca
        //como invocar un superconstructor
        //DEBE SER la primera linea de codigo del constructor
        super();
        System.out.println("Default autobus");
        cantidadDeAsientos = 10;
    }

    public Autobus(float capacidadInKg, float velocidadMaxima, int cantidadDeAsientos) {
        //invocando a un superconstructor
        //si no se especifica se invoca el default obviamente
        //de otra manera se invoca el explicito
        super(capacidadInKg, velocidadMaxima);
        this.cantidadDeAsientos = cantidadDeAsientos;
        //si los atributps de transporte no estuvieran en protected daría error
        /*this.capacidadInKg = capacidadInKg;
        this.velocidadMaxima = velocidadMaxima; */
       }
}
