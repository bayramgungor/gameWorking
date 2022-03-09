import concretes.PlayerManeger;
import concretes.SaleManager;
import entities.Campaigne;
import entities.Game;
import entities.Player;
import entities.Sale;

public class Main {

    public static void main(String[] args) {
        Player player=new Player(1,"263564","bayram","güngör");
        Game game=new Game(1,"Volarant",1000);
        Campaigne campaigne=new Campaigne(1,"kampanya",10);
        Sale sale=new Sale(1);
        PlayerManeger maneger=new PlayerManeger();
        SaleManager saleManager=new SaleManager();
        saleManager.makeSale(player,game,campaigne);
        maneger.add(player);


    }
}
