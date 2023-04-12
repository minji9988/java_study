//<학습내용>
// 객체지향 정의
// 객체, 클래스, 인스턴스의 정의
// 클래스와 객체를 생성하는 방법

package src.chap_07;

public
class _01_Class {

    public static
    void main ( String[] args ) {
        //객체 지향 프로그래밍 (OOP: Object-Oriented Programming)
        // 유지보수 편지하고 높은 재사용성 지님

        //우리가 같은 자료형을 다룰 땐 배열을 사용했었다.
        // 예)
        // String[] items = {"CPU", "RAM", "하드시트크"};

        //위에선 문자열로 같은 자료형을 다루고 있는데
        // 서로 다른 자료형을 다룰 땐 배열을 사용할 수 x
        // 배열은 같은 형태의 data만 다룰 수 있다.


        //객체지향 예시: 차량용 블랙바스
        // 블랙박스의 모델명, 해상도, 가격, 색상을 저장해 보자.

        // 첫 번째 제품
        String modelName = "까망이";
        String resolution = "FHD";
        int price = 20000;
        String color = "블랙";


        // 얼마 지나지 않아서 아래와 같은 두 번째 제품을 만듦

        // 두 번째 제품
        String modelName2 = "하양이";
        String resolution2 = "UHD";
        int price2 = 30000;
        String color2 = "white";


        //여기서 또 다른 제품을 더 만든다면?
        // 제품 만들 때 마다 새로운 걸 작성하면 코드 줄이 너무 길다.
        // 이럴 때 class를 만들 수 있다.

        //BlackBox 파일을 만들고 class를 생성했다.


        //BlackBox class로부터 객체 만들기 > class로부터 만들어지는 게 객체다.
        // 객체 생성 형싱
        // (class 이름) (객체이름) = new (class이름())
        BlackBox bbox = new BlackBox();

        //BlackBox란 class로부터 bbox란 객체를 생성함
        //bbox 객체는 BlackBox 클래스의 인스턴스라고 한다.

        //class는 설계도라고 보면 된다.
        // 객체는 설계도로부터 만들어진 결과물이다.
        // 예) 종이접기 책이 있다. 종이접기 책을 통해
        // 학을 여러마리 만든다면 책은 class고, 학들은 객체가 된다.
        // 이때 학들은 종이접기 책(클래스)의 인스턴스라고 한다.

        // 객체는 여러개 만들 수 있다.

        BlackBox bbox2 = new BlackBox();

        //위에서 bbox란 객체를 만들었다면 여기선 bbox2란 객체를 만들었다.


    }
}
