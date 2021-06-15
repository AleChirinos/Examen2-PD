package segundoParcial.fila1.ejercicio4Strategy;

import java.util.LinkedList;
import java.util.List;

public class OrderProfession implements IOrderDB {

    @Override
    public void orderUsers(List<User> users) {
        System.out.println("*** Ordenando por profesión *** ");
        List<User> orderProfession = new LinkedList<User>();
        for (User user : orderProfession) {
            orderProfession.add(user);
        }
        char last = 'z';
        while (orderProfession.size() != users.size()) {
            last = 'z';
            User littleUser = null;
            for (User usuario : users) {
                if (usuario.getProfession().charAt(0) < last && !orderProfession.contains(usuario)) {
                    last = usuario.getProfession().charAt(0);
                    littleUser = usuario;
                }
            }
            orderProfession.add(littleUser);
        }
        for (User usuario : orderProfession) {
            usuario.mostrarInfo();
            System.out.println();
        }
    }

}