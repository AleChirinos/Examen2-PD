package segundoParcial.fila1.ejercicio3Observer;

public interface IFacebook {
    void attach(IUser observer);
    void deattach(IUser observer);
    void notifyObserver(Post post);
}
