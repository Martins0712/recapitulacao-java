import java.util.Scanner;

public class Concatenacao {
    public static void main(String[] args){

        //Adicione variaveis (STRINGS) a seu texto contatenando

        String nome;
        String idade;
        String profissao;

        Scanner entradaUsuario = new Scanner(System.in);

        System.out.print("Qual é o seu nome: ");
        nome = entradaUsuario.nextLine();
        System.out.print("Qual é a sua idade: ");
        idade = entradaUsuario.nextLine();
        System.out.print("Qual é a sua profissão: ");
        profissao = entradaUsuario.nextLine();
        System.out.println("Meu nome é " + nome + " eu tenho " + idade + " anos e minha profissão é " + profissao);
    }
}
