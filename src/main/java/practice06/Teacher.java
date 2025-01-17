package practice06;

public class Teacher extends Person {
    private Integer klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        if (klass == null)
            return super.introduce() + " I am a Teacher. I teach No Class.";
        else return super.introduce() + " I am a Teacher. I teach Class " + klass + ".";
    }

}
