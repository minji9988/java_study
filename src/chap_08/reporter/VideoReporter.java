package src.chap_08.reporter;

public class VideoReporter implements Reportable{


    // report는 Reportable interface에 있는 method를 의미
    @Override
    public void report () {
        System.out.println("직전 30초 영상과 함께 신고를 진행합니다.");
    }
}
