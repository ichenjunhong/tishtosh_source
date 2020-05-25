package com.bytedance.android.livesdk.p279af.p281b;

import com.bytedance.android.livesdkapi.p458l.C8833a;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C1675ac;
import p064c.p065a.C2201v;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p071d.C1715j;
import p064c.p065a.p072e.p074b.C1723a;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p077e.p081d.C1912ag;
import p064c.p065a.p072e.p077e.p081d.C1914ah;
import p064c.p065a.p072e.p077e.p081d.C1932ap;
import p064c.p065a.p072e.p077e.p081d.C2000j;
import p064c.p065a.p090h.C2150a;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.bytedance.android.livesdk.af.b.b */
public final class C4585b<T> {

    /* renamed from: a */
    public C2201v<T> f12552a;

    /* renamed from: a */
    public final C2201v<T> mo10390a(long j) {
        return m11019a(j, C1723a.m6041c());
    }

    /* renamed from: a */
    public final <K> C2201v<T> mo10391a(C1711f<? super T, K> fVar) {
        return m11021a(fVar, C1723a.m6042d());
    }

    /* renamed from: a */
    public final C2201v<T> mo10389a() {
        return (C2201v) C8833a.m17336a(C8833a.m17337a("io.reactivex.internal.operators.observable.ObservablePublish", "create", this.f12552a), "refCount", new Object[0]);
    }

    C4585b(C2201v<T> vVar) {
        this.f12552a = vVar;
    }

    /* renamed from: a */
    private C2201v<T> m11019a(long j, C1715j<? super Throwable> jVar) {
        if (j >= 0) {
            C1745b.m6050a(jVar, "predicate is null");
            return C2150a.m6486a((C2201v<T>) new C1932ap<T>(this.f12552a, j, jVar));
        }
        StringBuilder sb = new StringBuilder("times >= 0 required but it was ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public static C2201v<Long> m11020a(long j, TimeUnit timeUnit) {
        return m11018a(j, j, timeUnit, C2168a.m6519a());
    }

    /* renamed from: a */
    private <K> C2201v<T> m11021a(C1711f<? super T, K> fVar, Callable<? extends Collection<? super K>> callable) {
        C1745b.m6050a(fVar, "keySelector is null");
        C1745b.m6050a(callable, "collectionSupplier is null");
        return C2150a.m6486a((C2201v<T>) new C2000j<T>(this.f12552a, fVar, callable));
    }

    /* renamed from: a */
    public static C2201v<Long> m11017a(long j, long j2, TimeUnit timeUnit) {
        return m11018a(0, j2, timeUnit, C2168a.m6519a());
    }

    /* renamed from: a */
    private static C2201v<Long> m11018a(long j, long j2, TimeUnit timeUnit, C1675ac acVar) {
        C1745b.m6050a(timeUnit, "unit is null");
        C1745b.m6050a(acVar, "scheduler is null");
        C1912ag agVar = new C1912ag(Math.max(0, j), Math.max(0, j2), timeUnit, acVar);
        return C2150a.m6486a((C2201v<T>) agVar);
    }

    /* renamed from: a */
    public static C2201v<Long> m11015a(long j, long j2, long j3, long j4, TimeUnit timeUnit) {
        return m11016a(0, 10, 1000, 1000, timeUnit, C2168a.m6519a());
    }

    /* renamed from: a */
    private static C2201v<Long> m11016a(long j, long j2, long j3, long j4, TimeUnit timeUnit, C1675ac acVar) {
        long j5 = j2;
        long j6 = j3;
        TimeUnit timeUnit2 = timeUnit;
        C1675ac acVar2 = acVar;
        if (j5 < 0) {
            StringBuilder sb = new StringBuilder("count >= 0 required but it was ");
            sb.append(j5);
            throw new IllegalArgumentException(sb.toString());
        } else if (j5 == 0) {
            return C2201v.m6610b().mo6511a(j6, timeUnit2, acVar2);
        } else {
            long j7 = (j5 - 1) + j;
            if (j <= 0 || j7 >= 0) {
                C1745b.m6050a(timeUnit2, "unit is null");
                C1745b.m6050a(acVar2, "scheduler is null");
                C1914ah ahVar = new C1914ah(j, j7, Math.max(0, j6), Math.max(0, j4), timeUnit, acVar);
                return C2150a.m6486a((C2201v<T>) ahVar);
            }
            throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
    }
}
