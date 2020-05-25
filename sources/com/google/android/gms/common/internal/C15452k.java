package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.C15369c;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.C15211a.C15222f;

/* renamed from: com.google.android.gms.common.internal.k */
public final class C15452k {

    /* renamed from: a */
    private final SparseIntArray f39867a;

    /* renamed from: b */
    private C15369c f39868b;

    public C15452k() {
        this(GoogleApiAvailability.getInstance());
    }

    public C15452k(C15369c cVar) {
        this.f39867a = new SparseIntArray();
        C15464q.m32123a(cVar);
        this.f39868b = cVar;
    }

    /* renamed from: a */
    public final int mo28444a(Context context, C15222f fVar) {
        C15464q.m32123a(context);
        C15464q.m32123a(fVar);
        int e = fVar.mo27967e();
        int i = this.f39867a.get(e, -1);
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= this.f39867a.size()) {
                break;
            }
            int keyAt = this.f39867a.keyAt(i2);
            if (keyAt > e && this.f39867a.get(keyAt) == 0) {
                i = 0;
                break;
            }
            i2++;
        }
        if (i == -1) {
            i = this.f39868b.isGooglePlayServicesAvailable(context, e);
        }
        this.f39867a.put(e, i);
        return i;
    }

    /* renamed from: a */
    public final void mo28445a() {
        this.f39867a.clear();
    }
}
