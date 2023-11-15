package com.example.score4you.player;
// Data Transfer Object
public record PlayerResponseDTO(Long id, String player_name){
    public PlayerResponseDTO(Player player) {
        //getters criados pelo lombok
        this(player.getId(), player.getPlayer_name());
    }
}
