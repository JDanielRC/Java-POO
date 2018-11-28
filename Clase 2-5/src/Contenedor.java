
// tipos genéricos
// 1 problema - si tienes una listas necesitas especificar un tipo
// entre los diamantitos las variables van con mayuscula
public class Contenedor<T, U, V> {
	
	// private int carga; pero quiero más tipos de cosas para poner en mi lista
	private T carga;
	private U carga2;
	private V carga3;
	
	public Contenedor(T carga, U carga2, V carga3) {
		this.carga = carga;
		this.carga2 = carga2;
		this.carga3 = carga3;
	}

	public T getCarga() {
		return carga;
	}

	public U getCarga2() {
		return carga2;
	}

	public V getCarga3() {
		return carga3;
	}

	

}
