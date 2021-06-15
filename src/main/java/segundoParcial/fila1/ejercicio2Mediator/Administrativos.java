package segundoParcial.fila1.ejercicio2Mediator;

public class Administrativos extends Persona{
    String cargo;

    public Administrativos(ICanalDeComunicacion mediator){
        super(mediator);
    }

    @Override
    public void send(String message) {
        canalDeComunicacion.send(message,this);
    }

    @Override
    public void messageReceived(String message) {
        System.out.println("INFO-> message recived Administrativo:");
        System.out.println("Name: "+ name);
        System.out.println("Cargo: "+ cargo);
        System.out.println("Message: "+ message);
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
