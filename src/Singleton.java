/**
 * Created by   on 2017-02-24.
 */
public class Singleton {
    private Singleton(){}

    private static class SingletionIntance{
        private static final Singleton INTANCE = new Singleton();
    }
    public Singleton get(){
        return SingletionIntance.INTANCE;
    }


    public static void main(String[] args){
        Object o = new Object();

    }
}
