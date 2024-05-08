package ParticipantsAndTeams;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Participant> {
    private String teamName;
    private List<T> teamList;

    public Team(String teamName) {
        this.teamName = teamName;
        teamList = new ArrayList<>();
    }

    public boolean addParticipant(T newParticipant) {
        return teamList.add(newParticipant);
    }

    public String getList() {
        StringBuilder stringBuilder = new StringBuilder();
        teamList.forEach(participant -> {
            stringBuilder.append(participant.getName()).append(" ");
        });
        return stringBuilder.toString();
    }
}
