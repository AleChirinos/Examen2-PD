package observer.basic;

public class ConcreteObserver2 implements IObserver {
    @Override
    public void update(String message) {
        System.out.println("ConcreteObserver2");
        System.out.println("Notificando: "+message);
        // evento
        // logica
    }
}
