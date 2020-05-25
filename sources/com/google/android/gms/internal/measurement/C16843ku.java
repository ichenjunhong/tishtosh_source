package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C16843ku;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.ku */
public abstract class C16843ku<M extends C16843ku<M>> extends C16850la {

    /* renamed from: L */
    protected C16845kw f47288L;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo31925b() {
        if (this.f47288L == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f47288L.f47296d; i2++) {
            i += this.f47288L.mo32459a(i2).mo32465a();
        }
        return i;
    }

    /* renamed from: a */
    public void mo31924a(C16841ks ksVar) throws IOException {
        if (this.f47288L != null) {
            for (int i = 0; i < this.f47288L.f47296d; i++) {
                this.f47288L.mo32459a(i).mo32466a(ksVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cc  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo32451a(com.google.android.gms.internal.measurement.C16839kq r11, int r12) throws java.io.IOException {
        /*
            r10 = this;
            int r0 = r11.mo32437i()
            boolean r1 = r11.mo32427b(r12)
            r2 = 0
            if (r1 != 0) goto L_0x000c
            return r2
        L_0x000c:
            int r1 = r12 >>> 3
            int r3 = r11.mo32437i()
            int r3 = r3 - r0
            if (r3 != 0) goto L_0x0018
            byte[] r11 = com.google.android.gms.internal.measurement.C16853ld.f47310d
            goto L_0x0023
        L_0x0018:
            byte[] r4 = new byte[r3]
            int r5 = r11.f47264b
            int r5 = r5 + r0
            byte[] r11 = r11.f47263a
            java.lang.System.arraycopy(r11, r5, r4, r2, r3)
            r11 = r4
        L_0x0023:
            com.google.android.gms.internal.measurement.lc r0 = new com.google.android.gms.internal.measurement.lc
            r0.<init>(r12, r11)
            com.google.android.gms.internal.measurement.kw r11 = r10.f47288L
            r12 = 0
            if (r11 != 0) goto L_0x0036
            com.google.android.gms.internal.measurement.kw r11 = new com.google.android.gms.internal.measurement.kw
            r11.<init>()
            r10.f47288L = r11
        L_0x0034:
            r11 = r12
            goto L_0x004b
        L_0x0036:
            com.google.android.gms.internal.measurement.kw r11 = r10.f47288L
            int r3 = r11.mo32461c(r1)
            if (r3 < 0) goto L_0x0034
            com.google.android.gms.internal.measurement.kx[] r4 = r11.f47295c
            r4 = r4[r3]
            com.google.android.gms.internal.measurement.kx r5 = com.google.android.gms.internal.measurement.C16845kw.f47293a
            if (r4 != r5) goto L_0x0047
            goto L_0x0034
        L_0x0047:
            com.google.android.gms.internal.measurement.kx[] r11 = r11.f47295c
            r11 = r11[r3]
        L_0x004b:
            r3 = 1
            if (r11 != 0) goto L_0x00c1
            com.google.android.gms.internal.measurement.kx r11 = new com.google.android.gms.internal.measurement.kx
            r11.<init>()
            com.google.android.gms.internal.measurement.kw r4 = r10.f47288L
            int r5 = r4.mo32461c(r1)
            if (r5 < 0) goto L_0x0060
            com.google.android.gms.internal.measurement.kx[] r1 = r4.f47295c
            r1[r5] = r11
            goto L_0x00c1
        L_0x0060:
            r5 = r5 ^ -1
            int r6 = r4.f47296d
            if (r5 >= r6) goto L_0x0077
            com.google.android.gms.internal.measurement.kx[] r6 = r4.f47295c
            r6 = r6[r5]
            com.google.android.gms.internal.measurement.kx r7 = com.google.android.gms.internal.measurement.C16845kw.f47293a
            if (r6 != r7) goto L_0x0077
            int[] r6 = r4.f47294b
            r6[r5] = r1
            com.google.android.gms.internal.measurement.kx[] r1 = r4.f47295c
            r1[r5] = r11
            goto L_0x00c1
        L_0x0077:
            int r6 = r4.f47296d
            int[] r7 = r4.f47294b
            int r7 = r7.length
            if (r6 < r7) goto L_0x009d
            int r6 = r4.f47296d
            int r6 = r6 + r3
            int r6 = com.google.android.gms.internal.measurement.C16845kw.m40889b(r6)
            int[] r7 = new int[r6]
            com.google.android.gms.internal.measurement.kx[] r6 = new com.google.android.gms.internal.measurement.C16846kx[r6]
            int[] r8 = r4.f47294b
            int[] r9 = r4.f47294b
            int r9 = r9.length
            java.lang.System.arraycopy(r8, r2, r7, r2, r9)
            com.google.android.gms.internal.measurement.kx[] r8 = r4.f47295c
            com.google.android.gms.internal.measurement.kx[] r9 = r4.f47295c
            int r9 = r9.length
            java.lang.System.arraycopy(r8, r2, r6, r2, r9)
            r4.f47294b = r7
            r4.f47295c = r6
        L_0x009d:
            int r6 = r4.f47296d
            int r6 = r6 - r5
            if (r6 == 0) goto L_0x00b4
            int[] r6 = r4.f47294b
            int r7 = r5 + 1
            int r8 = r4.f47296d
            int r8 = r8 - r5
            java.lang.System.arraycopy(r6, r5, r6, r7, r8)
            com.google.android.gms.internal.measurement.kx[] r6 = r4.f47295c
            int r8 = r4.f47296d
            int r8 = r8 - r5
            java.lang.System.arraycopy(r6, r5, r6, r7, r8)
        L_0x00b4:
            int[] r6 = r4.f47294b
            r6[r5] = r1
            com.google.android.gms.internal.measurement.kx[] r1 = r4.f47295c
            r1[r5] = r11
            int r1 = r4.f47296d
            int r1 = r1 + r3
            r4.f47296d = r1
        L_0x00c1:
            java.util.List<com.google.android.gms.internal.measurement.lc> r1 = r11.f47299c
            if (r1 == 0) goto L_0x00cc
            java.util.List<com.google.android.gms.internal.measurement.lc> r11 = r11.f47299c
            r11.add(r0)
            goto L_0x0174
        L_0x00cc:
            java.lang.Object r1 = r11.f47298b
            boolean r1 = r1 instanceof com.google.android.gms.internal.measurement.C16850la
            if (r1 == 0) goto L_0x00f4
            byte[] r0 = r0.f47306b
            int r1 = r0.length
            com.google.android.gms.internal.measurement.kq r1 = com.google.android.gms.internal.measurement.C16839kq.m40832a(r0, r2, r1)
            int r2 = r1.mo32430d()
            int r0 = r0.length
            int r4 = com.google.android.gms.internal.measurement.C16841ks.m40854a(r2)
            int r0 = r0 - r4
            if (r2 != r0) goto L_0x00ef
            java.lang.Object r0 = r11.f47298b
            com.google.android.gms.internal.measurement.la r0 = (com.google.android.gms.internal.measurement.C16850la) r0
            com.google.android.gms.internal.measurement.la r0 = r0.mo31923a(r1)
            goto L_0x016c
        L_0x00ef:
            com.google.android.gms.internal.measurement.kz r11 = com.google.android.gms.internal.measurement.C16848kz.m40904a()
            throw r11
        L_0x00f4:
            java.lang.Object r1 = r11.f47298b
            boolean r1 = r1 instanceof com.google.android.gms.internal.measurement.C16850la[]
            if (r1 == 0) goto L_0x011a
            com.google.android.gms.internal.measurement.kv<?, ?> r1 = r11.f47297a
            java.util.List r0 = java.util.Collections.singletonList(r0)
            java.lang.Object r0 = r1.mo32455a(r0)
            com.google.android.gms.internal.measurement.la[] r0 = (com.google.android.gms.internal.measurement.C16850la[]) r0
            java.lang.Object r1 = r11.f47298b
            com.google.android.gms.internal.measurement.la[] r1 = (com.google.android.gms.internal.measurement.C16850la[]) r1
            int r4 = r1.length
            int r5 = r0.length
            int r4 = r4 + r5
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r1, r4)
            com.google.android.gms.internal.measurement.la[] r4 = (com.google.android.gms.internal.measurement.C16850la[]) r4
            int r1 = r1.length
            int r5 = r0.length
            java.lang.System.arraycopy(r0, r2, r4, r1, r5)
        L_0x0118:
            r0 = r4
            goto L_0x016c
        L_0x011a:
            java.lang.Object r1 = r11.f47298b
            boolean r1 = r1 instanceof com.google.android.gms.internal.measurement.C16775ik
            if (r1 == 0) goto L_0x013d
            com.google.android.gms.internal.measurement.kv<?, ?> r1 = r11.f47297a
            java.util.List r0 = java.util.Collections.singletonList(r0)
            java.lang.Object r0 = r1.mo32455a(r0)
            com.google.android.gms.internal.measurement.ik r0 = (com.google.android.gms.internal.measurement.C16775ik) r0
            java.lang.Object r1 = r11.f47298b
            com.google.android.gms.internal.measurement.ik r1 = (com.google.android.gms.internal.measurement.C16775ik) r1
            com.google.android.gms.internal.measurement.il r1 = r1.mo32231h()
            com.google.android.gms.internal.measurement.il r0 = r1.mo31991a(r0)
            com.google.android.gms.internal.measurement.ik r0 = r0.mo32239d()
            goto L_0x016c
        L_0x013d:
            java.lang.Object r1 = r11.f47298b
            boolean r1 = r1 instanceof com.google.android.gms.internal.measurement.C16775ik[]
            if (r1 == 0) goto L_0x0162
            com.google.android.gms.internal.measurement.kv<?, ?> r1 = r11.f47297a
            java.util.List r0 = java.util.Collections.singletonList(r0)
            java.lang.Object r0 = r1.mo32455a(r0)
            com.google.android.gms.internal.measurement.ik[] r0 = (com.google.android.gms.internal.measurement.C16775ik[]) r0
            java.lang.Object r1 = r11.f47298b
            com.google.android.gms.internal.measurement.ik[] r1 = (com.google.android.gms.internal.measurement.C16775ik[]) r1
            int r4 = r1.length
            int r5 = r0.length
            int r4 = r4 + r5
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r1, r4)
            com.google.android.gms.internal.measurement.ik[] r4 = (com.google.android.gms.internal.measurement.C16775ik[]) r4
            int r1 = r1.length
            int r5 = r0.length
            java.lang.System.arraycopy(r0, r2, r4, r1, r5)
            goto L_0x0118
        L_0x0162:
            com.google.android.gms.internal.measurement.kv<?, ?> r1 = r11.f47297a
            java.util.List r0 = java.util.Collections.singletonList(r0)
            java.lang.Object r0 = r1.mo32455a(r0)
        L_0x016c:
            com.google.android.gms.internal.measurement.kv<?, ?> r1 = r11.f47297a
            r11.f47297a = r1
            r11.f47298b = r0
            r11.f47299c = r12
        L_0x0174:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16843ku.mo32451a(com.google.android.gms.internal.measurement.kq, int):boolean");
    }

    /* renamed from: c */
    public final /* synthetic */ C16850la mo32452c() throws CloneNotSupportedException {
        return (C16843ku) clone();
    }

    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        C16843ku kuVar = (C16843ku) super.clone();
        C16847ky.m40900a(this, kuVar);
        return kuVar;
    }
}
