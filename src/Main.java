import modelo.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println(" ==== REPRODUTOR MUSICAL ===== ");
        iphone.selecionarMusica("Let it be dos Beatles");
        iphone.tocar();
    }
}
