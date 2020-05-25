package com.p683ss.android.ugc.aweme.shortvideo.videocategory.p2260ui;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.ui.StatusLoadingDialog */
public final class StatusLoadingDialog extends Dialog {
    @BindView(2131494091)
    public DmtStatusView mDmtStatusView;

    public final void dismiss() {
        Activity ownerActivity = getOwnerActivity();
        if (ownerActivity != null && !ownerActivity.isFinishing()) {
            try {
                C45531c.m99176a(this);
            } catch (Exception unused) {
            }
            DmtStatusView dmtStatusView = this.mDmtStatusView;
            if (dmtStatusView == null) {
                C52711k.m112237a("mDmtStatusView");
            }
            dmtStatusView.setVisibility(8);
        }
    }

    public final void show() {
        if (!isShowing()) {
            Activity ownerActivity = getOwnerActivity();
            if (ownerActivity != null && !ownerActivity.isFinishing()) {
                super.show();
                DmtStatusView dmtStatusView = this.mDmtStatusView;
                if (dmtStatusView == null) {
                    C52711k.m112237a("mDmtStatusView");
                }
                dmtStatusView.mo19209d();
                DmtStatusView dmtStatusView2 = this.mDmtStatusView;
                if (dmtStatusView2 == null) {
                    C52711k.m112237a("mDmtStatusView");
                }
                dmtStatusView2.mo19212f();
            }
        }
    }

    public StatusLoadingDialog(Activity activity) {
        C52711k.m112240b(activity, "context");
        super(activity, R.style.a_);
        setOwnerActivity(activity);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.bki);
        ButterKnife.bind((Dialog) this);
        DmtStatusView dmtStatusView = this.mDmtStatusView;
        if (dmtStatusView == null) {
            C52711k.m112237a("mDmtStatusView");
        }
        dmtStatusView.setBuilder(C10719a.m21676a(getContext()));
    }
}
