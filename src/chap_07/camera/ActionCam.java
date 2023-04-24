package src.chap_07.camera;

public final class ActionCam extends Camera{ //다른 곳에서 상속 못하게 막음

    public final String lens = "광각랜즈"; //액션캠은 광각랜즈를 사용해서 이렇게 써줌
// 어디에서도 lens값 바꾸지 못하게 하기 위해 final 사용


    // 생성자 함수 만들어 줌
    public ActionCam () {
        super("액션 카메라");
        // 부모 class의 생성자(Camera)에 접근함과 동시에 해당 생성자 method에
        // "액션 카메라"라는 parameter를 넘겨주는 것

    }

    public final void makeVideo() { //makeVideo 가져다 쓸 때 메서드 오버라이딩(재정의) 못하게 함.
        System.out.println(this.name + " : " + this.lens + "로 촬영한 멋진 비디오를 제작합니다.");
        // 상속 관계에 의해 자식클래스인 ActionCam 은 부모 클래스인 Camera 의 모든 내용을 포함하게 됩니다.
        // 그래서 ActionCam 에서 별다른 name 변수를 생성하지 않고 this 를 통해 접근하게 되면
        // 부모 클래스인 Camera 에 정의된 name 변수를 의미하게 됩니다.

//        public class ActionCam extends Camera {
//            public String name = "액션 카메라"; // 변수 생성
//            public void makeVideo() {
//                System.out.println(this.name);
//            }
//        }

//       출력: 액션카메라 ///////////////////////////////

//        ActionCam 에 name 변수가 없을 때는 부모클래스의 name 변수값(카메라)을 출력했지만,
//        ActionCam 에 name 변수(public String name="액션카메라";)가 생기니 이번에는 ActionCam의 name 변수값(액션 카메라)을 출력하게 되네요.
//        그러면 부모클래스의 name 변수는 더 이상 쓸 수 없는 것일까요?

        //놉!!!!!!!!!! this 대신 super를 사용하면 가능

//
//능       public class ActionCam extends Camera {
//            public String name = "액션 카메라";
//            public void makeVideo() {
//                System.out.println(super.name); // this 를 super 로 변경
//            }
//        }

//      출력:  카메라 /////////////////

//        출력문에서 this 대신 super 로 바꾸면 name 변수가 있음에도 불구하고
//        부모클래스의 name 변수값인 카메라가 출력됩니다.
//
    }

}
