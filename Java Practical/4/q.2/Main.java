import java.net.ProxySelector;

/* Create a Teacher class and derive Professor and Associate_Professor class from Teacher class. Define
appropriate constructor for all the classes. Also define a method to display information of Teacher. Make
necessary assumptions as required. */

// Author : Ajaykumar Nadar

class Teacher {
    int eid;
    String name;
    int salary;
    int yearsOfService;
    String subject;
    String designation;

    void display(){
        System.out.printf("Employee id: %d\nName: %s\nSalary: %d\nYears of Service: %d\nSubject: %s\nDesignation: %s\n\n", eid, name, salary, yearsOfService, subject, designation);
    };
}
class Professor extends Teacher {
    Professor(int eid,String name,int salary,int yearsOfService,String subject) {
        this.eid = eid;
        this.name = name;
        this.salary = salary;
        this.yearsOfService = yearsOfService;
        this.subject = subject;
        this.designation =  "Professor";
    }
}
class Associate_Professor extends Teacher {
    Associate_Professor           (int eid,String name,int salary,int yearsOfService,String subject) {
        this.eid = eid;
        this.name = name;
        this.salary = salary;
        this.yearsOfService = yearsOfService;
        this.subject = subject;
        this.designation =  "Associate Professor";
    }
    
}
class Main {
    public static void main(String[] args) {
        
        Professor professor = new Professor(12334, "Ajaykumar", 236723, 2, "Java");
        professor.display();
    }
}