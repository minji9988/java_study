package src.chap_08;

// 추상 클래스

//데이터 추상화
//추상 클래스에 대해 배우기 전에 데이터 추상화에 대해 배우고자 한다.
//
//- 데이터 추상화는 몰라도 되는 내용은 숨기고,
//알아야 할 정보만 공개하는 것이다.
//
//- 추상클래스랑 인터페이스를 통해서 데이터 추상화가 가능하다.
//- 이때 abstract란 키워드가 사용된다.
//
//abstract 사용범위
// : 추상 클래스(완선 X 클래스), 추상 메서드
//
//- abstarct를 통해 추상 클래스를 만들 수 있다.
//- 추상 클래스란 아직 완성되지 않은 클래스다.
//- 완성되지 않은 클래스라 객체로 만들 수 없다.
//
//- abstract를 통해 추상 메서드를 만들 수 있다.
// 추상 클래스에서만 사용 가능한, 껍데기만 있는 메서드다.

import src.chap_08.camera.Camera;
import src.chap_08.camera.FactoryCam;
import src.chap_08.camera.SpeedCam;

public class _01_AbstractClass {

    public static
    void main ( String[] args ) {

        // chap_08에서 Camera package를 만들고, Camera class 생성
        // 이때 Camera class는 abstract class다.


//    Camera camera = new Camera();

        //객체를 만들려고 시도했더니 error 뜸.
        // Camera는 abstract해서 객체를 못만듬
        // Camera는 추상 class라 객체를 만들 수 없으나
        // 추상 class를 inheritance한 child class는 만들 수 있다.

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainFeature();

        // 정리
        // - 데이터 추상화 즉 보여줄 건 보여주고, 숨길 건 숨기기 위해서 추상 클래스를 만들 수 있다.
        // - abstract class는 Object를 생성할 수 없다.
        // - abstract class를 inheritance한 child class는 can make object
        // - abstract method가 abstract class에 있다면
        // chile class에선 반드시 abstract method를 구현해야 한다.


        System.out.println("--------------");

        // 다양성 시간에 배웠던 것처럼 parent class인 Camera 형태로도
        // object를 만들 수 있다.

        Camera factoryCam_1 = new FactoryCam();
        factoryCam_1.showMainFeature();

        Camera speedCam_1 = new SpeedCam();
        speedCam_1.showMainFeature();

    }


}
