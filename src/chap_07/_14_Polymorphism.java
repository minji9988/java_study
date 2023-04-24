package src.chap_07;

// 다형성

import src.chap_07.camera.Camera;
import src.chap_07.camera.FactoryCam;
import src.chap_07.camera.SpeedCam;

public class _14_Polymorphism {

    public static void main ( String[] args ) {

    // class Person: 사람
    // class Student extends Person: 학생 (학생은 사람이다. 상속)
    // class Teacher extends Person: 선생님 (선생님은 사람이다. 상속)

    // 사람이란 parents class 안에 학생과 선생님 class가 include된 것

//        Camera camera = new Camera();
//        FactoryCam factoryCam = new FactoryCam();
//        SpeedCam speedCam = new SpeedCam();

        // 위에 코드를 다혀성하면 앞에 있는 걸 부모 class로 change할 수 있다.

        Camera camera = new Camera();
        Camera factoryCam = new FactoryCam();
        Camera speedCam = new SpeedCam();

        // 즉 FacotryCam과 SpeddCam 대신 Camera라고 작성할 수 있는 것
        // 위에처럼 만들면 Camera라는 parents class는 FatoryCam이라는 자식 class 객체를 만들 수 있다.

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

        // 위에처럼 작성해도 코드가 잘 동작하는 걸 확인할 수 있다.

        System.out.println("---------------------");

        // 이런 객체도 배열로 관리할 수 있다.

        // 배열 형식 : 타입[] 변수;
        // 예) String[] names = new String[] {"혼공자", "자바맨"};

        //camera란 이름의 배열을 만들었다.
        Camera[] cameras = new Camera[3];

        // cameras 배열 안에 서로 다른 객체를 집어넣었다.
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        // for each 문 형식
        // for(변수타입 변수이름 : 배열 이름)
        //     실행부분;
        // 예) int array[] = {10, 20, 30};
        // for (int number : array) {
        //      System.out.prinn(number);
        // }

        for (Camera cam : cameras) { //cameras란 배열을 순회하는데 순회되는 값을 cam이란 이름으로 받아서 사용하겠다.
            cam.showMainFeature();
        }

        System.out.println("-------------------------");

//        factoryCam.detectFire();
//        speedCam.checkSpeed();
//        speedCam.recognizeLicensePlate();

        // 다형성을 사용할 때 문제점은 위에처럼 factoryCam과
        // speedCame class 내에만 있는 함수(detectFire같은)를 사용하지 못한다는 거다.
        // 오로지 Camera class에 있는 함수만 호출할 수 있다.

        ///////////////////////////////////////////////

        // 이럴 때 인스턴스 오브를 사용한다.
        // 특정 객체가 어떤 클래스의 객체인지 확인하는 것이다.

        if (camera instanceof Camera) { //camera 객체가 Camera란 class로부터 만들어진 인스턴스라면
            System.out.println("카메라입니다.");
        }

        if (factoryCam instanceof FactoryCam) {
            ((FactoryCam)factoryCam).detectFire();//facotrycam 객체가 FactoryCam이란 class로 형변환하는 것
            // (FactoryCam)factoryCam 부분이 형변환해주는 부분이다.
            // 위에처럼 작성해줌으로써 dectectFire()을 사용 가능하게 됐다.
            // 형변환을 통해 각각의 주요 객체가 가지는 기능을 사용할 수 있게 됐다.

            // factoryCam.detectFire();만 쓰면 오류가 떴었다.

        }

        if (speedCam instanceof SpeedCam) {
            ((SpeedCam) speedCam).checkSpeed();
        }

    }
}
