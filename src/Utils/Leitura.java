package Utils;

import java.util.Scanner;

public class Leitura {
    private Scanner sc;
    public Leitura(){
        sc = new Scanner(System.in);
    }
    private static Leitura instancia = null;
    public static Leitura getInstancia()
    {
        if (instancia==null)
            instancia = new Leitura();
        return instancia;
    }
    public String nextString()
    {
        return sc.nextLine();
    }

    public int nextInt()
    {
        int v = sc.nextInt();
        sc.nextLine();
        return v;
    }

    public double nextDouble()
    {
        double v = sc.nextDouble();
        sc.nextLine();
        return v;
    }
}
