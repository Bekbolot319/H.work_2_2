import javax.swing.*;

public class Chemistry extends Books implements Printable{
    private String labName;

    public Chemistry(String name, String teacher, String labName) {
        super(name, teacher);
        this.labName = labName;
    }

    public String getLabName() {
        return labName;
    }public void print(){
        System.out.println("Chemistry - Name:" + getName() + ", " +
                "Teacher:" + getTeacher() + ", LabName:" + labName);
    }

}
