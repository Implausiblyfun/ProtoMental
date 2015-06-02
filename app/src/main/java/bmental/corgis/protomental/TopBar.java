package bmental.corgis.protomental;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import bmental.corgis.protomental.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class TopBar extends Fragment {

    public TopBar() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View thisView = inflater.inflate(R.layout.fragment_patient_view, container, false);
        thisView.findViewById(R.id.call_patient).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent change = new Intent(getActivity().getApplicationContext(), PCallView.class);
                startActivity(change);
            }
        });
        thisView.findViewById(R.id.call_help).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent change = new Intent(getActivity().getApplicationContext(), EmergencyView.class);
                startActivity(change);
            }
        });
        thisView.findViewById(R.id.patient_name).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent change = new Intent(getActivity().getApplicationContext(), PatientChooserView.class);
                startActivity(change);
            }
        });



        return thisView;
    }
}
