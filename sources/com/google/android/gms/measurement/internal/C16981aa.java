package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C15464q;

/* renamed from: com.google.android.gms.measurement.internal.aa */
public final class C16981aa implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f47857a;

    /* renamed from: b */
    private final /* synthetic */ long f47858b;

    /* renamed from: c */
    private final /* synthetic */ C16980a f47859c;

    public C16981aa(C16980a aVar, String str, long j) {
        this.f47859c = aVar;
        this.f47857a = str;
        this.f47858b = j;
    }

    public final void run() {
        C16980a aVar = this.f47859c;
        String str = this.f47857a;
        long j = this.f47858b;
        aVar.mo32840c();
        C15464q.m32125a(str);
        if (aVar.f47855b.isEmpty()) {
            aVar.f47856c = j;
        }
        Integer num = (Integer) aVar.f47855b.get(str);
        if (num != null) {
            aVar.f47855b.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (aVar.f47855b.size() >= 100) {
            aVar.mo32854q().f48448e.mo33376a("Too many ads visible");
        } else {
            aVar.f47855b.put(str, Integer.valueOf(1));
            aVar.f47854a.put(str, Long.valueOf(j));
        }
    }
}
