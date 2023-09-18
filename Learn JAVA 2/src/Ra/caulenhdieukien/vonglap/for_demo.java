package Ra.caulenhdieukien.vonglap;

import java.util.Scanner;

public class for_demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 1 số nguyên dương :");
        int numb = Integer.parseInt(scanner.nextLine());
        for (int i = 0 ; i <= numb ; i +=2){
//            if (i % 2 == 0){
                System.out.println("Các số chẵn nhỏ hoặc bằng hơn số nguyên dương" + i);
            System.out.printf("%d\t", i);
//            }
        }
    }
}
