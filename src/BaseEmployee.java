public  abstract class BaseEmployee {

private String name;
private int age;
private char sex;
private int salaryPerDay;

    public BaseEmployee(String name, int age, char sex, int salaryPerDay) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.salaryPerDay = salaryPerDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getSalaryPerDay() {
        return salaryPerDay;
    }

    public void setSalaryPerDay(int salaryPerDay) {
        this.salaryPerDay = salaryPerDay;
    }
    public  int getSalary(Month[] monthArray){
        int result = 0;
        for (int i = 0; i < monthArray.length; i++) {
            result += monthArray[i].getWorkDays() * getSalaryPerDay();
             }
        return result;
    }
}
