package com.p683ss.android.ugc.aweme.base.activity;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import cat.ereza.customactivityoncrash.C2207a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.base.activity.d */
final /* synthetic */ class C23425d implements OnClickListener {

    /* renamed from: a */
    private final CustomErrorActivity f62484a;

    /* renamed from: b */
    private final Class f62485b;

    C23425d(CustomErrorActivity customErrorActivity, Class cls) {
        this.f62484a = customErrorActivity;
        this.f62485b = cls;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        CustomErrorActivity customErrorActivity = this.f62484a;
        C2207a.m6678a(customErrorActivity, new Intent(customErrorActivity, this.f62485b), null);
    }
}
