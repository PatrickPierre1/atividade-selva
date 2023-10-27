package selva;

public class Hiena extends Carnivoro {
    private String alimentacao;
    private String velocidade;

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    public String getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(String velocidade) {
        this.velocidade = velocidade;
    }
    @Override
    public void emitirSom() {
        System.out.println("Hiena:");
        System.out.println("Tipo de Som: Risada");
    }

    public void alimentacao() {
        setAlimentacao("Tipo de Alimentação: Carcaças");
        System.out.println(getAlimentacao());
    }
}
