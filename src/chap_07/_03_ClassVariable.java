package src.chap_07;

public
class _03_ClassVariable {
    public static
    void main ( String[] args ) {
        //블랙박스 기능이 좋아서 충돌이 있었을 때
        // 충돌이 정해진 범위 초과시 자동으로 경찰서에 gps 정보 전송해줌

        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        System.out.println(b1.modelName);

        BlackBox b2 = new BlackBox();
        b2.modelName = "하양이";
        System.out.println(b2.modelName);

        //특정 범위를 초과하는 충돌 감지 시 자동 신고 기능 개발 여부

        System.out.println("------------------개발 전----------------");
        System.out.println(b1.modelName + " 자동 신고 기능: " + b1.canAutoReport); //까망이 자동신고 기능은
        System.out.println(b2.modelName + " 자동 신고 기능: " + b2.canAutoReport); //하양이 자동신고 기능은
        System.out.println("모든 블랙박스 제품 자동 신고 기능: " + BlackBox.canAutoReport);


        // 기능 개발

        BlackBox.canAutoReport = true; //개발이 됐으니 true로 바꿔줌
        System.out.println("------------------개발 후----------------");
        System.out.println(b1.modelName + " 자동 신고 기능: " + b1.canAutoReport); //까망이 자동신고 기능은
        System.out.println(b2.modelName + " 자동 신고 기능: " + b2.canAutoReport); //하양이 자동신고 기능은
        System.out.println("모든 블랙박스 제품 자동 신고 기능: " + BlackBox.canAutoReport);




    }

}
