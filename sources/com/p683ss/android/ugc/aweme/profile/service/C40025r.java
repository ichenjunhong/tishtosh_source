package com.p683ss.android.ugc.aweme.profile.service;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.mix.C37023e;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.service.r */
public final class C40025r implements C37023e {

    /* renamed from: a */
    public static final C40025r f101962a = new C40025r();

    /* renamed from: b */
    private final /* synthetic */ C37023e f101963b;

    /* renamed from: a */
    public final void mo76330a(Context context, Aweme aweme, View view, TextView textView, String str, int i) {
        this.f101963b.mo76330a(context, aweme, view, textView, str, i);
    }

    /* renamed from: a */
    public final void mo76331a(Context context, Aweme aweme, TextView textView) {
        this.f101963b.mo76331a(context, aweme, textView);
    }

    /* renamed from: a */
    public final boolean mo76332a() {
        return this.f101963b.mo76332a();
    }

    /* renamed from: a */
    public final boolean mo76333a(Aweme aweme, int i, String str) {
        return this.f101963b.mo76333a(aweme, i, str);
    }

    /* renamed from: b */
    public final int mo76334b(Context context, Aweme aweme, TextView textView) {
        return this.f101963b.mo76334b(context, aweme, textView);
    }

    /* renamed from: b */
    public final boolean mo76335b() {
        return this.f101963b.mo76335b();
    }

    /* renamed from: b */
    public final boolean mo76336b(Aweme aweme, int i, String str) {
        return this.f101963b.mo76336b(aweme, i, str);
    }

    private C40025r() {
        C37023e i = C23794bh.m58395i();
        C52711k.m112236a((Object) i, "LegacyServiceUtils.getMixHelperService()");
        this.f101963b = i;
    }
}
