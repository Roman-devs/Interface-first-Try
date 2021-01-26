package student;

import java.util.Objects;

public class OldStudentClass implements Student{

    private String name;
    private String nameLast;
    private int matNum;
    // Constructor
    public OldStudentClass(String name, String nameLast, int matNum){
        this.name = name;
        this.nameLast = nameLast;
        this.matNum = matNum;
    }

    @Override
    public String getSubject() {
        return null;
    }

    // Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameLast() {
        return nameLast;
    }

    public void setNameLast(String nameLast) {
        this.nameLast = nameLast;
    }

    public int getMatNum() {
        return matNum;
    }

    public void setMatNum(int matNum) {
        this.matNum = matNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OldStudentClass that = (OldStudentClass) o;
        return matNum == that.matNum && Objects.equals(name, that.name) && Objects.equals(nameLast, that.nameLast);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, nameLast, matNum);
    }

    @Override
    public String toString() {
        return name + " " + nameLast + " " + matNum;
    }
}
