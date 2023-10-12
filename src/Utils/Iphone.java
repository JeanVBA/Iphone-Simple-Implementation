package Utils;

import Navegação.FuncoesNet;
import Som.FuncoesMusicais;
import Telefone.FuncoesTelefonicas;

public class Iphone {
    private FuncoesNet net;
    private FuncoesMusicais musica;
    private FuncoesTelefonicas telefone;



    Leitura sc = new Leitura();

    public void setTelefone(FuncoesTelefonicas telefone) {
        this.telefone = telefone;
    }

    public void setMusica(FuncoesMusicais musica) {
        this.musica = musica;
    }

    public void setNet(FuncoesNet net) {
        this.net = net;
    }
    public void exibiPagina(){ net.exibirPagina(""); }
    public void adicionarPagina(){ net.adicionarPagina(); }
    public void atualizarPagina(){ net.atualizarPagina(); }

    public void tocar(){ musica.tocar(); }
    public void pausar(){ musica.pausar(); }
    public void selecionarMusica(){ musica.selecionarMusica(); }

    public void ligar(){ telefone.ligar();}
    public void atender(){ telefone.atender();}
    public void iniciarCorreioVoz(){ telefone.iniciarCorreioVoz();}

    public int funcoesTelefonicas(){
        System.out.println("Telefone:");
        System.out.println("1 - Ligar");
        System.out.println("2 - Atender");
        System.out.println("3 - Escutar Correio de Voz");
        int opcao = sc.nextInt();
        return  opcao;
    }
    public int funcoesMusicais(){
        System.out.println("MP3:");
        System.out.println("1 - Selecionar Musica");
        System.out.println("2 - Tocar Musica");
        System.out.println("3 - Pausar Musica");
        int opcao = sc.nextInt();
        return opcao;
    }
    public int funcoesNet(){
        System.out.println("Navegador:");
        System.out.println("1 - Exibir Pagina");
        System.out.println("2 - Adicionar Pagina");
        System.out.println("3 - AtualizarPagina");
        int opcao = sc.nextInt();
        return opcao;
    }
}
