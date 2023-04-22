package src.chap_07.camera;

public class SpeedCam extends Camera{
//    public  String name;

    // 과속단속 카메라 class다.
    public SpeedCam () {
        this.name = "과속단속 카메라";
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

    // 속도를 측정해서 이 차가 과속인지 체크하는 메서드도 만들었다.
    public void checkSpeed() {

        System.out.println("속도를 측정합니다.");

    }

    // 차량번호 인식 method
    public void recognizelicensePlate() {
        System.out.println("차량번호를 인식합니다.");

    }


}
