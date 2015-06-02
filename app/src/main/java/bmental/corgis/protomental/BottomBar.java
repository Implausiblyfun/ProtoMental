package bmental.corgis.protomental;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import bmental.corgis.protomental.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class BottomBar extends Fragment {

    public BottomBar() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View thisView = inflater.inflate(R.layout.fragment_bottom_bar, container, false);

        //Here are the listeneres that actually change screens!
        thisView.findViewById(R.id.Patient).setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent change = new Intent(getActivity().getApplicationContext(), PatientView.class);
                startActivity(change);
            }
        });

        thisView.findViewById(R.id.Info).setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent change = new Intent(getActivity().getApplicationContext(), InfoView.class);
                startActivity(change);
            }
        });

        thisView.findViewById(R.id.Tasks).setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Intent change = new Intent(getActivity().getApplicationContext(), TaskView.class);
                startActivity(change);
            }
        });

        return thisView;
    }
}
