package src.class_03;

public
class _10_AccessModifier {
    public static
    void main ( String[] args ) {

        // 접근 제어자
        // 인터넷 카페에 글 작성할 때 전체 회원만 공개, 카페 회원만 공개하는 게 있는 것처럼
        // 특정 글을 열람하는 범위가 있듯이. 자바에서도 이런 접근 제어자가 있다.

        // private: 해당 클래스 내에서만 접근 가능
        // public: 모든 클래스에서 접근 가능
        // default: 같은 패키지(폴더) 내에서만 접근 가능
        // protected: 같은 패키지 내에서 접근 가능하고,
        //             다른 캐피지인 경우 자식 클래스에서 접근 가능(상속 공부할 때 알게됨)



        BlackBoxRefurbish b1 = new BlackBoxRefurbish(); //b1이라는 BlackBoxRefurbish 객체 생성
        b1.modelName = "까망이";
        b1.resolution = "FHD";

//        b1.price = 20000;
        // 원래 price을 위에처럼 지정해줬는데 price를
        // private price로 만들어줘서 price 변수는 BlackBoxRefurbish
        // 안에서만 사용이 가능해졌다.

        // 이젠 get과 set price를 통해서만 접근이 가능해진다.

        b1.setPrice(20000);


        b1.color = "까망이";

        //black box 제품을 할인행사한다고 한다.
        // 원래 가격에서 -5000을 넣어줘야 하는 데 실수로 -5000원만 입력했다. > 현재는 setMethod 사용해서 그런 현상 X
        b1.setPrice(-5000); // setPrice 함수에서  10000만원 이하면 10000원으로 자동 변경해라 했기에 -5000이 아닌 10,000이 나온다.
        System.out.println("가격: " + b1.getPrice() + "원");
        // 이 상태로 출력하면 엉뚱하게 -5000원이 출력되어 버린다.
        System.out.println("해상도: " + b1.resolution);

        System.out.println("-----------------------------");

        BlackBoxRefurbish b2 = new BlackBoxRefurbish();
        b2.setModelName("하양이");
        b2.setPrice(-5000);
        b2.setColor("화이트");

        System.out.println("가격: " + b2.getPrice() + "원");
        //b2.setPrice(-5000)이라고 작성했음에도
        // 결과로는 10000원이 찍히는 걸 확인할 수 있다.

        System.out.println("해상도 : " + b2.getResolution());
        //b2 객체에서 해상도를 설정하지 않았는데도
        // null이 뜨는 대신 "판매자에게 문의하세요."라고 뜬다.


        // 아래처럼 가격을 -5000원으로 설정하지 못하게 하려함

        //b2.price = -5000;

        // price 변수 앞에 접근 제어자 private을 붙여주면 됨
        // BlackBoxRefurbish class 안에 있는 price 앞에 private을 붙여주면 됨
        // private price라 작성해 주면 price는 BlackBoxRefurbish class
        // 내에서만 접근이 가능하게 된다.

    }
}
