package pairmatching.domain;

import java.util.Arrays;

public enum Level {
    LEVEL1("레벨1"),
    LEVEL2("레벨2"),
    LEVEL3("레벨3"),
    LEVEL4("레벨4"),
    LEVEL5("레벨5");

    private String levelName;

    Level(String levelName) {
        this.levelName = levelName;
    }

    public static Level oFLevel(String levelInput) {
        return Arrays.stream(values())
                .filter(level -> levelInput.equals(level.levelName))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("[ERROR] 유효하지 않은 레벨입니다."));

    }
}
