package com.p683ss.android.ugc.aweme.shortvideo;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cr */
final /* synthetic */ class C42560cr implements OnClickListener {

    /* renamed from: a */
    private final C42559cq f107640a;

    /* renamed from: b */
    private final C42558cp f107641b;

    C42560cr(C42559cq cqVar, C42558cp cpVar) {
        this.f107640a = cqVar;
        this.f107641b = cpVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C42559cq cqVar = this.f107640a;
        C42558cp cpVar = this.f107641b;
        PublishPermissionActivity.m93012a(cqVar.f107636a, cqVar.f107639d, cqVar.f107638c.getPermission(), R.string.b3o, R.string.b3n, 2);
    }
}
