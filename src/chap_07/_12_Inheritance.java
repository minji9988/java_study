package src.chap_07;

//상속
// 부모 클래스에 있는 모든 걸 자식 클래스에서 가져다 쓰는 것

// 실습을 위해 chap_07에서 camera class를 관리하는 패키지를 만들었다.

import src.chap_07.camera.Camera;
import src.chap_07.camera.FactoryCam;
import src.chap_07.camera.SpeedCam;

public
class _12_Inheritance {
    public static void main ( String[] args ) {

        // 객체 생성 형싱
        // (class 이름) (객체이름) = new (class이름())
        // camera 객체를 만들어주면 자동으로 chap_07에 있는 camera class 가져옴
        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        System.out.println(camera.name);
        System.out.println(factoryCam.name);
        System.out.println(speedCam.name);

        // 사진기를 가지고 사진촬영을 하고자 한다.
        camera.tackPicture();
        factoryCam.recordVideo();
        speedCam.tackPicture();

        factoryCam.detectFire(); //화재감지
        speedCam.checkSpeed();
        speedCam.recognizelicensePlate();


    }
}
