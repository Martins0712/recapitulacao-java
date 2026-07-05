public class VariavelMutavelOuImutavel {
    public static void main(String[] args){

        //As variáveis mutáveis permitem mudanças de valor ao longo do programa,
        // enquanto as imutáveis mantêm o mesmo valor do início ao fim,
        // ajudando a evitar alterações acidentais e tornando o código mais seguro.

        //MUTAVEL
        byte idade = 30;

        idade = 50;

        idade = 120;

        System.out.println(idade);

        //IMUTAVEL

        //Coloque "final" no inicio e a Variavel ficara imutavel, è recomendado sempre ser composta inteiramente maiuscula
        final String NOME = "Luis";

        System.out.println(NOME);

    }
}
