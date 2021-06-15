package segundoParcial.fila1.ejercicio4Strategy;

import java.util.LinkedList;
import java.util.List;

public class OrderName implements IOrderDB {

    @Override
    public void orderUsers(List<User> users) {
        System.out.println("*** Ordenando por nombre ***");
        List<User> orderName = new LinkedList<User>();
        for (User user : orderName) {
            orderName.add(user);
        }
        char last = 'z';
        while (orderName.size() != users.size()) {
            last = 'z';
            User lastUser = null;
            for (User usuario : users) {
                if (usuario.getName().charAt(0) < last && !orderName.contains(usuario)) {
                    last = usuario.getName().charAt(0);
                    lastUser = usuario;
                }
            }
            orderName.add(lastUser);
        }
        for (User usuario : orderName) {
            usuario.mostrarInfo();
            System.out.println();
        }
    }

}
