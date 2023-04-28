package src.chap_08.detector;

// Detectable이란 interface를 만들고 이 interface를 구현하는
// AdvancedFireDetector class를 만들었다.

public
class AdvancedFireDetector implements Detectable {
    @Override
    public void detect () {
        System.out.println("향상된 성능으로 화재를 감지합니다.");

        // 이렇게 만들고 _02_Interface에서 객체를 만듬

    }

}
