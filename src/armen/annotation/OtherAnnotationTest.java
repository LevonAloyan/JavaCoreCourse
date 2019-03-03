package armen.annotation;

import java.lang.annotation.*;
import java.lang.reflect.*;

public class OtherAnnotationTest {

    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface NeedMethod {
    }

    public static void main(String[] args) {

        class WorkClass {

            String write() {
                return "text";
            }
            @NeedMethod
            String writeOther() {
                return "bla";
            }
        }

        class LibraryClass {
            void doIt(Object object) {
                String s = "";
                Class classObject = object.getClass();

                for (Method method : classObject.getDeclaredMethods()) {
                    NeedMethod annotation = method.getAnnotation(NeedMethod.class);
                    if (annotation != null) {
                        try {
                            s = (String) method.invoke(object);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (InvocationTargetException e) {
                            e.printStackTrace();
                        }
                    }
                }
                System.out.println(s);
            }
        }

        WorkClass workObject = new WorkClass();
        LibraryClass library = new LibraryClass();
        library.doIt(workObject);
    }
}
