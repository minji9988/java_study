package src.chap_07;

import java.awt.print.Book;

import src.chap_07.camera.Camera;

public class _Quiz_07 {

    public static
    void main ( String[] args ) {

        // 햄버거를 자동으로 만드는 프로그램

        // 햄버커 종류는 햄버거, 치즈버거, 새우버거3 각각의 클래스 생성
        // 버거 이름담는 name 변수 정의
        // 재료 정보를 표시하는 cook 메서드 정의
        // 공통 부분은 상속 및 메소드 오버라이딩으로 처리
        // 모든 클래스는 하나의 파일에 정의

        // 햄버거: 양상추, 패티, 피클
        // 치즈버거: 양상추, 패티, 피클, 치즈
        // 새우버거: 양상추, 패티, 피클, 새우


        // Hambuger class
        class HamBurger {

            public String name = "햄버거";

            // 재료 정보 담는 cook 메서드
            void cook () {
                System.out.println(name + "를 만듭니다.");
                System.out.println("빵 사이에 들어갈 재료는?");
                System.out.println(">양상추");
                System.out.println("+패티");
                System.out.println("+피클");
            }

        }

        class CheeseBurger extends HamBurger {

            void cook () {
                name ="치즈버거"; //이 문장 안 쓰면 부모 class에 정의된 "햄버거"가 나올 것이다.
                // 이렇게 method 안에 부모 class와 똑같은 변수명을 가진 변수(name)을 생성할 경우
                // 일단 자식 class에 있는 게 반영된다.
                super.cook();

                // super란?
                // 부모 class의 특정 method을 모두 수행한 다음
                // 자식 class의 method가 동작할 수 있도록 하는 것

                System.out.println("치즈");
            }
        }

        class ShrimpBurger extends HamBurger {

            void cook () {
                name ="새우버거";
                super.cook();
                System.out.println("shripm");
            }
        }


//      HamBurger 객체 3개를 배열 형태로 만들어 사용하기
        HamBurger[] hamBurgers = new HamBurger[3];

//        아직 HamBurger 객체를 선언만 했지 만든 건 아니기 때문에,
//        HamBurger 객체를 사용하기 위해서는 아래와 같이 작성필요.
        hamBurgers[0] = new HamBurger();
        hamBurgers[1] = new CheeseBurger();
        hamBurgers[2] = new ShrimpBurger();

        System.out.println("주문하신 메뉴를 만듭니다.");
        System.out.println("------------");


        // for each 문 형식
        // for(변수타입 변수이름 : 배열 이름)
        //     실행부분;
        // 예) int array[] = {10, 20, 30};
        // for (int number : array) {
        //      System.out.prinn(number);
        // }

        for (HamBurger hamBurger : hamBurgers) {  //hamBurger란 배열을 순회하는데 순회되는 값을 habBurger란 이름으로 받아서 사용하겠다.
            // 첫 번째 순회 땐 HamBruger class를, 두 번째엔 CheeseBurger를, 세 번째 땐 ShrimpBurger를 돌게 된다.
            hamBurger.cook(); //각 hamBruger 객체의 cook 메서드 호출
            System.out.println("---------------");
        }
        System.out.println("메뉴 준비가 완료되었습니다.");


    }
}
