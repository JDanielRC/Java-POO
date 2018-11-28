public class Repaso{

    public static void main(String[] args){

        /*
        - CLases
        - objetos
        - constructores
        - atributos
        - metodos
        - modificadores de acceso - public, private, protected
        - herencia
        - constructores con herencia
        - poliformismo
        - objetos como atributos (relacion HAS-A)
        - objetos como parametros
        - excepciones
        - throws
        - try - catch - finally
        - arreglos
        - static

        ***EXAMEN QUE NO COMPILE NO SE CALIFICA
        ***IDENTACION O PENALIZACION
        ***CAMEL CASE, MAYUSCULAS CLASES, MINUSCULAS VARIABLES, ETC

        */
        //Declaracion y uso de objetos

        Letrero l, l2, l3;

        //valor default de objeto = nulo
        //momento de CREACION de objetos
        l = new Letrero();
        l2 = new Letrero(5);

        //l, l2 y l3 son referencias
        //primitivos se copian objetos se refieren

        //igualar espacio en memoria, no copia contenido
        l3 = l;
        
        //comparacion espacio de memoria
        if (l3 == l){
            System.out.println("mismo espacio en memoria");
        }

        Etiqueta e1 = new Etiqueta("hola");
        LetreroSalon ls = new LetreroSalon();
        LetreroSalon ls1 = new LetreroSalon(15, "rojo", e1);

        if (e1 == ls1.getEtiqueta()){
            System.out.println("SI FUERON IGUALES");
        }

        //poliformismo - muchas formas
        //un solo objeto puede representar su propia Clase
        //y a su propia clase
        // - un objeto de una superclase no puede representar a una subclase
        // - por medio de Herencoa
        // - los objetos estan restringidos a miembros de la clase que representan

        Letrero l4 = ls1;
        // System.out.println(l4.getColor());  //no podemos, l4 es el padre del hijo, no tiene acceso a esa variable

    }
}
