package br.com.marcello.pedido.service;

import br.com.marcello.pedido.event.AtualizarEvento;
import br.com.marcello.pedido.event.PedidoEvento;
import br.com.marcello.pedido.model.ItemPedido;
import br.com.marcello.pedido.model.Pedido;
import br.com.marcello.pedido.repository.PedidoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PedidoService {
    private PedidoRepository pedidoRepository;

    public List<Pedido> listarPedidos() {
        return pedidoRepository.findAll();
    }

    public Pedido obterPedidoPorId(Long id) {
        return pedidoRepository.findById(id).orElse(null);
    }

    public void PedidoCommandService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public void criarPedido(Long id, List<ItemPedido> itens) {
        Pedido pedido = new Pedido(id, itens);
        pedidoRepository.save(pedido);

        PedidoEvento evento = new AtualizarEvento(id, itens);
    }
}
