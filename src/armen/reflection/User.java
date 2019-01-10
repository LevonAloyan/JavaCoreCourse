package armen.reflection;

public class User {

    private String name;
    private int password;

    public User (String name, int password){
        this.name = name;
        this.password = password;
    }


    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private int getPassword() {
        return password;
    }

    private void setPassword(int password) {
        this.password = password;
    }

    private void print(String a){
        System.out.println(a);
    }
}
