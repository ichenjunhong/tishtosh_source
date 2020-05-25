package com.p683ss.android.ugc.aweme.share;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.commercialize.model.C26131l;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.share.f */
final /* synthetic */ class C42009f implements OnClickListener {

    /* renamed from: a */
    private final C41997d f106336a;

    /* renamed from: b */
    private final Aweme f106337b;

    /* renamed from: c */
    private final C26131l f106338c;

    C42009f(C41997d dVar, Aweme aweme, C26131l lVar) {
        this.f106336a = dVar;
        this.f106337b = aweme;
        this.f106338c = lVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f106336a.mo86077a(this.f106337b, this.f106338c, view);
    }
}
