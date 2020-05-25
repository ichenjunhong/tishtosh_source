package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C15464q;

/* renamed from: com.google.android.gms.measurement.internal.bc */
public final class C17010bc implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f47997a;

    /* renamed from: b */
    private final /* synthetic */ long f47998b;

    /* renamed from: c */
    private final /* synthetic */ C16980a f47999c;

    public C17010bc(C16980a aVar, String str, long j) {
        this.f47999c = aVar;
        this.f47997a = str;
        this.f47998b = j;
    }

    public final void run() {
        C16980a aVar = this.f47999c;
        String str = this.f47997a;
        long j = this.f47998b;
        aVar.mo32840c();
        C15464q.m32125a(str);
        Integer num = (Integer) aVar.f47855b.get(str);
        if (num != null) {
            C17050cp v = aVar.mo32845h().mo33021v();
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                aVar.f47855b.remove(str);
                Long l = (Long) aVar.f47854a.get(str);
                if (l == null) {
                    aVar.mo32854q().f48445b.mo33376a("First ad unit exposure time was never set");
                } else {
                    long longValue = j - l.longValue();
                    aVar.f47854a.remove(str);
                    aVar.mo32837a(str, longValue, v);
                }
                if (aVar.f47855b.isEmpty()) {
                    if (aVar.f47856c == 0) {
                        aVar.mo32854q().f48445b.mo33376a("First ad exposure time was never set");
                        return;
                    } else {
                        aVar.mo32836a(j - aVar.f47856c, v);
                        aVar.f47856c = 0;
                    }
                }
                return;
            }
            aVar.f47855b.put(str, Integer.valueOf(intValue));
            return;
        }
        aVar.mo32854q().f48445b.mo33377a("Call to endAdUnitExposure for unknown ad unit id", str);
    }
}
