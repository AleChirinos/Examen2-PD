package segundoParcial.fila1.ejercicio4Strategy;

import java.util.LinkedList;
import java.util.List;

public class DataBase {
    private IOrderDB orderDB;
    private List<User> users = new LinkedList<User>();

    public IOrderDB getOrderDB() {
        return orderDB;
    }

    public void setOrderDB(IOrderDB orderDB) {
        this.orderDB = orderDB;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void ordering() {
        orderDB.orderUsers(users);
    }
}