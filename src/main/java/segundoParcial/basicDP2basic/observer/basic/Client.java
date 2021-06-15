package observer.basic;

public class Client {

    public static void main (String [] args){
        ConcreteSubject concreteSubject= new ConcreteSubject();

        concreteSubject.attach(new ConcreteObserver1());
        concreteSubject.attach(new ConcreteObserver2());

        concreteSubject.setAttribute2("este atributo tiene un nuevo valor");
        concreteSubject.setAttribute1("no deberia notificar");
        concreteSubject.setAttribute2("si deberia notificar");
    }



}
