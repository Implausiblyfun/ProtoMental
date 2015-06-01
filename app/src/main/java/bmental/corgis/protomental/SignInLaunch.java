package bmental.corgis.protomental;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;


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

//        findViewById(R.id.signin).setOnClickListener(signIn);
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
}
