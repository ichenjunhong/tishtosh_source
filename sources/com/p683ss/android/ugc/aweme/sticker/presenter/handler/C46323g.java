package com.p683ss.android.ugc.aweme.sticker.presenter.handler;

import android.content.Context;
import android.support.p043v7.app.AppCompatActivity;
import com.p683ss.android.ugc.asve.recorder.effect.C20489b;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46315a;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46316b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.g */
public final class C46323g extends C46306b {

    /* renamed from: a */
    private final AppCompatActivity f116880a;

    /* renamed from: b */
    private final C20489b f116881b;

    /* renamed from: a */
    public final void mo93029a(C46316b bVar, C46315a aVar) {
        C52711k.m112240b(bVar, "result");
        C52711k.m112240b(aVar, "session");
    }

    /* renamed from: a */
    public final void mo93028a() {
        this.f116881b.mo43510d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo93031b(C46315a aVar) {
        C52711k.m112240b(aVar, "session");
        this.f116881b.mo43459a((Context) this.f116880a);
    }

    /* renamed from: a */
    public final boolean mo93030a(C46315a aVar) {
        C52711k.m112240b(aVar, "session");
        return C46059g.m100097u(aVar.f116852a);
    }

    public C46323g(AppCompatActivity appCompatActivity, C20489b bVar) {
        C52711k.m112240b(appCompatActivity, "activity");
        C52711k.m112240b(bVar, "effectController");
        this.f116880a = appCompatActivity;
        this.f116881b = bVar;
    }
}
