public class Florecita {

    //encapsulamiento
    //cada objeto se encarga de su función

    //nueva regla, atributos siempre son privados (si se necesita puede ser público)
    private String color;
    private int cantidadDePetalos;

    //métodos accesores
    //separan quien lee y quien escribe una variable

    //PARA QUE LOS DEMAS PROGRAMAS LO PUEDAN USAR
    public String getColor() { return color; }
    private void setColor(String color) { this.color = color; } //this.color, el this. se usa solo para atributos
    //con el public todos pueden leer el color, pero al usar el private no pueden modificarlo, solo esta misma clase puede

    public int getcantidadDePetalos() { return cantidadDePetalos; }
    private void setcantidadDePetalos(int cantidadDePetalos) { this.cantidadDePetalos = cantidadDePetalos; }

    /*constructores
    metodos que se invocan en el momento de creacion del objeto

    siempre tenemos un constructor implícito
    default y vacío

    en el momento que definimos uno, el default vacío se obsolece

    constructor REGLAS
     - se llama igual que la Clase3
     - no regresa ningún tipo de cantidadDePetalos
     - puede tener los parámetros que decidamos
     */

     //CONSTRUCTOR 1
     public Florecita() {
         System.out.println("nació la florecita");
         color = "rojo"; //tambien podria usar setColor("rojo");
         cantidadDePetalos = 10;
     }
     //podemos tener N constructores (infinitos)
     //diferenciarlos por medio de la lista de parámetros
     //tipos de parámetros y orden (que no coincidan tipos u orden)

     //constructor muuuuy común - inicializar atributos
     //CONSTRUCTOR 2
     public Florecita(String color, int cantidadDePetalos) {
         this.color = color; //se usa más este
         setcantidadDePetalos(cantidadDePetalos); //cualquiera de los dos
     }

}
