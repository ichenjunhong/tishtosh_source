package com.google.p1057b.p1059b;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* renamed from: com.google.b.b.j */
final class C17514j extends C17524o implements C17509h, Serializable {
    private static final long serialVersionUID = 7249069246863182397L;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final long mo33929a(long j, long j2) {
        return j + j2;
    }

    /* renamed from: a */
    public final void mo33927a() {
        mo33928a(1);
    }

    public final double doubleValue() {
        return (double) m43019d();
    }

    public final float floatValue() {
        return (float) m43019d();
    }

    public final int intValue() {
        return (int) m43019d();
    }

    public final long longValue() {
        return m43019d();
    }

    public final String toString() {
        return Long.toString(m43019d());
    }

    /* renamed from: d */
    private long m43019d() {
        long j = this.f49171e;
        C17526a[] aVarArr = this.f49170d;
        if (aVarArr != null) {
            for (C17526a aVar : aVarArr) {
                if (aVar != null) {
                    j += aVar.f49175a;
                }
            }
        }
        return j;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f49172f = 0;
        this.f49170d = null;
        this.f49171e = objectInputStream.readLong();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(m43019d());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        if (r0 == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (mo33939b(r4, r4 + r2) == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00bc, code lost:
        if (r1.f49170d != r9) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00be, code lost:
        r8 = new com.google.p1057b.p1059b.C17524o.C17526a[(r10 << 1)];
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00c3, code lost:
        if (r11 >= r10) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00c5, code lost:
        r8[r11] = r9[r11];
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00cc, code lost:
        r1.f49170d = r8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0054 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x008c A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo33928a(long r18) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            com.google.b.b.o$a[] r0 = r1.f49170d
            if (r0 != 0) goto L_0x0012
            long r4 = r1.f49171e
            long r6 = r4 + r2
            boolean r4 = r1.mo33939b(r4, r6)
            if (r4 != 0) goto L_0x011d
        L_0x0012:
            java.lang.ThreadLocal r4 = f49164a
            java.lang.Object r4 = r4.get()
            int[] r4 = (int[]) r4
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0036
            if (r0 == 0) goto L_0x0036
            int r7 = r0.length
            if (r7 <= 0) goto L_0x0036
            int r7 = r7 - r5
            r8 = r4[r6]
            r7 = r7 & r8
            r0 = r0[r7]
            if (r0 == 0) goto L_0x0036
            long r7 = r0.f49175a
            long r9 = r7 + r2
            boolean r0 = r0.mo33941a(r7, r9)
            if (r0 != 0) goto L_0x011d
            goto L_0x0037
        L_0x0036:
            r0 = 1
        L_0x0037:
            if (r4 != 0) goto L_0x004c
            java.lang.ThreadLocal<int[]> r4 = com.google.p1057b.p1059b.C17524o.f49164a
            int[] r7 = new int[r5]
            r4.set(r7)
            java.util.Random r4 = com.google.p1057b.p1059b.C17524o.f49165b
            int r4 = r4.nextInt()
            if (r4 != 0) goto L_0x0049
            r4 = 1
        L_0x0049:
            r7[r6] = r4
            goto L_0x0053
        L_0x004c:
            r7 = r4[r6]
            r16 = r7
            r7 = r4
            r4 = r16
        L_0x0053:
            r8 = 0
        L_0x0054:
            com.google.b.b.o$a[] r9 = r1.f49170d
            if (r9 == 0) goto L_0x00e2
            int r10 = r9.length
            if (r10 <= 0) goto L_0x00e2
            int r11 = r10 + -1
            r11 = r11 & r4
            r11 = r9[r11]
            if (r11 != 0) goto L_0x0093
            int r9 = r1.f49172f
            if (r9 != 0) goto L_0x0091
            com.google.b.b.o$a r9 = new com.google.b.b.o$a
            r9.<init>(r2)
            int r10 = r1.f49172f
            if (r10 != 0) goto L_0x0091
            boolean r10 = r17.mo33938b()
            if (r10 == 0) goto L_0x0091
            com.google.b.b.o$a[] r10 = r1.f49170d     // Catch:{ all -> 0x008d }
            if (r10 == 0) goto L_0x0087
            int r11 = r10.length     // Catch:{ all -> 0x008d }
            if (r11 <= 0) goto L_0x0087
            int r11 = r11 + -1
            r11 = r11 & r4
            r12 = r10[r11]     // Catch:{ all -> 0x008d }
            if (r12 != 0) goto L_0x0087
            r10[r11] = r9     // Catch:{ all -> 0x008d }
            r9 = 1
            goto L_0x0088
        L_0x0087:
            r9 = 0
        L_0x0088:
            r1.f49172f = r6
            if (r9 == 0) goto L_0x0054
            return
        L_0x008d:
            r0 = move-exception
            r1.f49172f = r6
            throw r0
        L_0x0091:
            r8 = 0
            goto L_0x00d5
        L_0x0093:
            if (r0 != 0) goto L_0x0097
            r0 = 1
            goto L_0x00d5
        L_0x0097:
            long r12 = r11.f49175a
            long r14 = r1.mo33929a(r12, r2)
            boolean r11 = r11.mo33941a(r12, r14)
            if (r11 != 0) goto L_0x011d
            int r11 = com.google.p1057b.p1059b.C17524o.f49166c
            if (r10 >= r11) goto L_0x0091
            com.google.b.b.o$a[] r11 = r1.f49170d
            if (r11 == r9) goto L_0x00ac
            goto L_0x0091
        L_0x00ac:
            if (r8 != 0) goto L_0x00b0
            r8 = 1
            goto L_0x00d5
        L_0x00b0:
            int r11 = r1.f49172f
            if (r11 != 0) goto L_0x00d5
            boolean r11 = r17.mo33938b()
            if (r11 == 0) goto L_0x00d5
            com.google.b.b.o$a[] r8 = r1.f49170d     // Catch:{ all -> 0x00d1 }
            if (r8 != r9) goto L_0x00ce
            int r8 = r10 << 1
            com.google.b.b.o$a[] r8 = new com.google.p1057b.p1059b.C17524o.C17526a[r8]     // Catch:{ all -> 0x00d1 }
            r11 = 0
        L_0x00c3:
            if (r11 >= r10) goto L_0x00cc
            r12 = r9[r11]     // Catch:{ all -> 0x00d1 }
            r8[r11] = r12     // Catch:{ all -> 0x00d1 }
            int r11 = r11 + 1
            goto L_0x00c3
        L_0x00cc:
            r1.f49170d = r8     // Catch:{ all -> 0x00d1 }
        L_0x00ce:
            r1.f49172f = r6
            goto L_0x0053
        L_0x00d1:
            r0 = move-exception
            r1.f49172f = r6
            throw r0
        L_0x00d5:
            int r9 = r4 << 13
            r4 = r4 ^ r9
            int r9 = r4 >>> 17
            r4 = r4 ^ r9
            int r9 = r4 << 5
            r4 = r4 ^ r9
            r7[r6] = r4
            goto L_0x0054
        L_0x00e2:
            int r10 = r1.f49172f
            if (r10 != 0) goto L_0x010f
            com.google.b.b.o$a[] r10 = r1.f49170d
            if (r10 != r9) goto L_0x010f
            boolean r10 = r17.mo33938b()
            if (r10 == 0) goto L_0x010f
            com.google.b.b.o$a[] r10 = r1.f49170d     // Catch:{ all -> 0x010b }
            if (r10 != r9) goto L_0x0104
            r9 = 2
            com.google.b.b.o$a[] r9 = new com.google.p1057b.p1059b.C17524o.C17526a[r9]     // Catch:{ all -> 0x010b }
            r10 = r4 & 1
            com.google.b.b.o$a r11 = new com.google.b.b.o$a     // Catch:{ all -> 0x010b }
            r11.<init>(r2)     // Catch:{ all -> 0x010b }
            r9[r10] = r11     // Catch:{ all -> 0x010b }
            r1.f49170d = r9     // Catch:{ all -> 0x010b }
            r9 = 1
            goto L_0x0105
        L_0x0104:
            r9 = 0
        L_0x0105:
            r1.f49172f = r6
            if (r9 != 0) goto L_0x011d
            goto L_0x0054
        L_0x010b:
            r0 = move-exception
            r1.f49172f = r6
            throw r0
        L_0x010f:
            long r9 = r1.f49171e
            long r11 = r1.mo33929a(r9, r2)
            boolean r9 = r1.mo33939b(r9, r11)
            if (r9 != 0) goto L_0x011d
            goto L_0x0054
        L_0x011d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p1057b.p1059b.C17514j.mo33928a(long):void");
    }
}
