package practice11;

public class Student extends Person {
    private Klass klass;

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        if (klass != null)
            this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        if (klass != null && klass.getLeader() != null && klass.getLeader().equals(this))
            return String.format("%s I am a Student. I am Leader of %s.", super.introduce(), klass.getDisplayName());
        return String.format("%s I am a Student. I am at %s.", super.introduce(), klass.getDisplayName());
    }
}