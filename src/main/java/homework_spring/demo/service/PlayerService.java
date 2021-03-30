package homework_spring.demo.service;
import homework_spring.demo.repository.PlayerRepository;
import homework_spring.demo.model.Player;
import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PlayerService {

    private final PlayerRepository playerRepository;


    public List<Player> getAllPlayers(){
        return  playerRepository.findAll();
    }


    public void save(Player player){
        playerRepository.save(player);
    }



}


