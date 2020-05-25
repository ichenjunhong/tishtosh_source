package android.arch.p006a.p008b;

import android.arch.p006a.p008b.C0046b.C0050c;
import java.util.HashMap;

/* renamed from: android.arch.a.b.a */
public final class C0045a<K, V> extends C0046b<K, V> {

    /* renamed from: a */
    public HashMap<K, C0050c<K, V>> f112a = new HashMap<>();

    /* renamed from: c */
    public final boolean mo64c(K k) {
        return this.f112a.containsKey(k);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C0050c<K, V> mo61a(K k) {
        return (C0050c) this.f112a.get(k);
    }

    /* renamed from: b */
    public final V mo63b(K k) {
        V b = super.mo63b(k);
        this.f112a.remove(k);
        return b;
    }

    /* renamed from: a */
    public final V mo62a(K k, V v) {
        C0050c a = mo61a(k);
        if (a != null) {
            return a.f118b;
        }
        this.f112a.put(k, mo66b(k, v));
        return null;
    }
}
