package memento.basic;

public class Originator {
    private ConcreteObject state;

    public Originator(){}

    public void setState(ConcreteObject state) {
        System.out.println("**** Set State *****");
        state.info();
        this.state = state;
    }

    public Memento createMemento(){
        System.out.println("**** Create State *****");
        state.info();
        return new Memento(this.state) ;
    }

    public void restoreFromMemento(Memento memento){
        this.state=memento.getState();
        System.out.println("**** State Restored *****");
        this.state.info();
    }

}
