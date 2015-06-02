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
        MyExpandableListAdapter adapter = new MyExpandableListAdapter(this,
                groups);
        infoList.setAdapter(adapter);
    }

    public void createData() {
        for (int j = 0; j < 5; j++) {
            Group group = new Group("Test " + j);
            for (int i = 0; i < 5; i++) {
                group.children.add("Sub Item" + i);
            }
            groups.append(j, group);
        }
    }
}
