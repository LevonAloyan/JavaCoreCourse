package armen.homework.compare;

/**
 * Created by Amalia on 07.12.2018.
 * Անհրաժեշտ է ունենալ ուսանողների ցուցակ որոնք պետք է դասակարգել ըստ  ուսանողների անունների,ազգանունների կամ ըստ գնահատականների․
 */
public class Student /*implements Comparable<Student>*/{
    private String firstName;
    private String lastName;
    private int age;

    public Student(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public Student(){}

//    public int compareTo(Student s){
//        return this.firstName.compareTo(s.getFirstName());
//    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }

    public String toString(){
        return "name - " + firstName + " " + lastName +
                "\n age - " + age;
    }
}
