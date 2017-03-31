/**
 * Created by   on 2017-03-03.
 */
public class Count {
    static int a= 0;
    public static void main(String[] org){
        int total = 2057042;
        int data = 0;
        boolean flag = true;
        int variate = 10000;
        int countFlag = 0;
        while (flag){
            if (total < variate){
                data += query(total,1);
                flag = false;
                continue;
            }
            int result = query(total,total-variate);
            data += result;
            total -= variate;
            countFlag = result==0 && data!=0?countFlag + 1:0;
            if (countFlag == 2 ){
                flag = false;
                break;
            }
        }
        System.out.println("data:"+data);
    }
    public static int query(int bigId,int smallId){
        a++;
        System.out.println(bigId+"-"+smallId);
        if (a<2){return 100;}

        return 0;
    }
}
