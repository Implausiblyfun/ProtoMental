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

        infoList.expandGroup(0);
        infoList.expandGroup(1);
    }

    public void createData() {
        Group medication = new Group("Medication");
        medication.children.add("Medication X");
        medication.children.add("Medication Y");
        medication.children.add("Medication Z");
        medication.children.add("Possible Med");
        medication.children.add("Medication W");
        medication.children.add("Medication H");
        medication.children.add("Medication O");
        medication.children.add("Medication A");
        medication.children.add("Medication A");


        Group symptoms = new Group("Symptoms");
        symptoms.children.add("High fever");
        symptoms.children.add("Cold sores");


        Group supp = new Group("Support Groups and Infomation");
        supp.children.add("This online forum" );
        supp.children.add("that other one");
        supp.children.add("isnt anyone scared that I am so bad at making up new things to write? Because I most definitely...");

        Group whoa = new Group("Paperwork help");
        whoa.children.add("People with papers");
        whoa.children.add("Doctors against paperwork");
        whoa.children.add("Financial advisors  link 1");
        whoa.children.add("Financial advisors  link 3");
        whoa.children.add("Financial advisors  link 2");
        whoa.children.add("Local doctors 1");
        whoa.children.add("Local doctors 2");
        whoa.children.add("Available mental health near you");

        groups.append(0, medication);
        groups.append(1, symptoms);
        groups.append(2, supp);
        groups.append(3, whoa);
    }
}
