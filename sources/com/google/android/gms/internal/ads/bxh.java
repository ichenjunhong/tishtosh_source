package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.C14963ax;
import com.google.android.gms.common.internal.C15428c.C15429a;
import com.google.android.gms.common.internal.C15428c.C15430b;

@C16299uq
public final class bxh {

    /* renamed from: a */
    public final Runnable f44511a = new bxi(this);

    /* renamed from: b */
    public final Object f44512b = new Object();
    /* access modifiers changed from: 0000 */

    /* renamed from: c */
    public bxn f44513c;

    /* renamed from: d */
    private Context f44514d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public bxq f44515e;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo30847a(android.content.Context r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.Object r0 = r2.f44512b
            monitor-enter(r0)
            android.content.Context r1 = r2.f44514d     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x000c:
            android.content.Context r3 = r3.getApplicationContext()     // Catch:{ all -> 0x0048 }
            r2.f44514d = r3     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.C15740bx.f44355cj     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.bu r1 = com.google.android.gms.internal.ads.caf.m37099d()     // Catch:{ all -> 0x0048 }
            java.lang.Object r3 = r1.mo30717a(r3)     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0048 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0028
            r2.mo30846a()     // Catch:{ all -> 0x0048 }
            goto L_0x0046
        L_0x0028:
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.C15740bx.f44354ci     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.bu r1 = com.google.android.gms.internal.ads.caf.m37099d()     // Catch:{ all -> 0x0048 }
            java.lang.Object r3 = r1.mo30717a(r3)     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0048 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0046
            com.google.android.gms.internal.ads.bxj r3 = new com.google.android.gms.internal.ads.bxj     // Catch:{ all -> 0x0048 }
            r3.<init>(r2)     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.ads.bwk r1 = com.google.android.gms.ads.internal.C14963ax.m30833c()     // Catch:{ all -> 0x0048 }
            r1.mo30816a(r3)     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x0048:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bxh.mo30847a(android.content.Context):void");
    }

    /* renamed from: a */
    public final zzwo mo30845a(zzwr zzwr) {
        synchronized (this.f44512b) {
            if (this.f44515e == null) {
                zzwo zzwo = new zzwo();
                return zzwo;
            }
            try {
                zzwo a = this.f44515e.mo30854a(zzwr);
                return a;
            } catch (RemoteException e) {
                abv.m32793b("Unable to call into cache service.", e);
                return new zzwo();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo30846a() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f44512b
            monitor-enter(r0)
            android.content.Context r1 = r3.f44514d     // Catch:{ all -> 0x0025 }
            if (r1 == 0) goto L_0x0023
            com.google.android.gms.internal.ads.bxn r1 = r3.f44513c     // Catch:{ all -> 0x0025 }
            if (r1 == 0) goto L_0x000c
            goto L_0x0023
        L_0x000c:
            com.google.android.gms.internal.ads.bxk r1 = new com.google.android.gms.internal.ads.bxk     // Catch:{ all -> 0x0025 }
            r1.<init>(r3)     // Catch:{ all -> 0x0025 }
            com.google.android.gms.internal.ads.bxl r2 = new com.google.android.gms.internal.ads.bxl     // Catch:{ all -> 0x0025 }
            r2.<init>(r3)     // Catch:{ all -> 0x0025 }
            com.google.android.gms.internal.ads.bxn r1 = r3.m36951a(r1, r2)     // Catch:{ all -> 0x0025 }
            r3.f44513c = r1     // Catch:{ all -> 0x0025 }
            com.google.android.gms.internal.ads.bxn r1 = r3.f44513c     // Catch:{ all -> 0x0025 }
            r1.mo28409l()     // Catch:{ all -> 0x0025 }
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            return
        L_0x0023:
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            return
        L_0x0025:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bxh.mo30846a():void");
    }

    /* renamed from: a */
    private final synchronized bxn m36951a(C15429a aVar, C15430b bVar) {
        return new bxn(this.f44514d, C14963ax.m30844n().mo28747a(), aVar, bVar);
    }

    /* renamed from: a */
    static /* synthetic */ void m36953a(bxh bxh) {
        synchronized (bxh.f44512b) {
            if (bxh.f44513c != null) {
                if (bxh.f44513c.mo28404g() || bxh.f44513c.mo28405h()) {
                    bxh.f44513c.mo28403f();
                }
                bxh.f44513c = null;
                bxh.f44515e = null;
                Binder.flushPendingCommands();
            }
        }
    }
}
