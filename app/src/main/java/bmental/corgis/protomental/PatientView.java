package bmental.corgis.protomental;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Folly on 6/1/2015.
 */
public class PatientView extends CorgiView {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.patient);
        TextView bottomBarPatient  = (TextView) findViewById(R.id.Patient);
        bottomBarPatient.setTextSize(50);

        bottomBarPatient.setTextColor(Color.GREEN);

    }
}
