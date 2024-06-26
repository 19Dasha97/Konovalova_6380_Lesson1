// Класс Market, который реализовывает два
// вышеуказанных интерфейса и хранит в списке
// список людей в очереди в различных статусах
// Реализовать класс Market и
// все методы, которые он
// обязан реализовывать.
// Методы из интерфейса
// QueueBehaviour, имитируют
// работу очереди,
// MarketBehaviour – помещает и
// удаляет человека из очереди,
// метод update – обновляет
// состояние магазина
// (принимает и отдает заказы)
// НЕ ЗАБЫТЬ СОЗДАТЬ МЕЙН КЛАСС В КОТОРОМ БУДЕТ ВСЯ ЛОГИКА СОБИРАТЬСЯ


package Seminar_2;

import java.util.ArrayList;
import java.util.List;

public class Market implements MaketBehaviour, QueueBehaviour {
    private final List<Actor> queue;
    boolean status = false;

    public Market() {
        this.queue = new ArrayList<>();
    }

    @Override
    public void takeInQueue(Actor actor) {
        System.out.println(actor.getName() + " встал в очередь");
        this.queue.add(actor);
    }

    @Override
    public void takeOrders() {
        for (Actor actor: queue) {
            if (!actor.isMakeOrder(status)){
                status = true;
                actor.setMakeOrder(status);
                System.out.println(actor.getName() + " сделал заказ");
            }
        }
    }

    @Override
    public void giveOrders() {
        for (Actor actor: queue) {
            if (actor.isMakeOrder(status)){
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " получил свой заказ");
            }
        }
    }

    @Override
    public void relaseFromQueue() {
        List<Actor> releasedActors = new ArrayList<>();
        for (Actor actor: queue) {
            if (actor.isTakeOrder(status)){
                releasedActors.add(actor);
                System.out.println(actor.getName() + " покинул очередь");
            }
        }
        releaseFromMarket(releasedActors);
    }

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " пришел в магазин");
        takeInQueue(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor: actors) {
            System.out.println(actor.getName() + " ушел из магазина");
            queue.remove(actor);
        }
    }

    @Override
    public void update() {
        takeOrders();
        giveOrders();
        relaseFromQueue();
    }

}
