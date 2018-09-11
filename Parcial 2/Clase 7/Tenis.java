public class Tenis extends Calzado{

    //la sobrecarga se puede hacer con todo y herencia

    public void caminar(String n1, String n2){
        System.out.println("Animo " + n1 + ", " + n2 + " ya esta a la vista");
        }

        //sobreescritura
        //redefinicion de un metodo del padre con EXACTAMENTE la misma firma
        //INDISPENSABLE herencia

        //2 usos comunes - redefinir la logica de un metodo por completo
        // - o agregar comportamiento a lo que ya existía

        public void caminar(){
            System.out.println("Metodo sobreescrito");
        }

        public void caminar(float distancia){

            //invocando una superversion
            super.caminar(distancia);
            System.out.println("Version sobreescrita (clase hija) + lo que hace la clase padre");
        }
}
