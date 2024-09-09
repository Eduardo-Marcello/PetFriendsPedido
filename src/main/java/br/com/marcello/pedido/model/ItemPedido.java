package br.com.marcello.pedido.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ItemPedido {
    private String nome;
    private int quantidade;
    private BigDecimal preco;
}
