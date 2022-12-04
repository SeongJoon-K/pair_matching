package pairmatching.domain;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Crew {
    private Course course;
    private String name;

    public Crew(Course course, String name) {
        this.course = course;
        this.name = name;
    }

    // 백엔드 크루의 정보를 가져오는 메소드
    public static List<String> generateBackendCrew() throws IOException {
        return Files.readAllLines(Paths.get("src/main/resources/backend-crew.md"));
    }

    public static List<String> generateFrontendCrew() throws IOException {
        return Files.readAllLines(Paths.get("src/main/resources/frontend-crew.md"));
    }
}
