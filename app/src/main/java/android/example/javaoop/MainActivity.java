package android.example.javaoop;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Cat myCat;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myCat = new Cat(4, "Puma");
        myCat.talk();

        Cat murzik = new Cat(2, "Murza");
        murzik.talk();
        murzik.breath();

        Cat glasha = new Cat();
        glasha.age = 1;
        glasha.name = "Glasha";
        glasha.numberOfLegs = 4;
        Log.i("numberOfLeg", String.valueOf(glasha.numberOfLegs));
        glasha.talk();

        Puma puma = new Puma();


        puma.isAlive = true;
        puma.name = "Leo";

        puma.breath();
        puma.talk();
        Log.i("isAlive", String.valueOf(puma.isAlive));

        Log.i("breath()", "My name is " + puma.name + " and " + puma.breath());

    }
}