//TODO el código de java va en clases

public class Clase2 {


    //el código de Java necesita ser compilado
    //compilacion -

    //es obligatorio tener un método main que correr
    //es lo que corre por default
    public static void main(String[] args){

        //Variables - declaración y asignación
        //declarar una variable
        //sintaxis _ tipo nombre:
        byte enteroMenor;
        int entero;
        long enteroLargo;
        float decimal;
        double decimalLargo;
        String texto;
        boolean booleano;

        enteroMenor = 4;
        entero = 15;
        decimal = 4.3f;
        decimalLargo = 2.3;
        texto = "Harneps";
        booleano = true;

        //se puede declarar y asignar de golpe

        int hola = 32;

        //se declara una vez, se asigna n veces

        enteroMenor = 12;

        //estrucutras de control de flujo
        //if - else - if else
        //switch
        //for
        //while
        //do while

        //para ciclos de los que conocemos numeros de repeticiones
        //for(variable de contador; condicion de repeticion; incremento)
        for(int i = 0; i < 10; i++){
            System.out.println("i actual: " + i);
        }
        switch(entero){
            case 1:
            System.out.println("fue 1");
            break;
            case 2:
            System.out.println("fue 2");
            break;
            case 3:
            System.out.println("fue 3");
            break;
            default:
            System.out.println("ño");
            break;
        }
        if (entero==2){
            System.out.println("fue igual");
        } else if (entero == 3){
            System.out.println("fue 3");
        } else {
            System.out.println("en el if no se cumplió ninguna condicion");
        }

        //código para cuando no sabemos cuantas repeticiones hay

        //while(entero==2){
            //System.out.println("Que onda");
        //}
        

    }
}
