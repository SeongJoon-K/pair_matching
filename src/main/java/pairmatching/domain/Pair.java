package pairmatching.domain;

import org.w3c.dom.ls.LSInput;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Pair {
    private Course course;
    private Level level;
    private List<List<String>> pairHistory = new ArrayList<>();

    public Pair(Course course, Level level) {
        this.course = course;
        this.level = level;
    }

    public void generatePair(String courseName) throws IOException {
        Init init = new Init();
        if (Course.ofName(courseName) == Course.BACKEND) {
            List<String> crewNames = init.getBackendCrewNames();
            init.shuffleCrewNames(crewNames);
            for (int i = 0; i < crewNames.size(); i += 2) {
                if (crewNames.size() % 2 != 0 && i == crewNames) { // 홀수 일때 마지막 세개로 더하는 메소드

                }

                List<String> pairs = new ArrayList<>();
                pairs.add(crewNames.get(i));
                pairs.add(crewNames.get(i+1));
                pairHistory.add(pairs);
            }
        }
    }

    private void addPairList()

    public List<List<String>> getPairHistory() {
        return pairHistory;
    }
}
