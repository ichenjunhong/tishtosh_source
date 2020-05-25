package com.p683ss.android.ugc.aweme.p2377ug.referral;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.ug.referral.c */
final /* synthetic */ class C47489c implements OnClickListener {

    /* renamed from: a */
    private final C47486a f119777a;

    C47489c(C47486a aVar) {
        this.f119777a = aVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f119777a.dismiss();
    }
}
