package src.chap_07.camera;

public
class FactoryCam extends Camera{ // 자식 class
    // FactoryCam 뒤에 extends Camera라고 작성하면
    // 부모 class가 Camera라고 선언한 것과 동시에
    // Camera에 정의된 method를 사용할 수 있게 된다.

    // 공장에 카메라를 달아서 영상을 녹화하는 카메라를 만들고자 한다.
// 동영상에 불이 나면 화재를 감지하기 위함이다.



//    public String name;
    // 부모 class인 Camera에 이미 name이란 변수가 선언되어 있어서
    // 자식 class에선 name 변수를 선언할 필요없다.

    public FactoryCam() {
        this.name = "공장카메라";
    }

    ////////////////////////

    // 위에서 extends Camera를 통해 camera를 상속받았기 때문에
    // 아래 takePicture과 recordVideo는 사용하지 않아도 된다.
    // 해당 method는 이미 Camera에 정의되어 있기 때문이다.
//
//    public void takePicture() {
//        //사진촬영
//        System.out.println("사진을 촬영합니다.");
//
//    }
//
//    public void recodeVideo() {
//        // 동영상 녹화
//        System.out.println("동영상을 촬영합니다");
//
//    }

    public void detectFire() {
        // 화재감지
        System.out.println("화재를 감지합니다.");
    }

    public void showMainFeature() {
        System.out.println(this.name + "의 주요기능 : 화재 감지");
    }

}
