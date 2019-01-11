package armen.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        int number = myClass.getNumber();
        String name = null;
        
        System.out.println(number + " " +  name);
        try {
            Field field = myClass.getClass().getDeclaredField("name");
            field.setAccessible(true);
            field.set(myClass, (String) "new value");
            name = (String) field.get(myClass);

            Method method = myClass.getClass().getDeclaredMethod("printData");
            method.setAccessible(true);
            method.invoke(myClass);
        } catch (NoSuchFieldException | IllegalAccessException
                | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
