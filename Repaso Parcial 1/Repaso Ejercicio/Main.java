import javax.swing.*;
public class Main {

    public static void main(String[] args){

        /*String opcion = "0";
        while (opcion != "8"){
            opcion = JOptionPane.showInputDialog("Seleccione una opción: \n 1) ");
            switch(opcion){
                case "1":

                break;
                case "2":

                break;
                case "3":
            }
        }*/

        Figura figura = new Figura("roja");
        Figura figurin = new Figura();

        System.out.println(figura.getColor());
        System.out.println(figurin.getColor());

        try{
            Poligono triangulo = new Poligono();
            Poligono cuadrado = new Poligono(4, 5, "popo");
            System.out.println(cuadrado.getNLados() + " lados");
            System.out.println(cuadrado.getLado() + " m");
            System.out.println(cuadrado.getColor() + " es el color");
            System.out.println(cuadrado.calculoArea());

            Caja tumbaDeAlex = new Caja(cuadrado, 1.5);
            System.out.println(tumbaDeAlex.getAltura());
            System.out.println(tumbaDeAlex.getBase());
            System.out.println(tumbaDeAlex.getVolumen());
            System.out.println(tumbaDeAlex.getSuperficie());
            figura = cuadrado; //polimorfismo
            System.out.println(figura.getColor());
            int alepsNLados = Integer.parseInt(JOptionPane.showInputDialog("Cuántos lados tiene la figura: "));
            double alepsLado = Double.parseDouble(JOptionPane.showInputDialog("Cuánto mide su lado regular:  "));
            double alepsAltura = Double.parseDouble(JOptionPane.showInputDialog("Cuál es la altura: "));
            String alepsColor = JOptionPane.showInputDialog("Cuál es el color: ");
            Caja tumbaDeAlex2 = new Caja(alepsNLados, alepsLado, alepsAltura, alepsColor);
            System.out.println(tumbaDeAlex2.getAltura());
            System.out.println(tumbaDeAlex2.getBase());
            System.out.println(tumbaDeAlex2.getVolumen());
            System.out.println(tumbaDeAlex2.getSuperficie());
            System.out.println(tumbaDeAlex2.getBase().getColor());

            Poligono error = new Poligono(2, -5, "caca");
        } catch(ExcepcionPoligono ep){
            ep.printStackTrace();
        } finally {
            System.out.println("Dio error baboso");
        }
    }

}
