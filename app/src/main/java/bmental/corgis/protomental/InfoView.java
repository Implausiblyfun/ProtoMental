package bmental.corgis.protomental;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Folly on 6/1/2015.
 */
public class InfoView extends CorgiView {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);

        TextView bottomBarInfo  = (TextView) findViewById(R.id.Info);
        bottomBarInfo.setTextSize(50);
        bottomBarInfo.setTextColor(Color.GREEN);

    }
}
