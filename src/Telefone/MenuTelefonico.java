package Telefone;

import Utils.Leitura;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MenuTelefonico implements  FuncoesTelefonicas{
    Leitura sc = new Leitura();
    int ligacoesRecusadas;
    List<String> recadosPossiveis = Arrays.asList("Parabens, voce acaba de ganhar 100 mil reais, basta ligar para nossa central de atendimento para receber seu premio (24 988764567)",
                                                  "Olá, boa tarde. Aqui é o senhorio, seu aluguel está com 2 meses de atraso, se não me pagar até o final do mês, não terei escolha a não ser, chamar as autoridades",
                                                  "Fala my best friend, estou te aguardando a muito tempo na frente do shopping, cade tu?");
    @Override
    public void ligar() {
        System.out.print("Digite o numero telefonico: ");
        String numero = sc.nextString();
        System.out.println("Ligando para: "+numero);
    }

    @Override
    public void atender() {
        System.out.print("Recebendo chamada. Deseja atender? (1 - Sim|| 2 - Não)");
        int atender = sc.nextInt();
        if(atender ==1) System.out.println("Chamada aceita");
        else {
            System.out.println("Chamada recusada");
            ligacoesRecusadas++;
        }
    }
    @Override
    public void iniciarCorreioVoz() {
        if(ligacoesRecusadas == 0)
            System.out.println("Voce tem 0 recados");
        if(ligacoesRecusadas > 0)
            System.out.println("Voce tem "+ligacoesRecusadas+" recados");
        System.out.println("Deseja ouvir os recados? (1 - Sim|| 2 - Não)");
        int atender = sc.nextInt();
        if(atender ==1){
            for(int i=1; i<=ligacoesRecusadas;i++){
                Collections.shuffle(recadosPossiveis);
                System.out.println(recadosPossiveis);
            }
        }
    }
}
