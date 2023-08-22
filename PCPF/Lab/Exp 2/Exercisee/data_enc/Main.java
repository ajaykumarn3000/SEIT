/* Write a program in Java to implement data encapsulation. Create class EncapTest
that has private data members- name, age, idno of an employee. Get and set the
values of the private data members using public methods- getName(), getAge(),
getIdno(), setName(), setAge() and setIdno(). */

class EncapTest {
  private int age;
  private String name;
  private int idno;

  public void setName(String n) { name = n; }

  public void setAge(int a) { age = a; }

  public void setIdno(int i) { idno = i; }

  public String getName() { return name; }

  public int getIdno() { return idno; }

  public int getAge() { return age; }
}

public class Main {
  public static void main(String[] args) {
    EncapTest test = new EncapTest();
    test.setName("Ajaykumar");
    test.setIdno(9);
    test.setAge(19);

    System.out.println("Id: "+ test.getIdno()+"\nName: "+ test.getName()+"\nAge: "+ test.getAge()+"\n");
  }
}
