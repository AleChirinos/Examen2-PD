package segundoParcial.fila1.ejercicio4Strategy;

import java.util.LinkedList;
import java.util.List;

public class OrderDateBorn implements IOrderDB {

    @Override
    public void orderUsers(List<User> users) {
        System.out.println("*** Ordenando por fecha de nacimiento ***");
        List<User> ordered = new LinkedList<User>();
        int last = Integer.MAX_VALUE;
        while (ordered.size() != users.size()) {
            last = Integer.MAX_VALUE;
            User lastUser = null;
            for (User user : users) {
                if (user.getBornDate() < last && !ordered.contains(user)) {
                    last = user.getBornDate();
                    lastUser = user;
                }
            }
            ordered.add(lastUser);
        }
        for (User usuario : ordered) {
            usuario.mostrarInfo();
            System.out.println();
        }
    }

}

