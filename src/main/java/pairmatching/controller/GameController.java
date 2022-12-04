package pairmatching.controller;

import pairmatching.domain.Course;
import pairmatching.domain.Init;
import pairmatching.domain.Level;
import pairmatching.domain.Pair;
import pairmatching.view.InputView;
import pairmatching.view.OutputView;

import java.io.IOException;
import java.util.List;

public class GameController {
    public void run() throws IOException {
        Init init = new Init();
        Pair pair = new Pair(Course.BACKEND, Level.LEVEL1);
        // 게임 시작 메세지 출력함
        OutputView.printGameStartMsg();
        int gameInput = InputView.inputStartNumber();

        // 1. 페어 매칭 입력
        if (gameInput == 1) {
            OutputView.printCourseInfo();
            List<String> condition = InputView.inputMatchingCondition();
            System.out.println(init.getBackendCrewNames());
            // 여기서 level1 백엔드에 해당하는 페어를 짠다.
            System.out.println("페어 결과");
            pair.generatePair(condition.get(0));
            pair.getPairHistory();

        }
        // 2. 페어 조회 입력했을 시
        if (gameInput == 2) {
            OutputView.printCourseInfo();
        }
        // 3. 페어 초기화 입력
    }

    /*
    1. 매칭, 조회, 초기화, 종료 중 뭐 선택할 지 입력한다.
    2. 과정 레벨 미션을 입력한다.
    3. 해당 기능을 다시 선택한다.
        1. 매칭의 결과는 초기화 혹은 종료 전까지 모두 기록되어야 한다.
     */

}
