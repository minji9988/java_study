package src.chap_09;

// 1. generice class 설명
// 01_Generics는 서로 다른 형태의 자료를 받아서
// 한 꺼번에 처리하는 방법에 대해 배웠었다.
// class도 그렇게 만들 수 있다.
// coffee 패키지를 만들고, CoffeeByNumber를 통해 설명하겠다.

import src.chap_09.coffee.Coffee;
import src.chap_09.coffee.CoffeeByName;
import src.chap_09.coffee.CoffeeByNickName;
import src.chap_09.coffee.CoffeeByNumber;
import src.chap_09.coffee.CoffeeByUser;
import src.chap_09.user.User;

public class _02_GenericClass {

    public static
    void main ( String[] args ) {
        // 4. 제네릭 클래스
        CoffeeByNumber c1 = new CoffeeByNumber(33); //앞에서 33명의 고객이 다녀갔다고 가정
        c1.ready(); // 33

        // 5. 닉네임 등록
        // 이번 손님은 이름을 등록한 손님이라 번호 대신 이름으로 출력
        // 현재 CoffeeByNumber는 public int waitingNumber 즉
        // 숫자를 받고 있어서 문자형을 받는 CoffeeByNickname class를 새로 생성


        // 7. 객체 생성
        CoffeeByNickName c2 = new CoffeeByNickName("유재석");
        c2.ready();

        System.out.println("--------------------------");

        // 8. 동작 같음
        // 현재 CoffeeByNickName과 CoffeeByNumber는 동작이 같다.
        // 둘 다 어떤 값(waitingNumber, nickName)을 받아서 커피 준비 완료라고
        // 뜨는 건 똑같다. 자료형이 float, double, boolean 등
        // 다양해 질 때 마다 매번class 만드는 건 번거롭다.

        // 이를 해결하기 위해 ObjectClass를 사용할 수 있다.
        // Object class는 모든 class의 조상 class라고 생각하면 된다.
        // 따로 상속하지 않더라도 Object class는 자동으로 inheria
        // CoffeeByNickname class에 있는 public String nickname에서
        // String을 Object 형태로 바꿔서 받게 하면 정수, double, float 모두 받을 수 있다.

        // 9. coffee 패키지에서 CoffeeByName 생성

        System.out.println("--------------------");

        // 11. Object 사용해서 method 호출

        CoffeeByName c3 = new CoffeeByName(34);
        c3.ready(); // 34

        CoffeeByName c4 = new CoffeeByName("박명수");
        c4.ready(); // 박명수

        // 12. 문제점
        // CoffeeByNumber와 CoffeeByNickName을 통해
        // 만들었던 걸 CoffeeByName 하나만으로 만든 걸 볼 수 있다.

        // 하지만 여기엔 문제가 있다.

        System.out.println("--------------------");

        // 13. 커피 주문한 사람의 정보를 얻기 위해서
        // c3.name을 가져오고자 한다. 즉 현재 CoffeByName class에 있는
        // public Object name의 name을 가져오고자 한다.

//        int c3Name = c3.name;

        // 위에처럼 쓰면 오류뜬다.
        // Object라서 바로 쓸 수 없고, 형 변환 필요

        int c3Name = (int) c3.name;
        System.out.println("주문 고객 번호: " + c3Name); // 주문 고객 번호: 34

        String c4Name = (String) c4.name;
        System.out.println("주문 고객 이름: " + c4Name); // 주문 고객 이름: 박명수

        // 14. 문제는 개발자가 실수할 때 오류를 알려주지 않는 것

        // c4Name = (String) c4.name;이라고 써야할 걸
        // c4Name = (String) c3.name; 실수해서 작성했을 때
        // 오류가 뜨지 않고, 실행하고 나서야 오류가 노출된다.

        // 이런 점을 개선하기 위해 generic class를 사용할 수 있다.

        System.out.println("----------------------------------");

        //15. Coffee class 생성하고, Coffee class를 generic class로 만든 뒤
        // 아래와 같이 사용할 수 있다.
        // 다이아몬드<>에 어떤 type 사용할지 작성
        Coffee<Integer> c5 = new Coffee<>(35);
        c5.ready(); // 커피 준비 완료
        int c5Name = c5.name; // 정수형 데이터라 형변환없이 선언 가능
        // 위에선  int c3Name = (int) c3.name; 이렇게 형변환이 필요했었다.
        System.out.println("주문 고객 번호; " + c5Name);

        Coffee<String> c6 = new Coffee<>("조세호");
        c6.ready();
        String c6Name = c6.name;
        System.out.println("주문 고객 이름; " + c6Name);


        // 정리하자면, 하나의 클래스(Coffee)를 통해 서로 다른 데이터 형태를
        // 처리할 수 있었다. 이렇게 하면 코드의 중복 없앨 수 있고,
        // 값을 가져올 때 형 변환을 할 필요도 없어서 개발 상 실수도 줄일 수 있음

        System.out.println("---------------------------");

        // 16. Generic class type 제한

        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("강호동"));
        // 강호동이라는 이름을 가진 User라는 객체를 new 연산자가 생성하고,
        // 이 객체를 CoffeeByUser class를 생성할 때 집어넣어서
        // 커피주문을 하게 된 것이다.

        c7.ready();

        CoffeeByUser<User> c8 = new CoffeeByUser<>(new User("강호동"));
        // CoffeeByUser class 객체를 만드는데, VIPUser 객체를 만든다.
        c8.ready();

        System.out.println("---------------------------");

        // 17. 여러 개의 값을 전달해야 하는 경우
        // 2개 이상의 파라미터를 한 꺼번에 처리하는 방법을 살펴보자

        // 일단 아래는 한 개일 때
        orderCoffee("김영철");
        orderCoffee("35");

        System.out.println("---------------------------");


        // 아래는 2개 일 때
        orderCoffee("김희철", "아메리카노");
        orderCoffee(37, "라떼");

   }

   // 1개일 때 method
   public static <T> void orderCoffee(T name) {
       System.out.println("Complete cofffe: " + name );
   }

   // 2개일 때 method
   // 주문한 사람뿐만 아니라 어떤 커피도 주문했는지도 알려주는 것이다.
    public static <T, V> void orderCoffee(T name, V coffee) {
        System.out.println(coffee + "Ready: " + name );
    }



}
