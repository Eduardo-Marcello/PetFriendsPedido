package br.com.marcello.pedido.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data // gera getters e setters
@AllArgsConstructor //constructos com atributos
@NoArgsConstructor // constructo vazio
@ToString
@Table(schema = "pedidos")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private List<ItemPedido> itens;
}
