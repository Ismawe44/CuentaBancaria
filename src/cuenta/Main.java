package cuenta;
/**
 * Clase que realiza una serie de operaciones (ingresar y retirar dinero)
 * resultado en pantalla con System out.println
 * @author Ismael Alcázar González
 * @since 25/02/2024
 * @version 1.0 25/02/2024
 */

public class Main {
/**
 * Metodo que crea un objeto CuentaAlcazarGonzalezIsmael2324T4 que realiza un saldo inicial
 * luego un ingreso de dinero y finalmente una retirada de dinero imprimiendo por pantalla,
 * el saldo Actual.
 */
    
    public static void main(String[] args) {
        CuentaAlcazarGonzalezIsmael2324T4 miCuentaAlcazarGonzalezIsmael2324T4;
        double saldoActual;// saldo Actual
        int x;
        
        miCuentaAlcazarGonzalezIsmael2324T4 = new CuentaAlcazarGonzalezIsmael2324T4("Antonio Sánchez","ES55-3058-2365-8522-1234-5678",2500,0);//constructor
        System.out.println("Saldo inicial de la cuenta: "+miCuentaAlcazarGonzalezIsmael2324T4.estado()+"€");// imprime por pantalla el saldo actual.
        retiraDineroAlcazarGonzalezIsmael(miCuentaAlcazarGonzalezIsmael2324T4);// retirada de dinero double
        
        ingresaDineroAlcazarGonzalezIsmael(miCuentaAlcazarGonzalezIsmael2324T4, "ingreso en cuenta");// ingreso de dinero double
        saldoActual = miCuentaAlcazarGonzalezIsmael2324T4.estado();// introduce el saldo actual en variable double
        System.out.println("El saldo actual es "+ saldoActual );// imprime por pantalla el saldo Actual
    }

 /* Metodo para ingresar dinero en cuenta utilizando el try y catch*/
    private static void ingresaDineroAlcazarGonzalezIsmael(CuentaAlcazarGonzalezIsmael2324T4 miCuentaAlcazarGonzalezIsmael2324T4, String concepto) {
        int x;
        try
        {
            x=100;
            System.out.println("Ingreso en cuenta de "+x+"€");
            miCuentaAlcazarGonzalezIsmael2324T4.ingresar(x);
        } catch (Exception e)
        {
            System.out.print("Fallo al ingresar");
        }
    }
/* Metodo para retirar dinero en cuenta utilizando el try y catch*/
    private static void retiraDineroAlcazarGonzalezIsmael(CuentaAlcazarGonzalezIsmael2324T4 miCuentaAlcazarGonzalezIsmael2324T4) {
        int x;
        try
        {
            x=1500;
            System.out.println("Retirada en cuenta de "+x+"€");
            miCuentaAlcazarGonzalezIsmael2324T4.retirar(x);
        } catch (Exception e)
        {
            System.out.print("Fallo al retirar");
        }
    }

}
