package com.p683ss.android.ugc.aweme.mobile;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.account.C20854a;

/* renamed from: com.ss.android.ugc.aweme.mobile.f */
final /* synthetic */ class C37144f implements OnClickListener {

    /* renamed from: a */
    private final C37139b f94816a;

    /* renamed from: b */
    private final Activity f94817b;

    C37144f(C37139b bVar, Activity activity) {
        this.f94816a = bVar;
        this.f94817b = activity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C37139b bVar = this.f94816a;
        C20854a.m53165e().bindMobile(this.f94817b, bVar.f94808b, null, null);
        bVar.f94809c = true;
    }
}
