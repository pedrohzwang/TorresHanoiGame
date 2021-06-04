package main;

import estruturas.PilhaLista;
import estruturas.PilhaVetor;

public class Main {
    public static void main(String[] args) throws Exception{
        PilhaLista pl = new PilhaLista();
        Integer integer = 18;
        pl.push("Pedro");
        pl.push(19);
        pl.push(false);
        pl.push(integer);
        pl.pop();
        pl.pop();
        pl.pop();

        System.out.println(pl.toString());
        PilhaVetor pl2 = new PilhaVetor();
        pl2.push("Pedro");
        pl2.push(19);
        pl2.push(false);
        pl2.push(integer);
        pl2.pop();
        pl2.pop();
        pl2.pop();
        System.out.println(pl2.toString());
        System.out.println("----");
        System.out.println("PL: " + pl.vazia() + ", PL2: " + pl2.vazia());
    }
}
