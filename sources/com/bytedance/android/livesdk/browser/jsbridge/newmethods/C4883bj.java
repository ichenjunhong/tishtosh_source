package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.Context;
import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.livesdkapi.depend.model.p443b.C8686a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bj */
final /* synthetic */ class C4883bj implements C1710e {

    /* renamed from: a */
    private final C4881bh f13157a;

    /* renamed from: b */
    private final C8686a f13158b;

    /* renamed from: c */
    private final Context f13159c;

    C4883bj(C4881bh bhVar, C8686a aVar, Context context) {
        this.f13157a = bhVar;
        this.f13158b = aVar;
        this.f13159c = context;
    }

    public final void accept(Object obj) {
        C3009i iVar = (C3009i) obj;
        this.f13157a.mo10635a(this.f13158b, this.f13159c);
    }
}
