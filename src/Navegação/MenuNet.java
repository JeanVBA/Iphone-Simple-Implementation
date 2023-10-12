package Navegação;

import Utils.Leitura;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MenuNet implements FuncoesNet{
    List<String> guias = new ArrayList<String>();
    Leitura sc = new Leitura();

    public void PrimeiraGuia(){
        guias.add("Google.com");
    }
    @Override
    public void exibirPagina(String pagina) {
        if(pagina == ""){
            if(guias.size() == 0) PrimeiraGuia();
            System.out.println(guias.get(0));
        }
        else System.out.println(pagina);
    }
    @Override
    public void adicionarPagina() {
        System.out.print("Digite nova URL(não adicione WWW): ");
        guias.add(sc.nextString());
        int qtd = Integer.parseInt(String.valueOf(guias.size()));
        qtd = qtd -1;
        System.out.println("Entrando na pagina: "+ guias.get(qtd));
        atualizarPagina();
        exibirPagina(guias.get(qtd));
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina atualizada");
    }
}
