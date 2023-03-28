package src;

import java.util.Scanner;

public
class quiz_ternary_operator {

    public static
    void main ( String[] args ) {

        Scanner scan = new Scanner(System.in);
        int tall = scan.nextInt(); //키를 담을 변수

        scan.close();



        String result = (tall > 120) ? "이므로 탑승 가능합니다." : "이므로 탑승 불가합니다";
        System.out.println("키가 " + tall + result);


    }
}
