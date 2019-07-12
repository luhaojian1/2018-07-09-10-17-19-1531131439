package practice11;

import java.util.LinkedList;

public class Teacher extends Person {
    private LinkedList<Klass> classes;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        classes = new LinkedList<>();
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
        for (Klass klass : classes) {
            klass.setTeacher(this);
        }
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }


    @Override
    public String introduce() {
        if (classes == null || classes.isEmpty())
            return String.format("%s I am a Teacher. I teach No Class.", super.introduce());
        StringBuilder classNumbers = new StringBuilder();
        for (int i = 0; i < classes.size() - 1; i++) {
            classNumbers.append(classes.get(i).getNumber()).append(", ");
        }
        classNumbers.append(classes.get(classes.size() - 1).getNumber());
        return String.format("%s I am a Teacher. I teach Class %s.", super.introduce(), classNumbers.toString());

    }


    public String introduceWith(Student student) {
        if (classes.contains(student.getKlass())) {
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        } else return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
    }

    public boolean isTeaching(Student student) {
        for (Klass klass : classes) {
            if (klass.isIn(student))
                return true;
        }
        return false;
    }
}
