package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.C16299uq;
import com.google.android.gms.internal.ads.abv;
import com.google.android.gms.internal.ads.acd;
import com.google.android.gms.internal.ads.zzyv;
import java.lang.ref.WeakReference;

@C16299uq
/* renamed from: com.google.android.gms.ads.internal.an */
public final class C14953an {

    /* renamed from: a */
    public zzyv f38548a;

    /* renamed from: b */
    public boolean f38549b;

    /* renamed from: c */
    boolean f38550c;

    /* renamed from: d */
    private final C14955ap f38551d;

    /* renamed from: e */
    private final Runnable f38552e;

    /* renamed from: f */
    private long f38553f;

    public C14953an(C14939a aVar) {
        this(aVar, new C14955ap(acd.f40245a));
    }

    private C14953an(C14939a aVar, C14955ap apVar) {
        this.f38551d = apVar;
        this.f38552e = new C14954ao(this, new WeakReference(aVar));
    }

    /* renamed from: a */
    public final void mo27540a() {
        this.f38549b = false;
        this.f38551d.mo27546a(this.f38552e);
    }

    /* renamed from: b */
    public final void mo27543b() {
        this.f38550c = true;
        if (this.f38549b) {
            this.f38551d.mo27546a(this.f38552e);
        }
    }

    /* renamed from: c */
    public final void mo27544c() {
        this.f38550c = false;
        if (this.f38549b) {
            this.f38549b = false;
            mo27542a(this.f38548a, this.f38553f);
        }
    }

    /* renamed from: a */
    public final void mo27541a(zzyv zzyv) {
        mo27542a(zzyv, 60000);
    }

    /* renamed from: a */
    public final void mo27542a(zzyv zzyv, long j) {
        if (this.f38549b) {
            abv.m32798e("An ad refresh is already scheduled.");
            return;
        }
        this.f38548a = zzyv;
        this.f38549b = true;
        this.f38553f = j;
        if (!this.f38550c) {
            StringBuilder sb = new StringBuilder(65);
            sb.append("Scheduling ad refresh ");
            sb.append(j);
            sb.append(" milliseconds from now.");
            abv.m32796d(sb.toString());
            this.f38551d.mo27547a(this.f38552e, j);
        }
    }
}
