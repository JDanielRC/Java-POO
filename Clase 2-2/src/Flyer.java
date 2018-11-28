//interfaz es una clase ligera
// en java de cuántas clases podemos heredar?
// 1 sola!!
// hay situaciones en las que queremos compartir un comportamiento
// entre clases que pueden no estar relacionadas
// las interfaces se implementan (vs heredan)
// no podemos inicializar un objeto de una interfaz
//para utilizar una interfaz debe ser implementada
// utilidad o intencion = definir un contrato - firma de una clase


public interface Flyer {
	
	//NO tiene atributos
	// los metodos son solo firmas (como los metodos abstractos)
	
	public void despegar();
	public void aterrizar();
	
}
