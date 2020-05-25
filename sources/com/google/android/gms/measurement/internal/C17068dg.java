package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C15428c.C15429a;
import com.google.android.gms.common.internal.C15428c.C15430b;
import com.google.android.gms.common.internal.C15464q;

/* renamed from: com.google.android.gms.measurement.internal.dg */
public final class C17068dg implements ServiceConnection, C15429a, C15430b {
    /* access modifiers changed from: 0000 */

    /* renamed from: a */
    public volatile boolean f48188a;

    /* renamed from: b */
    volatile C17132q f48189b;

    /* renamed from: c */
    final /* synthetic */ C17055cu f48190c;

    protected C17068dg(C17055cu cuVar) {
        this.f48190c = cuVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r3.f48190c.mo32854q().f48445b.mo33376a("Service connect failed to get IMeasurementService");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x005d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            java.lang.String r4 = "MeasurementServiceConnection.onServiceConnected"
            com.google.android.gms.common.internal.C15464q.m32132b(r4)
            monitor-enter(r3)
            r4 = 0
            if (r5 != 0) goto L_0x001d
            r3.f48188a = r4     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.cu r4 = r3.f48190c     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.r r4 = r4.mo32854q()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.t r4 = r4.f48445b     // Catch:{ all -> 0x001a }
            java.lang.String r5 = "Service connected with null binder"
            r4.mo33376a(r5)     // Catch:{ all -> 0x001a }
            monitor-exit(r3)     // Catch:{ all -> 0x001a }
            return
        L_0x001a:
            r4 = move-exception
            goto L_0x0091
        L_0x001d:
            r0 = 0
            java.lang.String r1 = r5.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x005d }
            java.lang.String r2 = "com.google.android.gms.measurement.internal.IMeasurementService"
            boolean r2 = r2.equals(r1)     // Catch:{ RemoteException -> 0x005d }
            if (r2 == 0) goto L_0x004f
            if (r5 != 0) goto L_0x002d
            goto L_0x0041
        L_0x002d:
            java.lang.String r1 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x005d }
            boolean r2 = r1 instanceof com.google.android.gms.measurement.internal.C17124i     // Catch:{ RemoteException -> 0x005d }
            if (r2 == 0) goto L_0x003b
            com.google.android.gms.measurement.internal.i r1 = (com.google.android.gms.measurement.internal.C17124i) r1     // Catch:{ RemoteException -> 0x005d }
        L_0x0039:
            r0 = r1
            goto L_0x0041
        L_0x003b:
            com.google.android.gms.measurement.internal.k r1 = new com.google.android.gms.measurement.internal.k     // Catch:{ RemoteException -> 0x005d }
            r1.<init>(r5)     // Catch:{ RemoteException -> 0x005d }
            goto L_0x0039
        L_0x0041:
            com.google.android.gms.measurement.internal.cu r5 = r3.f48190c     // Catch:{ RemoteException -> 0x005d }
            com.google.android.gms.measurement.internal.r r5 = r5.mo32854q()     // Catch:{ RemoteException -> 0x005d }
            com.google.android.gms.measurement.internal.t r5 = r5.f48453j     // Catch:{ RemoteException -> 0x005d }
            java.lang.String r1 = "Bound to IMeasurementService interface"
            r5.mo33376a(r1)     // Catch:{ RemoteException -> 0x005d }
            goto L_0x006a
        L_0x004f:
            com.google.android.gms.measurement.internal.cu r5 = r3.f48190c     // Catch:{ RemoteException -> 0x005d }
            com.google.android.gms.measurement.internal.r r5 = r5.mo32854q()     // Catch:{ RemoteException -> 0x005d }
            com.google.android.gms.measurement.internal.t r5 = r5.f48445b     // Catch:{ RemoteException -> 0x005d }
            java.lang.String r2 = "Got binder with a wrong descriptor"
            r5.mo33377a(r2, r1)     // Catch:{ RemoteException -> 0x005d }
            goto L_0x006a
        L_0x005d:
            com.google.android.gms.measurement.internal.cu r5 = r3.f48190c     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.r r5 = r5.mo32854q()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.t r5 = r5.f48445b     // Catch:{ all -> 0x001a }
            java.lang.String r1 = "Service connect failed to get IMeasurementService"
            r5.mo33376a(r1)     // Catch:{ all -> 0x001a }
        L_0x006a:
            if (r0 != 0) goto L_0x0081
            r3.f48188a = r4     // Catch:{ all -> 0x001a }
            com.google.android.gms.common.stats.C15497a.m32246a()     // Catch:{ IllegalArgumentException -> 0x008f }
            com.google.android.gms.measurement.internal.cu r4 = r3.f48190c     // Catch:{ IllegalArgumentException -> 0x008f }
            android.content.Context r4 = r4.mo32850m()     // Catch:{ IllegalArgumentException -> 0x008f }
            com.google.android.gms.measurement.internal.cu r5 = r3.f48190c     // Catch:{ IllegalArgumentException -> 0x008f }
            com.google.android.gms.measurement.internal.dg r5 = r5.f48133c     // Catch:{ IllegalArgumentException -> 0x008f }
            com.google.android.gms.common.stats.C15497a.m32247a(r4, r5)     // Catch:{ IllegalArgumentException -> 0x008f }
            goto L_0x008f
        L_0x0081:
            com.google.android.gms.measurement.internal.cu r4 = r3.f48190c     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.at r4 = r4.mo32853p()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.dh r5 = new com.google.android.gms.measurement.internal.dh     // Catch:{ all -> 0x001a }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x001a }
            r4.mo32912a(r5)     // Catch:{ all -> 0x001a }
        L_0x008f:
            monitor-exit(r3)     // Catch:{ all -> 0x001a }
            return
        L_0x0091:
            monitor-exit(r3)     // Catch:{ all -> 0x001a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C17068dg.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C15464q.m32132b("MeasurementServiceConnection.onServiceDisconnected");
        this.f48190c.mo32854q().f48452i.mo33376a("Service disconnected");
        this.f48190c.mo32853p().mo32912a((Runnable) new C17070di(this, componentName));
    }

    /* renamed from: a */
    public final void mo28417a(Bundle bundle) {
        C15464q.m32132b("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                this.f48190c.mo32853p().mo32912a((Runnable) new C17071dj(this, (C17124i) this.f48189b.mo28413p()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f48189b = null;
                this.f48188a = false;
            }
        }
    }

    /* renamed from: a */
    public final void mo28416a(int i) {
        C15464q.m32132b("MeasurementServiceConnection.onConnectionSuspended");
        this.f48190c.mo32854q().f48452i.mo33376a("Service connection suspended");
        this.f48190c.mo32853p().mo32912a((Runnable) new C17072dk(this));
    }

    /* renamed from: a */
    public final void mo28418a(ConnectionResult connectionResult) {
        C15464q.m32132b("MeasurementServiceConnection.onConnectionFailed");
        C17005ay ayVar = this.f48190c.f48052r;
        C17133r rVar = (ayVar.f47967f == null || !ayVar.f47967f.mo32979v()) ? null : ayVar.f47967f;
        if (rVar != null) {
            rVar.f48448e.mo33377a("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.f48188a = false;
            this.f48189b = null;
        }
        this.f48190c.mo32853p().mo32912a((Runnable) new C17073dl(this));
    }
}
