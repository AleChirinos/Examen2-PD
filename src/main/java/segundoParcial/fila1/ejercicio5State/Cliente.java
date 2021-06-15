package segundoParcial.fila1.ejercicio5State;

import java.util.Arrays;

public class Cliente {
    public static void main(String arg[]){
        Computadora computadora = new Computadora();

        IState state1 = new Apagado(computadora);
        IState state2 = new Reiniciar(computadora);
        IState state3 = new Prendido(computadora);

        computadora.setState(state1);
        computadora.request();
        System.out.println("APAGADO");
        System.out.println(computadora.getConsumoCPU());
        System.out.println(computadora.getConsumoRAM());
        System.out.println(Arrays.toString(computadora.getProgramasAbiertos()));
        System.out.println();

        System.out.println("REINICIAR");
        computadora.setState(state2);
        computadora.request();
        System.out.println(computadora.getConsumoCPU());
        System.out.println(computadora.getConsumoRAM());
        System.out.println(Arrays.toString(computadora.getProgramasAbiertos()));
        System.out.println();

        computadora.setState(state3);
        computadora.request();
        System.out.println("PRENDIDO");
        System.out.println(computadora.getConsumoCPU());
        System.out.println(computadora.getConsumoRAM());
        System.out.println(Arrays.toString(computadora.getProgramasAbiertos()));
        System.out.println();

    }
}
