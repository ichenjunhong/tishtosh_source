package com.bytedance.android.live.core.p222a;

import android.util.Pair;
import com.bytedance.android.live.core.p222a.C3810b.C3811a;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.common.utility.C9414h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p064c.p065a.p071d.C1707b;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p071d.C1713h;
import p064c.p065a.p094l.C2180b;

/* renamed from: com.bytedance.android.live.core.a.j */
public class C3819j<K, V> implements C3810b<K, V> {

    /* renamed from: a */
    private final C1711f<K, Integer> f10771a;

    /* renamed from: b */
    private final C1707b<K, List<V>, List<V>> f10772b;

    /* renamed from: c */
    private final C1713h<K, List<V>, Integer, List<V>, List<V>> f10773c;

    /* renamed from: d */
    private final Map<Integer, List<V>> f10774d;

    /* renamed from: e */
    private final ConcurrentMap<Integer, C2180b<C3811a>> f10775e;

    /* renamed from: f */
    private final C2180b<Pair<K, C3811a>> f10776f;

    public C3819j() {
        this(C3820k.f10777a);
    }

    private C3819j(C1711f<K, Integer> fVar) {
        this(fVar, C3821l.f10778a, C3822m.f10779a);
    }

    /* renamed from: a */
    public final List<V> mo9185a(K k) {
        int intValue = ((Integer) C4064k.m10184a(this.f10771a, k)).intValue();
        if (!this.f10774d.containsKey(Integer.valueOf(intValue))) {
            this.f10774d.put(Integer.valueOf(intValue), new ArrayList());
        }
        return (List) this.f10774d.get(Integer.valueOf(intValue));
    }

    /* renamed from: b */
    public final int mo9189b(K k) {
        int intValue = ((Integer) C4064k.m10184a(this.f10771a, k)).intValue();
        if (!this.f10774d.containsKey(Integer.valueOf(intValue))) {
            this.f10774d.put(Integer.valueOf(intValue), new ArrayList());
        }
        return ((List) this.f10774d.get(Integer.valueOf(intValue))).size();
    }

    /* renamed from: c */
    public final void mo9191c(K k) {
        int intValue = ((Integer) C4064k.m10184a(this.f10771a, k)).intValue();
        if (!this.f10774d.containsKey(Integer.valueOf(intValue))) {
            this.f10774d.put(Integer.valueOf(intValue), new ArrayList());
        }
        ((List) this.f10774d.get(Integer.valueOf(intValue))).clear();
    }

    /* renamed from: a */
    public final V mo9184a(K k, C3823n<V> nVar) {
        int intValue = ((Integer) C4064k.m10184a(this.f10771a, k)).intValue();
        if (!this.f10774d.containsKey(Integer.valueOf(intValue))) {
            this.f10774d.put(Integer.valueOf(intValue), new ArrayList());
        }
        for (V next : (List) this.f10774d.get(Integer.valueOf(intValue))) {
            try {
                if (nVar.mo9194a(next)) {
                    return next;
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: b */
    public final int mo9190b(K k, V v) {
        int intValue = ((Integer) C4064k.m10184a(this.f10771a, k)).intValue();
        if (!this.f10774d.containsKey(Integer.valueOf(intValue))) {
            this.f10774d.put(Integer.valueOf(intValue), new ArrayList());
        }
        return ((List) this.f10774d.get(Integer.valueOf(intValue))).indexOf(v);
    }

    /* renamed from: a */
    public final List<V> mo9186a(K k, List<V> list) {
        int intValue = ((Integer) C4064k.m10184a(this.f10771a, k)).intValue();
        if (!this.f10774d.containsKey(Integer.valueOf(intValue))) {
            this.f10774d.put(Integer.valueOf(intValue), new ArrayList());
        }
        return m9687a(k, ((List) this.f10774d.get(Integer.valueOf(intValue))).size(), list);
    }

    /* renamed from: a */
    public final void mo9187a(K k, int i) {
        int intValue = ((Integer) C4064k.m10184a(this.f10771a, k)).intValue();
        if (!this.f10774d.containsKey(Integer.valueOf(intValue))) {
            this.f10774d.put(Integer.valueOf(intValue), new ArrayList());
        }
        List list = (List) this.f10774d.get(Integer.valueOf(intValue));
        if (i >= 0 && i <= list.size()) {
            Object remove = list.remove(i);
            if (this.f10775e.containsKey(Integer.valueOf(intValue))) {
                ((C2180b) this.f10775e.get(Integer.valueOf(intValue))).onNext(new C3811a(2, i, Collections.singletonList(remove)));
            }
        }
    }

    /* renamed from: a */
    public final void mo9188a(K k, V v) {
        int intValue = ((Integer) C4064k.m10184a(this.f10771a, k)).intValue();
        if (!this.f10774d.containsKey(Integer.valueOf(intValue))) {
            this.f10774d.put(Integer.valueOf(intValue), new ArrayList());
        }
        List list = (List) this.f10774d.get(Integer.valueOf(intValue));
        int indexOf = list.indexOf(v);
        if (list.remove(v)) {
            C3811a aVar = new C3811a(2, indexOf, Collections.singletonList(v));
            if (this.f10775e.containsKey(Integer.valueOf(intValue))) {
                ((C2180b) this.f10775e.get(Integer.valueOf(intValue))).onNext(aVar);
            }
            this.f10776f.onNext(Pair.create(k, aVar));
        }
    }

    public C3819j(C1711f<K, Integer> fVar, C1713h<K, List<V>, Integer, List<V>, List<V>> hVar, C1707b<K, List<V>, List<V>> bVar) {
        this.f10774d = new ConcurrentHashMap();
        this.f10775e = new ConcurrentHashMap(20, 0.75f, 4);
        this.f10776f = C2180b.m6534l();
        this.f10771a = fVar;
        this.f10773c = hVar;
        this.f10772b = bVar;
    }

    /* renamed from: a */
    private synchronized List<V> m9687a(K k, int i, List<V> list) {
        int intValue = ((Integer) C4064k.m10184a(this.f10771a, k)).intValue();
        if (!this.f10774d.containsKey(Integer.valueOf(intValue))) {
            this.f10774d.put(Integer.valueOf(intValue), new ArrayList());
        }
        List list2 = (List) this.f10774d.get(Integer.valueOf(intValue));
        List<V> list3 = (List) C4064k.m10186a(this.f10773c, k, list2, Integer.valueOf(i), (List) C4064k.m10183a(this.f10772b, k, list));
        if (C9414h.m18630a(list3)) {
            return list3;
        }
        int min = Math.min(i, list2.size());
        list2.addAll(min, list3);
        this.f10774d.put(Integer.valueOf(intValue), list2);
        C3811a aVar = new C3811a(1, min, list3);
        if (this.f10775e.containsKey(Integer.valueOf(intValue))) {
            ((C2180b) this.f10775e.get(Integer.valueOf(intValue))).onNext(aVar);
        }
        this.f10776f.onNext(Pair.create(k, aVar));
        return list3;
    }
}
