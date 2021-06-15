package segundoParcial.fila1.ejercicio1Memento;

import java.util.ArrayList;

public class SaveDocumentCareTaker {
    private ArrayList<Memento> savedStates = new ArrayList<>();
    private int current=savedStates.size()-1;

    public void addMemento(Memento m) {
        savedStates.add(m);
        current=savedStates.size()-1;
    }

    public Memento getMemento() {
        return savedStates.get(current);
    }
    public Memento ctrlz(){
        if(current>0){
            current--;
        } else{
            current=0;
        }
        return savedStates.get(current);
    }
    public Memento ctrly(){
        if(current<savedStates.size()-1){
            current++;
        } else{
            current=savedStates.size()-1;
        }
        return savedStates.get(current);
    }
}
