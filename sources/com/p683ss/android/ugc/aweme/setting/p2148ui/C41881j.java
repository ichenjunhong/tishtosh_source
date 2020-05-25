package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.j */
public final class C41881j extends Dialog {

    /* renamed from: a */
    DmtStatusView f106029a;

    public final void show() {
        if (getOwnerActivity() != null && !getOwnerActivity().isFinishing()) {
            super.show();
            if (this.f106029a != null) {
                this.f106029a.mo19212f();
            }
        }
    }

    public final void dismiss() {
        if (getOwnerActivity() != null && !getOwnerActivity().isFinishing()) {
            try {
                super.dismiss();
            } catch (Exception unused) {
            }
            if (this.f106029a != null) {
                this.f106029a.setVisibility(8);
            }
        }
    }

    public C41881j(Activity activity) {
        super(activity, R.style.a1x);
        setOwnerActivity(activity);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.bu3);
        this.f106029a = (DmtStatusView) findViewById(R.id.csv);
        this.f106029a.setBuilder(C10719a.m21676a(getContext()));
    }
}
