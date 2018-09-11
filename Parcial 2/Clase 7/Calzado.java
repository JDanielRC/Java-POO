public class Calzado{

    //static
    //static se aplica a un miembro de una clase
    //lo que tiene es en lugar de tener una copia por objeto
    //se tiene una copia por clase

    public static int cantidadDeCalzado = 0;

    public static void saludar(){
        System.out.println("ALOOOOOOOOOOO");
    }

    //sobrecarga
    //redefinicion de metodo con diferente firma al mismo nivel
    //firma de un método - nombre(lista de parámetros)
    //métodos similares con diferentes parámetros
    public void caminar(){
        System.out.println("Caminele klero");
    }

    public void caminar(float distancia){
        System.out.println("camina " + distancia + " metros");
    }

    public void caminar(String nombre){
        System.out.println("Sigue caminando " + nombre + " huevon");
    }


    //sobreescritura

    
}
