package Ra.caulenhdieukien;

import java.util.Scanner;

public class SwitchCase_demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số từ 0-9 :");
        int numbInt = Integer.parseInt(scanner.nextLine());
        switch (numbInt){
            case 0:
                System.out.print("%d Không");
                break;
            case 1:
                System.out.print("Một" );
                break;
            case 2:
                System.out.print("Hai" );
                break;
            case 3:
                System.out.print("Ba" );
                break;
            case 4:
                System.out.print("Bốn" );
                break;
            case 5:
                System.out.print("Năm" );
                break;
            case 6:
                System.out.print("Sáu" );
                break;
            case 7:
                System.out.print("Bảy" );
                break;
            case 8:
                System.out.print("Tám " );
                break;
            default:
                System.out.print("Chín " );
        }
        System.out.println(numbInt );

    }
}
