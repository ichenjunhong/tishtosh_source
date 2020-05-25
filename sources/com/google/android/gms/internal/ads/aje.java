package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.C15521l;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;

@C16299uq
public final class aje implements bkm {

    /* renamed from: a */
    private InputStream f40658a;

    /* renamed from: b */
    private boolean f40659b;

    /* renamed from: c */
    private final Context f40660c;

    /* renamed from: d */
    private final bkm f40661d;

    /* renamed from: e */
    private final WeakReference<ajf> f40662e;

    public aje(Context context, bkm bkm, ajf ajf) {
        this.f40660c = context;
        this.f40661d = bkm;
        this.f40662e = new WeakReference<>(ajf);
    }

    /* renamed from: a */
    public final void mo29004a() throws IOException {
        if (this.f40659b) {
            this.f40659b = false;
            if (this.f40658a != null) {
                C15521l.m32290a(this.f40658a);
                this.f40658a = null;
                return;
            }
            this.f40661d.mo29004a();
            return;
        }
        throw new IOException("Attempt to close an already closed CacheDataSource.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0097, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r4.cancel(true);
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r4.cancel(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d7, code lost:
        r4 = com.google.android.gms.ads.internal.C14963ax.m30837g().mo28524b() - r9;
        r2 = (com.google.android.gms.internal.ads.ajf) r1.f40662e.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e8, code lost:
        if (r2 != null) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ea, code lost:
        r2.mo28990a(false, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ed, code lost:
        r2 = new java.lang.StringBuilder(44);
        r2.append("Cache connection took ");
        r2.append(r4);
        r2.append("ms");
        com.google.android.gms.internal.ads.abv.m32494a(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0107, code lost:
        r2 = com.google.android.gms.ads.internal.C14963ax.m30837g().mo28524b() - r9;
        r4 = (com.google.android.gms.internal.ads.ajf) r1.f40662e.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0118, code lost:
        if (r4 != null) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x011a, code lost:
        r4.mo28990a(false, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x011d, code lost:
        r4 = new java.lang.StringBuilder(44);
        r4.append("Cache connection took ");
        r4.append(r2);
        r4.append("ms");
        com.google.android.gms.internal.ads.abv.m32494a(r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0136, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:18:0x0099, B:24:0x00d4] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0099 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x00d4 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:24:0x00d4=Splitter:B:24:0x00d4, B:18:0x0099=Splitter:B:18:0x0099} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo29003a(com.google.android.gms.internal.ads.bkn r18) throws java.io.IOException {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            boolean r2 = r1.f40659b
            if (r2 != 0) goto L_0x0177
            r2 = 1
            r1.f40659b = r2
            android.net.Uri r3 = r0.f42786a
            com.google.android.gms.internal.ads.zzwr r3 = com.google.android.gms.internal.ads.zzwr.m39298a(r3)
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.C15740bx.f44359cn
            com.google.android.gms.internal.ads.bu r5 = com.google.android.gms.internal.ads.caf.m37099d()
            java.lang.Object r4 = r5.mo30717a(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r5 = -1
            if (r4 == 0) goto L_0x0137
            if (r3 == 0) goto L_0x0155
            long r7 = r0.f42788c
            r3.f46309c = r7
            boolean r4 = r3.f46308b
            if (r4 == 0) goto L_0x003c
            com.google.android.gms.internal.ads.bl<java.lang.Long> r4 = com.google.android.gms.internal.ads.C15740bx.f44361cp
            com.google.android.gms.internal.ads.bu r7 = com.google.android.gms.internal.ads.caf.m37099d()
            java.lang.Object r4 = r7.mo30717a(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            goto L_0x0048
        L_0x003c:
            com.google.android.gms.internal.ads.bl<java.lang.Long> r4 = com.google.android.gms.internal.ads.C15740bx.f44360co
            com.google.android.gms.internal.ads.bu r7 = com.google.android.gms.internal.ads.caf.m37099d()
            java.lang.Object r4 = r7.mo30717a(r4)
            java.lang.Long r4 = (java.lang.Long) r4
        L_0x0048:
            long r7 = r4.longValue()
            com.google.android.gms.common.util.e r4 = com.google.android.gms.ads.internal.C14963ax.m30837g()
            long r9 = r4.mo28524b()
            android.content.Context r4 = r1.f40660c
            java.util.concurrent.Future r4 = com.google.android.gms.internal.ads.byb.m36978a(r4, r3)
            r11 = 0
            r12 = 44
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException | TimeoutException -> 0x00d4, InterruptedException -> 0x0099 }
            java.lang.Object r7 = r4.get(r7, r13)     // Catch:{ ExecutionException | TimeoutException -> 0x00d4, InterruptedException -> 0x0099 }
            java.io.InputStream r7 = (java.io.InputStream) r7     // Catch:{ ExecutionException | TimeoutException -> 0x00d4, InterruptedException -> 0x0099 }
            r1.f40658a = r7     // Catch:{ ExecutionException | TimeoutException -> 0x00d4, InterruptedException -> 0x0099 }
            com.google.android.gms.common.util.e r0 = com.google.android.gms.ads.internal.C14963ax.m30837g()
            long r3 = r0.mo28524b()
            long r3 = r3 - r9
            java.lang.ref.WeakReference<com.google.android.gms.internal.ads.ajf> r0 = r1.f40662e
            java.lang.Object r0 = r0.get()
            com.google.android.gms.internal.ads.ajf r0 = (com.google.android.gms.internal.ads.ajf) r0
            if (r0 == 0) goto L_0x007d
            r0.mo28990a(r2, r3)
        L_0x007d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r12)
            java.lang.String r2 = "Cache connection took "
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = "ms"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.abv.m32494a(r0)
            return r5
        L_0x0097:
            r0 = move-exception
            goto L_0x0107
        L_0x0099:
            r4.cancel(r2)     // Catch:{ all -> 0x0097 }
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0097 }
            r2.interrupt()     // Catch:{ all -> 0x0097 }
            com.google.android.gms.common.util.e r2 = com.google.android.gms.ads.internal.C14963ax.m30837g()
            long r4 = r2.mo28524b()
            long r4 = r4 - r9
            java.lang.ref.WeakReference<com.google.android.gms.internal.ads.ajf> r2 = r1.f40662e
            java.lang.Object r2 = r2.get()
            com.google.android.gms.internal.ads.ajf r2 = (com.google.android.gms.internal.ads.ajf) r2
            if (r2 == 0) goto L_0x00b9
            r2.mo28990a(r11, r4)
        L_0x00b9:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r12)
            java.lang.String r6 = "Cache connection took "
            r2.append(r6)
            r2.append(r4)
            java.lang.String r4 = "ms"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.google.android.gms.internal.ads.abv.m32494a(r2)
            goto L_0x0155
        L_0x00d4:
            r4.cancel(r2)     // Catch:{ all -> 0x0097 }
            com.google.android.gms.common.util.e r2 = com.google.android.gms.ads.internal.C14963ax.m30837g()
            long r4 = r2.mo28524b()
            long r4 = r4 - r9
            java.lang.ref.WeakReference<com.google.android.gms.internal.ads.ajf> r2 = r1.f40662e
            java.lang.Object r2 = r2.get()
            com.google.android.gms.internal.ads.ajf r2 = (com.google.android.gms.internal.ads.ajf) r2
            if (r2 == 0) goto L_0x00ed
            r2.mo28990a(r11, r4)
        L_0x00ed:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r12)
            java.lang.String r6 = "Cache connection took "
            r2.append(r6)
            r2.append(r4)
            java.lang.String r4 = "ms"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.google.android.gms.internal.ads.abv.m32494a(r2)
            goto L_0x0155
        L_0x0107:
            com.google.android.gms.common.util.e r2 = com.google.android.gms.ads.internal.C14963ax.m30837g()
            long r2 = r2.mo28524b()
            long r2 = r2 - r9
            java.lang.ref.WeakReference<com.google.android.gms.internal.ads.ajf> r4 = r1.f40662e
            java.lang.Object r4 = r4.get()
            com.google.android.gms.internal.ads.ajf r4 = (com.google.android.gms.internal.ads.ajf) r4
            if (r4 == 0) goto L_0x011d
            r4.mo28990a(r11, r2)
        L_0x011d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r12)
            java.lang.String r5 = "Cache connection took "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = "ms"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.google.android.gms.internal.ads.abv.m32494a(r2)
            throw r0
        L_0x0137:
            r2 = 0
            if (r3 == 0) goto L_0x0146
            long r7 = r0.f42788c
            r3.f46309c = r7
            com.google.android.gms.internal.ads.bxh r2 = com.google.android.gms.ads.internal.C14963ax.m30836f()
            com.google.android.gms.internal.ads.zzwo r2 = r2.mo30845a(r3)
        L_0x0146:
            if (r2 == 0) goto L_0x0155
            boolean r4 = r2.mo31638a()
            if (r4 == 0) goto L_0x0155
            java.io.InputStream r0 = r2.mo31639b()
            r1.f40658a = r0
            return r5
        L_0x0155:
            if (r3 == 0) goto L_0x0170
            com.google.android.gms.internal.ads.bkn r2 = new com.google.android.gms.internal.ads.bkn
            java.lang.String r3 = r3.f46307a
            android.net.Uri r8 = android.net.Uri.parse(r3)
            long r9 = r0.f42787b
            long r11 = r0.f42788c
            long r13 = r0.f42789d
            java.lang.String r15 = r0.f42790e
            int r0 = r0.f42791f
            r7 = r2
            r16 = r0
            r7.<init>(r8, r9, r11, r13, r15, r16)
            r0 = r2
        L_0x0170:
            com.google.android.gms.internal.ads.bkm r2 = r1.f40661d
            long r2 = r2.mo29003a(r0)
            return r2
        L_0x0177:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Attempt to open an already open CacheDataSource."
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aje.mo29003a(com.google.android.gms.internal.ads.bkn):long");
    }

    /* renamed from: a */
    public final int mo29002a(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f40659b) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        } else if (this.f40658a != null) {
            return this.f40658a.read(bArr, i, i2);
        } else {
            return this.f40661d.mo29002a(bArr, i, i2);
        }
    }
}
