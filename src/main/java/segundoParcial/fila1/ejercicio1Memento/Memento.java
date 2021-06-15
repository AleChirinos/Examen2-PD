package segundoParcial.fila1.ejercicio1Memento;

public class Memento {

    private Document state;

    public Memento(Document stateToSave) {
        state = stateToSave;
    }

    public Document getSavedState() {
        return state;
    }
}
