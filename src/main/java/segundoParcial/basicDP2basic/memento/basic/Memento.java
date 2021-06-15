package memento.basic;

public class Memento {
    private ConcreteObject state;

    public Memento(ConcreteObject stateSaved){
        this.state=stateSaved;
    }

    public ConcreteObject getState() {
        return state;
    }
}
