package bmental.corgis.protomental;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Folly on 6/1/2015.
 */
public class PatientChooserView extends CorgiView{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_view);

        findViewById(R.id.select_patient).setOnClickListener(proceedWithChosen);
    }
    private final View.OnClickListener proceedWithChosen;
    {
        proceedWithChosen = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent change = new Intent(getApplicationContext(), PatientView.class);

                startActivity(change);
            }

        };
    }
}

