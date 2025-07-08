import modelo.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println(" ==== REPRODUTOR MUSICAL ===== ");
        iphone.selecionarMusica("Let it be dos Beatles");
        iphone.tocar();
        iphone.pausar();
        System.out.println();


        System.out.println(" ==== LIGAÇÃO ===== ");
        iphone.ligar("00 12344-5678");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        System.out.println();


        System.out.println(" ==== INTERNET ===== ");
        iphone.exibirPagina("https://www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

    }
}
