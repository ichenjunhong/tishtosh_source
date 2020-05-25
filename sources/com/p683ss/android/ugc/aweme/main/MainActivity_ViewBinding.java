package com.p683ss.android.ugc.aweme.main;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.p683ss.android.ugc.aweme.base.p1420ui.ScrollableViewPager;
import com.p683ss.android.ugc.aweme.feed.p1736ui.DisLikeAwemeLayout;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.main.MainActivity_ViewBinding */
public class MainActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private MainActivity f93420a;

    public void unbind() {
        MainActivity mainActivity = this.f93420a;
        if (mainActivity != null) {
            this.f93420a = null;
            mainActivity.mViewPager = null;
            mainActivity.mDisLikeAwemeLayout = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public MainActivity_ViewBinding(MainActivity mainActivity, View view) {
        this.f93420a = mainActivity;
        mainActivity.mViewPager = (ScrollableViewPager) Utils.findRequiredViewAsType(view, R.id.ds2, "field 'mViewPager'", ScrollableViewPager.class);
        mainActivity.mDisLikeAwemeLayout = (DisLikeAwemeLayout) Utils.findRequiredViewAsType(view, R.id.a6b, "field 'mDisLikeAwemeLayout'", DisLikeAwemeLayout.class);
    }
}
