package selva;

public class Tucano extends Ave{
    private String alimentacao;
    private String tamanho;

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    @Override
    public void emitirSom() {
        System.out.println("Tucano:");
        System.out.println("Tipo de Som: Gorjido");
    }

    public void alimentacao() {
        setAlimentacao("Tipo de Alimentação: Frutas");
        System.out.println(getAlimentacao());
    }
}
