package Ra.caulenhdieukien;

import java.util.Scanner;

public class ifElse_demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập số nguyên tử :");
        int number = scanner.nextInt();
        if(number % 5 == 0){
            System.out.print(" Chia hết cho 5");
        }else if(number % 5 == 1){
            System.out.print(" Dư 1");
        }
        else if(number % 5 == 2){
            System.out.print(" Dư 2");
        }
        else if(number % 5 == 3){
            System.out.print(" Dư 3");
        }else{
            System.out.print(" Dư 4");
        }


    }
}
