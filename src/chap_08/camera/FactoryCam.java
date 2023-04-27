package src.chap_08.camera;

public class FactoryCam extends Camera{

    @Override // - 부모 class에 정의되어 있는 method를 자식 class에 서 재정의하는 것
    public void showMainFeature () {
        // 이 method 만들어 준 이유는 extends Camera를 했더니
        // error가 떠서다. showMainFeature method를 만들어 줘야 해결됨

        // FactoryCam은 Camera를 상속받았다.
        // Camera class에선 showMainFeature method가 name만 정의되어 있었는데
        // child class인 FactoryCam에서 구체적으로 기능까지 작성했다.

        // 이로써 FactoryCam은 객체를 만들 수 있게 됐다.
        System.out.println("화재 감지");

        // 똑같이 SpeedCam class 만들어서 writing 해준다.

    }

    //// interface ////////////////////

    // 화재를 감지하면 신고도 자동으로 되도록 기능 설정

    // 화재감지 method
    public void detect() {
        System.out.println("화재를 감지합니다.");
    }

    // 신고 method
    public void report() {
        System.out.println("화재 신고를 진행합니다.");
    }

    ////// SpeedCam에도 동일하게 작성


}
