package com.p683ss.android.ugc.aweme.base.activity;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import cat.ereza.customactivityoncrash.C2207a;
import cat.ereza.customactivityoncrash.C2207a.C2210a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.base.activity.e */
final /* synthetic */ class C23426e implements OnClickListener {

    /* renamed from: a */
    private final CustomErrorActivity f62486a;

    C23426e(CustomErrorActivity customErrorActivity) {
        this.f62486a = customErrorActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C2207a.m6679a((Activity) this.f62486a, (C2210a) null);
    }
}
