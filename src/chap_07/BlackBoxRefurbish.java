package src.chap_07;

public
class BlackBoxRefurbish {

    public String modelName; //모델명

    //아래 resolution 접근제어자는 default로 설정한 거다.
    String resolution; //해상도
    private int price; //가격
    protected String color; //색상

    // getter와 setter 자동 완성 방법
    // 위의 코드를 마우스 드래그 한 상태에서 alt+enter 누르고
    // generate > getter, setter 클릭하면
    // 아래에 get과 set Method가 생성된다.

    public
    String getModelName () {
        return modelName;
    }

    public
    void setModelName ( String modelName ) {
        this.modelName = modelName;
    }

    public
    String getResolution () {
        if(resolution == null || resolution.isEmpty()) {
            return "판매자에게 문의하세요";
        }
        //isEmpty는 비어있단 뜻이다.
        return resolution;
    }

    public
    void setResolution ( String resolution ) {
           this.resolution = resolution;
    }

    public
    int getPrice () {
        return price;
    }

    public
    void setPrice ( int price ) {
        if (price < 10000) {
            this.price = 10000;
            // 이렇게 설정하면 -5000이라고 잘못 설정해도
            // -50000이 아닌 100000원으로 자동 조정된다.
        }
        else {

            this.price = price;
        }
    }

    public
    String getColor () {
        return color;
    }

    public
    void setColor ( String color ) {
        this.color = color;
    }
}


