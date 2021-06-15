package segundoParcial.fila1.ejercicio2Mediator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Chat implements ICanalDeComunicacion {

    private Map<String, Persona> personMap = new HashMap<>();
    private List<String> name= new ArrayList<>();
    String notify;

    public void addColleague(Persona person){
        personMap.put(person.name, person);
        name.add(person.name);
    }

    public String getNotify() {
        return notify;
    }

    public void setNotify(String notify) {
        this.notify = notify;
    }

    @Override
    public void send(String message, Persona person) {
        Persona personaParseOrigen= person;
        for (String personFrom:name) {
            if (!personFrom.equals(personaParseOrigen.name)){
                 if (personaParseOrigen instanceof Estudiante && this.getNotify().equals("TODOS")){
                     personMap.get(personFrom).messageReceived(message);
                 }
                 else if (personaParseOrigen instanceof Estudiante && personMap.get(personFrom) instanceof Docente && this.getNotify().equals("DOCENTES")){
                     personMap.get(personFrom).messageReceived(message);
                 }
                 else if (personaParseOrigen instanceof Estudiante && personMap.get(personFrom) instanceof Administrativos && this.getNotify().equals("ADMINISTRATIVOS")){
                     personMap.get(personFrom).messageReceived(message);
                 }
                 else if (personaParseOrigen instanceof Docente && (personMap.get(personFrom) instanceof Docente ||personMap.get(personFrom) instanceof Estudiante )){
                     personMap.get(personFrom).messageReceived(message);
                 }
                 else if (personaParseOrigen instanceof Administrativos){
                     personMap.get(personFrom).messageReceived(message);
                }
            }
        }
    }
}
