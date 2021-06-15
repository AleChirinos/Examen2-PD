package segundoParcial.fila1.ejercicio2Mediator;

public class Docente extends Persona{
    int ci;

    public Docente(ICanalDeComunicacion mediator){
        super(mediator);
    }

    @Override
    public void send(String message) {
        canalDeComunicacion.send(message,this);
    }

    @Override
    public void messageReceived(String message) {
        System.out.println("INFO-> message recived Docente:");
        System.out.println("Name: "+ name);
        System.out.println("CI: "+ ci);
        System.out.println("Message: "+ message);
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }
}
