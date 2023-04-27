package src.chap_08.camera;

// public class 사이에 abstract를 넣어줌.
// 이렇게 하면 Camera라고 하는 추상 클래스를 만든 것

public abstract class Camera {

    public void takePicture() {
        System.out.println("Take a picture");
    }

    public void recordVideo() {
        System.out.println("Record a video");
    }

    // abstract class 내에는 abstract method도 define함
    // Camera class에 있는 건 camera 부품만 있다고 가정을 해보자.


    public abstract void showMainFeature();
    // Camera에서 abstract method를 정의했다.
    // abstract class내에서 define하는 abstract method는 method name만 선언한다.

    // Camera를 inheritance하는 child class에서
    // showMainFeature method를 구현하도록 하려 한다.

    // factorcy cam과 speedcam에서 상속받아서 만들어 보고자 한다.



}
