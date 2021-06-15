package state.basic;

public class Client {
    public static void main (String [] args){
          IState state1 = new ConcreteState1();
          IState state2 = new ConcreteState2();
          IState state3 = new ConcreteState3();

          Context context = new Context();

          context.setState(state1);
          context.request();

          context.setState(state2);
          context.request();

          context.setState(state3);
          context.request();
    }
}
