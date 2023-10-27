package selva;

public class Papagaio extends Ave{
    private String alimentacao;
    private String colaracao;

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    public String getColaracao() {
        return colaracao;
    }

    public void setColaracao(String colaracao) {
        this.colaracao = colaracao;
    }

    @Override
    public void emitirSom() {
        System.out.println("Papagaio:");
        System.out.println("Tipo de Som: Falar");
    }

    public void alimentacao() {
        setAlimentacao("Tipo de Alimentação: Sementes");
        System.out.println(getAlimentacao());
    }
}
