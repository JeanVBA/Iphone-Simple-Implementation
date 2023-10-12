import Navegação.MenuNet;
import Som.MenuMusical;
import Telefone.MenuTelefonico;
import Utils.Iphone;
import Utils.Leitura;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        MenuMusical musica = new MenuMusical();
        MenuNet net = new MenuNet();
        MenuTelefonico telefone = new MenuTelefonico();
        Iphone iphone = new Iphone();
        Leitura sc = new Leitura();
        int opcao=0;
        do {
            System.out.println("1 - Acessar Telefone || 2 - Acessar MP3 || 3 - Acessar Navegador || 4 - Sair");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    iphone.setTelefone(telefone);
                    switch (iphone.funcoesTelefonicas()) {
                        case 1:
                            iphone.ligar();
                            break;
                        case 2:
                            iphone.atender();
                            break;
                        case 3:
                            iphone.iniciarCorreioVoz();
                            break;
                    }
                    break;
                case 2:
                    iphone.setMusica(musica);
                    switch (iphone.funcoesMusicais()) {
                        case 1:
                            iphone.selecionarMusica();
                            break;
                        case 2:
                            iphone.tocar();
                            break;
                        case 3:
                            iphone.pausar();
                            break;
                    }
                    break;
                case 3:
                    iphone.setNet(net);
                    switch (iphone.funcoesNet()) {
                        case 1:
                            iphone.exibiPagina();
                            break;
                        case 2:
                            iphone.adicionarPagina();
                            break;
                        case 3:
                            iphone.atualizarPagina();
                            break;
                    }
            }
        }while (opcao != 4);
    }
}