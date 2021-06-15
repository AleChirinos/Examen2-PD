package segundoParcial.fila1.ejercicio5State;

import java.util.Random;

public class Prendido implements IState {
    private Computadora computadora;

    public Prendido(Computadora computadora){
        this.computadora=computadora;
    }

    @Override
    public void handler() {
        Random random = new Random();
        int numerorandom= random.nextInt(20) + 1;
        String[] programasabiertos=new String[numerorandom];
        for (int i = 0; i < programasabiertos.length; i++) {
            programasabiertos[i]="Programa"+(i+1);
        }
        computadora.setProgramasAbiertos(programasabiertos);
        computadora.setConsumoCPU((numerorandom*5)+"%");
        computadora.setConsumoRAM((numerorandom*5)+"%");
    }
}