package src.chap_07;

//super
// 자식 class에서 부모 class의 variable이나 method에 access할 때 사용

// 부모 class의 특정 method을 모두 수행한 다음
// 자식 class의 method가 동작할 수 있도록 하는 것

// 예) FatorCamera class에 가면 detectFire method가 있었다.
// 열감지 기능은 동영상 녹화를 시작함과 동시에 화재 감지 기능을 켜놔야 한다.
// 즉 Camera class에서 recordVideo가 동작함과 동시에 FactoryCam에 있는 detectFire가 동작해야한다.
// 이를 위해선 FactoryCam class에 있는 recordVideo 안에 detectFire()를 작성해 주면 된다.

// SpeedCam의 경우 속도를 측정함과 동시에 차량 번호를 인식할 것이다.
// SpeedCam에선 takePicture가 동작함과 동시에 shcekSpeed와 recognizeLicensePlate가 동작하게 하려 한다.

import src.chap_07.camera.FactoryCam;
import src.chap_07.camera.SpeedCam;

public class _15_Super {
    public static void main ( String[] args ) {


        // 객체 생성 형싱
        // (class 이름) (객체이름) = new (class이름())
        FactoryCam factoryCam = new FactoryCam();
        //FactoryCam이란 class로부터 factoryCam이란 객체를 생성함
        //factoryCam 객체는 FactoryCam 클래스의 인스턴스라고 한다.

        SpeedCam speedCam = new SpeedCam();

        factoryCam.recordVideo();
        System.out.println("-----------------");
        speedCam.tackPicture();

        // 배울 내용

        // 1. 자식 class에서 부모 class를 super를 사용해서 호출하는 방법
        // 2. 부모 class에 생성자 함수 만들고, 자식 class에서 부모 class의 생성자를
        // super를 통해 어떻게 호출할 수 있는지를 알아봄

    }
}
