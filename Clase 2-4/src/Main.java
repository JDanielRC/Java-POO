import java.io.*;
public class Main {

	public static void main(String[] args) {
		
		new Ventana("Bloc Notas");
		
		FileReader fr;
		try {
			fr = new FileReader("textito.txt");
			BufferedReader br = new BufferedReader(fr);
			String linea;
			while((linea = br.readLine()) != null) {
				
				System.out.println(linea);
			}
			br.close();
			FileWriter fw = new FileWriter("textito.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			
			pw.println("linea 1");
			pw.println("linea 2");
			pw.println("hola");
			pw.println("salu2");
			
			pw.close();
			// bw.write("alo");
			// bw.close();
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
