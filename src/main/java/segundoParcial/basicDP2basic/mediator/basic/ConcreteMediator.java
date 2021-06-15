package mediator.basic;

public class ConcreteMediator implements IMediator {

    private ConcreateColleague1 user1;
    private ConcreateColleague2 user2;

    public void setUser1(ConcreateColleague1 user1) {
        this.user1 = user1;
    }

    public void setUser2(ConcreateColleague2 user2) {
        this.user2 = user2;
    }

    @Override
    public void send(String message, Colleague colleague) {
         if (colleague == user1){
                user2.messageReceived(message);
         }else{
                user1.messageReceived(message);
         }
    }
}
