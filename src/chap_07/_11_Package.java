package src.chap_07;

import java.util.Random;

// 서로 연관된 class끼리 묶는 게 패키지다.
public
class _11_Package {

    public static void main ( String[] args ) {


        // 잘 만든 프로그램 class는 다른 사람에게 제공할 수 있을 거다.
        // 다른 사람이 만든 random class를 사용해보자.

        Random random = new Random(); //Random class 사용하겠따는 구문
        System.out.println("랜덤 정수: " + random.nextInt()); //int의 범위 내에서 정수형 값 반환
        System.out.println("랜덤 정수 (범위):" + random.nextInt(10)); // 0 이상 10 미만의 정수형 값
        System.out.println("랜덤 실수: " + random.nextDouble()); // '0.0 이상 1.0 미만의 실수값

        // 만약 5.0 이상 10.0 미만의 실수을 얻으려면?
        // nextDouble 안에 숫자 넣으면 오류떠서 trick 써야 함

        double min = 5.0;
        double max = 10.0;

        System.out.println("랜덤 실수(범위): " + (min + (max - min) * random.nextDouble()));

        // (max - min) 값인 5를 곱함으로써 nextDouble의 값은
        // 0.0 이상 5.0 미만의 실수값으로 바뀐다.
        // 여기에 min 값인 5를 더함으로써 0.0 ~ 5.0이 5.0~10.0으로 변함

        System.out.println("랜덤 boolena: " + random.nextBoolean());


        // 로또 번호를 랜덤으로 뽑을며녀?
        // 1 이상 45 미만의 값을 얻어야 한다.

        System.out.println("로또 번호: " + random.nextInt(45) + 1);
        // nextInt(45) 라고 작성: 0 이상 45 미만의 수 중 출력
        // nextInt(45) + 1: 시작값을 1로 지정해서 1 이상 46 미만의 수 출력
    }

}
