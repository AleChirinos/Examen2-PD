package segundoParcial.fila1.ejercicio1Memento;

public class StorageOriginator {
    private Document state;

    public void setCommit(Document state)
    {
        System.out.println("*** Set State ***");
        state.showInfo();
        System.out.println();
        this.state = state;
    }

    public Memento createCommit() {
        System.out.println("*** Create State ***");
        state.showInfo();
        System.out.println();
        return new Memento(state);
    }

    public void retoreTheDocument(Memento memento){
        state = memento.getSavedState();
        System.out.println("*** State Restored ***");
        state.showInfo();
        System.out.println();
    }
}
