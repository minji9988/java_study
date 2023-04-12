package src.chap_07;

public
class _05_MethodOverloading {

    public static
    void main ( String[] args ) {

        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";

        // record method를 만들고자 한다.
        // record를 할 때 어떤 information이 표시된다.
        // 녹화시간, 속도, 위치 정보를 표현해 준다.
        // record method는 BlackBox file에 정의함


        // BlackBox 파일에 정의된 record method를 불어와보자

        b1.record(false, false, 10);
        // record는 날짜, 속도, min 총 3개의 인자를 받으니 3개 작성
        // 위에처럼 작성할 경우 "녹화를 시작합니다."란 문구와
        // '영상은 10분 단위로 기록됩니다'라고 뜬다.


        System.out.println("-------------------------");

        // 날짜, 시간 정보 받고, 속도는 표시하지 않으려 할 때
        b1.record(true, false, 3);

        System.out.println("-------------------------");

        // 매번 true로 작성하기보다 기본값으로 true로 설정하고, 분단위도 5분으로 설정하고 싶을 때

        b1.record();
        // 이렇게 record에 어떤 인자도 넣어주지 않으면
        // BlackBox에 정의해 놓은 record 함수들 중 인자가 없는 함수로 넘어간다.


    }

}
