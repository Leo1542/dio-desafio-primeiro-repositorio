package primeiro.programa;

public class Main {
    public static void main(String[] args){

        //calculadora
        System.out.println("Exercicio calculadora");
        Calculadora.adicao(2, 3, 0);
        Calculadora.subtracao(2, 3, 0);
        Calculadora.divisao(2, 3, 0);
        Calculadora.multiplicacao(2, 3, 0);

        //relógip
        System.out.println("\nExercicio relógio");
        Relogio.Mensagem(10);
        Relogio.Mensagem(15);
        Relogio.Mensagem(22);
    }

}
