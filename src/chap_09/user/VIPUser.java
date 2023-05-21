package src.chap_09.user;

public
class VIPUser extends User {
    public VIPUser(String name) {
        super("특별한" + name); // parents class인 User class의 constructor를 call한다.
    }
}
