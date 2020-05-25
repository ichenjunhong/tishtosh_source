package com.p683ss.android.ugc.aweme.checkprofile;

import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.checkprofile.CheckProfileActivity_ViewBinding */
public class CheckProfileActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private CheckProfileActivity f65614a;

    public void unbind() {
        CheckProfileActivity checkProfileActivity = this.f65614a;
        if (checkProfileActivity != null) {
            this.f65614a = null;
            checkProfileActivity.mTitleBar = null;
            checkProfileActivity.mStatusBarView = null;
            checkProfileActivity.mStatusView = null;
            checkProfileActivity.mRecyclerView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CheckProfileActivity_ViewBinding(CheckProfileActivity checkProfileActivity, View view) {
        this.f65614a = checkProfileActivity;
        checkProfileActivity.mTitleBar = (ButtonTitleBar) Utils.findRequiredViewAsType(view, R.id.d1b, "field 'mTitleBar'", ButtonTitleBar.class);
        checkProfileActivity.mStatusBarView = Utils.findRequiredView(view, R.id.csm, "field 'mStatusBarView'");
        checkProfileActivity.mStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.csv, "field 'mStatusView'", DmtStatusView.class);
        checkProfileActivity.mRecyclerView = (RecyclerView) Utils.findRequiredViewAsType(view, R.id.ero, "field 'mRecyclerView'", RecyclerView.class);
    }
}
