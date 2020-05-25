package com.google.p1057b.p1060c;

import java.io.Serializable;
import java.util.Map.Entry;

/* renamed from: com.google.b.c.af */
final class C17549af<K, V> extends C17572b<K> {

    /* renamed from: a */
    private final C17538ad<K, V> f49208a;

    /* renamed from: com.google.b.c.af$a */
    static class C17550a<K> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final C17538ad<K, ?> f49209a;

        /* access modifiers changed from: 0000 */
        public final Object readResolve() {
            return this.f49209a.keySet();
        }

        C17550a(C17538ad<K, ?> adVar) {
            this.f49209a = adVar;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo33977a() {
        return true;
    }

    public final int size() {
        return this.f49208a.size();
    }

    /* access modifiers changed from: 0000 */
    public final Object writeReplace() {
        return new C17550a(this.f49208a);
    }

    public final C17666bt<K> iterator() {
        C17538ad<K, V> adVar = this.f49208a;
        return new C17666bt<K>(adVar.entrySet().iterator()) {

            /* renamed from: a */
            final /* synthetic */ C17666bt f49193a;

            public final boolean hasNext() {
                return this.f49193a.hasNext();
            }

            public final K next() {
                return ((Entry) this.f49193a.next()).getKey();
            }

            {
                this.f49193a = r2;
            }
        };
    }

    C17549af(C17538ad<K, V> adVar) {
        this.f49208a = adVar;
    }

    public final boolean contains(Object obj) {
        return this.f49208a.containsKey(obj);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final K mo34031a(int i) {
        return ((Entry) this.f49208a.entrySet().asList().get(i)).getKey();
    }
}
