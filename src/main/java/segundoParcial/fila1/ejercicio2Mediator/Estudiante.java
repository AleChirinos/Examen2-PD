package segundoParcial.fila1.ejercicio2Mediator;

public class Estudiante extends Persona {
    int matricula;

    public Estudiante(ICanalDeComunicacion mediator){
        super(mediator);
    }

    @Override
    public void send(String message) {
        canalDeComunicacion.send(message,this);
    }

    @Override
    public void messageReceived(String message) {
        System.out.println("INFO-> message recived Estudiante:");
        System.out.println("Name: "+ name);
        System.out.println("Matricula: "+ matricula);
        System.out.println("Message: "+ message);
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
