package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Messenger;
import android.support.p030v4.p038f.C0800n;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.p1033b.C15179g;
import com.google.android.gms.p1033b.C15180h;
import com.google.android.gms.p1033b.C15183j;
import com.google.android.gms.p1033b.C15183j.C15184a;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.firebase.iid.w */
final class C17939w {

    /* renamed from: d */
    private static int f49811d;

    /* renamed from: e */
    private static PendingIntent f49812e;

    /* renamed from: a */
    final C0800n<String, C15180h<Bundle>> f49813a = new C0800n<>();

    /* renamed from: b */
    Messenger f49814b;

    /* renamed from: c */
    zzl f49815c;

    /* renamed from: f */
    private final Context f49816f;

    /* renamed from: g */
    private final C17933q f49817g;

    /* renamed from: h */
    private Messenger f49818h;

    public C17939w(Context context, C17933q qVar) {
        this.f49816f = context;
        this.f49817g = qVar;
        this.f49818h = new Messenger(new C17940x(this, Looper.getMainLooper()));
    }

    /* renamed from: a */
    private static synchronized void m43963a(Context context, Intent intent) {
        synchronized (C17939w.class) {
            if (f49812e == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f49812e = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", f49812e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo34789a(java.lang.String r3, android.os.Bundle r4) {
        /*
            r2 = this;
            android.support.v4.f.n<java.lang.String, com.google.android.gms.b.h<android.os.Bundle>> r0 = r2.f49813a
            monitor-enter(r0)
            android.support.v4.f.n<java.lang.String, com.google.android.gms.b.h<android.os.Bundle>> r1 = r2.f49813a     // Catch:{ all -> 0x0029 }
            java.lang.Object r1 = r1.remove(r3)     // Catch:{ all -> 0x0029 }
            com.google.android.gms.b.h r1 = (com.google.android.gms.p1033b.C15180h) r1     // Catch:{ all -> 0x0029 }
            if (r1 != 0) goto L_0x0024
            java.lang.String r4 = "Missing callback for "
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0029 }
            int r1 = r3.length()     // Catch:{ all -> 0x0029 }
            if (r1 == 0) goto L_0x001d
            r4.concat(r3)     // Catch:{ all -> 0x0029 }
            goto L_0x0022
        L_0x001d:
            java.lang.String r3 = new java.lang.String     // Catch:{ all -> 0x0029 }
            r3.<init>(r4)     // Catch:{ all -> 0x0029 }
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            return
        L_0x0024:
            r1.mo28005a(r4)     // Catch:{ all -> 0x0029 }
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            return
        L_0x0029:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C17939w.mo34789a(java.lang.String, android.os.Bundle):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Bundle mo34788a(Bundle bundle) throws IOException {
        Object obj;
        if (this.f49817g.mo34785d() < 12000000) {
            return m43964b(bundle);
        }
        C17921e a = C17921e.m43929a(this.f49816f);
        C15179g a2 = a.mo34763a((C17930n<T>) new C17932p<T>(a.mo34762a(), 1, bundle));
        try {
            C15464q.m32127a();
            C15464q.m32124a(a2, (Object) "Task must not be null");
            if (a2.mo27998a()) {
                obj = C15183j.m31396a(a2);
            } else {
                C15184a aVar = new C15184a(null);
                C15183j.m31398a(a2, aVar);
                aVar.f39206a.await();
                obj = C15183j.m31396a(a2);
            }
            return (Bundle) obj;
        } catch (InterruptedException | ExecutionException e) {
            if (!(e.getCause() instanceof C17931o) || ((C17931o) e.getCause()).getErrorCode() != 4) {
                return null;
            }
            return m43964b(bundle);
        }
    }

    /* renamed from: b */
    private final Bundle m43964b(Bundle bundle) throws IOException {
        Bundle c = m43965c(bundle);
        if (c == null || !c.containsKey("google.messenger")) {
            return c;
        }
        Bundle c2 = m43965c(bundle);
        if (c2 == null || !c2.containsKey("google.messenger")) {
            return c2;
        }
        return null;
    }

    /* renamed from: a */
    private static synchronized String m43962a() {
        String num;
        synchronized (C17939w.class) {
            int i = f49811d;
            f49811d = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bc A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.os.Bundle m43965c(android.os.Bundle r7) throws java.io.IOException {
        /*
            r6 = this;
            java.lang.String r0 = m43962a()
            com.google.android.gms.b.h r1 = new com.google.android.gms.b.h
            r1.<init>()
            android.support.v4.f.n<java.lang.String, com.google.android.gms.b.h<android.os.Bundle>> r2 = r6.f49813a
            monitor-enter(r2)
            android.support.v4.f.n<java.lang.String, com.google.android.gms.b.h<android.os.Bundle>> r3 = r6.f49813a     // Catch:{ all -> 0x00ec }
            r3.put(r0, r1)     // Catch:{ all -> 0x00ec }
            monitor-exit(r2)     // Catch:{ all -> 0x00ec }
            com.google.firebase.iid.q r2 = r6.f49817g
            int r2 = r2.mo34782a()
            if (r2 == 0) goto L_0x00e4
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r3 = "com.google.android.gms"
            r2.setPackage(r3)
            com.google.firebase.iid.q r3 = r6.f49817g
            int r3 = r3.mo34782a()
            r4 = 2
            if (r3 != r4) goto L_0x0033
            java.lang.String r3 = "com.google.iid.TOKEN_REQUEST"
            r2.setAction(r3)
            goto L_0x0038
        L_0x0033:
            java.lang.String r3 = "com.google.android.c2dm.intent.REGISTER"
            r2.setAction(r3)
        L_0x0038:
            r2.putExtras(r7)
            android.content.Context r7 = r6.f49816f
            m43963a(r7, r2)
            java.lang.String r7 = "kid"
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            int r3 = r3 + 5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
            java.lang.String r3 = "|ID|"
            r5.append(r3)
            r5.append(r0)
            java.lang.String r3 = "|"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r2.putExtra(r7, r3)
            java.lang.String r7 = "google.messenger"
            android.os.Messenger r3 = r6.f49818h
            r2.putExtra(r7, r3)
            android.os.Messenger r7 = r6.f49814b
            if (r7 != 0) goto L_0x0074
            com.google.firebase.iid.zzl r7 = r6.f49815c
            if (r7 == 0) goto L_0x008a
        L_0x0074:
            android.os.Message r7 = android.os.Message.obtain()
            r7.obj = r2
            android.os.Messenger r3 = r6.f49814b     // Catch:{ RemoteException -> 0x008a }
            if (r3 == 0) goto L_0x0084
            android.os.Messenger r3 = r6.f49814b     // Catch:{ RemoteException -> 0x008a }
            r3.send(r7)     // Catch:{ RemoteException -> 0x008a }
            goto L_0x00ad
        L_0x0084:
            com.google.firebase.iid.zzl r3 = r6.f49815c     // Catch:{ RemoteException -> 0x008a }
            r3.mo34802a(r7)     // Catch:{ RemoteException -> 0x008a }
            goto L_0x00ad
        L_0x008a:
            com.google.firebase.iid.q r7 = r6.f49817g
            int r7 = r7.mo34782a()
            if (r7 != r4) goto L_0x0098
            android.content.Context r7 = r6.f49816f
            r7.sendBroadcast(r2)
            goto L_0x00ad
        L_0x0098:
            android.content.Context r7 = r6.f49816f
            if (r7 == 0) goto L_0x00aa
            boolean r3 = r7 instanceof android.content.Context
            if (r3 == 0) goto L_0x00aa
            r3 = r7
            android.content.Context r3 = (android.content.Context) r3
            boolean r3 = com.p683ss.android.ugc.aweme.push.downgrade.C40895d.m90464a(r3, r2)
            if (r3 == 0) goto L_0x00aa
            goto L_0x00ad
        L_0x00aa:
            r7.startService(r2)
        L_0x00ad:
            com.google.android.gms.b.z<TResult> r7 = r1.f39202a     // Catch:{ InterruptedException | TimeoutException -> 0x00cf, ExecutionException -> 0x00c8 }
            r1 = 30000(0x7530, double:1.4822E-319)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException | TimeoutException -> 0x00cf, ExecutionException -> 0x00c8 }
            java.lang.Object r7 = com.google.android.gms.p1033b.C15183j.m31397a(r7, r1, r3)     // Catch:{ InterruptedException | TimeoutException -> 0x00cf, ExecutionException -> 0x00c8 }
            android.os.Bundle r7 = (android.os.Bundle) r7     // Catch:{ InterruptedException | TimeoutException -> 0x00cf, ExecutionException -> 0x00c8 }
            android.support.v4.f.n<java.lang.String, com.google.android.gms.b.h<android.os.Bundle>> r1 = r6.f49813a
            monitor-enter(r1)
            android.support.v4.f.n<java.lang.String, com.google.android.gms.b.h<android.os.Bundle>> r2 = r6.f49813a     // Catch:{ all -> 0x00c3 }
            r2.remove(r0)     // Catch:{ all -> 0x00c3 }
            monitor-exit(r1)     // Catch:{ all -> 0x00c3 }
            return r7
        L_0x00c3:
            r7 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00c3 }
            throw r7
        L_0x00c6:
            r7 = move-exception
            goto L_0x00d7
        L_0x00c8:
            r7 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x00c6 }
            r1.<init>(r7)     // Catch:{ all -> 0x00c6 }
            throw r1     // Catch:{ all -> 0x00c6 }
        L_0x00cf:
            java.io.IOException r7 = new java.io.IOException     // Catch:{ all -> 0x00c6 }
            java.lang.String r1 = "TIMEOUT"
            r7.<init>(r1)     // Catch:{ all -> 0x00c6 }
            throw r7     // Catch:{ all -> 0x00c6 }
        L_0x00d7:
            android.support.v4.f.n<java.lang.String, com.google.android.gms.b.h<android.os.Bundle>> r1 = r6.f49813a
            monitor-enter(r1)
            android.support.v4.f.n<java.lang.String, com.google.android.gms.b.h<android.os.Bundle>> r2 = r6.f49813a     // Catch:{ all -> 0x00e1 }
            r2.remove(r0)     // Catch:{ all -> 0x00e1 }
            monitor-exit(r1)     // Catch:{ all -> 0x00e1 }
            throw r7
        L_0x00e1:
            r7 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00e1 }
            throw r7
        L_0x00e4:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r0 = "MISSING_INSTANCEID_SERVICE"
            r7.<init>(r0)
            throw r7
        L_0x00ec:
            r7 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00ec }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C17939w.m43965c(android.os.Bundle):android.os.Bundle");
    }
}
