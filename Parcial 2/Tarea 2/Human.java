//tarea realizada por Daniel Rubio A01663924
public class Human{

    protected double speed;
    protected String name;
    protected double strength;

    public double getSpeed() {return speed;}
    public double getStrength() {return strength;}
    public String getName() {return name;}


    public Human(double speed, String name, double strength){
        this.speed = speed;
        this.name = name;
        this.strength = strength;
    }

    public void run(){
        System.out.println("GOTTA GO FAST");
    }

    public void run(String objeto){
        System.out.println("GOTTA GO F... UN " + objeto + " WEEEEE!");
    }

    public void run (double velocidad){
        System.out.println("GOTTA GO AT " + velocidad + " KILOMETERS PER SECONDS");
    }

}
