package mtc.com.coffeetakeaway.utlis.controls;

import android.content.Context;
import android.widget.Spinner;

/**
 * Created by Forev on 9/10/2016.
*/
public class CSSpinner extends Spinner {
    public CSSpinner(Context context) {
        super(context);
    }

    @Override
    public void setOnItemClickListener(OnItemClickListener l) {
        super.setOnItemClickListener(l);
    }
}
