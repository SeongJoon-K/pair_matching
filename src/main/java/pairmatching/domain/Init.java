package pairmatching.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Init {
    private List<String> backendCrewNames;
    private List<String> frontendCrewNames;

    public Init() throws IOException {
        backendCrewNames = generateBackendCrew();
        frontendCrewNames = generateFrontendCrew();
    }

    public List<String> generateBackendCrew() throws IOException {
        return Files.readAllLines(Paths.get("src/main/resources/backend-crew.md"));
    }

    public List<String> generateFrontendCrew() throws IOException {
        return Files.readAllLines(Paths.get("src/main/resources/frontend-crew.md"));
    }

    public List<String> shuffleCrewNames(List<String> crewNames) {
        return Randoms.shuffle(crewNames);
    }

    public List<String> getBackendCrewNames() {
        return backendCrewNames;
    }

    public List<String> getFrontendCrewNames() {
        return frontendCrewNames;
    }
}
