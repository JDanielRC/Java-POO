//actividad realizada Juan Daniel Rubio Camacho A01633924
public class Dog {

    private int strenght;
    private int speed;
    private String name;
    private Head head;

    public int getStrenght() { return strenght; }
    private void setStrenght(int strenght) {this.strenght = strenght;}
    public int getSpeed() { return speed; }
    private void setSpeed(int speed) {this.speed = speed;}
    public String getName() { return name; }
    private void setName(String name) {this.name = name;}
    public Head getHead() { return head; }
    private void setHead(Head head) {this.head = head;}

    public Dog() {
        System.out.println("Constructor default.");
        strenght = 5;
        speed = 10;
        name = "Charlie";
        this.head = head;
    }
    public Dog(int strenght, int speed, String name, Head head) {
        this.strenght = strenght;
        this.speed = speed;
        this.name = name;
        this.head = head;
    }

    //la variable Dog perro aplica al perro con el que iniciamos el atributo, en el primer caso, Charlie (Charlie.fight(Bucky))
    public void fight(Dog perro) {
        if (this.strenght > perro.getStrenght()) {
              System.out.println(this.name + " gana la pelea");
        } else{
              System.out.println(this.name + " pierde la pelea");
          }
      }
    public void run(Dog perro) {
        if (this.speed > perro.getSpeed()) {
            System.out.println(this.name + " gana la carrera");
      } else{
            System.out.println(this.name + " pierde la carrera");
        }
    }
}
