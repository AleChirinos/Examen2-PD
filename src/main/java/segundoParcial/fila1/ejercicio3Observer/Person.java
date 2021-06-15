package segundoParcial.fila1.ejercicio3Observer;

public class Person {
    private String name;
    private String nickname;
    private String mail;

    public Person(String name, String nickname, String mail){
        this.name=name;
        this.nickname=nickname;
        this.mail=mail;
    }

    public void showInfo(){
        System.out.println("Nombre: "+name);
        System.out.println("Alias: "+nickname);
        System.out.println("Email: "+mail);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
