package src.chap_09.coffee;

// 현재 Coffee class는 Generic class라 모든 type을 받을 수 있다.
// type을 제한하는 걸 만들고자 한다.

import src.chap_09.user.User;

public
class CoffeeByUser <T extends User >{ // T extends User란 User라는 class를 상속하는 T를 쓴다.
    // 즉 User class와 User class를 상속하는 VIPUser class만 사용할 수 있다.

    public T user;

    public
    CoffeeByUser ( T user ) {
        this.user = user;
    }

    public void ready() {
        System.out.println("커피 준비 완료: " + user);
        System.out.println("커피 준비 완료: " + user.name);
        user.addPoint();
    }

}
