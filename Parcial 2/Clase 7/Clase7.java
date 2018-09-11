public class Clase7{

    //static
    //override
    //overload

    public static void despedirse(){
        System.out.println("adiooooooo");
    }
    public static void main(String[] args){

        //cuando un elemento es estático se refiere directamente
        //con el nombre de la clase
        Calzado.cantidadDeCalzado = 3; //cuando es estático no ocupas referirte al objeto, solo al nombre de la clase
        System.out.println(Calzado.cantidadDeCalzado);
        Calzado.saludar();

        Calzado c = new Calzado();
        System.out.println(c.cantidadDeCalzado);
        c.cantidadDeCalzado = 2;
        System.out.println(Calzado.cantidadDeCalzado);


        //para invocar métodos desde un método estático deben ser estáticos
        //o pertencer a un objeto
        despedirse();

        c.caminar();
        c.caminar(2);
        c.caminar("Juan");

        Tenis t = new Tenis();
        t.caminar();
        t.caminar(2);
        t.caminar("Guido");
        t.caminar("Juanpi", "Sara");

        //con poliformismo

        Calzado c1 = c;
        Calzado c2 = t;
        c1.caminar();
        c2.caminar();

        c1.caminar(5);
        c2.caminar(5); //porque hicimos c = t y sobreescribimos este metodo en la clase tenis, va a hacer 2 cosas
    }
}
