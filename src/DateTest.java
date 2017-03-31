/**
 * Created by   on 2017-03-07.
 */
//不能改动此Test类
public class DateTest extends Thread{

    private TestDo testDo;
    private String key;
    private String value;

    public DateTest(String key,String key2,String value){
        this.testDo = TestDo.getInstance();
        /*常量"1"和"1"是同一个对象，下面这行代码就是要用"1"+""的方式产生新的对象，
        以实现内容没有改变，仍然相等（都还为"1"），但对象却不再是同一个的效果*/
        this.key = key + key2;
        this.value = value;
    }


    public static void main(String[] args) throws InterruptedException{
        DateTest a = new DateTest("1","","1");
        DateTest b = new DateTest("1","","2");
        DateTest c = new DateTest("3","","3");
        DateTest d = new DateTest("4","","4");
        System.out.println("begin:"+(System.currentTimeMillis()/1000));
        a.start();
        b.start();
        c.start();
        d.start();
    }

    public void run(){
        testDo.doSome(key, value);
    }
}

class TestDo {

    private TestDo() {}
    private static TestDo _instance = new TestDo();
    public static TestDo getInstance() {
        return _instance;
    }

    public void doSome(Object key, String value) {

        // 以大括号内的是需要局部同步的代码，不能改动!
        synchronized (key){
            try {
                Thread.sleep(1000);
                System.out.println(key+":"+value + ":"
                        + (System.currentTimeMillis() / 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
