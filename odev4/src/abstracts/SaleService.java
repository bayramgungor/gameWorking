package abstracts;

import entities.Campaigne;
import entities.Game;
import entities.Player;

public interface SaleService {
    public boolean makeSale(Player player, Game game);
    public boolean makeSale(Player player, Game game, Campaigne campaigne);

}
