package src.chap_07.camera;

public class SpeedCam extends Camera{
//    public  String name;

    // 과속단속 카메라 class다.
    public SpeedCam () {

//        this.name = "과속단속 카메라";
        super("과속단속 카메라");

    }

    // 과속단속 카메라도 사진촬영과 동영상 녹화 기능이 있으니까
    // 해당 기능을 만들어 주겠다.

//    public void takePicture() {
//        //사진촬영
//        System.out.println("사진을 촬영합니다.");
//
//    }
//
//    public void recordVidoe() {
//        //동영상 녹화
//        System.out.println("동영상을 촬영합니다");
//
//    }

//////////////////////////////////////////
    // Super class lecture 때문에 넣어줌
    // 사진촬영 메서드
    public void tackPicture () {

        //System.out.println(this.name + " : 사진을 촬영합니다.");
        // 위에 줄 대신 아래처럼 작성 가능

        super.tackPicture(); //부모 class(Camera)에 있는 takePicture method를 모두 수행하고 아래 method를 수행

        checkSpeed(); //속도 측정
        recognizelicensePlate(); //번호판 인식

        //사진을 찍음과 동시에 속도 측정하고, 번호판 인식하기 위해
        // 위에처럼 작성해 줌

    }

    // 속도를 측정해서 이 차가 과속인지 체크하는 메서드도 만들었다.
    public void checkSpeed() {

        System.out.println("속도를 측정합니다.");

    }

    // 차량번호 인식 method
    public void recognizelicensePlate() {
        System.out.println("차량번호를 인식합니다.");

    }

    @Override
    //위의 노랑색 글씨로 된 Overrid는 에노테이션이라고 한다.
    // 컴파일러에게 아래 showMainFeature 페서드는 부모 메서드(Camera)를 오버라이딩
    // 하는 거라고 알려주는 것이다.
    public void showMainFeature () {
        System.out.println(this.name + "의 주요기능 : 속도 측정, 번호 인식");
    }
}
