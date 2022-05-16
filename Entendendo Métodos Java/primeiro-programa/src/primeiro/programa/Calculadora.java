package primeiro.programa;

public class Calculadora {

    int numero1=0, numero2=0, resultado=0;

    public static void multiplicacao(int numero1,int numero2,int resultado){
            resultado = numero1 * numero2;
            System.out.println(numero1 + " multiplicador por " + numero2 + " é " + resultado);
    }
    public static void adicao(int numero1,int numero2,int resultado){
        resultado = numero1 + numero2;
        System.out.println(numero1 + " somado com " + numero2 + " é " + resultado);
    }
    public static void subtracao(int numero1,int numero2,int resultado) {
        resultado = numero1 - numero2;
        System.out.println(numero1 + " subtraido de " + numero2 + " é " + resultado);
    }

    public static void divisao(int numero1,int numero2,int resultado){
        resultado = numero1 / numero2;
        System.out.println(numero1 + " dividido por  " + numero2 + " é " + resultado);
    }
}
