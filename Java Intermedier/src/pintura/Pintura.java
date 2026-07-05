package pintura;

public class Pintura<E extends Pintavel> {
    private E coisaQueVouPintar;
    private String tipo;
    private String marca;
    private double preco;

    public Pintura(E coisaQueVouPintar, String marca, double preco, String tipo) {
        this.coisaQueVouPintar = coisaQueVouPintar;
        this.marca = marca;
        this.preco = preco;
        this.tipo = tipo;
    }

    public E getCoisaQueVouPintar() {
        return coisaQueVouPintar;
    }

    public void setCoisaQueVouPintar(E coisaQueVouPintar) {
        this.coisaQueVouPintar = coisaQueVouPintar;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
