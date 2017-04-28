package mtc.com.coffeetakeaway.core;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by Forev on 2/26/2017.
 */

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout());
        ButterKnife.inject(this);
    }

    protected abstract int layout();

    public void openActivity(Class<? extends BaseActivity> cls, Bundle arg) {
        Intent i = new Intent(this, cls);

        if (arg != null) {
            i.putExtras(arg);
        }

        startActivity(i);
    }

    public void openActivity(Class<? extends BaseActivity> cls, Bundle arg, int request_code) {
        Intent i = new Intent(this, cls);

        if (arg != null) {
            i.putExtras(arg);
        }

        startActivityForResult(i, request_code);
    }


    public void openActivity(Class<? extends BaseActivity> cls) {
        openActivity(cls, null);
    }

    public void openActivity(Class<? extends BaseActivity> cls, int request_code) {
        openActivity(cls, null, request_code);
    }
}
