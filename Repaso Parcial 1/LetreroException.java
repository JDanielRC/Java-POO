//excepciones
// - mecanismo para manejo de errores en ejecucion
// - se lanzan y se cachan
// - sirven para fallar con gracia (no interrumpir el programa en caso de un error)
public class LetreroException extends Exception{

    public LetreroException(){
        super("LETRERO EXCEPTION LANZADA");
    }
}
