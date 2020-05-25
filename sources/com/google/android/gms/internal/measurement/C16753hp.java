package com.google.android.gms.internal.measurement;

import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.hp */
final class C16753hp<K> implements Entry<K, Object> {

    /* renamed from: a */
    Entry<K, C16751hn> f47117a;

    private C16753hp(Entry<K, C16751hn> entry) {
        this.f47117a = entry;
    }

    public final K getKey() {
        return this.f47117a.getKey();
    }

    public final Object getValue() {
        if (((C16751hn) this.f47117a.getValue()) == null) {
            return null;
        }
        return C16751hn.m40330a();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof C16775ik) {
            C16751hn hnVar = (C16751hn) this.f47117a.getValue();
            C16775ik ikVar = (C16775ik) obj;
            C16775ik ikVar2 = hnVar.f47121b;
            hnVar.f47120a = null;
            hnVar.f47122c = null;
            hnVar.f47121b = ikVar;
            return ikVar2;
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
