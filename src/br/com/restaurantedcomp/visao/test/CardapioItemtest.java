package br.com.restaurantedcomp.visao.test;

import br.com.restaurantedcomp.visao.CardapioItem;

public class CardapioItemtest {
    public static void main(String[] args) {
        System.out.println("CADASTRO DE ITEM NO RESTAURANTE DCOMP");
        CardapioItem cardapioItem = new CardapioItem();
        int id;
        for(id = 0; id < 2;id++) {
            if (id == 0) {
                cardapioItem.id = id++;
                cardapioItem.nome = "Refrigerante";
                cardapioItem.tamanho = "600ml";
                cardapioItem.preco = Float.parseFloat("6.00");

            } else {
                int id_m;
                id_m = id;
                cardapioItem.id = id_m + 1;
                cardapioItem.nome = "Self Service";
                cardapioItem.tamanho = "8";
                cardapioItem.preco = Float.parseFloat("10.00");
            }
        }
        int i;
        for(i = 0; i < 2; i++) {
            System.out.println("--------------------------");
            System.out.println(cardapioItem.id);
            System.out.println(cardapioItem.nome);
            System.out.println(cardapioItem.tamanho);
            System.out.println(cardapioItem.preco);
            System.out.println("--------------------------");
        }
    }
}
