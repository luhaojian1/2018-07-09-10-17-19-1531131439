package practice11;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private List<Student> members = new ArrayList<>();
    private Teacher teacher;

    public Klass(int number) {
        this.number = number;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public Student getLeader() {
        return leader;
    }

    public void assignLeader(Student leader) {
        if (members.contains(leader)) {
            this.leader = leader;
            if (teacher != null)
                System.out.print(String.format("I am %s. I know %s become Leader of %s.\n", teacher.getName(), leader.getName(), getDisplayName()));
        } else System.out.print("It is not one of us.\n");
    }

    public void appendMember(Student student) {
        members.add(student);
        if (teacher != null)
            System.out.print(String.format("I am %s. I know %s has joined %s.\n", teacher.getName(), student.getName(), getDisplayName()));
    }

    boolean isIn(Student student) {
        return student.getKlass().getNumber() == number;
    }
}
