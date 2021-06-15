package chainOfResponsability.basic;

public class HandlerConcrete3 implements IHandler {
    private  IHandler next;

    @Override
    public void setNext(IHandler handler) {
        this.next=handler;
    }

    @Override
    public IHandler next() {
        return this.next;
    }

    @Override
    public void criteriaHandler(int criterioDeResolucion) {

          if (criterioDeResolucion >= 20 && criterioDeResolucion < 30 ){
              // logica // algoritmos
              System.out.println("INFO> HandlerConcrete3 es el que resuelve el problema");
          } else {
              System.out.println("INFO> no se puede resolver el problema");
          }
    }
}
