package com.p683ss.android.ugc.aweme.miniapp;

import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.miniapp.RecentlyUsedMicroAppActivity_ViewBinding */
public class RecentlyUsedMicroAppActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private RecentlyUsedMicroAppActivity f94045a;

    public void unbind() {
        RecentlyUsedMicroAppActivity recentlyUsedMicroAppActivity = this.f94045a;
        if (recentlyUsedMicroAppActivity != null) {
            this.f94045a = null;
            recentlyUsedMicroAppActivity.mStatusView = null;
            recentlyUsedMicroAppActivity.mListView = null;
            recentlyUsedMicroAppActivity.mTextTitleBar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public RecentlyUsedMicroAppActivity_ViewBinding(RecentlyUsedMicroAppActivity recentlyUsedMicroAppActivity, View view) {
        this.f94045a = recentlyUsedMicroAppActivity;
        recentlyUsedMicroAppActivity.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.csv, "field 'mStatusView'", DmtStatusView.class);
        recentlyUsedMicroAppActivity.mListView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.bc2, "field 'mListView'", RecyclerView.class);
        recentlyUsedMicroAppActivity.mTextTitleBar = (TextTitleBar) Utils.findRequiredViewAsType(view, R.id.d10, "field 'mTextTitleBar'", TextTitleBar.class);
    }
}
