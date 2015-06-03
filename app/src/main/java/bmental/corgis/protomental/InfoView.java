package bmental.corgis.protomental;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.util.SparseArray;

import java.util.ArrayList;


/**
 * Created by Folly on 6/1/2015.
 */
public class InfoView extends CorgiView {

    SparseArray<Group> groups = new SparseArray<Group>();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);

        TextView bottomBarInfo  = (TextView) findViewById(R.id.Info);
        bottomBarInfo.setTextSize(50);
        bottomBarInfo.setTextColor(Color.GREEN);

        createData();
        ExpandableListView infoList = (ExpandableListView) findViewById(R.id.expandableListView);
        MyExpandableListAdapter adapter = new MyExpandableListAdapter(this,  groups, 0);
        infoList.setAdapter(adapter);
    }

    public void createData() {
        Group medication = new Group("Medication");
        medication.children.add("Medication X");
        medication.children.add("Medication Y");
        medication.children.add("Medication Z");

        Group symptoms = new Group("Symptoms");
        symptoms.children.add("High fever");
        symptoms.children.add("Cold sores");

        groups.append(0, medication);
        groups.append(1, symptoms);

    }
}
