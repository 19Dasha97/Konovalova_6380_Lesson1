// Интерфейс QueueBehaviour, который описывает логику очереди – помещение в/освобождение из
// очереди, принятие/отдача заказа

package Seminar_2;

public interface QueueBehaviour {
    void takeInQueue (Actor actor);

    void takeOrders(); // сделать заказ

    void giveOrders(); // забрать заказ

    void relaseFromQueue(); // выйти из очереди
    
}
