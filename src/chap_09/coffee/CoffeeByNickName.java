package src.chap_09.coffee;

public class CoffeeByNickName {

    public CoffeeByNickName ( String nickname ) {
        this.nickname = nickname;
    }

    public String nickname;


    public void ready() {
        System.out.println("커피 준비 완료" + nickname);
    }

    // 6. 위에처럼 만들어주고,_02_GenericClass로 이동

}
