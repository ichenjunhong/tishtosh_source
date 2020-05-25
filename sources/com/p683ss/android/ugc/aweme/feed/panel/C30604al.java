package com.p683ss.android.ugc.aweme.feed.panel;

import com.p683ss.android.ugc.aweme.C27979p;
import com.p683ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.feed.panel.al */
public final class C30604al implements C30600ah, C27979p {

    /* renamed from: a */
    final WeakReference<C30597ae> f79908a;

    /* renamed from: b */
    private final int f79909b;

    /* renamed from: c */
    private final C1689b f79910c = new C1689b();

    /* renamed from: c */
    public final void mo47074c() {
    }

    /* renamed from: a */
    public final void mo47070a() {
        this.f79910c.dispose();
    }

    /* renamed from: d */
    public final void mo62798d() {
        BusinessComponentServiceUtils.getAppStateReporter().mo47073b(this);
        this.f79910c.dispose();
    }

    /* renamed from: b */
    public final void mo47072b() {
        this.f79910c.dispose();
        this.f79910c.mo6181a(C2201v.m6614b("").mo6539d((long) this.f79909b, TimeUnit.MILLISECONDS).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C30605am<Object>(this), C30606an.f79912a));
    }

    public C30604al(C30597ae aeVar, int i) {
        this.f79908a = new WeakReference<>(aeVar);
        this.f79909b = i;
        BusinessComponentServiceUtils.getAppStateReporter().mo47071a(this);
    }
}
