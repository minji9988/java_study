package src.chap_07;

//final

// 어떤 변수가 변경되지 않았으면 할 때 final을 사용한다.
// ex) 변수를 String name = "푸푸";라고 정의한 다음에
// name = "사사";라고 변경이 가능하다.
// String final name ="푸푸";라고 지정하면 변경이 불가하다.

// camera package에서 actioncam class를 만듬



// final로 한 것

// 1. 변수 값 변경 못하게 막기

// 2. 메서드 오버라이딩 못하게 막기 > 특정 메서드만 못 쓰게 함
// > ActionCam에 있는 makeVideo를 SlowCam에서 사용 못하게 함

// 3. 상속자체를 막기 > 모든 메서드 다 못 쓰게 함
// > ActionCam에서 public class ActionCam 부분에
// publick final class라고 작성해서 상속을 못하게 막아버림
// SlowActionCam에선 extends ActionCam 못 쓰게 됨


import src.chap_07.camera.ActionCam;
import src.chap_07.camera.SlowActionCam;

public class _17_Final {
    public static void main ( String[] args ) {

        //Final
        ActionCam actionCam = new ActionCam();

        // 액션캠으로 촬영할 때 광각렌즈가 아닌 표준 렌즈로
        // 촬영을 하고 싶었다. 아래처럼 만들어줬다
        //actionCam.lens = "표준렌즈"; // 광각렌즈 > 표준렌즈로 변경

        // 그런데 렌즈를 광각렌즈로 고정하고 싶다면?
        // 즉 lens 안에 들어가 있는 값을 변경 못하게 하고 싶다.

        // 이럴 땐 ActionCam에 들어가서 public String lens를
        // public final String lens로 바꾸면 된다.

        actionCam.recordVideo(); //Camera class에 있는 method 사용
        actionCam.makeVideo(); // ActionCam class에 있는 method 사용


        //ActionCam도 좋지만 SlowActionCam도 만들고 싶다.
        // Make SlowActionCam class


        System.out.println("---------------------------");

        SlowActionCam slowActionCam = new SlowActionCam();


        // slowActionCam.recordVideo(); < 상속을 못 받아서 주석 처리해줌
        // 위에 걸 쓰려면 slowActionCam에 recordVideo method 만들어 줘어ㅑ 함.
        // 상속 받았을 땐 그냥 ActionCam에 있는 recordVideo 가져와서 자동으로 쓸 수 있어서
        // slowActionCam에 recordVideo method를 작성할 필요가 없었는 데
        // 상속 하나 못 받아서 이런 불편이 생김

        slowActionCam.makeVideo();



    }
}
