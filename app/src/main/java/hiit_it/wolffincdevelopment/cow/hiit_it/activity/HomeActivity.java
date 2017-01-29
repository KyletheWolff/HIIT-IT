package hiit_it.wolffincdevelopment.cow.hiit_it.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v7.widget.Toolbar;

import hiit_it.wolffincdevelopment.cow.hiit_it.HiitItActivity;
import hiit_it.wolffincdevelopment.cow.hiit_it.R;
import hiit_it.wolffincdevelopment.cow.hiit_it.activity.viewmodel.HomeItem;
import hiit_it.wolffincdevelopment.cow.hiit_it.databinding.ActivityHomeBinding;
import hiit_it.wolffincdevelopment.cow.hiit_it.managers.UserManager;
import hiit_it.wolffincdevelopment.cow.hiit_it.widget.MediaControllerView;

/**
 * Created by Kyle Wolff on 1/28/17.
 */

public class HomeActivity extends HiitItActivity implements HomeItem.HomeItemCallback, MediaControllerView.MediaControllerListener {

    private ActivityHomeBinding binding;
    private HomeItem homeItem;
    private UserManager userManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        userManager = getUserManager();
        homeItem = new HomeItem(userManager);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_home);
        binding.setItem(homeItem);

        Toolbar toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        binding.controllerView.setListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        homeItem.onViewAttached(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        homeItem.onViewResumed();
    }

    @Override
    protected void onDestroy() {
        homeItem.onViewDetached();
        super.onDestroy();
    }

    @Override
    public void onShowProgressView(boolean isVisible, @StringRes int textResourceId) {

    }

    @Override
    public void onPlay() {

    }

    @Override
    public void onNext() {

    }

    @Override
    public void onPrev() {

    }
}
