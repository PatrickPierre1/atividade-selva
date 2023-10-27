package selva;

public class Leao extends Carnivoro {
    private String alimentacao;
    private String forca;

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    public String getForca() {
        return forca;
    }

    public void setForca(String forca) {
        this.forca = forca;
    }

    @Override
    public void emitirSom() {
        System.out.println("Leão:");
        System.out.println("Tipo de Som: Rugido");
    }

    public void alimentacao() {
        setAlimentacao("Tipo de Alimentação: carne de cervo");
        System.out.println(getAlimentacao());
    }
}
