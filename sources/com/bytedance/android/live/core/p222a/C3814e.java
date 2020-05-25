package com.bytedance.android.live.core.p222a;

import android.util.Pair;
import com.bytedance.android.live.core.rxutils.C4064k;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p064c.p065a.p071d.C1707b;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p071d.C1712g;
import p064c.p065a.p094l.C2189f;

/* renamed from: com.bytedance.android.live.core.a.e */
public final class C3814e<K, V> implements C3809a<K, V> {

    /* renamed from: a */
    private final C1711f<K, Integer> f10761a;

    /* renamed from: b */
    private final C1707b<K, V, Boolean> f10762b;

    /* renamed from: c */
    private final C1712g<K, V, Long, Boolean> f10763c;

    /* renamed from: d */
    private final C1707b<V, V, V> f10764d;

    /* renamed from: e */
    private final Map<Integer, Pair<V, Long>> f10765e;

    /* renamed from: f */
    private final ConcurrentMap<Integer, C2189f<V>> f10766f;

    public C3814e() {
        this(Long.MAX_VALUE);
    }

    /* renamed from: a */
    public final void mo9181a(K k) {
        this.f10765e.remove(C4064k.m10184a(this.f10761a, k));
    }

    private C3814e(long j) {
        this(C3815f.f10767a, Long.MAX_VALUE);
    }

    /* renamed from: b */
    public final V mo9183b(K k) {
        Pair pair = (Pair) this.f10765e.get(C4064k.m10184a(this.f10761a, k));
        if (pair == null || ((Boolean) C4064k.m10185a(this.f10763c, k, pair.first, pair.second)).booleanValue()) {
            return null;
        }
        return pair.first;
    }

    private C3814e(C1707b<K, V, Boolean> bVar, long j) {
        this(C3816g.f10768a, bVar, new C3817h(j), C3818i.f10770a);
    }

    /* renamed from: a */
    public final void mo9182a(K k, V v) {
        if (!((Boolean) C4064k.m10183a(this.f10762b, k, v)).booleanValue()) {
            int intValue = ((Integer) C4064k.m10184a(this.f10761a, k)).intValue();
            boolean z = false;
            Pair pair = (Pair) this.f10765e.get(Integer.valueOf(intValue));
            if (pair != null && !((Boolean) C4064k.m10185a(this.f10763c, k, pair.first, pair.second)).booleanValue()) {
                Object obj = ((Pair) this.f10765e.get(Integer.valueOf(intValue))).first;
                z = v.equals(obj);
                if (!z) {
                    v = C4064k.m10183a(this.f10764d, obj, v);
                    z = v.equals(obj);
                }
            }
            if (!z) {
                this.f10765e.put(Integer.valueOf(intValue), new Pair(v, Long.valueOf(System.currentTimeMillis())));
                if (this.f10766f.containsKey(Integer.valueOf(intValue))) {
                    ((C2189f) this.f10766f.get(Integer.valueOf(intValue))).onNext(v);
                }
            }
        }
    }

    private C3814e(C1711f<K, Integer> fVar, C1707b<K, V, Boolean> bVar, C1712g<K, V, Long, Boolean> gVar, C1707b<V, V, V> bVar2) {
        this.f10765e = new ConcurrentHashMap();
        this.f10766f = new ConcurrentHashMap(20, 0.75f, 4);
        this.f10761a = fVar;
        this.f10762b = bVar;
        this.f10763c = gVar;
        this.f10764d = bVar2;
    }
}
