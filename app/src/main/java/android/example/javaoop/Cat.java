package android.example.javaoop;

import android.util.*;

public class Cat extends Animal {
    int age;
    String name;



    public Cat() {

    }

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }


    public void talk() {
        Log.i("talk()", "Meow! Hi! My name is " + name +
                ", and I'm " + age + " years old.");
    }

}
