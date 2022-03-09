package concretes;

import abstracts.GameService;
import entities.Game;

public class GameManager implements GameService {
    @Override
    public void add(Game game) {
        System.out.println("oyun eklendi :"+game.getName());

    }

    @Override
    public void uptade(Game game) {
        System.out.println("oyun güncellendi :"+game.getName());
    }

    @Override
    public void delete(Game game) {
        System.out.println("oyun silimdi :"+game.getName());
    }
}
