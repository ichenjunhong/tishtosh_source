package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class azd<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: b */
    private static final azd f41660b;

    /* renamed from: a */
    private boolean f41661a = true;

    private azd() {
    }

    private azd(Map<K, V> map) {
        super(map);
    }

    public static <K, V> azd<K, V> zzauk() {
        return f41660b;
    }

    public final void zza(azd<K, V> azd) {
        m34834a();
        if (!azd.isEmpty()) {
            putAll(azd);
        }
    }

    public final Set<Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public final void clear() {
        m34834a();
        super.clear();
    }

    public final V put(K k, V v) {
        m34834a();
        ayb.m34768a(k);
        ayb.m34768a(v);
        return super.put(k, v);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        m34834a();
        for (Object next : map.keySet()) {
            ayb.m34768a(next);
            ayb.m34768a(map.get(next));
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        m34834a();
        return super.remove(obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L_0x005d
            java.util.Map r7 = (java.util.Map) r7
            r0 = 1
            if (r6 == r7) goto L_0x0059
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L_0x0016
        L_0x0014:
            r7 = 0
            goto L_0x005a
        L_0x0016:
            java.util.Set r2 = r6.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x001e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0059
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L_0x0035
            goto L_0x0014
        L_0x0035:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L_0x0052
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L_0x0052
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L_0x0056
        L_0x0052:
            boolean r3 = r4.equals(r3)
        L_0x0056:
            if (r3 != 0) goto L_0x001e
            goto L_0x0014
        L_0x0059:
            r7 = 1
        L_0x005a:
            if (r7 == 0) goto L_0x005d
            return r0
        L_0x005d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.azd.equals(java.lang.Object):boolean");
    }

    /* renamed from: a */
    private static int m34833a(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            int a = ayb.m34765a(length, bArr, 0, length);
            if (a == 0) {
                return 1;
            }
            return a;
        } else if (!(obj instanceof ayc)) {
            return obj.hashCode();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final int hashCode() {
        int i = 0;
        for (Entry entry : entrySet()) {
            i += m34833a(entry.getValue()) ^ m34833a(entry.getKey());
        }
        return i;
    }

    public final azd<K, V> zzaul() {
        return isEmpty() ? new azd<>() : new azd<>(this);
    }

    public final void zzara() {
        this.f41661a = false;
    }

    public final boolean isMutable() {
        return this.f41661a;
    }

    /* renamed from: a */
    private final void m34834a() {
        if (!this.f41661a) {
            throw new UnsupportedOperationException();
        }
    }

    static {
        azd azd = new azd();
        f41660b = azd;
        azd.f41661a = false;
    }
}
