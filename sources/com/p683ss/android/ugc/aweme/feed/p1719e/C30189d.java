package com.p683ss.android.ugc.aweme.feed.p1719e;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.feed.model.FloatingCardInfo;

/* renamed from: com.ss.android.ugc.aweme.feed.e.d */
public final /* synthetic */ class C30189d implements OnClickListener {

    /* renamed from: a */
    private final C30188c f78787a;

    /* renamed from: b */
    private final FloatingCardInfo f78788b;

    public C30189d(C30188c cVar, FloatingCardInfo floatingCardInfo) {
        this.f78787a = cVar;
        this.f78788b = floatingCardInfo;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C30188c cVar = this.f78787a;
        C30188c.m70809a(this.f78788b);
    }
}
