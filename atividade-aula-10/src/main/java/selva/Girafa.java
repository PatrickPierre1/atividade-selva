package selva;

public class Girafa extends Herbivoro{
    private String alimentacao;

    private String altura;

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }


    @Override
    public void emitirSom() {
        System.out.println("Girafa:");
        System.out.println("Tipo de Som: Zumbido");
    }

    public void alimentacao() {
        setAlimentacao("Tipo de Alimentação: Maça");
        System.out.println(getAlimentacao());
    }


}
