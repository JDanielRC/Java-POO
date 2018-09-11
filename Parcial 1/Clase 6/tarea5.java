public class tarea5 {
  public static void main(String[] args){

    //crear objeto clock
    //probar metodos con casos especiales
    //hora 23+1
    //minuto 59+1
    //segundos 59+1
    //e imprimir resultado
    //probar todos los metodos disponibles
    //hacer try catch en donde sea necesario
    //agregar throw / throws tambien a metodos donde sea necesario

    Clock c1 = new Clock();
    Clock c2 = new Clock();
    Clock cSet = new Clock();
    Clock cCopiado = new Clock();
    try{
        c2 = new Clock(23, 59, 59);
    } catch(clockException ce){
        ce.printStackTrace();
    }

    try{
        Clock cError = new Clock(45, 24, 90);
    } catch(clockException ce){
        ce.printStackTrace();
    }

    c2.printTime();
    System.out.println(c2.incrementSeconds() + " segundo(s)");
    System.out.println(c2.incrementMinutes() + " minuto(s)");
    System.out.println(c2.incrementHours() + " hora(s)");
    c2.printTime();
    System.out.println(c2.getSeconds() + " segundo(s)");
    System.out.println(c2.getMinutes() + " minuto(s)");
    System.out.println(c2.getHours() + " hora(s)");

    try{
        cSet.setTime(54, 58, 62);
    } catch(clockException ce){
        ce.printStackTrace();
    }

    System.out.println(c2.equalsClock(c1));
    cSet.copy(c2);
    cSet.printTime();
    c2.printTime();
    System.out.println(cCopiado = c2.getCopy());
    cCopiado.printTime();
  }
}
