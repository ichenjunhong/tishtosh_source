package android.support.p030v4.p038f;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: android.support.v4.f.a */
public class C0777a<K, V> extends C0800n<K, V> implements Map<K, V> {

    /* renamed from: a */
    C0787i<K, V> f2666a;

    public C0777a() {
    }

    /* renamed from: a */
    private C0787i<K, V> m2191a() {
        if (this.f2666a == null) {
            this.f2666a = new C0787i<K, V>() {
                /* access modifiers changed from: protected */
                /* renamed from: b */
                public final Map<K, V> mo2461b() {
                    return C0777a.this;
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final int mo2454a() {
                    return C0777a.this.f2722h;
                }

                /* access modifiers changed from: protected */
                /* renamed from: c */
                public final void mo2462c() {
                    C0777a.this.clear();
                }

                /* access modifiers changed from: protected */
                /* renamed from: b */
                public final int mo2460b(Object obj) {
                    return C0777a.this.mo2575b(obj);
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final int mo2455a(Object obj) {
                    return C0777a.this.mo2573a(obj);
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final void mo2458a(int i) {
                    C0777a.this.mo2581d(i);
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final Object mo2456a(int i, int i2) {
                    return C0777a.this.f2721g[(i << 1) + i2];
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final V mo2457a(int i, V v) {
                    C0777a aVar = C0777a.this;
                    int i2 = (i << 1) + 1;
                    V v2 = aVar.f2721g[i2];
                    aVar.f2721g[i2] = v;
                    return v2;
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final void mo2459a(K k, V v) {
                    C0777a.this.put(k, v);
                }
            };
        }
        return this.f2666a;
    }

    public Set<K> keySet() {
        return m2191a().mo2512d();
    }

    public Set<Entry<K, V>> entrySet() {
        C0787i a = m2191a();
        if (a.f2696b == null) {
            a.f2696b = new C0789b<>();
        }
        return a.f2696b;
    }

    public Collection<V> values() {
        C0787i a = m2191a();
        if (a.f2698d == null) {
            a.f2698d = new C0792e<>();
        }
        return a.f2698d;
    }

    public C0777a(int i) {
        super(i);
    }

    /* renamed from: a */
    public final boolean mo2449a(Collection<?> collection) {
        return C0787i.m2249a((Map<K, V>) this, collection);
    }

    public C0777a(C0800n nVar) {
        super(nVar);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        mo2574a(this.f2722h + map.size());
        for (Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }
}
