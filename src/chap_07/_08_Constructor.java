package src.chap_07;

//생성자란?

//객체가 생성될 때 자동으로 호출되는 메서드다.


// 생성자 함수 만드는 이유
// 객체가 호출될 때 기본적으로 작동되야 할 부분이 있는 경우 생성자에 명시
// 객체가 생성됨과 동시에 우리가 전달한 값으로 초기화를 하고자 할 때 //BlackBox에 있음 예시
// +(추가) 생성자 간에 서로를 호출하기 위해서 this()를 사용한다.

public
class _08_Constructor {
    public static
    void main ( String[] args ) {

        BlackBox b1 = new BlackBox();
        //b1이란 객체가 만들어질 때 반드시 해야하는 동작을 설정하고 싶다.

        //constructor 만드는 방법
        //BlackBox class로 간다.
        //생성자는 인스턴스 변수 아래에 만들어준다.
        //BlackBox 생성자 만들고, 그 아래에 sout("기본 생성자 호출)
        //이라고 적어준 후 실행을 시키면
        // b1란 BlackBox 객체가 만들어짐과 동시에 기본 생성자 호출이란 문구가 뜨게 된다.


//        원래는 생성자 함수 만들어주고 아래처럼 값을 대입해줘야 했다.
//        b1.modelName = "까망이";
//        b1.resolution = "FHD";
//        b1.price = 200000;
//        b1.color = "블랙";

        //하지만 이렇게 쓰면 여러줄을 써야 해서 불편하다.
        // BlackBox class로 가서 BlackBox 사용자 정의 생성자 함수를
        // 만들어 줘서 한 줄로 끝내는 방법을 만들었다.

        ////////////////////////////

        //생성자 함수
        System.out.println(b1.serialNumber); // 1출력


        BlackBox b2 = new BlackBox("하양이", "UHD", 30000, "화이트");


       //위의 한 줄 써주고 이제 출력해보기
        System.out.println(b2.modelName);
        System.out.println(b2.resolution);
        System.out.println(b2.price);
        System.out.println(b2.color);

        // 위에처럼 작성하면 '사용자 정의 생성자 호출이' 나오고
        // 그 아래 하양이, UHD, 30000, 화이트가 뜬다.

///////////////////////////////////////////////////////////


        // BlackBox에 시리얼 넘버가 있다고 하자.

        //BlackBox class에 serialNumber가 추가된다.


        //생성자 함수
        System.out.println(b2.serialNumber); // 2출력



    }
}
