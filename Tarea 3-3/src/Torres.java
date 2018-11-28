
public class Torres { 
    
    public void torreHanoi(int n, char deTorre, char aTorre, char auxiliar) { 
        if (n == 1) { 
            System.out.println("Se mueve el disco 1 de la torre " +  deTorre + " a la torre " + aTorre);
            return; 
        } 
        torreHanoi(n-1, deTorre, auxiliar, aTorre); 
        System.out.println("Se mueve el disco " + n + " de la torre " +  deTorre + " a la torre " + aTorre); 
        torreHanoi(n-1, auxiliar, aTorre, deTorre); 
    } 
} 