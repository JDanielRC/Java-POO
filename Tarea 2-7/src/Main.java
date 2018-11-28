
public class Main {

	public static void main(String[] args) {
		
		ArrayList t1;
		t1 = new ArrayList<String>(5);
		t1.add(20);
		t1.add("hola");
		t1.delete(0);
		System.out.println(t1.get(0));
		System.out.println(t1.get(1));
		System.out.println(t1.size());

	}

}
