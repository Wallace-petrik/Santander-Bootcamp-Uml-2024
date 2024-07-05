import componentes.dispositivo.Iphone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Iphone meuIphone = new Iphone();

        System.out.println("Digite o número para fazer a ligação: ");
        String numero = teclado.nextLine();
        meuIphone.ligar(numero);
        meuIphone.atender();
        meuIphone.iniciarCorreioVOz();
    }
}
