package com.p683ss.android.ugc.aweme.account.p1272e;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import butterknife.ButterKnife;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.e.a */
public final class C20965a extends Dialog {

    /* renamed from: a */
    public boolean f57068a;

    /* renamed from: b */
    public final Activity f57069b;

    /* renamed from: c */
    private DmtStatusView f57070c;

    public final void onBackPressed() {
        if (this.f57068a) {
            super.onBackPressed();
        }
    }

    public final void show() {
        if (getOwnerActivity() != null) {
            Activity ownerActivity = getOwnerActivity();
            if (ownerActivity == null) {
                C52711k.m112234a();
            }
            if (!ownerActivity.isFinishing()) {
                super.show();
                this.f57070c.mo19212f();
            }
        }
    }

    public final void dismiss() {
        if (getOwnerActivity() != null) {
            Activity ownerActivity = getOwnerActivity();
            if (ownerActivity == null) {
                C52711k.m112234a();
            }
            if (!ownerActivity.isFinishing()) {
                super.dismiss();
                this.f57070c.mo19208c(true);
            }
        }
    }

    public C20965a(Activity activity, View view) {
        C52711k.m112240b(activity, "context");
        super(activity, R.style.a1x);
        this.f57069b = activity;
        setOwnerActivity(this.f57069b);
        setContentView(R.layout.ayl);
        ButterKnife.bind((Dialog) this);
        View findViewById = findViewById(R.id.csv);
        C52711k.m112236a((Object) findViewById, "findViewById(R.id.status_view)");
        this.f57070c = (DmtStatusView) findViewById;
        C10719a a = C10719a.m21676a(getContext());
        a.mo19228a(view);
        this.f57070c.setBuilder(a);
    }
}
