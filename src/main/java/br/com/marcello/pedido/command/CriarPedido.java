package br.com.marcello.pedido.command;

import br.com.marcello.pedido.model.Pedido;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class CriarPedido extends PedidoComando{
    private final Pedido pedido;

}
