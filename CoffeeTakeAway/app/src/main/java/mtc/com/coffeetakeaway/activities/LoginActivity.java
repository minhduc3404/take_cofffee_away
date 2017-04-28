package mtc.com.coffeetakeaway.activities;

import android.content.Intent;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.view.View;
import android.widget.ImageView;

import butterknife.InjectView;
import butterknife.OnClick;
import mtc.com.coffeetakeaway.R;
import mtc.com.coffeetakeaway.core.BaseActivity;
import mtc.com.coffeetakeaway.utlis.controls.CSTextView;

public class LoginActivity extends BaseActivity {

    @InjectView(R.id.iv_logo)
    ImageView ivLogo;

    @InjectView(R.id.txt_app_name)
    CSTextView txtAppName;

    @Override
    protected int layout() {
        return R.layout.activity_login;
    }

    @OnClick(R.id.btn_sign_up)
    public void onSignUpClick(View view)
    {

        Pair<View, String> p1 = Pair.create((View)ivLogo, "profile");
        Pair<View, String> p2 = Pair.create((View)txtAppName, "appname");

        ActivityOptionsCompat options = ActivityOptionsCompat.
                makeSceneTransitionAnimation(this);
        Intent i = new Intent(this, RegisterActivity.class);
        startActivity(i, options.toBundle());
    }
}
