package observer.basic;

public interface ISubject {
    void attach(IObserver observer);
    void deattach(IObserver observer);
    void notifyObserver();
}
