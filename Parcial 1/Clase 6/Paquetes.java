import javax.swing.*;

public class Paquetes{

    public static void main(String[] args) {

        //input!
        String entrada = JOptionPane.showInputDialog("test");
        System.out.println(entrada);

        //parse (no es cast)
        //significa traducir un string a otro tipo de dato

        int ejemploInt = Integer.parseInt(entrada);
        float ejemploFloat = Float.parseFloat(entrada);
        double ejemploDouble = Double.parseDouble(entrada);

        try {
            int hr = Integer.parseInt(JOptionPane.showInputDialog("dame hora"));
            int min = Integer.parseInt(JOptionPane.showInputDialog("dame minuto"));
            int sec = Integer.parseInt(JOptionPane.showInputDialog("dame segundo"));

            Clock c = new Clock();
            Clock c2 = new Clock(hr, min, sec);

            c2.printTime();
            c2.incrementHours();
            c2.incrementMinutes();
            c2.incrementSeconds();
            c2.printTime();
            Clock c3 = c2.getCopy();
            c3.printTime();
            
        } catch(clockException ce){
            ce.printStackTrace();
        } finally {
            //corre en todos los casos, haya habido excepción o no
            //sirve para limpiar
            System.out.println("FINALLY!");
        }

        System.out.println("código post catch");
    }
}
