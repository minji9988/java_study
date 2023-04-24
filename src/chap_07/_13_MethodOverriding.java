package src.chap_07;

// 메서드 오버라이딩

// 메서드 오버라이딩은 오버로딩과 다르다.

// Method Overloading(과부화/너무 많이 주다)
// - 같은 클래스 내에서 똑같은 이름을 가진 method를
// - parameter의 개수나 타입을 다르게 함으로써 정의할 수 있다.

// Method overriding(기각하다)
// - 부모 class에 정의되어 있는 method를 자식 class에 서 재정의하는 것


import src.chap_07.camera.Camera;
import src.chap_07.camera.FactoryCam;
import src.chap_07.camera.SpeedCam;

public class _13_MethodOverriding {
    public static void main ( String[] args ) {

    // Camera class에서 showMainFeature() method를 만듬
        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

// 위에처럼 작성할 경우 카메라~과속단속 카메라의 주요 기능이 모두
// 사진촬영와 동영상 녹화라고 나와버린다.
// 각 카메라마다 주요 기능이 다르게 나왔으면 할 때 'Method Overriding'을 사용할 수 있다.

        // Mehtod Overriding 방법

        // Camera class에 있는 showMainFeature method를
        // copy해서 FacotryCam에 paste한 후 method안에 작성한
        // 내용을 수정하면 Method Overriding 한 것


    }
}
