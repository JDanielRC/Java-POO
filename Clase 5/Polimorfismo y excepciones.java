public class PoliformismoYExcepciones {

    public void metodoRiesgoso() throws EjemploException{

        if(edadDelCarro < 0){
            throw new EjemploException();
        } else{
            System.out.println("Edad válida");
        }
    }

        //casting
        //convertir tipos
        //no hay certeza que sean compatibles

        //throws TIENE la posibilidad de lanzar una excepecion
        //no significa que la vaya a lanzar siempre

}
