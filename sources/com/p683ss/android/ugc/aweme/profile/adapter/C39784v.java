package com.p683ss.android.ugc.aweme.profile.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.profile.adapter.C39782u.C39783a;

/* renamed from: com.ss.android.ugc.aweme.profile.adapter.v */
final /* synthetic */ class C39784v implements OnClickListener {

    /* renamed from: a */
    private final C39783a f101537a;

    /* renamed from: b */
    private final UrlModel f101538b;

    C39784v(C39783a aVar, UrlModel urlModel) {
        this.f101537a = aVar;
        this.f101538b = urlModel;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f101537a.mo80853a(this.f101538b);
    }
}
