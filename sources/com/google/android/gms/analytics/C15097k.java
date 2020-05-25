package com.google.android.gms.analytics;

import com.google.android.gms.analytics.C15097k;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.util.C15514e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.analytics.k */
public class C15097k<T extends C15097k> {

    /* renamed from: a */
    private final List<Object> f38968a = new ArrayList();

    /* renamed from: g */
    public final C15098l f38969g;

    /* renamed from: h */
    protected final C15095i f38970h;

    protected C15097k(C15098l lVar, C15514e eVar) {
        C15464q.m32123a(lVar);
        this.f38969g = lVar;
        C15095i iVar = new C15095i(this, eVar);
        iVar.f38961e = true;
        this.f38970h = iVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo27829a(C15095i iVar) {
    }

    /* renamed from: b */
    public C15095i mo27831b() {
        C15095i a = this.f38970h.mo27836a();
        mo27842b(a);
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo27842b(C15095i iVar) {
        Iterator it = this.f38968a.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
