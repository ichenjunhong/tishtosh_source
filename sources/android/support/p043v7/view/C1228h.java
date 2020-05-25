package android.support.p043v7.view;

import android.support.p030v4.view.C1016aa;
import android.support.p030v4.view.C1063y;
import android.support.p030v4.view.C1067z;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: android.support.v7.view.h */
public final class C1228h {

    /* renamed from: a */
    final ArrayList<C1063y> f4079a = new ArrayList<>();

    /* renamed from: b */
    C1067z f4080b;

    /* renamed from: c */
    boolean f4081c;

    /* renamed from: d */
    private long f4082d = -1;

    /* renamed from: e */
    private Interpolator f4083e;

    /* renamed from: f */
    private final C1016aa f4084f = new C1016aa() {

        /* renamed from: b */
        private boolean f4086b;

        /* renamed from: c */
        private int f4087c;

        /* renamed from: a */
        public final void mo3180a(View view) {
            if (!this.f4086b) {
                this.f4086b = true;
                if (C1228h.this.f4080b != null) {
                    C1228h.this.f4080b.mo3180a(null);
                }
            }
        }

        /* renamed from: b */
        public final void mo3181b(View view) {
            int i = this.f4087c + 1;
            this.f4087c = i;
            if (i == C1228h.this.f4079a.size()) {
                if (C1228h.this.f4080b != null) {
                    C1228h.this.f4080b.mo3181b(null);
                }
                this.f4087c = 0;
                this.f4086b = false;
                C1228h.this.f4081c = false;
            }
        }
    };

    /* renamed from: b */
    public final void mo3978b() {
        if (this.f4081c) {
            Iterator it = this.f4079a.iterator();
            while (it.hasNext()) {
                ((C1063y) it.next()).mo3251b();
            }
            this.f4081c = false;
        }
    }

    /* renamed from: a */
    public final void mo3977a() {
        if (!this.f4081c) {
            Iterator it = this.f4079a.iterator();
            while (it.hasNext()) {
                C1063y yVar = (C1063y) it.next();
                if (this.f4082d >= 0) {
                    yVar.mo3245a(this.f4082d);
                }
                if (this.f4083e != null) {
                    yVar.mo3248a(this.f4083e);
                }
                if (this.f4080b != null) {
                    yVar.mo3247a((C1067z) this.f4084f);
                }
                yVar.mo3252c();
            }
            this.f4081c = true;
        }
    }

    /* renamed from: a */
    public final C1228h mo3975a(C1067z zVar) {
        if (!this.f4081c) {
            this.f4080b = zVar;
        }
        return this;
    }

    /* renamed from: a */
    public final C1228h mo3972a(long j) {
        if (!this.f4081c) {
            this.f4082d = 250;
        }
        return this;
    }

    /* renamed from: a */
    public final C1228h mo3973a(C1063y yVar) {
        if (!this.f4081c) {
            this.f4079a.add(yVar);
        }
        return this;
    }

    /* renamed from: a */
    public final C1228h mo3976a(Interpolator interpolator) {
        if (!this.f4081c) {
            this.f4083e = interpolator;
        }
        return this;
    }

    /* renamed from: a */
    public final C1228h mo3974a(C1063y yVar, C1063y yVar2) {
        this.f4079a.add(yVar);
        yVar2.mo3250b(yVar.mo3243a());
        this.f4079a.add(yVar2);
        return this;
    }
}
