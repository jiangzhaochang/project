/**
 * Created by   on 2017-02-24.
 */
public class Zhishu {
    public static void main(String[] args){
        int N = 20;
        int j,i;
        comPrime1_2(N);
    }
    public static void findZs(int num){
        for (int i=2;i<=num;i++){
            for (int j = i-1;j>1;j--){
                if (i%j==0){
                    break;
                }
                if (j<=2){
                    System.out.println(i);
                }
            }
        }
    }
    private static void comPrime1_2(int N){
        System.out.println("小于" + N + "的质数有：");
        for(int i=N;i>=0;i--){
            for(int j=2;j<=(int)Math.sqrt(i);j++){
                System.out.println("j=" + j );
                if(i%j==0)
                    break;
                if(j == (int)Math.sqrt(i))
                    System.out.println(i);
            }
        }
    }
}
