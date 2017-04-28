package mtc.com.coffeetakeaway.activities;

import android.view.View;

import butterknife.OnClick;
import mtc.com.coffeetakeaway.R;
import mtc.com.coffeetakeaway.core.BaseActivity;

/**
 * Created by Forev on 2/26/2017.
 */

public class RegisterActivity extends BaseActivity {
    @Override
    protected int layout() {
        return R.layout.activity_register;
    }

    @OnClick(R.id.btn_sigin)
    public void onSignInClick(View view) {
        openActivity(LoginActivity.class);
    }

    @Override
    public void onBackPressed() {
        finishAfterTransition();
    }
}
