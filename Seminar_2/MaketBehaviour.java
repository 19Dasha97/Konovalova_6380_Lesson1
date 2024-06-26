package Seminar_2;

import java.util.List;

public interface MaketBehaviour {
    
    void acceptToMarket(Actor actor); //входит в магазин
    void releaseFromMarket(List<Actor> actors); // выходит из магазина
    void update(); // обновление состояния магазина
}
