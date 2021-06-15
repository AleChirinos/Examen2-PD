package segundoParcial.fila1.ejercicio3Observer;

import java.util.ArrayList;
import java.util.List;

public class PostsFacebook implements IFacebook{
    private List<IUser> observerList= new ArrayList<>();
    private List<Post> postList = new ArrayList<>();

    public void uploadNewPost(Post post){
        postList.add(post);
        this.notifyObserver(post);
    }

    @Override
    public void attach(IUser observer) {
        observerList.add(observer);
    }

    @Override
    public void deattach(IUser observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver(Post post) {
        for (IUser userFacebook:observerList) {
            if ((userFacebook.getTypePost().equals(post.getTypePost())) && (post.getTypePost().equals("VIDEO"))){
                userFacebook.update("Se subio un nuevo post: "+post.getTypePost(),post);
            }else if(userFacebook.getTypePost().equals("TODO")){
                userFacebook.update("Se subio un nuevo post: "+post.getTypePost(),post);
            }
        }
    }
}
