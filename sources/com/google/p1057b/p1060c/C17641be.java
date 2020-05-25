package com.google.p1057b.p1060c;

import com.google.p1057b.p1058a.C17421k;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Map.Entry;

/* renamed from: com.google.b.c.be */
final class C17641be<K, V> extends C17538ad<K, V> {

    /* renamed from: b */
    static final C17538ad<Object, Object> f49325b = new C17641be(null, new Object[0], 0);
    private static final long serialVersionUID = 0;

    /* renamed from: c */
    final transient Object[] f49326c;

    /* renamed from: d */
    private final transient int[] f49327d;

    /* renamed from: e */
    private final transient int f49328e;

    /* renamed from: com.google.b.c.be$a */
    static class C17642a<K, V> extends C17570ak<Entry<K, V>> {

        /* renamed from: a */
        public final transient Object[] f49329a;

        /* renamed from: b */
        public final transient int f49330b = 0;

        /* renamed from: c */
        public final transient int f49331c;

        /* renamed from: d */
        private final transient C17538ad<K, V> f49332d;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo33977a() {
            return true;
        }

        public final int size() {
            return this.f49331c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final C17530ab<Entry<K, V>> mo34098d() {
            return new C17530ab<Entry<K, V>>() {
                /* renamed from: a */
                public final boolean mo33977a() {
                    return true;
                }

                public final int size() {
                    return C17642a.this.f49331c;
                }

                public final /* synthetic */ Object get(int i) {
                    C17421k.m42652a(i, C17642a.this.f49331c);
                    int i2 = i * 2;
                    return new SimpleImmutableEntry(C17642a.this.f49329a[C17642a.this.f49330b + i2], C17642a.this.f49329a[i2 + (C17642a.this.f49330b ^ 1)]);
                }
            };
        }

        public final C17666bt<Entry<K, V>> iterator() {
            return asList().iterator();
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.f49332d.get(key))) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final int mo33952a(Object[] objArr, int i) {
            return asList().mo33952a(objArr, i);
        }

        C17642a(C17538ad<K, V> adVar, Object[] objArr, int i, int i2) {
            this.f49332d = adVar;
            this.f49329a = objArr;
            this.f49331c = i2;
        }
    }

    /* renamed from: com.google.b.c.be$b */
    static final class C17644b<K> extends C17570ak<K> {

        /* renamed from: a */
        private final transient C17538ad<K, ?> f49334a;

        /* renamed from: b */
        private final transient C17530ab<K> f49335b;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo33977a() {
            return true;
        }

        public final C17530ab<K> asList() {
            return this.f49335b;
        }

        public final int size() {
            return this.f49334a.size();
        }

        public final C17666bt<K> iterator() {
            return asList().iterator();
        }

        public final boolean contains(Object obj) {
            if (this.f49334a.get(obj) != null) {
                return true;
            }
            return false;
        }

        C17644b(C17538ad<K, ?> adVar, C17530ab<K> abVar) {
            this.f49334a = adVar;
            this.f49335b = abVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final int mo33952a(Object[] objArr, int i) {
            return asList().mo33952a(objArr, i);
        }
    }

    /* renamed from: com.google.b.c.be$c */
    static final class C17645c extends C17530ab<Object> {

        /* renamed from: a */
        private final transient Object[] f49336a;

        /* renamed from: b */
        private final transient int f49337b;

        /* renamed from: c */
        private final transient int f49338c;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo33977a() {
            return true;
        }

        public final int size() {
            return this.f49338c;
        }

        public final Object get(int i) {
            C17421k.m42652a(i, this.f49338c);
            return this.f49336a[(i * 2) + this.f49337b];
        }

        C17645c(Object[] objArr, int i, int i2) {
            this.f49336a = objArr;
            this.f49337b = i;
            this.f49338c = i2;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final boolean mo34001d() {
        return false;
    }

    public final int size() {
        return this.f49328e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C17570ak<Entry<K, V>> mo33994a() {
        return new C17642a(this, this.f49326c, 0, this.f49328e);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C17570ak<K> mo33996b() {
        return new C17644b(this, new C17645c(this.f49326c, 0, this.f49328e));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final C17725z<V> mo33997c() {
        return new C17645c(this.f49326c, 1, this.f49328e);
    }

    public final V get(Object obj) {
        int[] iArr = this.f49327d;
        V[] vArr = this.f49326c;
        int i = this.f49328e;
        if (obj == null) {
            return null;
        }
        if (i == 1) {
            if (vArr[0].equals(obj)) {
                return vArr[1];
            }
            return null;
        } else if (iArr == null) {
            return null;
        } else {
            int length = iArr.length - 1;
            int a = C17724y.m43535a(obj.hashCode());
            while (true) {
                int i2 = a & length;
                int i3 = iArr[i2];
                if (i3 == -1) {
                    return null;
                }
                if (vArr[i3].equals(obj)) {
                    return vArr[i3 ^ 1];
                }
                a = i2 + 1;
            }
        }
    }

    /* renamed from: a */
    static <K, V> C17641be<K, V> m43368a(int i, Object[] objArr) {
        if (i == 0) {
            return (C17641be) f49325b;
        }
        if (i == 1) {
            C17698k.m43478a(objArr[0], objArr[1]);
            return new C17641be<>(null, objArr, 1);
        }
        C17421k.m42666b(i, objArr.length >> 1);
        return new C17641be<>(m43369a(objArr, i, C17570ak.m43179b(i), 0), objArr, i);
    }

    private C17641be(int[] iArr, Object[] objArr, int i) {
        this.f49327d = iArr;
        this.f49326c = objArr;
        this.f49328e = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
        r11[r6] = r4;
        r12 = r12 + 1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int[] m43369a(java.lang.Object[] r9, int r10, int r11, int r12) {
        /*
            r12 = 0
            r0 = 1
            if (r10 != r0) goto L_0x000d
            r10 = r9[r12]
            r9 = r9[r0]
            com.google.p1057b.p1060c.C17698k.m43478a(r10, r9)
            r9 = 0
            return r9
        L_0x000d:
            int r1 = r11 + -1
            int[] r11 = new int[r11]
            r2 = -1
            java.util.Arrays.fill(r11, r2)
        L_0x0015:
            if (r12 >= r10) goto L_0x0072
            int r3 = r12 * 2
            int r4 = r3 + 0
            r5 = r9[r4]
            int r3 = r3 + r0
            r3 = r9[r3]
            com.google.p1057b.p1060c.C17698k.m43478a(r5, r3)
            int r6 = r5.hashCode()
            int r6 = com.google.p1057b.p1060c.C17724y.m43535a(r6)
        L_0x002b:
            r6 = r6 & r1
            r7 = r11[r6]
            if (r7 != r2) goto L_0x0035
            r11[r6] = r4
            int r12 = r12 + 1
            goto L_0x0015
        L_0x0035:
            r8 = r9[r7]
            boolean r8 = r8.equals(r5)
            if (r8 != 0) goto L_0x0040
            int r6 = r6 + 1
            goto L_0x002b
        L_0x0040:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Multiple entries with same key: "
            r11.<init>(r12)
            r11.append(r5)
            java.lang.String r12 = "="
            r11.append(r12)
            r11.append(r3)
            java.lang.String r12 = " and "
            r11.append(r12)
            r12 = r9[r7]
            r11.append(r12)
            java.lang.String r12 = "="
            r11.append(r12)
            r12 = r7 ^ 1
            r9 = r9[r12]
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r10.<init>(r9)
            throw r10
        L_0x0072:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p1057b.p1060c.C17641be.m43369a(java.lang.Object[], int, int, int):int[]");
    }
}
