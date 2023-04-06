package src.class_03;

//this란?
// 특정 변수가 인스턴스 변수임을 명시해 주는 것


// this를 사용하는 이유

//method내에서 사용하려고 하는 인스턴스 변수와
// 파라미터 변수의 이름이 똑같다면 인스턴스 변수 앞에
// this. 을 붙여서 해당 변수가 인스턴스 변수인 것을 명시해 준다.


public class _07_This {
    public static void main ( String[] args ) {

        //b1이란 이름으로 BlackBox 객체 생성
        BlackBox b1 = new BlackBox();

        //까망이란 모델명 앞에 (최신형)을 붙여주고자 한다.
        b1.modelName = "까망이";

        b1.appendModelName("(최신형)");
        //appendModelName 함수는 기존의 model name에 다른 텍스트를 추가하는 함수다.
        //예) 까망이란 model name 앞에 (최신형)이란 텍스트 추가

        System.out.println(b1.modelName);

    }
}
