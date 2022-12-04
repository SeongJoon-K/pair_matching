package pairmatching.view;

public class OutputView {

    private OutputView() {
        // 생성자 접근 허용 불가를 위함
    }

    public static void printGameStartMsg() {
        System.out.println("기능을 선택하세요.\n" +
                "1. 페어 매칭\n" +
                "2. 페어 조회\n" +
                "3. 페어 초기화\n" +
                "Q. 종료");
    }
}
