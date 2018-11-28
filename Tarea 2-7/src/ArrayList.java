
public class ArrayList<T> {
	
	private T[] data, dataNew;
	private int posicionActual, tamanio = 0, tamano;
	
	public ArrayList(int tamano) {
		data = (T[]) new Object[tamano];
	}
	
	public void add(T nuevo) {
		//agrega elemento al final de la estructura y si no cabe se duplica el tamaño
		for(int i=0; i<data.length; i++) {
			if (data[i] == null) {
				data[i] = nuevo;
				posicionActual = i;
				i=data.length;
				}
			}
		}
public void delete(int posicion) {
		
		System.arraycopy(data, posicion + 1, data, posicion, posicionActual -1 - posicion);
		
		posicionActual--;
				
		if(posicionActual < data.length/2) {
			
			T[] temporal = (T[]) new Object[data.length/2];
			
			System.arraycopy(data, 0, temporal, 0, posicionActual);
			
			data = temporal;
		}
	}
	public T get(int posicion) {
		//regresar objeto en posicion
		return data[posicion];
	}
	public int size() {
		//regresa cantidad de datos guardados
		for(int i=0; i<data.length; i++) {
			if (data[i] != null) {
				tamanio = tamanio + 1;
			}
		}
		return tamanio;
	}
}
