package segundoParcial.fila1.ejercicio3Observer;

public class RegisteredUser implements IUser{
    private String type;
    private Person person;

    public RegisteredUser(Person person, String type){
        this.person=person;
        this.type=type;
    }

    @Override
    public void update(String type, Post post) {
        System.out.println("******* NOTIFY *******");
        System.out.println(type);
        person.showInfo();
        post.showinfo();
        System.out.println();
    }

    @Override
    public String getTypePost() {
        return this.type;
    }
}
