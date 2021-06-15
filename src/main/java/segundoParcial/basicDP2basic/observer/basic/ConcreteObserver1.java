package observer.basic;

public class ConcreteObserver1 implements IObserver {
    @Override
    public void update(String message) {
        System.out.println("ConcreteObserver1");
        System.out.println("Notificando: "+message);
        // evento
        // logica
    }
}
