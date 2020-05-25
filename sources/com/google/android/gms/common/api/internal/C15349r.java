package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C15227b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.p1033b.C15180h;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.r */
public final class C15349r {

    /* renamed from: a */
    final Map<BasePendingResult<?>, Boolean> f39630a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b */
    final Map<C15180h<?>, Boolean> f39631b = Collections.synchronizedMap(new WeakHashMap());

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo28295a() {
        return !this.f39630a.isEmpty() || !this.f39631b.isEmpty();
    }

    /* renamed from: b */
    public final void mo28296b() {
        m31903a(false, C15328d.f39567a);
    }

    /* renamed from: c */
    public final void mo28297c() {
        m31903a(true, C15295bx.f39473a);
    }

    /* renamed from: a */
    private final void m31903a(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f39630a) {
            hashMap = new HashMap(this.f39630a);
        }
        synchronized (this.f39631b) {
            hashMap2 = new HashMap(this.f39631b);
        }
        for (Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).mo28132c(status);
            }
        }
        for (Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C15180h) entry2.getKey()).mo28006b(new C15227b(status));
            }
        }
    }
}
