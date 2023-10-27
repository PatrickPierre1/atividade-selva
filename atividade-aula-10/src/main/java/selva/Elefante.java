package selva;

public class Elefante extends Herbivoro {

    private String alimentacao;
    private String peso;

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    @Override
    public void emitirSom() {
        System.out.println("Elefante:");
        System.out.println("Tipo de Som: Bramido");
    }

    public void alimentacao() {
        setAlimentacao("Tipo de Alimentação: Grama");
        System.out.println(getAlimentacao());
    }
}
