package com.facebook.imagepipeline.p964d;

import com.facebook.common.p920d.C13690j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

/* renamed from: com.facebook.imagepipeline.d.g */
public final class C13970g<K, V> {

    /* renamed from: a */
    private final C13993v<V> f36439a;

    /* renamed from: b */
    private final LinkedHashMap<K, V> f36440b = new LinkedHashMap<>();

    /* renamed from: c */
    private int f36441c = 0;

    /* renamed from: b */
    public final synchronized int mo26152b() {
        return this.f36441c;
    }

    /* renamed from: a */
    public final synchronized int mo26148a() {
        return this.f36440b.size();
    }

    /* renamed from: c */
    public final synchronized K mo26155c() {
        if (this.f36440b.isEmpty()) {
            return null;
        }
        return this.f36440b.keySet().iterator().next();
    }

    /* renamed from: d */
    public final synchronized ArrayList<V> mo26157d() {
        ArrayList<V> arrayList;
        arrayList = new ArrayList<>(this.f36440b.values());
        this.f36440b.clear();
        this.f36441c = 0;
        return arrayList;
    }

    public C13970g(C13993v<V> vVar) {
        this.f36439a = vVar;
    }

    /* renamed from: d */
    private int m28458d(V v) {
        if (v == null) {
            return 0;
        }
        return this.f36439a.mo23155a(v);
    }

    /* renamed from: b */
    public final synchronized V mo26153b(K k) {
        return this.f36440b.get(k);
    }

    /* renamed from: a */
    public final synchronized boolean mo26151a(K k) {
        return this.f36440b.containsKey(k);
    }

    /* renamed from: c */
    public final synchronized V mo26156c(K k) {
        V remove;
        remove = this.f36440b.remove(k);
        this.f36441c -= m28458d(remove);
        return remove;
    }

    /* renamed from: a */
    public final synchronized ArrayList<Entry<K, V>> mo26150a(C13690j<K> jVar) {
        ArrayList<Entry<K, V>> arrayList;
        arrayList = new ArrayList<>(this.f36440b.entrySet().size());
        for (Entry entry : this.f36440b.entrySet()) {
            if (jVar == null || jVar.mo25584a(entry.getKey())) {
                arrayList.add(entry);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final synchronized ArrayList<V> mo26154b(C13690j<K> jVar) {
        ArrayList<V> arrayList;
        arrayList = new ArrayList<>();
        Iterator it = this.f36440b.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            if (jVar == null || jVar.mo25584a(entry.getKey())) {
                arrayList.add(entry.getValue());
                this.f36441c -= m28458d(entry.getValue());
                it.remove();
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final synchronized V mo26149a(K k, V v) {
        V remove;
        remove = this.f36440b.remove(k);
        this.f36441c -= m28458d(remove);
        this.f36440b.put(k, v);
        this.f36441c += m28458d(v);
        return remove;
    }
}
