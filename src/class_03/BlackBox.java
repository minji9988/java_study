//<학습내용>

// class 생성 방법
// class 내의 인스턴스 생성 방법
// static을 사용해서 class 변수 생성 방법
// class 내에서 method 생성 방법

package src.class_03;

import org.w3c.dom.ls.LSOutput;

public class BlackBox {


    //BlackBox 란 설계도를 만든 것이다.
    // 이 설계도에 4가지 data가 있다.

    String modelName; //모델명
    String resolution; //해상도
    int price; //가격
    String color; //색상

    int serialNumber = 0; //시리얼 번호

    static int counter = 0; //시리얼 번호를 생성함. 처음엔 0이었다가 ++연산을 통해 값을 증가


// BlackBox는 4개의 인스턴스 변수 혹은 필드를 가진다고 할 수 있다.
//modelName, resolution, price, color

// BlackBox class를 사용하기 위해 _02_InstanceVariables 파일 생성



    //static을 붙이면 class 변수가 된다.
    //BlackBox란 class 내에 class 변수가 생성된 것

    //static 없는 위의 변수 4개는 인스턴스 변수다.
    // 인스턴스 변수는 서로 다른 객체에서 서로 다른 값을 가질 수 있다.

    // static을 붙이면 BlackBox로 부터 만들어지는 모든 객체에
    // 똑같이 적용된다는 차이점이 있다.
    static boolean canAutoReport = false; //자동신고기능

    // 접근방식
    // 인스턴스는 b1.modeName 형태로 접근하지만
    // class 변수는 canAutoReport는 클래스명.클래스변수명 형태로 접근한다.
    // 예) BlackBox.canAutoReport



    ///////////////////////////////////////////
    //08_생성자

    //아래와 같은 형태가 생성자의 형태다.
//    BlackBox() {
//
//    }


    BlackBox() {
        System.out.println("기본 생성자 호출");
        this.serialNumber = ++counter;
        // 처음 BlackBox 객체가 만들어질 때
        // 이 BlackBox 생성자 함수가 실행된다.
        // counter 값의 초기값은 0인데 0에 ++을 해줘서 1로 변한다
        // 새로운 객체가 만들어질 때 마다 +1 이 된다.

        System.out.println("새로운 시리얼 넘버를 발급받았습니다: " + this.serialNumber);


    }


    //아래 BlackBox는 사용자 정의 생성자 함수다.
    //메서드를 오버로딩 할 수 있는 것처럼 생성자 함수도 여러개 만들 수 있다.
    BlackBox(String modelName, String resolution, int price, String color) {

       this();

       //위의 this 설명

        // 생성자 함수를


        //생성자가 호출될 때 전달받는 파라미터 값을 인스턴스 변수에 대입하기

        System.out.println("사용자 정의 생성자 호출");


        this.modelName = modelName;
        //인스턴스 변수로 만들어진 modelName에 우리가 위에서 전달받은
        // 즉 String modelName 파라미터의 modelName을 정의해 줌

        this.resolution = resolution;
        this.price = price;
        this.color = color;


    }


   //End Constructor ////////////////////////////////////////////

    // 자동신고 기능 method
    void autoReport() {

        //canAutoReport가 true면 자동신고 가능하고
        // false면 자동신고가 불가하게 만들어보자

        if (canAutoReport) {
            System.out.println("충돌이 감지되어 신고합니다.");
        }
        else {
            System.out.println("자동신고 기능이 지원되지 않습니다.");
        }

    }

    //memory 카드 method로 특정 용량(capacity)에 해당하면
    // 출력이 되도록 하려 한다.

    void insertMemoryCard(int capacity) {  // _04_Method 파일에서 capacity를 전달해줌
        System.out.println("메모리 카드가 삽입되었습니다");
        System.out.println("용량은 " + capacity + "입니다");
    }

    //저장되어 있는 영상의 개수를 return한다.
    // 파일 개수를 받아와야 하니까 int로 받아오겠다.

    int getVideoFileCount (int type) {
        if (type == 1) { //일반 영상이면
            return 9; //9를 반환하라

        } else if (type == 2) { //이벤트 영상이면
            return 1; //1을 반환하라
        }
        return 10; // type을 알 수 없다면 10반환
    }

    // 녹화 시 나타나는 정보 method
    // showDateTime : 날짜정보 표시여부
    // showSpeed : 속도 정보 표시 여부
    // min: 블랙박스 영상을 몇 분 단위로 끊어서 저장할 건지)
    void record(boolean showDateTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다");

        if (showDateTime) { //showDateTime이 trur면 출력
            System.out.println("영상에 날짜정보가 표시됩니다.");
        }
        if (showSpeed) { //if 대신 else를 사용하면 위의 if가 true일 때 아래 문장 시행 안돼서 별도로 if 작성
            System.out.println("영상에 속도정보가 표시됩니다.");
        }
        System.out.println("영상은 " + min + "분 단위로 기록됩니다.");

    }

//     기본값으로 시간, 속도는 true로 분은 5분 단위로 하고자 할 때
//
//    void record() {
//        System.out.println("녹화를 시작합니다");
//        System.out.println("영상에 날짜정보가 표시됩니다");
//        System.out.println("영상에 속도정보가 표시됩니다.");
//        System.out.println("영상은 5분입니다");
//    }
//

    // 위에처럼 작성하면 너무 불편하다.
    // 아래처럼 해결 가능하다.

    void record() {
        // 기본값으로 시간, 속도, 분은 5분 단위로 저장하겠다고 알려줌
        record(true, true, 5);
    }


    //기존의 model name에 다른 텍스트를 추가하는 함수다.
    //예) 까망이란 model name 앞에 (최신형)이란 텍스트 추가
    void appendModelName ( String modelName ) {
        //modelName += modelName;
        //위에처럼 적으면 인스턴스 변수와 전달받은 파라미터 변수가 같은 것이다.
        // 이 상태에서 실행시키면 '까망이'라고 나온다. '까망이(최신형)'
        //이라고 나오지 않는다.

        this.modelName += modelName;
        //this.modelName이라고 쓰면 BlackBox class 안에 있는
        //인스턴스 변수인 modelName을 가리키게 된다.

        // this.modelName 뒤에 오는 modelName은 파라미터로 전달받은 modelName이 된다.

    }
}
