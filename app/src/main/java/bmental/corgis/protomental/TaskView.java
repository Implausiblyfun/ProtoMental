package bmental.corgis.protomental;

import android.graphics.Color;
import android.os.Bundle;
import android.util.SparseArray;
import android.widget.ExpandableListView;
import android.widget.TextView;

/**
 * Created by Folly on 6/1/2015.
 */
public class TaskView extends CorgiView {

    SparseArray<Group> groups = new SparseArray<Group>();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task);

        TextView bottomBarTasks  = (TextView) findViewById(R.id.Tasks);
        bottomBarTasks.setTextSize(50);

        bottomBarTasks.setTextColor(Color.GREEN);

        createData();
        ExpandableListView infoList = (ExpandableListView) findViewById(R.id.expandableListViewTask);
        MyExpandableListAdapter adapter = new MyExpandableListAdapter(this, groups, 1);
        infoList.setAdapter(adapter);
        infoList.expandGroup(0);
        infoList.expandGroup(1);
    }

    public void createData() {
        Group monday = new Group("MONDAY, JUNE 8");
        monday.children.add("Morning: Checkup call");
        monday.children.add("Afternoon: Checkup call");
        monday.children.add("Evening: Medication check");

        Group tuesday = new Group("TUESDAY, JUNE 9");
        tuesday.children.add("Morning: Checkup call");
        tuesday.children.add("Afternoon: Checkup call");
        tuesday.children.add("Evening: Medication check");


        Group wed = new Group("WEDNESDAY, JUNE 10");
        wed.children.add("Morning: Checkup call");
        wed.children.add("Evening: Medication check");

        Group thurs = new Group("THURSDAY, JUNE 11");

        thurs.children.add("Morning: Checkup call");
        thurs.children.add("Evening: Medication check");

        Group fri = new Group("FRIDAY, JUNE 12");

        fri.children.add("Morning: Checkup call");
        fri.children.add("Evening: Medication check");

        Group sat = new Group("SATURDAY, JUNE 13");

        sat.children.add("Morning: Checkup call");
        sat.children.add("Evening: Medication check");

        Group sun = new Group("SUNDAY, JUNE 14");

        sun.children.add("Morning: Checkup call");
        sun.children.add("Evening: Medication check");

        groups.append(0, monday);
        groups.append(1, tuesday);

        groups.append(2, wed);
        groups.append(3, thurs);
        groups.append(4, fri);
        groups.append(5, sat);
        groups.append(6, sun);

    }
}
