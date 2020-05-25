package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.C15521l;
import java.io.IOException;
import java.io.InputStream;

@C16299uq
public final class ajw implements bsr {

    /* renamed from: a */
    private InputStream f40728a;

    /* renamed from: b */
    private boolean f40729b;

    /* renamed from: c */
    private final Context f40730c;

    /* renamed from: d */
    private final bsr f40731d;

    /* renamed from: e */
    private final bth<bsr> f40732e;

    /* renamed from: f */
    private final ajx f40733f;

    /* renamed from: g */
    private Uri f40734g;

    public ajw(Context context, bsr bsr, bth<bsr> bth, ajx ajx) {
        this.f40730c = context;
        this.f40731d = bsr;
        this.f40732e = bth;
        this.f40733f = ajx;
    }

    /* renamed from: b */
    public final void mo29030b() throws IOException {
        if (this.f40729b) {
            this.f40729b = false;
            this.f40734g = null;
            if (this.f40728a != null) {
                C15521l.m32290a(this.f40728a);
                this.f40728a = null;
                return;
            }
            this.f40731d.mo29030b();
            return;
        }
        throw new IOException("Attempt to close an already closed CacheDataSource.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x009c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r4.cancel(true);
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r4.cancel(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d3, code lost:
        r4 = com.google.android.gms.ads.internal.C14963ax.m30837g().mo28524b() - r9;
        r1.f40733f.mo29038a(false, r4);
        r2 = new java.lang.StringBuilder(44);
        r2.append("Cache connection took ");
        r2.append(r4);
        r2.append("ms");
        com.google.android.gms.internal.ads.abv.m32494a(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00fb, code lost:
        r2 = com.google.android.gms.ads.internal.C14963ax.m30837g().mo28524b() - r9;
        r1.f40733f.mo29038a(false, r2);
        r4 = new java.lang.StringBuilder(44);
        r4.append("Cache connection took ");
        r4.append(r2);
        r4.append("ms");
        com.google.android.gms.internal.ads.abv.m32494a(r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0122, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:18:0x009e, B:21:0x00d0] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x009e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x00d0 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:21:0x00d0=Splitter:B:21:0x00d0, B:18:0x009e=Splitter:B:18:0x009e} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo29027a(com.google.android.gms.internal.ads.bsu r19) throws java.io.IOException {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            boolean r2 = r1.f40729b
            if (r2 != 0) goto L_0x0167
            r2 = 1
            r1.f40729b = r2
            android.net.Uri r3 = r0.f43789a
            r1.f40734g = r3
            com.google.android.gms.internal.ads.bth<com.google.android.gms.internal.ads.bsr> r3 = r1.f40732e
            if (r3 == 0) goto L_0x0018
            com.google.android.gms.internal.ads.bth<com.google.android.gms.internal.ads.bsr> r3 = r1.f40732e
            r3.mo29055a(r1, r0)
        L_0x0018:
            android.net.Uri r3 = r0.f43789a
            com.google.android.gms.internal.ads.zzwr r3 = com.google.android.gms.internal.ads.zzwr.m39298a(r3)
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.C15740bx.f44359cn
            com.google.android.gms.internal.ads.bu r5 = com.google.android.gms.internal.ads.caf.m37099d()
            java.lang.Object r4 = r5.mo30717a(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r5 = -1
            if (r4 == 0) goto L_0x0123
            if (r3 == 0) goto L_0x0141
            long r7 = r0.f43792d
            r3.f46309c = r7
            boolean r4 = r3.f46308b
            if (r4 == 0) goto L_0x0049
            com.google.android.gms.internal.ads.bl<java.lang.Long> r4 = com.google.android.gms.internal.ads.C15740bx.f44361cp
            com.google.android.gms.internal.ads.bu r7 = com.google.android.gms.internal.ads.caf.m37099d()
            java.lang.Object r4 = r7.mo30717a(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            goto L_0x0055
        L_0x0049:
            com.google.android.gms.internal.ads.bl<java.lang.Long> r4 = com.google.android.gms.internal.ads.C15740bx.f44360co
            com.google.android.gms.internal.ads.bu r7 = com.google.android.gms.internal.ads.caf.m37099d()
            java.lang.Object r4 = r7.mo30717a(r4)
            java.lang.Long r4 = (java.lang.Long) r4
        L_0x0055:
            long r7 = r4.longValue()
            com.google.android.gms.common.util.e r4 = com.google.android.gms.ads.internal.C14963ax.m30837g()
            long r9 = r4.mo28524b()
            android.content.Context r4 = r1.f40730c
            java.util.concurrent.Future r4 = com.google.android.gms.internal.ads.byb.m36978a(r4, r3)
            r11 = 0
            r12 = 44
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException | TimeoutException -> 0x00d0, InterruptedException -> 0x009e }
            java.lang.Object r7 = r4.get(r7, r13)     // Catch:{ ExecutionException | TimeoutException -> 0x00d0, InterruptedException -> 0x009e }
            java.io.InputStream r7 = (java.io.InputStream) r7     // Catch:{ ExecutionException | TimeoutException -> 0x00d0, InterruptedException -> 0x009e }
            r1.f40728a = r7     // Catch:{ ExecutionException | TimeoutException -> 0x00d0, InterruptedException -> 0x009e }
            com.google.android.gms.common.util.e r0 = com.google.android.gms.ads.internal.C14963ax.m30837g()
            long r3 = r0.mo28524b()
            long r3 = r3 - r9
            com.google.android.gms.internal.ads.ajx r0 = r1.f40733f
            r0.mo29038a(r2, r3)
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
        L_0x009c:
            r0 = move-exception
            goto L_0x00fb
        L_0x009e:
            r4.cancel(r2)     // Catch:{ all -> 0x009c }
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x009c }
            r2.interrupt()     // Catch:{ all -> 0x009c }
            com.google.android.gms.common.util.e r2 = com.google.android.gms.ads.internal.C14963ax.m30837g()
            long r4 = r2.mo28524b()
            long r4 = r4 - r9
            com.google.android.gms.internal.ads.ajx r2 = r1.f40733f
            r2.mo29038a(r11, r4)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r12)
            java.lang.String r6 = "Cache connection took "
            r2.append(r6)
            r2.append(r4)
            java.lang.String r4 = "ms"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.google.android.gms.internal.ads.abv.m32494a(r2)
            goto L_0x0141
        L_0x00d0:
            r4.cancel(r2)     // Catch:{ all -> 0x009c }
            com.google.android.gms.common.util.e r2 = com.google.android.gms.ads.internal.C14963ax.m30837g()
            long r4 = r2.mo28524b()
            long r4 = r4 - r9
            com.google.android.gms.internal.ads.ajx r2 = r1.f40733f
            r2.mo29038a(r11, r4)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r12)
            java.lang.String r6 = "Cache connection took "
            r2.append(r6)
            r2.append(r4)
            java.lang.String r4 = "ms"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.google.android.gms.internal.ads.abv.m32494a(r2)
            goto L_0x0141
        L_0x00fb:
            com.google.android.gms.common.util.e r2 = com.google.android.gms.ads.internal.C14963ax.m30837g()
            long r2 = r2.mo28524b()
            long r2 = r2 - r9
            com.google.android.gms.internal.ads.ajx r4 = r1.f40733f
            r4.mo29038a(r11, r2)
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
        L_0x0123:
            r2 = 0
            if (r3 == 0) goto L_0x0132
            long r7 = r0.f43792d
            r3.f46309c = r7
            com.google.android.gms.internal.ads.bxh r2 = com.google.android.gms.ads.internal.C14963ax.m30836f()
            com.google.android.gms.internal.ads.zzwo r2 = r2.mo30845a(r3)
        L_0x0132:
            if (r2 == 0) goto L_0x0141
            boolean r4 = r2.mo31638a()
            if (r4 == 0) goto L_0x0141
            java.io.InputStream r0 = r2.mo31639b()
            r1.f40728a = r0
            return r5
        L_0x0141:
            if (r3 == 0) goto L_0x0160
            com.google.android.gms.internal.ads.bsu r2 = new com.google.android.gms.internal.ads.bsu
            java.lang.String r3 = r3.f46307a
            android.net.Uri r8 = android.net.Uri.parse(r3)
            byte[] r9 = r0.f43790b
            long r10 = r0.f43791c
            long r12 = r0.f43792d
            long r14 = r0.f43793e
            java.lang.String r3 = r0.f43794f
            int r0 = r0.f43795g
            r7 = r2
            r16 = r3
            r17 = r0
            r7.<init>(r8, r9, r10, r12, r14, r16, r17)
            r0 = r2
        L_0x0160:
            com.google.android.gms.internal.ads.bsr r2 = r1.f40731d
            long r2 = r2.mo29027a(r0)
            return r2
        L_0x0167:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Attempt to open an already open CacheDataSource."
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ajw.mo29027a(com.google.android.gms.internal.ads.bsu):long");
    }

    /* renamed from: a */
    public final int mo29026a(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (this.f40729b) {
            if (this.f40728a != null) {
                i3 = this.f40728a.read(bArr, i, i2);
            } else {
                i3 = this.f40731d.mo29026a(bArr, i, i2);
            }
            if (this.f40732e != null) {
                this.f40732e.mo29054a(this, i3);
            }
            return i3;
        }
        throw new IOException("Attempt to read closed CacheDataSource.");
    }

    /* renamed from: a */
    public final Uri mo29028a() {
        return this.f40734g;
    }
}
