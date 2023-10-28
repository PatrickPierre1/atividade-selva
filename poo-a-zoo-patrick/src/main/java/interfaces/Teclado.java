package interfaces;

public class Teclado implements Usb{
    @Override
    public void conectar() {
        System.out.println("Conectar o teclado");
    }
}
