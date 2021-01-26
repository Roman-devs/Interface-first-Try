package Student;

import java.util.Objects;

public class ComputerScienceStudent implements Student {
    private String subject;
    private String name;


    public ComputerScienceStudent(String subject, String name) {
        this.subject = subject;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ComputerScienceStudent{" +
                "subject='" + subject + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComputerScienceStudent that = (ComputerScienceStudent) o;
        return Objects.equals(subject, that.subject) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subject, name);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
