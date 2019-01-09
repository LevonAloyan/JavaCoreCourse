package armen.reflection;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTest {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        User user = new User("kuku",123);

        Field field = user.getClass().getDeclaredField("name");
        field.setAccessible(true);
        field.set(user,"vacho");
        System.out.println(user.getName());
        Class<? extends String> aClass = "".getClass();
        Method method = user.getClass().getDeclaredMethod("print",aClass);
        method.setAccessible(true);
        method.invoke(user, "Helllop");

    }
}
