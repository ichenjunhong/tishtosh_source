package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.internal.C15464q;
import java.util.concurrent.atomic.AtomicBoolean;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.si */
public abstract class C16237si implements acz<Void>, ank {

    /* renamed from: a */
    protected final Context f45523a;

    /* renamed from: b */
    protected final ama f45524b;

    /* renamed from: c */
    protected zzaxi f45525c;

    /* renamed from: d */
    AtomicBoolean f45526d = new AtomicBoolean(true);

    /* renamed from: e */
    private final C16244sp f45527e;

    /* renamed from: f */
    private final abc f45528f;

    /* renamed from: g */
    private Runnable f45529g;

    /* renamed from: h */
    private final Object f45530h = new Object();

    protected C16237si(Context context, abc abc, ama ama, C16244sp spVar) {
        this.f45523a = context;
        this.f45528f = abc;
        this.f45525c = this.f45528f.f40130b;
        this.f45524b = ama;
        this.f45527e = spVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo31378a();

    /* renamed from: a */
    public final void mo27693a(boolean z) {
        abv.m32792b("WebView finished loading.");
        int i = 0;
        if (this.f45526d.getAndSet(false)) {
            if (z) {
                i = -2;
            }
            mo31379a(i);
            acd.f40245a.removeCallbacks(this.f45529g);
        }
    }

    /* renamed from: b */
    public void mo28617b() {
        if (this.f45526d.getAndSet(false)) {
            this.f45524b.stopLoading();
            acm.m32635a(this.f45524b);
            mo31379a(-1);
            acd.f40245a.removeCallbacks(this.f45529g);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo31379a(int i) {
        int i2 = i;
        if (i2 != -2) {
            this.f45525c = new zzaxi(i2, this.f45525c.f46192j);
        }
        this.f45524b.mo29185q();
        C16244sp spVar = this.f45527e;
        zzaxe zzaxe = this.f45528f.f40129a;
        abb abb = r1;
        C16244sp spVar2 = spVar;
        abb abb2 = new abb(zzaxe.f46132c, this.f45524b, this.f45525c.f46185c, i, this.f45525c.f46187e, this.f45525c.f46191i, this.f45525c.f46193k, this.f45525c.f46192j, zzaxe.f46138i, this.f45525c.f46189g, null, null, null, null, null, this.f45525c.f46190h, this.f45528f.f40132d, this.f45525c.f46188f, this.f45528f.f40134f, this.f45525c.f46195m, this.f45525c.f46196n, this.f45528f.f40136h, null, this.f45525c.f46156A, this.f45525c.f46157B, this.f45525c.f46158C, this.f45525c.f46159D, this.f45525c.f46160E, null, this.f45525c.f46163H, this.f45525c.f46167L, this.f45528f.f40137i, this.f45528f.f40130b.f46170O, this.f45528f.f40138j, this.f45528f.f40130b.f46172Q, this.f45525c.f46173R, this.f45528f.f40130b.f46174S, this.f45528f.f40130b.f46175T, this.f45528f.f40130b.f46177V, this.f45528f.f40130b.f46178W);
        spVar2.mo27479b(abb);
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo28618c() {
        C15464q.m32132b("Webview render task needs to be called on UI thread.");
        this.f45529g = new C16238sj(this);
        acd.f40245a.postDelayed(this.f45529g, ((Long) caf.m37099d().mo30717a(C15740bx.f44308bp)).longValue());
        mo31378a();
        return null;
    }
}
