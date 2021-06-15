package chainOfResponsability.basic;

public interface IHandler {
    void setNext(IHandler handler); //---> saber el siguiente responsable
    IHandler next(); //--> ir al siguient responsable
    void criteriaHandler(int criterioDeResolucion); // resolver el problema o moverse al siguinete responsable

}
