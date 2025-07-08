package modelo;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atender a ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciar o Correio de Voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página da url: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova Aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina ");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando uma música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando uma música");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionar uma música: " + musica);
    }
}
