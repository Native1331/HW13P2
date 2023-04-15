import static java.time.Month.AUGUST;

public final class Employee extends BaseEmployee {
    public Employee(String name, int age, char sex, int salaryPerDay) {
        super(name, age, sex, salaryPerDay);
    }
}
    /*Необходимо создать класс Employee с полями: имя, возраст, пол и ЗП в день. Все поля сделать приватными и для каждого
    поля добавить методы set и get. Класс должен иметь метод - getSalary(Month[] monthArray), метод возвращает зарплату
    за те месяцы которые были переданы в качестве аргумента.*/



