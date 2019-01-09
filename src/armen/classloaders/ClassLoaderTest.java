package armen.classloaders;

public class ClassLoaderTest {
    public static void main(String[] args) throws ClassNotFoundException {
        String s = "a";
        User user = new User();
        ClassLoader classLoader1 = user.getClass().getClassLoader();
        System.out.println(classLoader1);


        ClassLoader classLoader = s.getClass().getClassLoader();
        System.out.println(classLoader);

    }
}
