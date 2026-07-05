import java.util.Scanner;

public class OperadoresAritimeticos {
    public static void main(String[] args){

        //Os operadores aritméticos são utilizados para realizar operações matemáticas em Java.
        // O operador + faz a soma, - faz a subtração, * realiza a multiplicação, / faz a divisão,
        // % retorna o resto da divisão, ++ aumenta o valor da variável em 1 e -- diminui o valor da variável em 1.

        Scanner eUser = new Scanner(System.in);

        int numero1 = 10;
        int numero2 = 20;

        System.out.println("___ARITIMETICOS___");

        System.out.println(numero1 + numero2);
        System.out.println(numero1 - numero2);
        System.out.println(numero1 * numero2);
        System.out.println(numero1 % numero2);
        System.out.println(numero2 / numero1);

        //Operadores Relacionais: ==, !=, >, >=, <, <=

        System.out.println("\n___RELACIONAIS___");

        System.out.println(numero1 == numero2);
        System.out.println(numero1 != numero2);
        System.out.println(numero1 > numero2);
        System.out.println(numero1 >= numero2);
        System.out.println(numero1 < numero2);
        System.out.println(numero1 <= numero2);
    }

}
