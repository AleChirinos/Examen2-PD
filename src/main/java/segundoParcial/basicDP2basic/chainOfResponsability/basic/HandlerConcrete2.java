package chainOfResponsability.basic;

public class HandlerConcrete2 implements IHandler {
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

          if (criterioDeResolucion >= 10 && criterioDeResolucion < 20 ){
              // logica // algoritmos
              System.out.println("INFO> HandlerConcrete2 es el que resuelve el problema");
          } else {
              this.next.criteriaHandler(criterioDeResolucion);
          }
    }
}
