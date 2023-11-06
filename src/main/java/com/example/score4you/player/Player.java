package com.example.score4you.player;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "player")
@Entity(name = "player")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "player_id")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String player_name;

    public Player(PlayerRequestDTO data) {
        this.id= data.id();
        this.player_name = data.player_name();
    }
}

