package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileCoverLibActivity_ViewBinding */
public class ProfileCoverLibActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private ProfileCoverLibActivity f102352a;

    public void unbind() {
        ProfileCoverLibActivity profileCoverLibActivity = this.f102352a;
        if (profileCoverLibActivity != null) {
            this.f102352a = null;
            profileCoverLibActivity.mTitleBar = null;
            profileCoverLibActivity.mCoverRecycleView = null;
            profileCoverLibActivity.mStatusView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public ProfileCoverLibActivity_ViewBinding(ProfileCoverLibActivity profileCoverLibActivity, View view) {
        this.f102352a = profileCoverLibActivity;
        profileCoverLibActivity.mTitleBar = (TextTitleBar) Utils.findRequiredViewAsType(view, R.id.d10, "field 'mTitleBar'", TextTitleBar.class);
        profileCoverLibActivity.mCoverRecycleView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.cfz, "field 'mCoverRecycleView'", RecyclerView.class);
        profileCoverLibActivity.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.csv, "field 'mStatusView'", DmtStatusView.class);
    }
}
