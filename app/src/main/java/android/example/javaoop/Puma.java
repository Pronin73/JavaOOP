package android.example.javaoop;

import android.util.Log;

public class Puma extends Cat {
    public void talk() {
        Log.i("talk()", "R-r-r! Hi! My name is " + name +
            ", and I'm " + age + " years old.");
    }
}
