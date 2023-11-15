package com.example.score4you.player;
import org.springframework.data.jpa.repository.JpaRepository;

// Interface responsável por se comunicar com o banco de dados.
// JpaRepository já possui os métodos necessários para mexer no banco.
// Passando a Entidade criada e o tipo do ID, no nosso caso, Long.
public interface PlayerRepository extends JpaRepository<Player, Long> {
}
