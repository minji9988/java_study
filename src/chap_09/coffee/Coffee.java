package src.chap_09.coffee;

public
class Coffee <T> { //Coffee class 뒤에 <T>를 작성해주고
    public T name; // 인스턴스 변수를 T라고 지정해줌으로써 제너릭 CLASS를 만든 거다.
                    //name이 어떤 type인지 몰라서 T라고 적음
                    // 이렇게 만든 걸 _02_GenericClass에서 사용한다.
    public
    Coffee ( T name ) {
        this.name = name;
    }

    public void ready() {
        System.out.println("커피 준비 완료: " + name);
    }
}
