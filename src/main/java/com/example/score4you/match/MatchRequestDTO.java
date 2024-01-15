package com.example.score4you.match;

public record MatchRequestDTO(Long id, String match_name, Long team_a_id, Long team_b_id, String winner, Long sport_id) {
}
