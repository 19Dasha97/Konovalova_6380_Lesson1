// Абстрактный класс Actor, который хранит в себе параметры актора, включая
// состояние готовности сделать заказ и факт получения заказа.

package Seminar_2;

public abstract class Actor implements ActorBehavoir {
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;
    String getName(){
        return this.name;
    }
    public Actor(String name){
        this.name = name;
    }
}
