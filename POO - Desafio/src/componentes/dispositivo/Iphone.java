package componentes.dispositivo;

import componentes.aparelho.telefoneco.AparelhoTelefonico;
import componentes.navegador.internet.NavegadorInternet;
import componentes.reprodutor.musical.ReprodutorMusical;

import java.util.Scanner;


public class Iphone implements ReprodutorMusical,AparelhoTelefonico,NavegadorInternet {


    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número "+numero);
    }

    @Override
    public void atender() {
        System.out.println("Ligação a tendida");
    }

    @Override
    public void iniciarCorreioVOz() {
        System.out.println("Grave sua mensagem");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Pagina exibida "+ url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrir nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizandopagina");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar música");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("PLay "+musica);
    }
}
