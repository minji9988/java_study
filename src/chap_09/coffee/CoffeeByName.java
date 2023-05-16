package src.chap_09.coffee;

public class CoffeeByName {

    public Object name; // Object이기 때문에 Double, String, Integet 모두 받을 수 있음

    public CoffeeByName(Object name) {
        this.name= name;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " +  name);
    }

    // 10. GenericClass로 다시 이동

}
