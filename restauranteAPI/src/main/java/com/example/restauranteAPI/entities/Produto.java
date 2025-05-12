package com.example.restauranteAPI.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private BigDecimal preco;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id_categoria")
    private Categoria categoria;
    @OneToOne(mappedBy = "produto", cascade = CascadeType.ALL)
    private Imagem imagem;
}
