package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.oh */
public final class C16128oh implements C16116nw {

    /* renamed from: a */
    final long f45348a;

    /* renamed from: b */
    final long f45349b;

    /* renamed from: c */
    final Object f45350c = new Object();

    /* renamed from: d */
    boolean f45351d = false;

    /* renamed from: e */
    private final zzaxe f45352e;

    /* renamed from: f */
    private final C16134on f45353f;

    /* renamed from: g */
    private final Context f45354g;

    /* renamed from: h */
    private final C16118ny f45355h;

    /* renamed from: i */
    private final boolean f45356i;

    /* renamed from: j */
    private final int f45357j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final Map<aga<C16125oe>, C16122ob> f45358k = new HashMap();

    /* renamed from: l */
    private final boolean f45359l;

    /* renamed from: m */
    private final String f45360m;

    /* renamed from: n */
    private List<C16125oe> f45361n = new ArrayList();

    /* renamed from: o */
    private final boolean f45362o;

    public C16128oh(Context context, zzaxe zzaxe, C16134on onVar, C16118ny nyVar, boolean z, boolean z2, String str, long j, long j2, int i, boolean z3) {
        this.f45354g = context;
        this.f45352e = zzaxe;
        this.f45353f = onVar;
        this.f45355h = nyVar;
        this.f45356i = z;
        this.f45359l = z2;
        this.f45360m = str;
        this.f45348a = j;
        this.f45349b = j2;
        this.f45357j = 2;
        this.f45362o = z3;
    }

    /* renamed from: a */
    public final C16125oe mo31196a(List<C16117nx> list) {
        abv.m32792b("Starting mediation.");
        ArrayList arrayList = new ArrayList();
        zzyz zzyz = this.f45352e.f46133d;
        int[] iArr = new int[2];
        if (zzyz.f46344g != null && C16127og.m38186a(this.f45360m, iArr)) {
            int i = 0;
            int i2 = iArr[0];
            int i3 = iArr[1];
            zzyz[] zzyzArr = zzyz.f46344g;
            int length = zzyzArr.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                zzyz zzyz2 = zzyzArr[i];
                if (i2 == zzyz2.f46342e && i3 == zzyz2.f46339b) {
                    zzyz = zzyz2;
                    break;
                }
                i++;
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C16117nx nxVar = (C16117nx) it.next();
            String str = "Trying mediation network: ";
            String valueOf = String.valueOf(nxVar.f45272b);
            abv.m32796d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            Iterator it2 = nxVar.f45273c.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                Context context = this.f45354g;
                C16134on onVar = this.f45353f;
                C16118ny nyVar = this.f45355h;
                zzyv zzyv = this.f45352e.f46132c;
                zzbgz zzbgz = this.f45352e.f46140k;
                boolean z = this.f45356i;
                boolean z2 = this.f45359l;
                zzafl zzafl = this.f45352e.f46154y;
                Iterator it3 = it;
                List<String> list2 = this.f45352e.f46143n;
                Iterator it4 = it2;
                ArrayList arrayList2 = arrayList;
                boolean z3 = z;
                C16117nx nxVar2 = nxVar;
                zzyz zzyz3 = zzyz;
                zzbgz zzbgz2 = zzbgz;
                C16122ob obVar = new C16122ob(context, str2, onVar, nyVar, nxVar2, zzyv, zzyz3, zzbgz2, z3, z2, zzafl, list2, this.f45352e.f46155z, this.f45352e.f46120X, this.f45362o);
                aga a = acb.m32567a((Callable<T>) new C16129oi<T>(this, obVar));
                this.f45358k.put(a, obVar);
                ArrayList arrayList3 = arrayList2;
                arrayList3.add(a);
                arrayList = arrayList3;
                it = it3;
                it2 = it4;
            }
        }
        ArrayList arrayList4 = arrayList;
        if (this.f45357j != 2) {
            return m38189b(arrayList4);
        }
        return m38190c(arrayList4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        if (r4.hasNext() == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        r0 = (com.google.android.gms.internal.ads.aga) r4.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r1 = (com.google.android.gms.internal.ads.C16125oe) r0.get();
        r3.f45361n.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        if (r1 == null) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
        if (r1.f45341a != 0) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0031, code lost:
        m38188a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0035, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0036, code lost:
        com.google.android.gms.internal.ads.abv.m32795c("Exception while processing an adapter; continuing with other adapters", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003c, code lost:
        m38188a(null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
        return new com.google.android.gms.internal.ads.C16125oe(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        r4 = r4.iterator();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.ads.C16125oe m38189b(java.util.List<com.google.android.gms.internal.ads.aga<com.google.android.gms.internal.ads.C16125oe>> r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f45350c
            monitor-enter(r0)
            boolean r1 = r3.f45351d     // Catch:{ all -> 0x0047 }
            if (r1 == 0) goto L_0x000f
            com.google.android.gms.internal.ads.oe r4 = new com.google.android.gms.internal.ads.oe     // Catch:{ all -> 0x0047 }
            r1 = -1
            r4.<init>(r1)     // Catch:{ all -> 0x0047 }
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            return r4
        L_0x000f:
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            java.util.Iterator r4 = r4.iterator()
        L_0x0014:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x003c
            java.lang.Object r0 = r4.next()
            com.google.android.gms.internal.ads.aga r0 = (com.google.android.gms.internal.ads.aga) r0
            java.lang.Object r1 = r0.get()     // Catch:{ InterruptedException | ExecutionException -> 0x0035 }
            com.google.android.gms.internal.ads.oe r1 = (com.google.android.gms.internal.ads.C16125oe) r1     // Catch:{ InterruptedException | ExecutionException -> 0x0035 }
            java.util.List<com.google.android.gms.internal.ads.oe> r2 = r3.f45361n     // Catch:{ InterruptedException | ExecutionException -> 0x0035 }
            r2.add(r1)     // Catch:{ InterruptedException | ExecutionException -> 0x0035 }
            if (r1 == 0) goto L_0x0014
            int r2 = r1.f45341a     // Catch:{ InterruptedException | ExecutionException -> 0x0035 }
            if (r2 != 0) goto L_0x0014
            r3.m38188a(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0035 }
            return r1
        L_0x0035:
            r0 = move-exception
            java.lang.String r1 = "Exception while processing an adapter; continuing with other adapters"
            com.google.android.gms.internal.ads.abv.m32795c(r1, r0)
            goto L_0x0014
        L_0x003c:
            r4 = 0
            r3.m38188a(r4)
            com.google.android.gms.internal.ads.oe r4 = new com.google.android.gms.internal.ads.oe
            r0 = 1
            r4.<init>(r0)
            return r4
        L_0x0047:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C16128oh.m38189b(java.util.List):com.google.android.gms.internal.ads.oe");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        if (r13.f45355h.f45307n == -1) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        r0 = r13.f45355h.f45307n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        r0 = 10000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        r14 = r14.iterator();
        r3 = null;
        r1 = r0;
        r0 = null;
        r4 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        if (r14.hasNext() == false) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        r5 = (com.google.android.gms.internal.ads.aga) r14.next();
        r6 = com.google.android.gms.ads.internal.C14963ax.m30837g().mo28523a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (r1 != 0) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
        if (r5.isDone() == false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        r10 = (com.google.android.gms.internal.ads.C16125oe) r5.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0052, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0054, code lost:
        r10 = (com.google.android.gms.internal.ads.C16125oe) r5.get(r1, java.util.concurrent.TimeUnit.MILLISECONDS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005c, code lost:
        r13.f45361n.add(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0061, code lost:
        if (r10 == null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0065, code lost:
        if (r10.f45341a != 0) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0067, code lost:
        r11 = r10.f45346f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0069, code lost:
        if (r11 == null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006f, code lost:
        if (r11.mo31230a() <= r4) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0075, code lost:
        r3 = r5;
        r0 = r10;
        r4 = r11.mo31230a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0078, code lost:
        r1 = java.lang.Math.max(r1 - (com.google.android.gms.ads.internal.C14963ax.m30837g().mo28523a() - r6), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        com.google.android.gms.internal.ads.abv.m32795c("Exception while processing an adapter; continuing with other adapters", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008c, code lost:
        r1 = java.lang.Math.max(r1 - (com.google.android.gms.ads.internal.C14963ax.m30837g().mo28523a() - r6), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009b, code lost:
        java.lang.Math.max(r1 - (com.google.android.gms.ads.internal.C14963ax.m30837g().mo28523a() - r6), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a8, code lost:
        throw r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a9, code lost:
        m38188a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ac, code lost:
        if (r0 != null) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b4, code lost:
        return new com.google.android.gms.internal.ads.C16125oe(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b5, code lost:
        return r0;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.ads.C16125oe m38190c(java.util.List<com.google.android.gms.internal.ads.aga<com.google.android.gms.internal.ads.C16125oe>> r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f45350c
            monitor-enter(r0)
            boolean r1 = r13.f45351d     // Catch:{ all -> 0x00b6 }
            r2 = -1
            if (r1 == 0) goto L_0x000f
            com.google.android.gms.internal.ads.oe r14 = new com.google.android.gms.internal.ads.oe     // Catch:{ all -> 0x00b6 }
            r14.<init>(r2)     // Catch:{ all -> 0x00b6 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b6 }
            return r14
        L_0x000f:
            monitor-exit(r0)     // Catch:{ all -> 0x00b6 }
            com.google.android.gms.internal.ads.ny r0 = r13.f45355h
            long r0 = r0.f45307n
            r3 = -1
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x001f
            com.google.android.gms.internal.ads.ny r0 = r13.f45355h
            long r0 = r0.f45307n
            goto L_0x0021
        L_0x001f:
            r0 = 10000(0x2710, double:4.9407E-320)
        L_0x0021:
            java.util.Iterator r14 = r14.iterator()
            r3 = 0
            r1 = r0
            r0 = r3
            r4 = -1
        L_0x0029:
            boolean r5 = r14.hasNext()
            if (r5 == 0) goto L_0x00a9
            java.lang.Object r5 = r14.next()
            com.google.android.gms.internal.ads.aga r5 = (com.google.android.gms.internal.ads.aga) r5
            com.google.android.gms.common.util.e r6 = com.google.android.gms.ads.internal.C14963ax.m30837g()
            long r6 = r6.mo28523a()
            r8 = 0
            int r10 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x0054
            boolean r10 = r5.isDone()     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
            if (r10 == 0) goto L_0x0054
            java.lang.Object r10 = r5.get()     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
            com.google.android.gms.internal.ads.oe r10 = (com.google.android.gms.internal.ads.C16125oe) r10     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
            goto L_0x005c
        L_0x0050:
            r14 = move-exception
            goto L_0x009b
        L_0x0052:
            r5 = move-exception
            goto L_0x0087
        L_0x0054:
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
            java.lang.Object r10 = r5.get(r1, r10)     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
            com.google.android.gms.internal.ads.oe r10 = (com.google.android.gms.internal.ads.C16125oe) r10     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
        L_0x005c:
            java.util.List<com.google.android.gms.internal.ads.oe> r11 = r13.f45361n     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
            r11.add(r10)     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
            if (r10 == 0) goto L_0x0078
            int r11 = r10.f45341a     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
            if (r11 != 0) goto L_0x0078
            com.google.android.gms.internal.ads.ox r11 = r10.f45346f     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
            if (r11 == 0) goto L_0x0078
            int r12 = r11.mo31230a()     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
            if (r12 <= r4) goto L_0x0078
            int r11 = r11.mo31230a()     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
            r3 = r5
            r0 = r10
            r4 = r11
        L_0x0078:
            com.google.android.gms.common.util.e r5 = com.google.android.gms.ads.internal.C14963ax.m30837g()
            long r10 = r5.mo28523a()
            long r10 = r10 - r6
            long r1 = r1 - r10
            long r1 = java.lang.Math.max(r1, r8)
            goto L_0x0029
        L_0x0087:
            java.lang.String r10 = "Exception while processing an adapter; continuing with other adapters"
            com.google.android.gms.internal.ads.abv.m32795c(r10, r5)     // Catch:{ all -> 0x0050 }
            com.google.android.gms.common.util.e r5 = com.google.android.gms.ads.internal.C14963ax.m30837g()
            long r10 = r5.mo28523a()
            long r10 = r10 - r6
            long r1 = r1 - r10
            long r1 = java.lang.Math.max(r1, r8)
            goto L_0x0029
        L_0x009b:
            com.google.android.gms.common.util.e r0 = com.google.android.gms.ads.internal.C14963ax.m30837g()
            long r3 = r0.mo28523a()
            long r3 = r3 - r6
            long r1 = r1 - r3
            java.lang.Math.max(r1, r8)
            throw r14
        L_0x00a9:
            r13.m38188a(r3)
            if (r0 != 0) goto L_0x00b5
            com.google.android.gms.internal.ads.oe r14 = new com.google.android.gms.internal.ads.oe
            r0 = 1
            r14.<init>(r0)
            return r14
        L_0x00b5:
            return r0
        L_0x00b6:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b6 }
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C16128oh.m38190c(java.util.List):com.google.android.gms.internal.ads.oe");
    }

    /* renamed from: a */
    private final void m38188a(aga<C16125oe> aga) {
        acd.f40245a.post(new C16130oj(this, aga));
    }

    /* renamed from: a */
    public final void mo31197a() {
        synchronized (this.f45350c) {
            this.f45351d = true;
            for (C16122ob a : this.f45358k.values()) {
                a.mo31223a();
            }
        }
    }

    /* renamed from: b */
    public final List<C16125oe> mo31198b() {
        return this.f45361n;
    }
}
