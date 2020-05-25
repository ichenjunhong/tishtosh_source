package com.p683ss.android.ugc.bogut.library.view;

import android.os.Bundle;
import com.p683ss.android.ugc.bogut.library.p2414a.C48498c;
import com.p683ss.android.ugc.bogut.library.p2414a.C48499d;
import com.p683ss.android.ugc.bogut.library.p2415b.C48501a;

/* renamed from: com.ss.android.ugc.bogut.library.view.b */
public final class C48504b<P extends C48501a> {

    /* renamed from: a */
    public C48498c<P> f121946a;

    /* renamed from: b */
    private P f121947b;

    /* renamed from: c */
    private Bundle f121948c;

    /* renamed from: d */
    private boolean f121949d;

    /* renamed from: c */
    public final void mo96004c() {
        if (this.f121947b != null && this.f121949d) {
            this.f121947b.mo95993b();
            this.f121949d = false;
        }
    }

    /* renamed from: b */
    public final Bundle mo96003b() {
        Bundle bundle = new Bundle();
        mo95999a();
        if (this.f121947b != null) {
            bundle.putBundle("presenter", new Bundle());
            bundle.putString("presenter_id", C48499d.INSTANCE.getId(this.f121947b));
        }
        return bundle;
    }

    /* renamed from: a */
    public final P mo95999a() {
        if (this.f121946a != null) {
            if (this.f121947b == null && this.f121948c != null) {
                this.f121947b = (C48501a) C48499d.INSTANCE.getPresenter(this.f121948c.getString("presenter_id"));
            }
            if (this.f121947b == null) {
                this.f121947b = this.f121946a.mo95984a();
                C48499d.INSTANCE.add(this.f121947b);
                if (this.f121948c != null) {
                    this.f121948c.getBundle("presenter");
                }
            }
            this.f121948c = null;
        }
        return this.f121947b;
    }

    public C48504b(C48498c<P> cVar) {
        this.f121946a = cVar;
    }

    /* renamed from: a */
    public final void mo96002a(boolean z) {
        if (this.f121947b != null && z) {
            this.f121947b.mo95991a();
            this.f121947b = null;
        }
    }

    /* renamed from: a */
    public final void mo96000a(Bundle bundle) {
        if (this.f121947b == null) {
            this.f121948c = (Bundle) C48503a.m104935a(C48503a.m104936a((Object) bundle));
            return;
        }
        throw new IllegalArgumentException("onRestoreInstanceState() should be called before onResume()");
    }

    /* renamed from: a */
    public final void mo96001a(Object obj) {
        mo95999a();
        if (this.f121947b != null && !this.f121949d) {
            this.f121947b.mo95992a(obj);
            this.f121949d = true;
        }
    }
}
