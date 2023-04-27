package src.chap_08.camera;

public class SpeedCam extends Camera {

    @Override
    public void showMainFeature () {
        System.out.println("속도 측정, 번호 인식");

    }
    //// interface ////////////////////

    // 사고 감지하면, 사고 신고 진행

   // 화재감지 method
    public void detect() {
        System.out.println("사고를 감지합니다.");
    }

    // 신고 method
    public void report() {
        System.out.println("사고 신고를 진행합니다.");
    }

    // 이렇게 만들게 되면 FactoryCam에 있는
    // detect랑 report와 기능이 유사하다.
    // 이렇게 유사한 것들을 interface로 빼서 중복을 최소화할 수 있다.

    // chap_08에 reporter package를 만들고 해당 package에
    // Reportable이란 interface를 생성


}
