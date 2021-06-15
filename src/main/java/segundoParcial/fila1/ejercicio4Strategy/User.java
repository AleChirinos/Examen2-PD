package segundoParcial.fila1.ejercicio4Strategy;

public class User {
    private String name;
    private int ci;
    private int bornDate;
    private String profession;

    public User(String name, int ci, int bornDate, String profession) {
        super();
        this.name = name;
        this.ci = ci;
        this.bornDate = bornDate;
        this.profession = profession;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public int getBornDate() {
        return bornDate;
    }

    public void setBornDate(int bornDate) {
        this.bornDate = bornDate;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + name);
        System.out.println("CI: " + ci);
        System.out.println("Fecha de nacimiento: " + bornDate);
        System.out.println("Profesion: " + profession);

    }
}