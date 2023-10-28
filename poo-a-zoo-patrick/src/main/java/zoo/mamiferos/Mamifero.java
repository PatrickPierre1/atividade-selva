package zoo.mamiferos;

import zoo.Animal;

public class Mamifero extends Animal {
    public Boolean getFilhote() {
        return filhote;
    }

    public void setFilhote(Boolean filhote) {
        this.filhote = filhote;
    }

    private Boolean filhote;

    public Mamifero() {
        this.filhote = Boolean.TRUE;
    }

    @Override
    public void emitirSom() {
        System.out.println("som de mamifero");
    }
    public void alimentar(){
        System.out.println(getNome() +" leite materno");
    }
}
