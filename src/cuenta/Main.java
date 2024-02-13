package cuenta;


public class Main {

    
    public static void main(String[] args) {
        CuentaAlcazarGonzalezIsmael2324T4 miCuentaAlcazarGonzalezIsmael2324T4;
        double saldoActual;
        int x;
        
        miCuentaAlcazarGonzalezIsmael2324T4 = new CuentaAlcazarGonzalezIsmael2324T4("Antonio Sánchez","ES55-3058-2365-8522-1234-5678",2500,0);
        System.out.println("Saldo inicial de la cuenta: "+miCuentaAlcazarGonzalezIsmael2324T4.estado()+"€");
        retiraDineroAlcazarGonzalezIsmael(miCuentaAlcazarGonzalezIsmael2324T4);
        
        ingresaDineroAlcazarGonzalezIsmael(miCuentaAlcazarGonzalezIsmael2324T4, "ingreso en cuenta");
        saldoActual = miCuentaAlcazarGonzalezIsmael2324T4.estado();
        System.out.println("El saldo actual es "+ saldoActual );
    }

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
