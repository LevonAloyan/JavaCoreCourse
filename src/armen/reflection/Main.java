package armen.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        MyClass user = new MyClass(123, "kuku");

        Field field = user.getClass().getDeclaredField("name");
        field.setAccessible(true);
        field.set(user, "vacho");
        Class<? extends String> aClass = "".getClass();
        Method method = user.getClass().getDeclaredMethod("print", aClass);
        method.setAccessible(true);
        method.invoke(user, "Helllop");

    }
}
