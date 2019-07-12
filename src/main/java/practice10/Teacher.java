package practice10;

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
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }


    @Override
    public String introduce() {
        if (classes.isEmpty() || classes == null)
            return super.introduce() + " I am a Teacher. I teach No Class.";
        StringBuffer classNumbers = new StringBuffer();
        for (int i = 0; i < classes.size() - 1; i++) {
            classNumbers.append(classes.get(i).getNumber() + ", ");
        }
        classNumbers.append(classes.get(classes.size() - 1).getNumber());
        return super.introduce() + " I am a Teacher. I teach Class " + classNumbers.toString() + ".";

    }


    public String introduceWith(Student student) {
        if (classes.contains(student.getKlass())) {
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        } else return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
    }

    public boolean isTeaching(Student student) {
        boolean flag = false;
        for (Klass klass : classes) {
            if (klass.isIn(student))
                flag = true;
        }
        return flag;
    }
}
