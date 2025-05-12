package com.example.restauranteAPI.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Blob;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Imagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeArquivo;
    private String tipoArquivo;
    @Lob
    private Blob image;
    private String downloadUrl;
    @OneToOne
    @JoinColumn(name = "id_produto")
    private Produto produto;


}
