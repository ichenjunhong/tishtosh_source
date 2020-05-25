package com.p683ss.android.ugc.aweme.account.p1307ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.ui.BaseAccountActivity_ViewBinding */
public class BaseAccountActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BaseAccountActivity f59787a;

    public void unbind() {
        BaseAccountActivity baseAccountActivity = this.f59787a;
        if (baseAccountActivity != null) {
            this.f59787a = null;
            baseAccountActivity.mRootContainer = null;
            baseAccountActivity.mStatusView = null;
            baseAccountActivity.mContainer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public BaseAccountActivity_ViewBinding(BaseAccountActivity baseAccountActivity, View view) {
        this.f59787a = baseAccountActivity;
        baseAccountActivity.mRootContainer = (ViewGroup) Utils.findOptionalViewAsType(view, R.id.cfe, "field 'mRootContainer'", ViewGroup.class);
        baseAccountActivity.mStatusView = (DmtStatusView) Utils.findOptionalViewAsType(view, R.id.csv, "field 'mStatusView'", DmtStatusView.class);
        baseAccountActivity.mContainer = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.ajf, "field 'mContainer'", FrameLayout.class);
    }
}
