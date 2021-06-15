package chainOfResponsability.basic;

public class HandlerManager implements IHandler {
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

          HandlerConcrete1 handlerConcrete1 = new HandlerConcrete1();
          this.setNext(handlerConcrete1);

          HandlerConcrete2 handlerConcrete2 = new HandlerConcrete2();
          handlerConcrete1.setNext(handlerConcrete2);

          HandlerConcrete3 handlerConcrete3 = new HandlerConcrete3();
          handlerConcrete2.setNext(handlerConcrete3);

          this.next.criteriaHandler(criterioDeResolucion);
    }
}
