package src.method;// 메서드 오버로딩이란?

// 똑같은 이름으 메서드를 중복해서 사용하는 것
// 이러한 메서드 오버러딩을 할 때는 전달값의 타입이 다르거나
// 전달값의 개수가 다르면
// 똑같은 이름의 메서드를 중복해서 선언할 수 있다.

public
class overroding {

    // 정수(int)형 숫자를 인자로 받아서 그 숫자를 곱해주는 것
    public static int getNumber(int number) {
        int result = number * number;
        return result;
    }

    // 문자(string)형 숫자를 인자로 받아서 그 숫자를 곱해주는 것
    public static int getNumber(String strNumber) {

        //문자로 넘어온 값은 숫자로 바꿔줘야 계산이 가능하니까
        // 문자를 정수로 바꿔주는 Integer.parseInt() 사용한다.
        int number  = Integer.parseInt(strNumber);
        return number * number;

    }



    //인자가 2개인 경우
    public static int getNumber(int number1, int number2) {

        int result = number1 + number2;
        return result;

    }

    public static
    void main ( String[] args ) {

        System.out.println(getNumber(3)); //3 * 3 = 9
        System.out.println(getNumber("4")); //4 * 4 = 16
        System.out.println(getNumber(5, 3)); //4 * 4 = 16
    }
}



//math라는 함수를 만들고, 그 변수의 파라미터로 int를 받겠다고 했다.
// 그런데 어떤 때는 int가 아닌 double, stringn 형태로
// 파라미터를 전달해주고 싶을 때가 있을 것이다.
// 그럼 파라미터가 String인 mathString 함수 생성하고,
// 파라미터가 double형인 mathDouble 함수 생성하면 너무 번거롭다.

// 그냥 3개의 함수를 만들고 모두 math라고 이름 통일하고,
// 내가 파라미터로 넣은 값의 형태에 따라 알아서 잘 들어가 주는 것
