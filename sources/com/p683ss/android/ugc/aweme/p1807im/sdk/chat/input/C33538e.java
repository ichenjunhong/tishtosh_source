package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35200an;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.e */
final /* synthetic */ class C33538e implements OnClickListener {

    /* renamed from: a */
    private final C33521c f86928a;

    C33538e(C33521c cVar) {
        this.f86928a = cVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C33521c cVar = this.f86928a;
        if (!C35200an.m79575a(view, 500)) {
            if (view.equals(cVar.f86886d)) {
                cVar.mo70976d(-2);
            } else if (view.equals(cVar.f86889g)) {
                cVar.mo70984l();
                cVar.f86885c.bh_();
            } else if (view.equals(cVar.f86887e)) {
                cVar.f86887e.setSelected(!cVar.f86887e.isSelected());
                if (cVar.f86887e.isSelected()) {
                    cVar.f86887e.setImageResource(R.drawable.dau);
                    cVar.mo70976d(1);
                    cVar.f86887e.setContentDescription(cVar.mo70981i().getResources().getString(R.string.be_));
                    if (cVar.f86884b == 3) {
                        cVar.mo70974c(0);
                    }
                    C35190af.m79442a();
                    C35190af.m79477b();
                    return;
                }
                cVar.f86887e.setImageResource(R.drawable.dar);
                cVar.f86887e.setContentDescription(cVar.mo70981i().getResources().getString(R.string.be3));
                cVar.mo70976d(-2);
            } else if (view.equals(cVar.f86888f)) {
                if (cVar.f86884b == 0) {
                    cVar.mo70974c(3);
                    cVar.mo70976d(6);
                    cVar.mo70971a(false);
                    cVar.mo70979g();
                } else if (cVar.f86884b == 3) {
                    cVar.mo70974c(0);
                    cVar.mo70976d(-2);
                } else if (cVar.f86884b == 1) {
                    cVar.mo70974c(2);
                    cVar.mo70971a(true);
                    C35190af.m79516h();
                } else if (cVar.f86884b == 2) {
                    if (TextUtils.isEmpty(cVar.f86886d.getText())) {
                        cVar.mo70974c(0);
                    } else {
                        cVar.mo70974c(1);
                    }
                    cVar.mo70983k();
                }
            }
        }
    }
}
