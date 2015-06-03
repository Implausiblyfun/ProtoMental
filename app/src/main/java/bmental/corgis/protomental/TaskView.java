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
        ExpandableListView infoList = (ExpandableListView) findViewById(R.id.expandableListView);
        MyExpandableListAdapter adapter = new MyExpandableListAdapter(this,
                groups);
        infoList.setAdapter(adapter);
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

    }
}
