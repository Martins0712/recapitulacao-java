public class ClassWrappers {
    public static void main(String[] args){
        //Classes Wrappers
        //Classes Wrapper são classes que representam os tipos primitivos como objetos.
        // Elas permitem usar valores primitivos em situações onde o Java exige objetos, como em coleções (ArrayList, HashMap) e generics.
        // O Java faz a conversão automaticamente entre primitivos e Wrappers por meio do autoboxing (primitivo → objeto) e do unboxing (objeto → primitivo).
        // Exemplos: int → Integer, double → Double, char → Character e boolean → Boolean.

        Byte idade = 120;
        Short estoque = 32767;
        Integer numero = 2147483647;
        Long contaCorrente = 9223372036854775807L;
        Float real = 50.0f;
        Double dolar = 100.500;
        Character meuNumero = '2';
        Boolean ativado = true;
    }
}
