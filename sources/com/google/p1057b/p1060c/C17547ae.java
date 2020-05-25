package com.google.p1057b.p1060c;

import java.io.Serializable;
import java.util.Map.Entry;

/* renamed from: com.google.b.c.ae */
abstract class C17547ae<K, V> extends C17570ak<Entry<K, V>> {

    /* renamed from: com.google.b.c.ae$a */
    static class C17548a<K, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final C17538ad<K, V> f49207a;

        /* access modifiers changed from: 0000 */
        public final Object readResolve() {
            return this.f49207a.entrySet();
        }

        C17548a(C17538ad<K, V> adVar) {
            this.f49207a = adVar;
        }
    }

    C17547ae() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract C17538ad<K, V> mo34022b();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo33977a() {
        return mo34022b().mo34001d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final boolean mo34027c() {
        return mo34022b().mo34002e();
    }

    public int hashCode() {
        return mo34022b().hashCode();
    }

    public int size() {
        return mo34022b().size();
    }

    /* access modifiers changed from: 0000 */
    public Object writeReplace() {
        return new C17548a(mo34022b());
    }

    public boolean contains(Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        Object obj2 = mo34022b().get(entry.getKey());
        if (obj2 == null || !obj2.equals(entry.getValue())) {
            return false;
        }
        return true;
    }
}
