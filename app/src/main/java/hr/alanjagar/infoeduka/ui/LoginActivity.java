package hr.alanjagar.infoeduka.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import hr.alanjagar.infoeduka.R;
import hr.alanjagar.infoeduka.ui.drawer.DrawerActivity;
import hr.alanjagar.infoeduka.utils.Logger;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.activity_login_et_username)
    TextInputEditText etUsername;

    @BindView(R.id.activity_login_et_password)
    TextInputEditText etPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ButterKnife.bind(this);
    }


    @OnClick(R.id.activity_login_btn_login)
    public void onLogin(View view){
        String username = etUsername.getText().toString();
        String password = etPassword.getText().toString();

        Logger.debug(this.getClass(), "Username: " + username + " Password: " + password);
        //TODO: Save login info into database

        Intent intent = new Intent(this, DrawerActivity.class);
        startActivity(intent);

    }
}

