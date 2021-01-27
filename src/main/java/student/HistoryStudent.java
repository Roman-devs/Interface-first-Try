package student;

import java.util.Objects;

public class HistoryStudent implements Student {
    private String subject;
    private String name;

    public HistoryStudent(String subject, String name) {
        this.subject = subject;
        this.name = name;
    }
    @Override
    public String toString() {
        return "HistoryStudent{" +
                "subject='" + subject + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HistoryStudent that = (HistoryStudent) o;
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

    @Override
    public String getNameLast() {
        return null;
    }

    public void setName(String name) {
        this.name = name;
    }
}
