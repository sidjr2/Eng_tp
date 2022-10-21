package br.com.restaurantedcomp.visao.test;

import br.com.restaurantedcomp.visao.Cardapio;
import br.com.restaurantedcomp.visao.CardapioItem;
import br.com.restaurantedcomp.visao.Venda;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Vendatest {
    public static void main(String[] args) {
        System.out.println("CAIXA RESTAURANTE DCOMP");
        Venda venda = new Venda();
        Date();
        venda.qtd_venda = 2;
        venda.id = 0;
        //venda.nome = "Refrigerante"; tem que ser resgatado usando o id
        venda.total = CalculaTotal(venda.qtd_venda, venda.id);

    }
    public static void Date(){
        Date datah = new Date();
        String data = new SimpleDateFormat("dd/MM/yyyy").format(datah);
        String hora = new SimpleDateFormat("HH:mm:ss").format(datah);
        System.out.println("\nDATA: " + data + "\nHORA: " + hora);
    }

    public static float CalculaTotal(int qtd_venda, int id){
        float total = 1;
        total *= qtd_venda;
        return  total;
    }
}
