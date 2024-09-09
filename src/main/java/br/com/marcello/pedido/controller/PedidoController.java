package br.com.marcello.pedido.controller;

import br.com.marcello.pedido.model.ItemPedido;
import br.com.marcello.pedido.model.Pedido;
import br.com.marcello.pedido.service.PedidoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/")
public class PedidoController {
    private PedidoService pedidoService;

    @GetMapping
    public List<Pedido> listarPedidos() {
        return pedidoService.listarPedidos();
    }

    @GetMapping("/{id}")
    public Pedido obterPedidoPorId(@PathVariable Long id) {
        return pedidoService.obterPedidoPorId(id);
    }

    @PostMapping("/")
    public void criarPedido(@RequestParam Long id, @RequestBody List<ItemPedido> itens) {
        pedidoService.criarPedido(id, itens);
    }


}
