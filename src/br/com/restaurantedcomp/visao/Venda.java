package br.com.restaurantedcomp.visao;

import java.util.Date;

public class Venda {
    public Date data; //dia e hora
    public int id;
    public String nome;
    public float total;
    public int qtd_venda;

    public String getNome() {
        return nome;
    }

    public Date getData() {
        return data;
    }

    public float getTotal() {
        return total;
    }

    public int getId() {
        return id;
    }

    public int getQtd_venda() {
        return qtd_venda;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQtd_venda(int qtd_venda) {
        this.qtd_venda = qtd_venda;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "data=" + data +
                ", id=" + id +
                ", nome='" + nome + '\'' +
                ", total=" + total +
                ", qtd_venda=" + qtd_venda +
                '}';
    }
}
