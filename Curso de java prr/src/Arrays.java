import java.util.Scanner;

public class Arrays {
    public static void main(String[] args){
        
    //Arrays
    String[] listaCompras = {"Bananna", "Carne", "Ovos", "Feijão", "Batata", "Tomate"};


        Scanner iUser = new Scanner(System.in);
        
        System.out.println(listaCompras[4]);
        System.out.println(java.util.Arrays.toString(listaCompras));

        //Arrays permitem armazenar vários valores do mesmo tipo em uma única variável.
        // Cada elemento é acessado por um índice, que sempre começa em 0, facilitando a organização e o acesso aos dados.
    }
}
