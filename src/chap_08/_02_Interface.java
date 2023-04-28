package src.chap_08;

import src.chap_08.camera.FactoryCam;
import src.chap_08.detector.AdvancedFireDetector;
import src.chap_08.detector.Detectable;
import src.chap_08.detector.FireDetector;
import src.chap_08.reporter.NormalReporter;
import src.chap_08.reporter.Reportable;
import src.chap_08.reporter.VideoReporter;

public class _02_Interface {
    public static void main ( String[] args ) {

        // 인터페이스
        // 추상클래스가 미완성된 class였다면
        // interface는 뼈대만 제공하는 구조다.

        // class에서 inheritance(extends)를 할 경우 단일상속만 가능했었다.
        // 즉 parent를 하나만 가질 수 있었다.

        // 하지만 여러 곳에 있는 기능을 사용해야 할 때도 있다.
        // 이럴 때 interface를 사용한다.

        // 화재를 감지하는 FactoryCam으로 가보자.
        // FactoryCam과 SpeedCam에 detect와 report method를 만들고
        // reporter packgae create해서 Reportable interface 생성 후 report method 껍데이 만들어줌
        // 알맹이는 NormalReporter와 VideoReporter에 생성

        NormalReporter normalReporter = new NormalReporter();
        normalReporter.report();

        VideoReporter videoReporter = new VideoReporter();
        videoReporter.report();

        System.out.println("----------------------");

        // Interface 형태로 바꿀 수 있다.

        // interface를 구현함으로써 이 interface(Reportable)를 구현하는 모든
        // class들은 interface를 통해서 참조를 할 수 있다.

        Reportable normalReporter_1 = new NormalReporter();
        normalReporter_1.report();

        Reportable videoReporter_1 = new VideoReporter();
        videoReporter_1.report();

        System.out.println("----------------------");

        // detector package 만들고 Detectable interface랑
        // AdvancedFireDetecotr class와 FireDetector class 만듬

        Detectable fireDetector = new FireDetector();
        fireDetector.detect();  // 일반 성능으로 화재를 감지합니다.

        Detectable advancedFireDetector = new AdvancedFireDetector();
        advancedFireDetector.detect(); // 향상된 성능으로 화재를 감지합니다.

        // 만든 걸 FactoryCam에서 활용해 보고자한다.
        // FactoryCam에 있는 detect와 report method를 지움.

        System.out.println("----------------------V");

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetector(fireDetector);
        factoryCam.setReporter(normalReporter);

//        factoryCam.setDetector(advancedFireDetector); // fireDetector 대신 advancedFireDetecotr 넣음
//        factoryCam.setReporter(videoReporter); // normalReporter 대신 videoReporter 넣음

        factoryCam.detect();
        factoryCam.report();

        // detector 패키지에서만 놀았던 얘들을
        // 완전히 다른 패키지인 Camera에 있는 FactoryCam에서
        // Detectable interface에 있는 기능을 자유자재로 사용할 수 있게 됐다.

    }

}
