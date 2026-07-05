package Carro;

import pintura.Pintavel;

public class Carro implements Pintavel {
    String modelo;
    String cor;
    int ano;
    String Placa;

    public Carro(int ano, String cor, String modelo, String placa) {
        this.ano = ano;
        this.cor = cor;
        this.modelo = modelo;
        Placa = placa;
    }

    public void ligar(){
        System.out.println("Carro ligado");
    }

    public void desligar(){
        System.out.println("Carro desligado");
    }

    @Override
    public void aplicarTinta() {

    }

    @Override
    public String getCor() {
        return "";
    }

    @Override
    public void setCor(String cor) {

    }

    @Override
    public String getTipo() {
        return "";
    }

    @Override
    public void setTipo(String tipo) {

    }

    @Override
    public String getMarca() {
        return "";
    }

    @Override
    public void setMarca(String marca) {

    }

    @Override
    public double getPreco() {
        return 0;
    }

    @Override
    public void setPreco(double preco) {

    }
}
