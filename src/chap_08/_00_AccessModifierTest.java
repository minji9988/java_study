package src.chap_08;

import src.chap_07.BlackBoxRefurbish;

public
class _00_AccessModifierTest {
    public static
    void main ( String[] args ) {

        //public부터 protected까지 test해본 code

        //b1이란 이름의 BlackBoxRefurbish 객체 생성
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();

        //modelName은 public이라 chap_08에서 07로 접근 가능
        b1.modelName = "까망이";

        //reolution은 default로 선언했다.
        // default는 같은 패키지(폴더)안에서만 접근 가능해서 오류뜸
        b1.resolution = "FHD";

        // price는 private으로 선언했고 private은
        // 같은 class 안에 있는 것 안에서만 접근이 가능하다.
        b1.price = 20000;

        // color는 protected로 선언했다.
        // protected는 같은 패키지 내에서, 다른 패키지인 경우 자신 클래서에스 접근 가능
        // 여기선 패키지도 다르고, 자식 클래스도 아니라 접근 불가
        b1.color = "블랙";


    }
}
