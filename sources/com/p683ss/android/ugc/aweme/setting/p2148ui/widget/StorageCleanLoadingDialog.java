package com.p683ss.android.ugc.aweme.setting.p2148ui.widget;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.widget.StorageCleanLoadingDialog */
public final class StorageCleanLoadingDialog extends Dialog {
    public DmtStatusView mDmtStatusView;

    public final void dismiss() {
        Activity ownerActivity = getOwnerActivity();
        if (ownerActivity != null && !ownerActivity.isFinishing()) {
            try {
                C41895a.m91842a(this);
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

    public StorageCleanLoadingDialog(Activity activity) {
        C52711k.m112240b(activity, "context");
        super(activity, R.style.a1x);
        setOwnerActivity(activity);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.bu4);
        ButterKnife.bind((Dialog) this);
        DmtStatusView dmtStatusView = this.mDmtStatusView;
        if (dmtStatusView == null) {
            C52711k.m112237a("mDmtStatusView");
        }
        dmtStatusView.setBuilder(C10719a.m21676a(getContext()));
    }
}
