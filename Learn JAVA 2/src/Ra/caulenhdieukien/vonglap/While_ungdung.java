package Ra.caulenhdieukien.vonglap;

import java.util.Scanner;

public class While_ungdung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Nhập dữ liệu number :");
            int number = Integer.parseInt(scanner.nextLine());
            if (number==0){
                    System.out.println("The End");
                    break;
            }
        }
    }
}
