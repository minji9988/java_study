package src.chap_08.detector;

// Detectable이란 interface를 만들고 이 interface를 구현하는
// FireDetector class를 만들었다.


public class FireDetector implements Detectable{

    // implements Detectable를 추가하는 건 interface 구현을 위해서다.
    // 위에 걸 적는 순간 error 발생
    // detect method를 override 함으로써 error 해결
   @Override
    public void detect () {
       System.out.println("일반 성능으로 화재를 감지합니다.");

       // 이렇게 작성하니 화재가 발생하지 않았음에도 센서가 울렸다.
       // 좀 더 개선된 감지 센서를 만들고자 한다.

    }
}
