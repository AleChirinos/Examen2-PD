package segundoParcial.fila1.ejercicio3Observer;

public class Post {
    private String typePost;
    private String time;
    private int numberOflikes;
    private int numberOfComments;
    private int numbreOfShares;

    public Post(String typePost, String time, int numberOflikes, int numberOfComments, int numbreOfShares){
        this.typePost=typePost;
        this.time=time;
        this.numberOflikes=numberOflikes;
        this.numberOfComments=numberOfComments;
        this.numbreOfShares=numbreOfShares;
    }

    public void showinfo(){
        System.out.println("Tipo de post: "+ typePost);
        System.out.println("Hora de la publicacion: "+ time);
        System.out.println("Numero de likes: "+ numberOflikes);
        System.out.println("Numero  de comentarios: "+ numberOfComments);
        System.out.println("Numero de veces que se compartio la publicacion: "+ numbreOfShares);
    }

    public String getTypePost() {
        return typePost;
    }

    public void setTypePost(String typePost) {
        this.typePost = typePost;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getNumberOflikes() {
        return numberOflikes;
    }

    public void setNumberOflikes(int numberOflikes) {
        this.numberOflikes = numberOflikes;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public void setNumberOfComments(int numberOfComments) {
        this.numberOfComments = numberOfComments;
    }

    public int getNumbreOfShares() {
        return numbreOfShares;
    }

    public void setNumbreOfShares(int numbreOfShares) {
        this.numbreOfShares = numbreOfShares;
    }
}
