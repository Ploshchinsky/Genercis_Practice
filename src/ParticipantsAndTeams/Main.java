package ParticipantsAndTeams;

public class Main {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Mike", 13);
        Schoolar schoolar2 = new Schoolar("Eva", 14);
        Team<Schoolar> schoolarTeam = new Team<>("CoolTeam");
        schoolarTeam.addParticipant(schoolar1);
        schoolarTeam.addParticipant(schoolar2);

        Student student1 = new Student("Leo", 21);
        Student student2 = new Student("Sofie", 19);
        Team<Student> studentTeam = new Team<>("SmartTeam");
        studentTeam.addParticipant(student1);
        studentTeam.addParticipant(student2);

        Worker worker1 = new Worker("Alex", 33);
        Worker worker2 = new Worker("Stefan", 41);
        Team<Worker> workerTeam = new Team<>("StrengthTeam");
        workerTeam.addParticipant(worker1);
        workerTeam.addParticipant(worker2);

        System.out.println("Schoolar team\n\t" + schoolarTeam.getList() + "\n");
        System.out.println("Student team\n\t" + studentTeam.getList() + "\n");
        System.out.println("Worker team\n\t" + workerTeam.getList() + "\n");
    }
}
