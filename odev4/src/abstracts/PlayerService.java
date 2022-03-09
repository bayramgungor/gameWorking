package abstracts;

import entities.Game;
import entities.Player;

public interface PlayerService {
    public void add(Player player);
    public void update(Player player);
    public void delete(Player player);
    public void gameWork(Game game);
}
