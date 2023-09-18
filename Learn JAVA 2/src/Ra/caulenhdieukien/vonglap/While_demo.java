package Ra.caulenhdieukien.vonglap;

import java.util.Scanner;

public class While_demo {
    public static void main(String[] args) {
        int cntodd = 0;
        Scanner scanner = new Scanner(System.in);
        while(cntodd <= 10){
            System.out.println("Nhập vào số nguyên : ");
            int numb = Integer.parseInt(scanner.nextLine());
            if (numb%2 ==1){
                System.out.println(numb);
            }
        }

    }
}
