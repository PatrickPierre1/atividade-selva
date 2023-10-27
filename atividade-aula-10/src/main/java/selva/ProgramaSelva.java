package selva;

public class ProgramaSelva {
    public static void main(String[] args) {

        // Iniciando Herbívoros
        Animal elefante = new Elefante();
        Animal girafa = new Girafa();

        // Iniciando Carnívoros
        Animal leao = new Leao();
        Animal hiena = new Hiena();

        // Iniciando Aves
        Animal papagaio = new Papagaio();
        Animal tucano = new Tucano();


        elefante.emitirSom();
        elefante.alimentacao();

        girafa.emitirSom();
        girafa.alimentacao();


        leao.emitirSom();
        leao.alimentacao();


        hiena.emitirSom();
        hiena.alimentacao();

        papagaio.emitirSom();
        papagaio.alimentacao();


        tucano.emitirSom();
        tucano.alimentacao();

    }
}
