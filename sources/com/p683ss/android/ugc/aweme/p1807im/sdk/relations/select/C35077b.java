package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.select;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.b */
final class C35077b implements OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ C52671b f90243a;

    C35077b(C52671b bVar) {
        this.f90243a = bVar;
    }

    public final /* synthetic */ void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C52711k.m112236a(this.f90243a.invoke(view), "invoke(...)");
    }
}
