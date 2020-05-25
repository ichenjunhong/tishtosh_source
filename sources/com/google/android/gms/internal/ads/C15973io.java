package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.io */
public final class C15973io {

    /* renamed from: e */
    private static final Comparator<byte[]> f45070e = new C15995jj();

    /* renamed from: a */
    private final List<byte[]> f45071a = new ArrayList();

    /* renamed from: b */
    private final List<byte[]> f45072b = new ArrayList(64);

    /* renamed from: c */
    private int f45073c = 0;

    /* renamed from: d */
    private final int f45074d = 4096;

    public C15973io(int i) {
    }

    /* renamed from: a */
    public final synchronized byte[] mo31100a(int i) {
        for (int i2 = 0; i2 < this.f45072b.size(); i2++) {
            byte[] bArr = (byte[]) this.f45072b.get(i2);
            if (bArr.length >= i) {
                this.f45073c -= bArr.length;
                this.f45072b.remove(i2);
                this.f45071a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo31099a(byte[] r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L_0x002e
            int r0 = r3.length     // Catch:{ all -> 0x002b }
            int r1 = r2.f45074d     // Catch:{ all -> 0x002b }
            if (r0 <= r1) goto L_0x0009
            goto L_0x002e
        L_0x0009:
            java.util.List<byte[]> r0 = r2.f45071a     // Catch:{ all -> 0x002b }
            r0.add(r3)     // Catch:{ all -> 0x002b }
            java.util.List<byte[]> r0 = r2.f45072b     // Catch:{ all -> 0x002b }
            java.util.Comparator<byte[]> r1 = f45070e     // Catch:{ all -> 0x002b }
            int r0 = java.util.Collections.binarySearch(r0, r3, r1)     // Catch:{ all -> 0x002b }
            if (r0 >= 0) goto L_0x001b
            int r0 = -r0
            int r0 = r0 + -1
        L_0x001b:
            java.util.List<byte[]> r1 = r2.f45072b     // Catch:{ all -> 0x002b }
            r1.add(r0, r3)     // Catch:{ all -> 0x002b }
            int r0 = r2.f45073c     // Catch:{ all -> 0x002b }
            int r3 = r3.length     // Catch:{ all -> 0x002b }
            int r0 = r0 + r3
            r2.f45073c = r0     // Catch:{ all -> 0x002b }
            r2.m37799a()     // Catch:{ all -> 0x002b }
            monitor-exit(r2)
            return
        L_0x002b:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L_0x002e:
            monitor-exit(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C15973io.mo31099a(byte[]):void");
    }

    /* renamed from: a */
    private final synchronized void m37799a() {
        while (this.f45073c > this.f45074d) {
            byte[] bArr = (byte[]) this.f45071a.remove(0);
            this.f45072b.remove(bArr);
            this.f45073c -= bArr.length;
        }
    }
}
