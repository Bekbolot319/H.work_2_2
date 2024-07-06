public class History extends Books implements Printable{
    private String historicalPeriod;

    public History(String name, String teacher, String historicalPeriod) {
        super(name, teacher);
        this.historicalPeriod = historicalPeriod;
    }

    public String getHistoricalPeriod() {
        return historicalPeriod;
    }
    public void print(){
        System.out.println("History - Name:" + getName() + ", " +
        "Teacher:" + getTeacher() + ", HisoricalPeriod:" + historicalPeriod);
    }
}
