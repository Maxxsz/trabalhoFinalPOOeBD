package com.example.score4you.match;

public record MatchResponseDTO (Long id, String match_name, Long team_a_id, Long team_b_id, String winner, Long sport_id){
    public MatchResponseDTO(Match match) {
        this(match.getId(), match.getMatch_name(),match.getTeam_a_id(), match.getTeam_b_id(), match.getWinner(), match.getSport_id());
    }
}
