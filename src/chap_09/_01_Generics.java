package src.chap_09;

// 제네릭스란?
/*
- 다양한 타입의 객체를 지원하는 클래스, inferface, method를 정의하는 방법
- 똑같은 동작을 하는 class나 method를 여러 번 정의할 필요없이
- 한 번만 정의하고 나서 여러 타입에 대해 지원할 수 있도록 한다.

*/

public class _01_Generics {
    public static void main ( String[] args ) {

        // 1. 제네릭스 간단 예제
        // - 정수형, 실수형, 문자형 배열을 만들고자 한다.
        Integer[] iArray = {1, 2, 3, 4, 5};
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] sArray = {"A", "B", "C", "D", "E"};

        // 2. 아래는 위의 내용을 출력하는 메서드인 printIntArray를 만들었다.
        printIntArray(iArray); //이것만 적고, printIntArrary에 alt+enter를 누르면 method를 자동완성할 수 있음
        printDoubleArray(dArray);
        printStringArray(sArray);

        System.out.println("==================================");
        System.out.println("아래는 generics 사용 예시");
        System.out.println("위에선 각각의 method 만들어서 출력");
        System.out.println("아래선 PrintAnyArrya 메서드 한 개로 출력");


        printAnyArray(iArray);
        printAnyArray(dArray);
        printAnyArray(sArray);

        // 6. printAnyArray(iArray)에서 iArray에 빨간줄 뜨는 이유
        // 제네릭스는 객체를 제공한다.
        // int, double, boolean은 제네릭스에서 사용할 수 없다.
        // wrapper 클래스를 사용해서 감싸주는 작업이 필요하다.
        // Integet.parseInt()나 String.valueOf(), Double.toString()이 해당됨
        //  1번 부분에서

        /*
        int[] iArray = {1, 2, 3, 4, 5};
        double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        를
        Integer[] iArray = {1, 2, 3, 4, 5};
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        로 바꿔주면, 즉 Wrapper class로 change 하면 오류 해결됨
*/
    }


    // 5. 제네릭스 예
    // 서로 다른 타입, 즉 int, float, double이 들어와도 다 처리가능해야 함
    // 이를 위해 <T>를 void 앞에 써주고, 파라미터에 T array 작성
    // T는 type을 의미하고, 꼭 T라고 작성할 필요 X
    private  static <T> void printAnyArray(T[] array) {

        for (T t: array) {
            System.out.print(t + " "); // 1 2 3 4 5 출력
        }
        System.out.println(); // 줄바꿈


//        for (int i: iArray) {
//            System.out.print(i + " "); // 1 2 3 4 5 출력
//        }
//        System.out.println(); // 줄바꿈


    }


    private static void printIntArray ( Integer[] iArray ) {
    // 3. int[] iArrary 설명
        /*
        - 위에서 iArray에는 정수형 배열이 전달되니까
        - 전달값 파라미터에서도 int[] iArrary로 받는 거다. 
        - 반복문을 이용해서 한 개씩 출력하고자 한다.
        */

        for (int i: iArray) {
            System.out.print(i + " "); // 1 2 3 4 5 출력
        }
        System.out.println(); // 줄바꿈
        
        
    }


    private static void printStringArray ( String[] sArray ) {

        for (String s: sArray) {
            System.out.print(s + " "); // 1.0 2.0 3.0 4.0 5.0
        }
        System.out.println(); // 줄바꿈

    }

    private static void printDoubleArray ( Double[] dArray ) {

        for (double d: dArray) {
            System.out.print(d + " "); // A B C D E
        }
        System.out.println(); // 줄바꿈

    }

    // 4. 위의 method를 보면 다 동일한 script를 가지고 있다.
    // 자료형만 다른 상황이다.
    // 이 상황에서 long, float, boolean 배열을 추가한다면
    // 또 메서드를 추가해야 하는 불편함이 있다.

    // 이럴 때 제네릭스를 사용한다.
    // 다시 printStringArray 위로 올라가 준다.


}
