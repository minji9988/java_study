package src.chap_07;


// method들 호출하는 파일 ///////////////////

public
class _04_Method {

    public static
    void main ( String[] args ) {

        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";


        // 1. 자동신고 기능 사용(전달값, 반환값 X method)
        //_04_Method file에 있는 autoReport method를 사용
        b1.autoReport(); //자동신고 기능이 지원되지 않습니다.
        BlackBox.canAutoReport = true;
        b1.autoReport(); //충돌이 감지되어 신고합니다.


        // 2. 메모리 값 출력(전달값만 있는 method)
        // _04_Method 파일 안에 있는 insertMemoryCard method 안에 256 넣어줌
        b1.insertMemoryCard(256);


        // 3. 영상 타입 출력(전달값과 반환값이 있는 method)
        // 일반 영상 : 일반 영상은 type을 1로 해서 받아옴
        // 이벤트 영상(=충돌을 감지한 영상) : type을 2로 해서 받아옴


        //b1 객체의 getVideoFileCount method를 통해 반환된 값을
        // fileCount로 넘겨줘라
        int fileCount = b1.getVideoFileCount(1); //일반영상
        System.out.println("일반 영상 파일 수 : " + fileCount + "개");

        fileCount = b1.getVideoFileCount(2); //이벤트 영상
        System.out.println("이벤트 영상 파일 수 :" + fileCount + "개");

    }
}
