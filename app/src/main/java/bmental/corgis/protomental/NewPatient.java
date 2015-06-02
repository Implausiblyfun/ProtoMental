package bmental.corgis.protomental;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Set;

/**
 * Created by Folly on 6/2/2015.
 */
public class NewPatient extends CorgiView {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_patient);
        findViewById(R.id.added).setOnClickListener(cont);
        findViewById(R.id.backz).setOnClickListener(exitz);

    }



        private final View.OnClickListener exitz;
    {
        exitz = new View.OnClickListener() {
            public void onClick(View v){
                Intent change = new Intent(getApplicationContext(), PatientChooserView.class);
                startActivity(change);

            }
        };
    }

    private final View.OnClickListener cont;
    {
        cont = new View.OnClickListener() {
            public void onClick(View v){

                SharedPreferences stored = getSharedPreferences("prefs", 0);
                SharedPreferences.Editor e = stored.edit();
                String toAdd = ((TextView) findViewById(R.id.person_name)).getText().toString();
                if(!toAdd.equals("") && !toAdd.equals("Name")) {
                    e.putString("current_patient", toAdd);

                    Set<String> temp = stored.getStringSet("patients", null);
                    temp.add(toAdd);
                    e.putStringSet("patients", temp);

                    e.commit();
                }
                Intent change = new Intent(getApplicationContext(), PatientChooserView.class);
                startActivity(change);


            }
        };
    }
}
