package src.chap_09.coffee;

// 1. coffee가 완성되면, 손님의 주문번호를 통해
// coffee가 완성됐음을 알려주는 것

public class CoffeeByNumber {


    public CoffeeByNumber ( int waitingNumber ) {
        this.waitingNumber = waitingNumber;
    }

    // GenericClass에서 watingNumber값을 받아오면 int waitingNumber 파라미터로
    // 넘어가고 해당 값이 CoffeeByNumber class에 정의된
    // 아래의 waitingNumber에 저장된다.

    // 위의 함수는 생성자 함수다.
    //# 생성자란?
    //- 객체가 생성될 때 자동으로 호출되는 메서드다.

    // # 생성자 함수 만드는 이유
    // - 객체가 호출될 때 기본적으로 작동되야 할 부분이 있는 경우 생성자에 명시
    // - 객체가 생성됨과 동시에 우리가 전달한 값으로 초기화를 하고자 할 때 //BlackBox에 있음 예시


    public int waitingNumber; //대기 번호 저장 변수
    // 2. 위의 대기번호를 받는 생성자를
    // alt + insert 키 눌러서 만들 수 있다.

    public void ready() { //음식 완성되면 번호 노출시켜서 알려주는 것처럼
        System.out.println("커피 준비 완료: " + waitingNumber);
    }

    // 3. 이렇게 만들어 준 class를 통해 GenericClass에서 객체 생성
}
