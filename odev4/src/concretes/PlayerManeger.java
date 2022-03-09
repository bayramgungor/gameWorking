package concretes;

import abstracts.PlayerService;
import entities.Game;
import entities.Player;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class PlayerManeger implements PlayerService {

    @Override
    public void add(Player player) {
        System.out.println("oyuncu eklendi :"+player.getFirstName());
    }

    @Override
    public void update(Player player) {
        System.out.println("oyuncu güncellendi :"+player.getFirstName());

    }

    @Override
    public void delete(Player player) {
        System.out.println("oyuncu silindi :"+player.getFirstName());

    }


    @Override
    public void gameWork(Game game) {


    }
}
