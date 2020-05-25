package com.p683ss.android.ugc.asve.sandbox.p1250a;

import com.bef.effectsdk.message.MessageCenter.C2593a;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20724v.C20725a;
import java.lang.ref.WeakReference;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.sandbox.a.l */
public final class C20637l extends C20725a {

    /* renamed from: a */
    private final WeakReference<C2593a> f56489a;

    public C20637l(C2593a aVar) {
        C52711k.m112240b(aVar, "listener");
        this.f56489a = new WeakReference<>(aVar);
    }

    /* renamed from: a */
    public final void mo43769a(int i, int i2, int i3, String str) {
        C2593a aVar = (C2593a) this.f56489a.get();
        if (aVar != null) {
            aVar.onMessageReceived(i, i2, i3, str);
        }
    }
}
