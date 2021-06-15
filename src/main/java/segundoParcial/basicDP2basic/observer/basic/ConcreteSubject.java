package observer.basic;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements  ISubject{
    private List<IObserver> observerList= new ArrayList<>();
    private String attribute1;
    private String attribute2;

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
        this.notifyObserver();
    }

    @Override
    public void attach(IObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void deattach(IObserver observer) {
       observerList.remove(observer);
    }

    /*
    notify observer when the attribute2 is updated
     */
    @Override
    public void notifyObserver() {
        for (IObserver observer:observerList
             ) {
            observer.update(attribute2);
        }
    }
}
