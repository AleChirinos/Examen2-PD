package segundoParcial.fila1.ejercicio5State;

public class Reiniciar implements IState {
    private Computadora computadora;

    public Reiniciar(Computadora computadora){
        this.computadora=computadora;
    }

    @Override
    public void handler() {
        computadora.setConsumoRAM("0%");
        computadora.setConsumoCPU("0%");
        String[] var = {"Cerrados"};
        computadora.setProgramasAbiertos(var);
    }
}
