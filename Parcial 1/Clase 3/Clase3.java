public class Clase3 {

    public static void main(String[] args) {

        /*int x = 2;
        int y = x;
        y = 3;
        //los primitivos se copian la información
        System.out.println(x); 3
        System.out.println(y); 2
        System.out.println(x); 3
        */
        // new creación del objeto, e invocación al constructor

        //¿cuál es el valor de un objeto no inicializado?
        //el valor es null
        //Florecita f3;
        // f3.getColor(); <--- daría un error que dice que el objeto no se ha inicializado
        Florecita f1 = new Florecita();
        //f3 = f1; //apunta al espacio de f1, aún no ocupa un espacio pero ya le está apuntando
        System.out.println(f1.getColor());
        //System.out.println(f3.getColor());
        System.out.println(f1.getcantidadDePetalos());
        //System.out.println(f3.getcantidadDePetalos());


        Florecita f2 = new Florecita("azul", 100);
        System.out.println(f2.getColor());
        System.out.println(f2.getcantidadDePetalos());

    }
}
