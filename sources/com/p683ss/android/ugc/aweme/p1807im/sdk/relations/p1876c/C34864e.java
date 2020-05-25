package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1876c;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.c.e */
final class C34864e implements OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ C52671b f89807a;

    C34864e(C52671b bVar) {
        this.f89807a = bVar;
    }

    public final /* synthetic */ void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C52711k.m112236a(this.f89807a.invoke(view), "invoke(...)");
    }
}
