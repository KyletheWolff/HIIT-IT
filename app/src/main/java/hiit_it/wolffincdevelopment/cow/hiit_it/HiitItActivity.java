package hiit_it.wolffincdevelopment.cow.hiit_it;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import hiit_it.wolffincdevelopment.cow.hiit_it.managers.UserManager;
import hiit_it.wolffincdevelopment.cow.hiit_it.service.HomeMusicService;

/**
 * Created by Kyle Wolff on 1/28/17.
 */

public class HiitItActivity extends AppCompatActivity {

    private final String USER_MANAGER_PREF = "user_manager_pref";

    private UserManager userManager;
    private SharedPreferences sharedPreferences;
    private HomeMusicService homeMusicService;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sharedPreferences = this.getSharedPreferences(USER_MANAGER_PREF, MODE_PRIVATE);
    }

    public UserManager getUserManager() {
        userManager = UserManager.getInstance(sharedPreferences);
        return userManager;
    }
}
