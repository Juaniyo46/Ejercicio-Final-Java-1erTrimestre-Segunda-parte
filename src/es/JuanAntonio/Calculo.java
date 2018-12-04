package es.JuanAntonio;

//Esta clase engloba todos los metodos para realizar los calculos pedidos.

public class Calculo {
    protected String numero;

    public Calculo(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Calculo{" +
                "numero='" + numero + '\'' +
                '}';
    }

    //El siguiente metodo comprueba si un numero de dos o tres cifras maximo es capicua o no.

    public static boolean esCapicua (String numero) {
        boolean result = false;

        if (numero.length() == 2){
            if (numero.charAt(0)==numero.charAt(1)){
                result = true;
            }
        }

        if (numero.length() == 3){
            if (numero.charAt(0)==numero.charAt(2)){
                result = true;
            }
        }

        return result;
    }


    //Este método comprueba si un número de 3 o mas cifras es par o no lo es.

    public static boolean esPar (String numero){
        //Pasamos el número de String a int para realizar los calculos
        int n = Integer.parseInt(numero);
        // La siguiente operación devuelve el resto de dividir numero entre 2.
        if (n%2==0){
            return true;
        } else {
            return false;
        }
    }

    //Este método comprueba si un número (de una sola cifra) es divisible entre 3.
    public static boolean esDivisiblePorTres (String numero){
        int n = Integer.parseInt(numero);
        if (n%3==0){
            return true;
        } else {
            return false;
        }
    }
}
