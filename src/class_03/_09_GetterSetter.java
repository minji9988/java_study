package src.class_03;

// set은 값을 설정하는 것
// get은 설정한 값을 가져오는 것

// 이상한 값을 잘못입력했을 때
// 그 이상한 값이 뜨지 않고, 대신 다른 값으로 대체해주는 게
// getter와 setter다.

// 가령 5000원을 -5000으로 잘못입력했다면
// 이 -5000원을 이상한 값으로 인식하고
// 이렇게 이상한 값이 들어왔을 때 -5000이 아닌
// 다른 결과(100000원)가 뜨도록 대체하는 것이다.

public
class _09_GetterSetter {
    public static void main ( String[] args ) {
        BlackBox b1 = new BlackBox(); //b1이라는 BlackBox 객체 생성
        b1.modelName = "까망이";
        b1.resolution = "FHD";
        b1.price = 20000;
        b1.color = "까망이";

        //black box 제품을 할인행사한다고 한다.
        // 원래 가격에서 -5000을 넣어줘야 하는 데 실수로 -5000원만 입력했다.
         b1.price = -5000;
        System.out.println("가격: " + b1.price + "원");
        // 이 상태로 출력하면 엉뚱하게 -5000원이 출력되어 버린다.
        System.out.println("해상도: " + b1.resolution);

        System.out.println("-----------------------------");

        BlackBox b2 = new BlackBox();
        b2.setModelName("하양이");
        b2.setPrice(-5000);
        b2.setColor("화이트");

        System.out.println("가격: " + b2.getPrice() + "원");
        //b2.setPrice(-5000)이라고 작성했음에도
        // 결과로는 10000원이 찍히는 걸 확인할 수 있다.

        System.out.println("해상도 : " + b2.getResolution());
        //b2 객체에서 해상도를 설정하지 않았는데도
        // null이 뜨는 대신 "판매자에게 문의하세요."라고 뜬다.



    }
}
