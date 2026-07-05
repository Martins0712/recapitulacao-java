import poo.Carro;
import poo.heranca.Moto;

import java.util.Scanner;

public class Main{
        public static void main(String[] args){
                Scanner iUser = new Scanner(System.in);
                Carro carro1 = new Carro();
                carro1.acelerar("Carro esta em movimento");
                carro1.frear("Velocidade do carro foi reduzida");
        }
}


