public class Geography extends Books implements Printable {
 private int difficultyLevel;

    public Geography(String name, String teacher, int difficultyLevel) {
        super(name, teacher);
        this.difficultyLevel = difficultyLevel;
    }

    public int getDifficultyLevel() {
        return difficultyLevel;
    }
    public void print(){
        System.out.println("Geography - Name:" + getName() + ", " +
                "Teacher:" + getTeacher() + ", DifficultyLevel:" + getDifficultyLevel());
    }
}
