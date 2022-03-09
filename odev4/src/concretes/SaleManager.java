package concretes;

import abstracts.SaleService;
import entities.Campaigne;
import entities.Game;
import entities.Player;

public class SaleManager implements SaleService {


    @Override
    public boolean makeSale(Player player, Game game) {
        System.out.println(player.getFirstName()+"adlı oyuncu  "+game.getName()+" oyununu satın aldı ");
        return false;
    }

    @Override
    public boolean makeSale(Player player, Game game, Campaigne campaigne) {
        int priceOfGame=game.getPrice();
        double countOfDiscount=campaigne.getDiscount();
        double totalPrice=priceOfGame-(countOfDiscount*priceOfGame)/100;

        System.out.println(player.getFirstName()+" adlı oyuncu  "+game.getName()+"   adlı oyunu"+totalPrice+" şu fiyata satın aldı.  ");
        return false;
    }
}
