package com.example.score4you.controller;

import com.example.score4you.player.PlayerRequestDTO;
import com.example.score4you.player.PlayerResponseDTO;
import com.example.score4you.player.Player;
import com.example.score4you.player.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Indicando ao spring que a classe é um controller usando a notação @RestController
@RestController
// Mapeando o endpoint "player"
@RequestMapping("player")
public class playerController {
    //instanciando o repositório
    // Notação para indicar ao Spring para injetar dependencias presentes na classe/interface
    @Autowired
    private PlayerRepository playerRepository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    //Indicando ao spring que ao receber um POST no endpoint "player" essa função será chamada
    @PostMapping

    public void savePlayer(@RequestBody PlayerRequestDTO data){
        // Transformando DTO na Entidade
        Player playerData = new Player(data);
        playerRepository.save(playerData);
        return;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    //Indicando ao spring que ao receber um GET no endpoint "player" essa função será chamada
    @GetMapping
    // Classe responsável por retornar uma lista com todos os jogadores registrados
    public List<PlayerResponseDTO> getAll(){
        // stream vai pegar todos esses dados que vieram do findAll e utilizamos o map para criar um Data transfer object para cada um dos objetos
        List<PlayerResponseDTO> playerList = playerRepository.findAll().stream().map(PlayerResponseDTO::new).toList();

        return playerList;
    }
}

