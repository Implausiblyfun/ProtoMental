package bmental.corgis.protomental.dummy;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import bmental.corgis.protomental.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class PatientViewFragment extends Fragment {

    public PatientViewFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_patient_view, container, false);
    }
}
