package pairmatching.view;

import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
import java.util.List;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {
    private InputView() {
    }

    public static int inputStartNumber() {
        return Integer.parseInt(readLine());
    }

    public static List<String> inputMatchingCondition() {
        String matchingCondition = Console.readLine();
        return Arrays.asList(matchingCondition.split(", "));
    }

}
