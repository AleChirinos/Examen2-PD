package segundoParcial.fila1.ejercicio4Strategy;

import java.util.LinkedList;
import java.util.List;

public class Cliente {
    public static void main(String[] args) {
        DataBase dataBase = new DataBase();

        User user1 = new User("Gabriel", 6783645, 27022001,"Ingeniero");
        User user2 = new User("Antonio", 2345342, 14101957, "Economista");
        User user3 = new User( "Maria", 7624333,21091970,"Auditora");

        List<User> users = new LinkedList<User>();
        users.add(user1);
        users.add(user2);
        users.add(user3);

        dataBase.setUsers(users);

        OrderCI orderCI = new OrderCI();
        dataBase.setOrderDB(orderCI);
        dataBase.ordering();

        OrderName orderName = new OrderName();
        dataBase.setOrderDB(orderName);
        dataBase.ordering();

        OrderProfession orderProfession = new OrderProfession();
        dataBase.setOrderDB(orderProfession);
        dataBase.ordering();

        OrderDateBorn orderDateBorn =new OrderDateBorn();
        dataBase.setOrderDB(orderDateBorn);
        dataBase.ordering();
    }
}
