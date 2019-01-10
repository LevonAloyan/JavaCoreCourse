package armen.reflection;

import armen.javaui.MyFrame;
import armen.syncThread.Synch;

/**
 * Created by Amalia on 09.01.2019.
 */
public class MyClass {

    private int number;
    private String name = "John";

    MyClass(int number, String name){
        this.number = number;
        this.name = name;
    }

    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number = number;
    }
    private void printData(){
        System.out.println(name + " " + number);
    }
}
