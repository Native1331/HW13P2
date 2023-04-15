import java.time.Month;

public final class Manager extends BaseEmployee{
    private int numberOfSubordinates;

    public Manager(String name, int age, char sex, int salaryPerDay, int numberOfSubordinates) {
        super(name, age, sex, salaryPerDay);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }
    @Override
    public int getSalary(Month[] monthArray){
        return  super.getSalary(monthArray)+(super.getSalary(monthArray)* getNumberOfSubordinates()/100);
        return (int) (super.getSalary(monthArray)*(1.0 + getNumberOfSubordinates()/100));
    }
}
