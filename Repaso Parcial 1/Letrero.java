public class Letrero{
    //miembros - atributos mas comportamientos

    // Atributos
    // caracteristicas descriptivas
    // se representan por medio de variables

    // mdificadores de acceso
    //public - todo mundo puede acceder
    // protected - solo se puede acceder por clase e hijo
    //private - solo la clase puede acceder
    protected double tamanio;

    //metodos accesores (accessor methods)
    //getter y setters
    //- sirven para separar quien lee y quien escribe un atributo
    // this -este! referencia a si mismo (es como decir yo / mio)
    private void setTamanio(double tamanio){this.tamanio = tamanio; }

    public double getTamanio(){return tamanio; }

    //comportamientos -behavior
    //acciones
    //se representan por medio de metodos

    // CONSTRUCTORES
    // hay constructor si no lo definimos?
    // si- default vacio
    // constructor default - no tiene parametros
    // es default porque se invoca automaticamente desde sublaces
    // constructores se pueden sobrecargar n veces
    // se hace diferencia con lista de parametros
    // se llaman igual que la Clase
    // no tiene tipo de retorno

    public Letrero(){
      System.out.println("Constructor default");
      tamanio = 5;
    }

    public Letrero(double tamanio){
      System.out.println("CONSTRUCTOR NO DEFAULT");
      this.tamanio = tamanio;
      }

     public void cambiarTamanio(double tamanio) throws LetreroException{
         if(tamanio<1){
             throw new LetreroException();
         } else {
             this.tamanio = tamanio;
         }
     }
}
