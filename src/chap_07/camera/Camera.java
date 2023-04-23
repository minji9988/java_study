package src.chap_07.camera;

// 사진 촬영, 동영상 모듈을 녹화할 수 있는
// 카메라 부품이 모여져있는 camera class다.

public class Camera { // 부모 클래스

    public  String name; //
// 위에서 만든 name이란 인스턴스 변수를
// 아래 생성자 함수가 전달받아서 값을 생성해 준다.

    public Camera () {
        this.name = "카메라";
    }

    // 카메라가 가지고 있는 2가지 기본적인 메서드 정의

    // 사진촬영 메서드
    public void tackPicture() {
        System.out.println(this.name + " : 사진을 촬영합니다.");
    }

    // 동영상 녹화 메서드
    public void recordVideo() {
        System.out.println(this.name + " : 동영상을 촬영합니다");
    }

    // camera package 안에 새로운 class를 만든다.
    // 과속방지 카메라(speedcam랑 공장 카메라(factoryCamera)를 만들었다.

    // 모든 종류의 카메라에는 사진촬영 기능, 비디오 녹화 기능이 들어가 있다.
    // 이렇게 공통된 기능을 각 클래스마다 정의하지 말고,
    // 그냥 하나의 class에만 사진촬영 기능, 비디오 녹화 기능을 작성하고,
    // 거기에 작성한 걸 상속받는 형태로 가져올 수 있다.

    // 기능을 물려주는 걸 부모 class라 하고,
    // 물려받는 걸 자식 class라고 한다.
    // Camera class가 부모 class가 돼고, FactoryCam과, SpeedCam이 자식 class가 된다.


    // 주요 기능을 보여주는 method
    public void showMainFeature() {
        System.out.println(this.name + "의 주요기능 : 사진 촬영, 동영상 녹화");
    }


}