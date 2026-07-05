package poo.heranca;

public class Veiculo {

    String cor;
    String placa; //Variavel de instancia

    public Veiculo(String cor, String placa) {
        this.cor = cor;
        this.placa = placa;
    }

    public void detalhesveiculo(String veiculo) {
        System.out.printf("O %s tem a cor %s e a placa é %s\n",veiculo , cor, placa);
    }

    public void acelerar(String veiculo){
        System.out.printf("O %s esta em movimento...\n", veiculo);
    }

    public void frear(String veiculo){
        System.out.printf("A velocidade do %s foi reduzida.\n", veiculo);
    }

    public void abastecer(String veiculo, String combustivel){
        System.out.printf("O %s esta sendo abastecido com %s.\n", veiculo, combustivel);
    }
}
