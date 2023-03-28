package src.class_03;

public
class _02_InstanceVariables {

    public static
    void main ( String[] args ) {
        // BlackBox 객체를 여기서 만들고자 한다.

        //BlackBox class로부터 b1이란 객체 생성
        BlackBox b1 = new BlackBox();

        //BlackBox의 4가지 인스턴스 변수에 접근해서
        // 값을 설정할 수 있다.

        b1.modelName = "까망이";
        b1.resolution = "FHD";
        b1.price = 200000;
        b1.color = "블랙";

        // BlackBox class로부터 만들어진 b1이란 객체의
        // 4개의 인스턴스 변수(modelName~color)에 각각 값을 지정한 것

        System.out.println(b1.modelName);
        System.out.println(b1.resolution);
        System.out.println(b1.price);
        System.out.println(b1.color);


        System.out.println("--------------------------");

        //새로운 제품 생성

        BlackBox b2 = new BlackBox();

        b2.modelName = "하양이";
        b2.resolution = "FHD";
        b2.price = 300000;
        b2.color = "블랙";

        System.out.println(b2.modelName);
        System.out.println(b2.resolution);
        System.out.println(b2.price);
        System.out.println(b2.color);



    }
}
