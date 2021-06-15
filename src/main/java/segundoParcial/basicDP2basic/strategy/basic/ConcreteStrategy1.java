package strategy.basic;

public class ConcreteStrategy1 implements  IStrategy{
    @Override
    public void execute() {
        // algoritmo
        System.out.println("Strategy 1> Algoritmo 1");
    }
}
