package pairmatching.view;

import java.io.IOException;
import java.util.List;

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

    public static void printCourseInfo() {
        System.out.println("#############################################\n" +
                "과정: 백엔드 | 프론트엔드\n" +
                "미션:\n" +
                "  - 레벨1: 자동차경주 | 로또 | 숫자야구게임\n" +
                "  - 레벨2: 장바구니 | 결제 | 지하철노선도\n" +
                "  - 레벨3: \n" +
                "  - 레벨4: 성능개선 | 배포\n" +
                "  - 레벨5: \n" +
                "############################################\n" +
                "과정, 레벨, 미션을 선택하세요.\n" +
                "ex) 백엔드, 레벨1, 자동차경주");
    }
    private static void printMatchingResultMsg() {
        System.out.println("페어 매칭 결과입니다.");
    }
    public static void printShuffleCrew(List<String> crewNames) throws IOException {
        printMatchingResultMsg();
        for (int i = 0; i < crewNames.size(); i++) {
            if (crewNames.size() % 2 != 0 && i == crewNames.size() - 3) {
                System.out.println(crewNames.get(i) + " : " + crewNames.get(i+1) + " : " + crewNames.get(i+2));
                break;
            }
            System.out.println(crewNames.get(i) + " : " + crewNames.get(i+1));
            i++;
        }
    }

}
