package src.chap_08.camera;

import src.chap_08.detector.Detectable;
import src.chap_08.reporter.Reportable;

public class FactoryCam extends Camera implements Detectable, Reportable {

    // Detectable과 Reportable Interface를 구현하고자
    // implements Detectable, Reportable를 작성해젔다.
    // 이렇게 작성함으로써 Detectable과 Reportable에 있는 기능을 사용할 수 있다.


    // VideoReporter와 FireDetector를 사용하기 위해 변수 선언

    public Detectable detector; //detector란 Detectable interface 변수
    public Reportable reporter; //reporter란 interface 변수 선언

    // detector와 reporter는 setter를 통해서 값을 넣고자 함
    // alt+insert 눌러서 setter 누르면 생성 가능함
    public void setDetector ( Detectable detector ) {
        this.detector = detector;
        // this.detector가 위에서 선언한 public Detectable detecor의 detecotr를 가르키는 건가?
        // Detectable detector는 그냥 별도의 파라미터 이름이다.
        // 위에서 선언한 detector 변수와는 완전히 다르다.

        // this.detector에 ( Detectabel detector )를 통해 전달받은
        // detector를 전해주면 된다.
        // 만약 _02_Interface에서 factoryCam.setDetector(fireDetector)라고 작성되어 있다면
        // Detectable detector에는 fireDetector가 전달되는 것이고. detector에는 fireDetector가 저장되고
        // this.detector에 fireDetector가 저장되는 것이다.
    }


    // 왜 set을 사용하는지 잘 모르겠다면

//    FactoryCam 은 화재 감지와 자동 신고 기능이 추가된 공장 카메라입니다.
//    그런데 화재 감지 기능은 카메라 회사에서 직접 만드는 것이 아니라
//    햄버거집의 콜라처럼 화재 감지 기능 개발 전문 업체에서 제품을 사와서 사용한다고
//    하면 어떨까요? 햄버거 세트 메뉴에 콜라 캔 하나만 추가로 넣는 것처럼
//    그냥 화재 감지 기능을 넣기만 하면 될 겁니다.
//
//    만약 보다 개선된 버전 또는 새로운 업체에서 만든 제품을 사용한다면
//    기존 제품을 새 것으로 교체하면 될 겁니다.
//    콜라를 사이다로 바꾸는 것처럼요.
//    이를 쉽게 하기 위해서 setDetector() 를 제공하였고
//    메인 메소드에서는 간단히 이 메소드를 호출하면서 부품을
//    전달해주면 클래스 내에서는 이를 참조할 수 있는 detector 를
//    통해서 전달받은 화재 감지 기능을 사용할 수 있게 되는 것입니다.

    // 아래 코드 한 줄 해석
//    factoryCam.setDetector(advancedFireDetector);

//    setDetector 라는 setter 를 통해서 advancedFireDetector 를 설정하고,
//    factoryCam 객체에서 화재 감지 기능을 사용할 때 advancedFireDetector 의
//    화재 감지 기능을 사용한다는 뜻
//
//    마치 햄버거 세트 메뉴에 고객의 주문에 따라 콜라 또는 사이다를 넣는 것과 유사합니다.
//
//      hamburgerSetMenu.setDrink(coke); // 콜라
//      hamburgerSetMenu.setDrink(cider); // 사이다

    public void setReporter ( Reportable reporter ) {
        this.reporter = reporter;
    }


    @Override
    public void detect () {
        detector.detect(); // detector는 public Detectable detector의 detector를 가리킴
        // detector.detect()는 Detectable interface에 선언된 void detect method를 가리킴
        //
    }

    @Override
    public void report () {
        reporter.report();
    }


    // 화재를 감지하면 신고도 자동으로 되도록 기능 설정
//
//    // 화재감지 method
//    public void detect() {
//        System.out.println("화재를 감지합니다.");
//    }
//
//    // 신고 method
//    public void report() {
//        System.out.println("화재 신고를 진행합니다.");
//    }
//
//    ////// SpeedCam에도 동일하게 작성
//

    // detect와 report method를 commend 처리한 이유는 _02_Interface 강의를 위해서
    // Detectable과 Reportable Interface를 구현하고자 한다.
    // 구현 방법은 implements Detectable, Reportable이라고 상단에 작성하는 것


    // 위에는 interface 내용////////////////////////

    /////////// 아래는 abstract class 내용 /////////////////////////////

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


}
