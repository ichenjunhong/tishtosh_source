package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.DmtStatusViewDialog */
public class DmtStatusViewDialog extends Dialog {
    @BindView(2131494826)
    DmtStatusView mDmtStatusView;

    public void show() {
        if (getOwnerActivity() != null && !getOwnerActivity().isFinishing()) {
            super.show();
            if (this.mDmtStatusView != null) {
                this.mDmtStatusView.mo19212f();
            }
        }
    }

    public void dismiss() {
        if (getOwnerActivity() != null && !getOwnerActivity().isFinishing()) {
            try {
                super.dismiss();
            } catch (Exception unused) {
            }
            if (this.mDmtStatusView != null) {
                this.mDmtStatusView.mo19209d();
                this.mDmtStatusView.setVisibility(8);
            }
        }
    }

    public DmtStatusViewDialog(Activity activity) {
        super(activity, R.style.a1x);
        setOwnerActivity(activity);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.boi);
        ButterKnife.bind((Dialog) this);
        this.mDmtStatusView.setBuilder(C10719a.m21676a(getContext()));
    }
}
