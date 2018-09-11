public class Clock {

  private int hr;
  private int min;
  private int sec;

  public Clock(){
    //constructor inicializa atributos en 0
    hr = 0;
    min = 0;
    sec = 0;
  }

  public Clock(int hr, int min, int sec) throws clockException{
    //inicializa atributos con valores PERO
    //verifica si son validos, si no lanza clockException
    if (hr>23 || min>59 || sec>59){
      throw new clockException();
    } else {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
        System.out.println("Válido.");
    }
  }

  public void setTime(int hr, int min, int sec) throws clockException {
    //establece valores de atributos, verifica si son validos si no lanza clockException
    if (hr>23 || min>59 || sec>59 || hr<0 || min<0 || sec<0){
      throw new clockException();
    } else {
      System.out.println("Válido.");
    }
  }

  public int getHours(){
    return hr;
  }

  public int getMinutes(){
    return min;
  }

  public int getSeconds(){
    return sec;
  }

  public void printTime(){
    //imprime la hora completa en un horario legible para humanos
    //ejemplo: 12:30:25
    if (hr<10 && min<10 && sec<10) {
        System.out.println("0" + getHours() + ":0" + getMinutes() + ":0" + getSeconds());
    } else if (hr<10 && min<10) {
        System.out.println("0" + getHours() + ":0" + getMinutes() + ":" + getSeconds());
    } else if (min<10 && sec<10) {
        System.out.println(getHours() + ":0" + getMinutes() + ":0" + getSeconds());
    } else if (hr<10 && sec<10) {
        System.out.println("0" + getHours() + ":" + getMinutes() + ":0" + getSeconds());
    } else if (hr<10) {
        System.out.println("0" + getHours() + ":" + getMinutes() + ":" + getSeconds());
    } else if (min<10) {
        System.out.println(getHours() + ":0" + getMinutes() + ":" + getSeconds());
    } else if (sec<10) {
        System.out.println(getHours() + ":" + getMinutes() + ":0" + getSeconds());
    }

    /*
    String sHr, sMin, sSec;

    if (hr<10)
        sHr = "0" + hr;
    else
        sHr = "" + hr;
    if (min<10)
        sMin = "0" + min;
    else
        sMin = "" + min;
    if (sec<10)
        sSec = "0" + sec;
    else
        sSec = "" + sec;
    */
  }

  public int incrementHours(){
    //incrementa la hora por 1
    //implica ajustes de hora - mas de 23 se vuelve 0
    //regresa la nueva hora
    hr++;
    //o usar hr %= 24;   =    hr = hr % 24;
    if (hr > 23) {
      hr = 0;
    }
      return hr;
  }

  public int incrementMinutes(){
    //incrementa los minutos por 1
    //implica ajustes de minutos - mas de 59 minutos incrementHours
    //incrementHours(); para cuando son mas de 59 mins
    min++;
    if (min > 59) {
      min = 0;
      incrementHours();
    }
      return min;
  }

  public int incrementSeconds(){
    //incrementa los segundos por 1
    //implica ajustes de segundos - cuando son mas de 59 incrementMinutes
    //incrementMinutes();
    //regresa el nuevo segundo
    sec++;
    if (sec > 59) {
      sec = 0;
      incrementMinutes();
    }
      return sec;
  }
  public boolean equalsClock(Clock c){
    if (this.hr == c.hr && this.min == c.min && this.sec == c.sec) {
      return true;
    }
    return false;
    //compara atributos de ambos, si los valores son iguales regresar True
  }
  public void copy(Clock c){
    //copiar atributos de Clock c a este objeto
    this.hr = c.hr;
    this.min = c.min;
    this.sec = c.sec;
  }

  public Clock getCopy(){
    //regresar una NUEVA INSTANCIA de clock con valores identicos a mi
    Clock nuevo = new Clock();
    nuevo.hr = this.hr;
    nuevo.min = this.min;
    nuevo.sec = this.sec;
    return nuevo;
  }
}
