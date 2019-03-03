package armen.annotation;

import java.lang.annotation.*;

public class AnnotationTest {
//    @Target(ElementType.ANNOTATION_TYPE);
//    @Retention(RetentionPolicy.RUNTIME);

    public @interface Animal{
        int massa() default 3;
    }

    public static void main(String[] args){

        @Animal()
        class Cate{
        }
        Cate a = new Cate();
        Class c1 = a.getClass();
        Animal an = (Animal)c1.getAnnotation(Animal.class);
        System.out.println(an.massa());

//        @Animal(massa = 5);
        class Dog{
        }
        Dog b = new Dog();
        Class c2 = b.getClass();
        Animal anm = (Animal)c2.getAnnotation(Animal.class);
        System.out.println(anm.massa());
    }
}
