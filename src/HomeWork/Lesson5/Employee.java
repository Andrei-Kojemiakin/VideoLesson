package HomeWork.Lesson5;

public class Employee {
    Employee(int nomer, String familiya, double zarplata, String departament) {

    id=nomer;
    surname=familiya;
    salary=zarplata;
    department=departament;
    }

    String surname,department;
    int id;
    double salary;


    double wagesIncrease() {
        return salary *= 2;


    }

    void showInfo(){
        System.out.println("Nomer: "+id+" Familiya: "+surname+" ZP: "+salary+" Departament: "+department);
}   }

  class EmployeeTest{

    public static void main(String[] args) {
        Employee e1=new Employee(12,"Ivanov", 234,"Dvorniki");

        e1.showInfo();
        e1.wagesIncrease();
        e1.showInfo();


    }
}
