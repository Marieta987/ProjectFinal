import java.util.Arrays;

public class Project {
    public static void main(String[] args){
        System.out.println("hallo ");
    }


    public static int evens(int[] arr){
        int frequency = 0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]%2 == 0){
                frequency++;
            }
        }
        return frequency;

    }

    public static String isTriangle(int angle1,int angle2,int angle3){
        if(angle1+angle2<angle3 || angle2+angle3<angle1 || angle1+angle3<angle2) {
            return "isTriangle";
        } else {
            return "notTriangle";
        }
    }

    public static String isCardNumber(String num){

        if(num.length()==16){
            return "valid";
        } else {
            return "invalid";
        }

    }

    public static int discount(int amount) {
        if (amount < 1000) {
            return 10;
        } else if (amount > 1000 && amount < 5000) {
            return 30;
        } else if (amount > 5000 && amount < 10000) {
            return 50;
        } return 0;
    }

    public static String nameNull(String str){
        return str;
    }

    


}