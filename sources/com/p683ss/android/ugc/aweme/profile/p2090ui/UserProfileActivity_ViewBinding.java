package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.p683ss.android.ugc.aweme.feed.p1736ui.SlideSwitchLayout;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.UserProfileActivity_ViewBinding */
public class UserProfileActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private UserProfileActivity f102620a;

    public void unbind() {
        UserProfileActivity userProfileActivity = this.f102620a;
        if (userProfileActivity != null) {
            this.f102620a = null;
            userProfileActivity.mProfileLayout = null;
            userProfileActivity.mSlideSwitchLayout = null;
            userProfileActivity.mDmtStatusView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public UserProfileActivity_ViewBinding(UserProfileActivity userProfileActivity, View view) {
        this.f102620a = userProfileActivity;
        userProfileActivity.mProfileLayout = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.f7d, "field 'mProfileLayout'", LinearLayout.class);
        userProfileActivity.mSlideSwitchLayout = (SlideSwitchLayout) Utils.findRequiredViewAsType(view, R.id.cp_, "field 'mSlideSwitchLayout'", SlideSwitchLayout.class);
        userProfileActivity.mDmtStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.csv, "field 'mDmtStatusView'", DmtStatusView.class);
    }
}
