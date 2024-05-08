package ParticipantsAndTeams;

public abstract class Participant {
    private String name;
    private String age;

    public Participant(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }
}
