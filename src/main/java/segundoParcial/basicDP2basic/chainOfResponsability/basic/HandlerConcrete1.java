package chainOfResponsability.basic;

public class HandlerConcrete1 implements IHandler {
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

          if (criterioDeResolucion < 10 ){
              // logica // algoritmos
              System.out.println("INFO> HandlerConcrete1 es el que resuelve el problema");
          } else {
              this.next.criteriaHandler(criterioDeResolucion);
          }
    }
}
