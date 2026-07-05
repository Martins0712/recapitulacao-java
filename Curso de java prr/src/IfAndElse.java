import java.util.Scanner;

public class IfAndElse {
    public static void main(String[] args){

        //If Significa "Se" e Else significa "Se não"

        byte idade;

        Scanner iUser = new Scanner(System.in);
        System.out.print("Qual sua idade: ");
        idade = iUser.nextByte();

        if (idade < 10){
            System.out.println("Criança");
        }else if (idade <= 17){
            System.out.println("Adolescente");
        }else{
            System.out.println("Adulto");
        }


        //Operadores logicos "OR" "AND" e "||" "&&"

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;

        if (num1 == num2 || num3 < num4){
            System.out.println("Verdadeiro");
        }else {
            System.out.println("Falso");
        }
    }
}
