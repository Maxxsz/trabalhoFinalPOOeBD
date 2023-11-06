package com.example.score4you.player;

public record PlayerResponseDTO(Long id, String player_name){
    public PlayerResponseDTO(Player player) {
        this(player.getId(), player.getPlayer_name());
    }
}
