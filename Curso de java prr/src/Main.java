public class Main {
  public static void main(String[] args){

    String nameLastName = "Luis Martins";
    char option = 'S';
    boolean buttonAtctive = true;

    System.out.println("\nStrings");
    System.out.printf("Opção escolhida: %s\n", option);
    System.out.println(nameLastName + "\n");

  byte idade = 127;
  short estoque = 32767;
  int faturamento = 2147483647;
  long contaCorrente = 9223372036854775807L;

  System.out.println("Inteiros");
  System.out.println(idade);
  System.out.println(estoque);
  System.out.println(faturamento);
  System.out.println(contaCorrente + "\n");

  float real = 10.1234567f;
  double dolar = 50.123456789101112131415;

  System.out.println("Float");
  System.out.println(real);
  System.out.println(dolar);
  }
} 