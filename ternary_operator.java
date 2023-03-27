public
class ternary_operator {

    public static
    void main ( String[] args ) {

        //삼항 연산자
        // 결과 = (조건) ? (참의 경우 결과값) : (거짓의 경우 결과값)

        int x = 5;
        int y = 3;

        // 가장 큰 수 출력
        //x가 y보다 크다면 x를 출력하라
        int max = (x > y) ? x : y;
        System.out.println(max);

        // 가장 작은 수 출력
        int min = (x < y) ? x: y;
        System.out.println(min);

        // 두 수가 같으면 true 다르면 false 출력
        x = 3;
        y = 4;
        boolean b = (x == y) ? true : false;
        System.out.println(b); //false

        // 두 개의 문자가 다르다면 달라요가, 같다면 같아요가 출력
        String s = (x != y ) ? "달라요" : "같아요";
        System.out.println(s); //달라요

    }



}
