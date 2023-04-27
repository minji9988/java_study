package src.chap_08.reporter;

public class NormalReporter implements Reportable{

    // ingeritance할 땐 extends 작성한 것처럼
    // interface는 implements를 작성한다.

    // Reportable이란 interface를 구현하는 class가 바로
    // NormalReporter다.

    // 오류 뜰 텐데 implements해주면 된다. 그럼 report method가 생성됨

    @Override
    public void report () {
        System.out.println("일반 화재 신고를 진행합니다");
    }

    // 일반 카메라가 아닌 향상된 카메라로 영상을 찍어서 전송하고자한다.
    // 현재는 text 형태로 '무슨 공장에 화재 발생'이라고 뜨는데
    // 텍스트가 아닌 video 형태로 보내고 싶다.
    // VideoReporter class를 create.


}
