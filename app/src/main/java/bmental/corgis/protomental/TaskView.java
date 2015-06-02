package bmental.corgis.protomental;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Folly on 6/1/2015.
 */
public class TaskView extends CorgiView {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task);

        TextView bottomBarTasks  = (TextView) findViewById(R.id.Tasks);
        bottomBarTasks.setTextSize(50);

        bottomBarTasks.setTextColor(Color.GREEN);

    }
}
