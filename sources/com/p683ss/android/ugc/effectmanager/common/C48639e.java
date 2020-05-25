package com.p683ss.android.ugc.effectmanager.common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.effectmanager.common.e */
public final class C48639e<K, V> {

    /* renamed from: a */
    public HashMap<K, Collection<V>> f122270a = new HashMap<>();

    /* renamed from: a */
    public final Collection<V> mo96217a() {
        Collection<Collection> values = this.f122270a.values();
        ArrayList arrayList = new ArrayList();
        for (Collection addAll : values) {
            arrayList.addAll(addAll);
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    /* renamed from: a */
    public final void mo96218a(K k, V v) {
        Collection collection = (Collection) this.f122270a.get(k);
        if (collection == null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(v);
            this.f122270a.put(k, arrayList);
            return;
        }
        collection.add(v);
    }
}
