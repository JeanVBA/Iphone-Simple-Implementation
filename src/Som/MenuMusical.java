package Som;

import Utils.Leitura;

public class MenuMusical implements FuncoesMusicais {

    Leitura sc = new Leitura();
    @Override
    public void tocar() {
        System.out.println("Musica tocando");
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada");
    }

    @Override
    public void selecionarMusica() {
        System.out.print("Qual musica deseja: ");
        String nome = sc.nextString();
        System.out.println("Musica selecionada: "+nome);
        System.out.println("Deseja tocar musica? (1- Sim|| 2-Não)");
        int opcao = sc.nextInt();
        if(opcao ==1) tocar();
        else System.out.println("Musica só selecionada: "+nome);
    }
}
