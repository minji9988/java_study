package src.chap_07.camera;

public class SlowActionCam {

//public class SlowActionCam extends ActionCam {
    // 원래는 위에처럼 썼는 데 ActionCam에서 상속 못하게 final로 막아서
    // extends 못 쓰게 됨

    public String name; //상속 못 받아서 직접 써준 문장
    // 상속 받을 수 있었다면 쓸 필요없는 문장이엉싿.

    public SlowActionCam () {
        this.name = "slow action camera"; // Camera class의 name에 접근해서 이름설정
    }

//    public void makeVideo() {
//        System.out.println(this.name + " : "
//                + this.lens + "로 촬영한 멋진 슬로우 비디오를 제작합니다.");
//    }

    // 위의 코드 못 쓰는 이유
    // ActionCam에서 makeVideo는 메서드오버라이딩을 못하게 막아서
    // 재정의해서 사용할 수가 없다.
    // 그래서 주석처리 해야했음

    // 아래 문장은 상속을 못 받아서 다시 써준 makeVidoe다.
    public void makeVideo() {
        System.out.println("자체 개발한 비디오 제작 기능");
    }

}
