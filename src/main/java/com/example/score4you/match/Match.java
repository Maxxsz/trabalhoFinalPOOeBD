package com.example.score4you.match;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "match")
@Entity(name = "match")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
//@NamedQuery(name = "Player.findByMatch", query = "select Player.player_name from Player where player_name != null")
public class Match{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String match_name;
    private Long team_a_id;
    private Long team_b_id;
    private String winner;
    private Long sport_id;

    public Match(MatchRequestDTO data) {
        this.id = data.id();
        this.match_name = data.match_name();
        this.team_a_id = data.team_a_id();
        this.team_b_id = data.team_b_id();
        this.winner = data.winner();
        this.sport_id = data.sport_id();
    }
}
