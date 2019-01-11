package armen.patterns.builder;

/**
 * Created by Amalia on 11.01.2019.
 */
public class Person {

    private String firstName;
    private String lastName;
    private int age;

    Person(){}

    public class Builder{

        public Builder setFirstname(String firstName){
            Person.this.firstName = firstName;
            return this;
        }
        public Builder setLastname(String lastName){
            Person.this.lastName = lastName;
            return this;
        }
        public Builder setAge(int age){
            Person.this.age = age;
            return this;
        }

        public Person build(){
            return new Person();
        }
    }

    public Builder personBuilder(){
        return new Person().new Builder();
    }

    public String toString(){
        return "PersonInfo\n" +
                "firstName - " + firstName + '\n' +
                "lastName - " + lastName + '\n' +
                "age - " + age;
    }
}
