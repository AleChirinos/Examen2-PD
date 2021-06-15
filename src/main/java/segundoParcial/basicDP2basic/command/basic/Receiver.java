package command.basic;

public class Receiver {
    private String attribute1="default";
    private int attribute2=0;

    public Receiver(){}

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public int getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(int attribute2) {
        this.attribute2 = attribute2;
    }

    public void action1(){
        System.out.println("COMMAND>action1: "+attribute1);
    }

    public void action2(){
        System.out.println("COMMAND>action2: "+attribute2);
    }

}
