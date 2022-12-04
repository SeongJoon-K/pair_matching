package pairmatching.controller;

import jdk.internal.util.xml.impl.Input;
import pairmatching.view.InputView;
import pairmatching.view.OutputView;

public class GameController {
    public void run() {
        OutputView.printGameStartMsg();
        int gameInput = InputView.inputStartNumber();
        // 페어 매칭 입력했을 시
        if (gameInput == 1) {
            OutputView.printCourseInfo();
        }
        // 페어 조회 입력했을 시
        if (gameInput == 2) {
            OutputView.printCourseInfo();
        }
    }

}
