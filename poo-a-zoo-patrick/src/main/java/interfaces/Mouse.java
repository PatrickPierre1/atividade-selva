package interfaces;

public class Mouse implements Usb{

    @Override
    public void conectar() {
        System.out.println("Conectar o mouse");
    }
}
