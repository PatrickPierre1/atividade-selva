package zoo;

public abstract class Animal {
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String nome;
    public abstract void emitirSom();

}
