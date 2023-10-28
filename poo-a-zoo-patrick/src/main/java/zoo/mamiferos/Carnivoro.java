package zoo.mamiferos;

import zoo.Animal;

public class Carnivoro extends Mamifero {
    @Override
    public void alimentar() {
        if (getFilhote()) super.alimentar();
        if (!getFilhote()) System.out.println(getNome() +" Carnes");
    }
}
