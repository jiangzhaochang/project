/**
 * Created by   on 2017-03-08.
 */
public class RowSpanHandle {
    public static void main(String[] args) throws Exception {
        int total= 106;
        int flag = 1;
        for (int i = 0; i < total ; i=i+3){
            if (flag == 1 || flag == 2){
                System.out.print(i);
                System.out.print(",");
                flag++;
                continue;
            }
            if (flag == 3) {
                System.err.println(i);
                flag = 1;
                i = i - 2;
            }
        }
    }
}
