package practice10;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private List<Student> members = new ArrayList<>();

    public Klass(int number) {
        this.number = number;
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
        if (members.contains(leader))
            this.leader = leader;
        else System.out.print("It is not one of us.\n");
    }

    public void appendMember(Student student) {
        members.add(student);
    }

    public boolean isIn(Student student){
       if (student.getKlass().getNumber() == number)
            return true;
        else return false;
    }
}
