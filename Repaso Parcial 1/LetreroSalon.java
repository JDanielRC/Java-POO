//herencia
// - especializacion
// - mecanismo de rehuso - miembros del padre son accesibles para el hijo
// SIEMPRE Y CUANDO LOS ATRIBUTOS PADRE SEAN PROTECTED
public class LetreroSalon extends Letrero{

    //constructores en herencia
    //SIEMPRE INVOCAMOS UN SUPERCONSTRUCTOR
    //superconstructor - constructor de superclase
    //superclase - clase de donde heredamos

    private String color;
    private Etiqueta etiqueta;

    public String getColor() {return color;}
    //un objeto puede ser un atributo
    public Etiqueta getEtiqueta() {return etiqueta;}

    public LetreroSalon(){

        //INVOCACION AL CONSTRUCTOR default
        //puede ser implicita o explicita
        super();
        System.out.println("DEFAULT HIJO");
        color = "azul";
    }

    public LetreroSalon(double tamanio, String color, Etiqueta etiqueta){

        //invocando un constructor no default
        super(tamanio);
        this.color = color;
        this.etiqueta = etiqueta;
        System.out.println("CONSTRUCTOR NO DEFAULT HIJO");
    }
}
