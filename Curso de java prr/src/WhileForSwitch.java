import java.util.Scanner;

public class WhileForSwitch {
    public static void main(String[] args){

        //WHILE

        String[] listaCompras = {"Bananna", "Carne", "Ovos", "Feijão", "Batata", "Tomate"};

        int indice = 0;

        while (listaCompras.length <= 6){
            System.out.println(listaCompras[indice]);
            indice++;
        }

        //FOR

        for (indice = 0; listaCompras.length <= 7; indice++){
            System.out.println(listaCompras[indice]);
        }

        //SWITCH

        byte opcBank;

        Scanner iUser = new Scanner(System.in);
        System.out.print("Escolha uma opção:" +
                "1 - Ver fatira dp cartão\n" +
                "2 - Saldo conta corrente\n" +
                "3 - Poupança \n" +
                "4 - Cambio\n" +
                "\n" +
                "Escolha: ");
        opcBank = iUser.nextByte();

        switch (opcBank){

            case 1:
                System.out.println("Ver fatura do cartão");
                break;

            case 2:
                System.out.println("Saldo conta corrente");
                break;

            case 3:
                System.out.println("Poupança");
                break;

            case 4:
                System.out.println("Cambio");
                break;

            default:
                System.out.println("Nenhuma opção valida selecionada");
        }
    }
}
