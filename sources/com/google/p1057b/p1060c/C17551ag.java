package com.google.p1057b.p1060c;

import java.io.Serializable;
import java.util.Map.Entry;

/* renamed from: com.google.b.c.ag */
final class C17551ag<K, V> extends C17725z<V> {

    /* renamed from: a */
    public final C17538ad<K, V> f49210a;

    /* renamed from: com.google.b.c.ag$a */
    static class C17554a<V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        final C17538ad<?, V> f49215a;

        /* access modifiers changed from: 0000 */
        public final Object readResolve() {
            return this.f49215a.values();
        }

        C17554a(C17538ad<?, V> adVar) {
            this.f49215a = adVar;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo33977a() {
        return true;
    }

    public final C17666bt<V> iterator() {
        return new C17666bt<V>() {

            /* renamed from: a */
            final C17666bt<Entry<K, V>> f49211a = C17551ag.this.f49210a.entrySet().iterator();

            public final boolean hasNext() {
                return this.f49211a.hasNext();
            }

            public final V next() {
                return ((Entry) this.f49211a.next()).getValue();
            }
        };
    }

    public final int size() {
        return this.f49210a.size();
    }

    /* access modifiers changed from: 0000 */
    public final Object writeReplace() {
        return new C17554a(this.f49210a);
    }

    public final C17530ab<V> asList() {
        final C17530ab asList = this.f49210a.entrySet().asList();
        return new C17530ab<V>() {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final boolean mo33977a() {
                return true;
            }

            public final int size() {
                return asList.size();
            }

            public final V get(int i) {
                return ((Entry) asList.get(i)).getValue();
            }
        };
    }

    C17551ag(C17538ad<K, V> adVar) {
        this.f49210a = adVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean contains(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L_0x002d
            com.google.b.c.bt r1 = r4.iterator()
            r2 = 1
            if (r5 != 0) goto L_0x0018
        L_0x000a:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0029
            java.lang.Object r5 = r1.next()
            if (r5 != 0) goto L_0x000a
        L_0x0016:
            r5 = 1
            goto L_0x002a
        L_0x0018:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0029
            java.lang.Object r3 = r1.next()
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0018
            goto L_0x0016
        L_0x0029:
            r5 = 0
        L_0x002a:
            if (r5 == 0) goto L_0x002d
            return r2
        L_0x002d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p1057b.p1060c.C17551ag.contains(java.lang.Object):boolean");
    }
}
