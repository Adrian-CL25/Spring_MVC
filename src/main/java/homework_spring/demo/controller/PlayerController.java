package homework_spring.demo.controller;
import homework_spring.demo.model.Player;
import homework_spring.demo.service.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@AllArgsConstructor
@RequestMapping("/")


public class PlayerController {

    private final PlayerService service;

    @RequestMapping( "/")
    public String showPlayerPage(Model model) {
        List<Player> playerList = service.getAllPlayers();
        model.addAttribute("player", playerList);
        return "players";

    }

    @RequestMapping("/new")
    public String showNewPlayer(Model model) {
        Player newPlayer = new Player();
        model.addAttribute("newPlayer", newPlayer);
        return "new_player";

    }


    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String savePlayer(@ModelAttribute("player") Player player) {
        service.save(player);
        return "redirect:/";
    }


}
