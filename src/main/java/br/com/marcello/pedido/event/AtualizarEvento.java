package br.com.marcello.pedido.event;

import br.com.marcello.pedido.model.ItemPedido;

import java.util.List;


public class AtualizarEvento extends PedidoEvento{
    private final List<ItemPedido> itens;

    public AtualizarEvento(Long id, List<ItemPedido> itens) {
        this.itens = itens;
    }

    public void PedidoAtualizadoEvento(String id, List<ItemPedido> itens) {
        this.itens.get(0).setNome(itens.get(0).getNome());
        this.itens.get(0).setQuantidade(itens.get(0).getQuantidade());
        this.itens.get(0).setPreco(itens.get(0).getPreco());
    }

}
