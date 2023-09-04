import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int[] num = new int[2];
        int min = 10001;
        int min_3 = 10001;
        int min_7 = 10001;
        int min_21 = 10001;
        int prod_min = 0;
        int prod_min2 = 0;
        for(int i = 0;i < num.length;i++){
            num[i] = random.nextInt(10000);
            if (num[i] < min) {
                min = num[i];
            }
            if ((num[i] % 3 == 0) && (num[i] < min_3)) {
                min_3 = num[i];
            }
            if ((num[i] % 7 == 0) && (num[i] < min_7)) {
                min_7 = num[i];
            }
            if ((num[i] % 21 == 0) && (num[i] < min_21)) {
                min_21 = num[i];
            }
        }
        if(min != 10001 && min_21 != 10001){
            prod_min = min * min_21;
        }
        if(min_3 != 10001 && min_7 != 10001){
            prod_min2 = min_3 * min_7;
        }
        if (prod_min == 0 && prod_min2 == 0){
            System.out.println(-1);
        }
        else{
            System.out.println(Math.min(prod_min, prod_min2));
        }
    }
}