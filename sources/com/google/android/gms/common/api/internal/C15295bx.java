package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C15211a.C15214c;
import com.google.android.gms.common.api.C15211a.C15222f;
import com.google.android.gms.common.api.C15358j;
import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.bx */
public final class C15295bx {

    /* renamed from: a */
    public static final Status f39473a = new Status(8, "The connection to Google Play services was lost");

    /* renamed from: b */
    static final BasePendingResult<?>[] f39474b = new BasePendingResult[0];

    /* renamed from: c */
    final Set<BasePendingResult<?>> f39475c = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* renamed from: d */
    private final C15297bz f39476d = new C15296by(this);

    /* renamed from: e */
    private final Map<C15214c<?>, C15222f> f39477e;

    public C15295bx(Map<C15214c<?>, C15222f> map) {
        this.f39477e = map;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo28226a(BasePendingResult<? extends C15358j> basePendingResult) {
        this.f39475c.add(basePendingResult);
        basePendingResult.mo28130a(this.f39476d);
    }

    /* renamed from: a */
    public final void mo28225a() {
        BasePendingResult[] basePendingResultArr;
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f39475c.toArray(f39474b)) {
            basePendingResult.mo28130a((C15297bz) null);
            basePendingResult.mo28125c();
            if (basePendingResult.mo28134e()) {
                this.f39475c.remove(basePendingResult);
            }
        }
    }
}
