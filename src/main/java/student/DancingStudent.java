package student;

import java.util.Objects;

public class DancingStudent implements Student {
    private String subject;
    private String name;

    public DancingStudent(String subject, String name) {
        this.subject = subject;
        this.name = name;
    }

    @Override
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getNameLast() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DancingStudent that = (DancingStudent) o;
        return Objects.equals(subject, that.subject) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subject, name);
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DancingStudent{" +
                "subject='" + subject + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
