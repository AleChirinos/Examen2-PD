package segundoParcial.fila1.ejercicio3Observer;

public class Client {
    public static void main (String []args){

        PostsFacebook postsFacebook = new PostsFacebook();

        RegisteredUser user1= new RegisteredUser(new Person("Alejandra","Ale", "alecita2702@gmail.com"), "VIDEO");
        RegisteredUser user2= new RegisteredUser(new Person("Juan","Juanqui", "j4567@yahoo.com"), "VIDEO");
        RegisteredUser user3= new RegisteredUser(new Person("Pedro","Pe", "pedro.picapiedra@gmail.com"), "TODO");
        RegisteredUser user4= new RegisteredUser( new Person("Sofia","Sofi", "sofioficial@hotmail.com"), "VIDEO");
        RegisteredUser user5= new RegisteredUser(new Person("Jose","Jos", "jose4020@hotmail.com"), "TODO");

        postsFacebook.attach(user1);
        postsFacebook.attach(user2);
        postsFacebook.attach(user3);
        postsFacebook.attach(user4);
        postsFacebook.attach(user5);

        postsFacebook.uploadNewPost(new Post("VIDEO","16:40", 23, 5,1));
        postsFacebook.uploadNewPost(new Post("VIDEO","18:27", 45, 0,0));
        postsFacebook.uploadNewPost(new Post("IMAGEN","17:40", 107, 25,3));
        postsFacebook.uploadNewPost(new Post("IMAGEN","20:53", 27, 1,2));
    }
}
