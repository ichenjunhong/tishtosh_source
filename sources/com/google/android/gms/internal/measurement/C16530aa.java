package com.google.android.gms.internal.measurement;

import android.content.ComponentName;
import android.content.ServiceConnection;
import com.google.android.gms.common.internal.C15464q;

/* renamed from: com.google.android.gms.internal.measurement.aa */
public final class C16530aa implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C16867y f46447a;

    /* renamed from: b */
    private volatile C16565bi f46448b;

    /* renamed from: c */
    private volatile boolean f46449c;

    protected C16530aa(C16867y yVar) {
        this.f46447a = yVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:9|10|11|12|13|(1:15)) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0073, code lost:
        return r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x005c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.C16565bi mo31758a() {
        /*
            r6 = this;
            com.google.android.gms.analytics.C15098l.m31266b()
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.google.android.gms.analytics.service.START"
            r0.<init>(r1)
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.String r2 = "com.google.android.gms"
            java.lang.String r3 = "com.google.android.gms.analytics.service.AnalyticsService"
            r1.<init>(r2, r3)
            r0.setComponent(r1)
            com.google.android.gms.internal.measurement.y r1 = r6.f46447a
            android.content.Context r1 = r1.mo32506g()
            java.lang.String r2 = "app_package_name"
            java.lang.String r3 = r1.getPackageName()
            r0.putExtra(r2, r3)
            com.google.android.gms.common.stats.a r2 = com.google.android.gms.common.stats.C15497a.m32246a()
            monitor-enter(r6)
            r3 = 0
            r6.f46448b = r3     // Catch:{ all -> 0x0074 }
            r4 = 1
            r6.f46449c = r4     // Catch:{ all -> 0x0074 }
            com.google.android.gms.internal.measurement.y r4 = r6.f46447a     // Catch:{ all -> 0x0074 }
            com.google.android.gms.internal.measurement.aa r4 = r4.f47583a     // Catch:{ all -> 0x0074 }
            r5 = 129(0x81, float:1.81E-43)
            boolean r0 = r2.mo28515a(r1, r0, r4, r5)     // Catch:{ all -> 0x0074 }
            com.google.android.gms.internal.measurement.y r1 = r6.f46447a     // Catch:{ all -> 0x0074 }
            java.lang.String r2 = "Bind to service requested"
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0074 }
            r1.mo32490a(r2, r4)     // Catch:{ all -> 0x0074 }
            r1 = 0
            if (r0 != 0) goto L_0x004e
            r6.f46449c = r1     // Catch:{ all -> 0x0074 }
            monitor-exit(r6)     // Catch:{ all -> 0x0074 }
            return r3
        L_0x004e:
            com.google.android.gms.internal.measurement.bd<java.lang.Long> r0 = com.google.android.gms.internal.measurement.C16559bc.f46504B     // Catch:{ InterruptedException -> 0x005c }
            V r0 = r0.f46547a     // Catch:{ InterruptedException -> 0x005c }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ InterruptedException -> 0x005c }
            long r4 = r0.longValue()     // Catch:{ InterruptedException -> 0x005c }
            r6.wait(r4)     // Catch:{ InterruptedException -> 0x005c }
            goto L_0x0063
        L_0x005c:
            com.google.android.gms.internal.measurement.y r0 = r6.f46447a     // Catch:{ all -> 0x0074 }
            java.lang.String r2 = "Wait for service connect was interrupted"
            r0.mo32503e(r2)     // Catch:{ all -> 0x0074 }
        L_0x0063:
            r6.f46449c = r1     // Catch:{ all -> 0x0074 }
            com.google.android.gms.internal.measurement.bi r0 = r6.f46448b     // Catch:{ all -> 0x0074 }
            r6.f46448b = r3     // Catch:{ all -> 0x0074 }
            if (r0 != 0) goto L_0x0072
            com.google.android.gms.internal.measurement.y r1 = r6.f46447a     // Catch:{ all -> 0x0074 }
            java.lang.String r2 = "Successfully bound to service but never got onServiceConnected callback"
            r1.mo32505f(r2)     // Catch:{ all -> 0x0074 }
        L_0x0072:
            monitor-exit(r6)     // Catch:{ all -> 0x0074 }
            return r0
        L_0x0074:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0074 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16530aa.mo31758a():com.google.android.gms.internal.measurement.bi");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:23|24) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:10|11|12|(2:(1:15)(3:16|(1:18)(1:20)|19)|21)(1:22)|(2:26|27)(3:28|29|(1:31)(1:32))|33|34|35|36) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r2.f46447a.mo32505f("Service connect failed to get IAnalyticsService");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0083 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r3, android.os.IBinder r4) {
        /*
            r2 = this;
            java.lang.String r3 = "AnalyticsServiceConnection.onServiceConnected"
            com.google.android.gms.common.internal.C15464q.m32132b(r3)
            monitor-enter(r2)
            if (r4 != 0) goto L_0x0017
            com.google.android.gms.internal.measurement.y r3 = r2.f46447a     // Catch:{ all -> 0x0014 }
            java.lang.String r4 = "Service connected with null binder"
            r3.mo32505f(r4)     // Catch:{ all -> 0x0014 }
            r2.notifyAll()     // Catch:{ all -> 0x008c }
            monitor-exit(r2)     // Catch:{ all -> 0x008c }
            return
        L_0x0014:
            r3 = move-exception
            goto L_0x0088
        L_0x0017:
            r3 = 0
            java.lang.String r0 = r4.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x004b }
            java.lang.String r1 = "com.google.android.gms.analytics.internal.IAnalyticsService"
            boolean r1 = r1.equals(r0)     // Catch:{ RemoteException -> 0x004b }
            if (r1 == 0) goto L_0x0043
            if (r4 != 0) goto L_0x0027
            goto L_0x003b
        L_0x0027:
            java.lang.String r0 = "com.google.android.gms.analytics.internal.IAnalyticsService"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)     // Catch:{ RemoteException -> 0x004b }
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C16565bi     // Catch:{ RemoteException -> 0x004b }
            if (r1 == 0) goto L_0x0035
            com.google.android.gms.internal.measurement.bi r0 = (com.google.android.gms.internal.measurement.C16565bi) r0     // Catch:{ RemoteException -> 0x004b }
        L_0x0033:
            r3 = r0
            goto L_0x003b
        L_0x0035:
            com.google.android.gms.internal.measurement.bj r0 = new com.google.android.gms.internal.measurement.bj     // Catch:{ RemoteException -> 0x004b }
            r0.<init>(r4)     // Catch:{ RemoteException -> 0x004b }
            goto L_0x0033
        L_0x003b:
            com.google.android.gms.internal.measurement.y r4 = r2.f46447a     // Catch:{ RemoteException -> 0x004b }
            java.lang.String r0 = "Bound to IAnalyticsService interface"
            r4.mo32493b(r0)     // Catch:{ RemoteException -> 0x004b }
            goto L_0x0052
        L_0x0043:
            com.google.android.gms.internal.measurement.y r4 = r2.f46447a     // Catch:{ RemoteException -> 0x004b }
            java.lang.String r1 = "Got binder with a wrong descriptor"
            r4.mo32501d(r1, r0)     // Catch:{ RemoteException -> 0x004b }
            goto L_0x0052
        L_0x004b:
            com.google.android.gms.internal.measurement.y r4 = r2.f46447a     // Catch:{ all -> 0x0014 }
            java.lang.String r0 = "Service connect failed to get IAnalyticsService"
            r4.mo32505f(r0)     // Catch:{ all -> 0x0014 }
        L_0x0052:
            if (r3 != 0) goto L_0x0067
            com.google.android.gms.common.stats.C15497a.m32246a()     // Catch:{ IllegalArgumentException -> 0x0083 }
            com.google.android.gms.internal.measurement.y r3 = r2.f46447a     // Catch:{ IllegalArgumentException -> 0x0083 }
            android.content.Context r3 = r3.mo32506g()     // Catch:{ IllegalArgumentException -> 0x0083 }
            com.google.android.gms.internal.measurement.y r4 = r2.f46447a     // Catch:{ IllegalArgumentException -> 0x0083 }
            com.google.android.gms.internal.measurement.aa r4 = r4.f47583a     // Catch:{ IllegalArgumentException -> 0x0083 }
            com.google.android.gms.common.stats.C15497a.m32247a(r3, r4)     // Catch:{ IllegalArgumentException -> 0x0083 }
            goto L_0x0083
        L_0x0067:
            boolean r4 = r2.f46449c     // Catch:{ all -> 0x0014 }
            if (r4 != 0) goto L_0x0081
            com.google.android.gms.internal.measurement.y r4 = r2.f46447a     // Catch:{ all -> 0x0014 }
            java.lang.String r0 = "onServiceConnected received after the timeout limit"
            r4.mo32503e(r0)     // Catch:{ all -> 0x0014 }
            com.google.android.gms.internal.measurement.y r4 = r2.f46447a     // Catch:{ all -> 0x0014 }
            com.google.android.gms.analytics.l r4 = r4.mo32509j()     // Catch:{ all -> 0x0014 }
            com.google.android.gms.internal.measurement.ab r0 = new com.google.android.gms.internal.measurement.ab     // Catch:{ all -> 0x0014 }
            r0.<init>(r2, r3)     // Catch:{ all -> 0x0014 }
            r4.mo27845a(r0)     // Catch:{ all -> 0x0014 }
            goto L_0x0083
        L_0x0081:
            r2.f46448b = r3     // Catch:{ all -> 0x0014 }
        L_0x0083:
            r2.notifyAll()     // Catch:{ all -> 0x008c }
            monitor-exit(r2)     // Catch:{ all -> 0x008c }
            return
        L_0x0088:
            r2.notifyAll()     // Catch:{ all -> 0x008c }
            throw r3     // Catch:{ all -> 0x008c }
        L_0x008c:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x008c }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16530aa.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C15464q.m32132b("AnalyticsServiceConnection.onServiceDisconnected");
        this.f46447a.mo32509j().mo27845a((Runnable) new C16532ac(this, componentName));
    }
}
