package bmental.corgis.protomental;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


public class SignInLaunch extends Activity {


    Bundle thisBundle;
    EditText userName;
    EditText passWord;
    String signInStatus;

    public void onCreate(Bundle savedStuff) {
        super.onCreate(savedStuff);
        this.thisBundle = savedStuff;
        this.signInStatus = "false";

        setContentView(R.layout.login_screen_res);

        userName = (EditText) findViewById(R.id.username);
        passWord = (EditText) findViewById(R.id.password);

        SharedPreferences stored = getSharedPreferences("prefs", 0);
        SharedPreferences.Editor e = stored.edit();
        e.putString("current_patient", "Patient1");


        String[] meow = {"Patient1", "Patient2", "Patient3"};

        Set<String> mySet = new HashSet<String>();
        Collections.addAll(mySet, meow);

        e.putStringSet("patients", mySet);


        e.commit();



        findViewById(R.id.signin).setOnClickListener(signIn);
//        findViewById(R.id.signup).setOnClickListener(signUp);
//        findViewById(R.id.skip).setOnClickListener(skip);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.sign_in_launch, menu);



        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    private final View.OnClickListener skip;
    {
        skip = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent change = new Intent(getApplicationContext(), PatientChooserView.class);
                //thisBundle.putSerializable("Player", player);
                startActivity(change);
            }

        };
    }
    private final View.OnClickListener signIn;
    {
        signIn = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent change = new Intent(getApplicationContext(), PatientChooserView.class);
                //thisBundle.putSerializable("Player", player);
                startActivity(change);
            }

        };
    }


}
