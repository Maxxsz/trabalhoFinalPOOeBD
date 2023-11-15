package com.example.score4you.player;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

// Notação informando o nome da tabela no nosso DB
@Table(name = "player")
// Notação informando o nome da entidade
@Entity(name = "player")
// Notações do lombok para gerar getters e construtores necessários
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "player_id")
public class Player {
    @Id // Notação informando qual a chave primária da tabela
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Notação realizando a geração automática do nosso ID(SERIAL dentro do Banco).
    private Long id;
    private String player_name;

    // Construtor para setar os dados.
    public Player(PlayerRequestDTO data) {
        this.id = data.id();
        this.player_name = data.player_name();
    }
}

