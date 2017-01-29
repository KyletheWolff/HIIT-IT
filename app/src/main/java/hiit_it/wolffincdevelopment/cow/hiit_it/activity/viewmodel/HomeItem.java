package hiit_it.wolffincdevelopment.cow.hiit_it.activity.viewmodel;

import android.databinding.Bindable;

import hiit_it.wolffincdevelopment.cow.hiit_it.BaseViewModel;
import hiit_it.wolffincdevelopment.cow.hiit_it.LifeCycle;
import hiit_it.wolffincdevelopment.cow.hiit_it.managers.UserManager;

/**
 * Created by Kyle Wolff on 1/28/17.
 */

public class HomeItem extends BaseViewModel {

    private boolean hideAddToTrackImage;

    public HomeItem(UserManager userManager) {
        super();
    }

    public interface HomeItemCallback extends LifeCycle.LoadingView {

    }

    @Override
    protected HomeItemCallback getViewCallback() {
        return (HomeItemCallback) super.getViewCallback();
    }

    @Override
    protected void refreshData() {

    }

    private void setHideAddToTrackImage(boolean hideAddToTrackImage) {
        this.hideAddToTrackImage = hideAddToTrackImage;
    }

    @Bindable
    public boolean getHideAddToTrackImage() {
        return hideAddToTrackImage;
    }
}
