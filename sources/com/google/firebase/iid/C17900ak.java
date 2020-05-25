package com.google.firebase.iid;

import android.content.BroadcastReceiver.PendingResult;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.util.p1039a.C15508b;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: com.google.firebase.iid.ak */
public final class C17900ak implements ServiceConnection {

    /* renamed from: a */
    private final Context f49739a;

    /* renamed from: b */
    private final Intent f49740b;

    /* renamed from: c */
    private final ScheduledExecutorService f49741c;

    /* renamed from: d */
    private final Queue<C17896ag> f49742d;

    /* renamed from: e */
    private C17898ai f49743e;

    /* renamed from: f */
    private boolean f49744f;

    public C17900ak(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new C15508b("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    private C17900ak(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f49742d = new ArrayDeque();
        this.f49744f = false;
        this.f49739a = context.getApplicationContext();
        this.f49740b = new Intent(str).setPackage(this.f49739a.getPackageName());
        this.f49741c = scheduledExecutorService;
    }

    /* renamed from: a */
    public final synchronized void mo34741a(Intent intent, PendingResult pendingResult) {
        this.f49742d.add(new C17896ag(intent, pendingResult, this.f49741c));
        m43881a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0087, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m43881a() {
        /*
            r4 = this;
            monitor-enter(r4)
        L_0x0001:
            java.util.Queue<com.google.firebase.iid.ag> r0 = r4.f49742d     // Catch:{ all -> 0x008a }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x008a }
            if (r0 != 0) goto L_0x0088
            com.google.firebase.iid.ai r0 = r4.f49743e     // Catch:{ all -> 0x008a }
            if (r0 == 0) goto L_0x004c
            com.google.firebase.iid.ai r0 = r4.f49743e     // Catch:{ all -> 0x008a }
            boolean r0 = r0.isBinderAlive()     // Catch:{ all -> 0x008a }
            if (r0 == 0) goto L_0x004c
            java.util.Queue<com.google.firebase.iid.ag> r0 = r4.f49742d     // Catch:{ all -> 0x008a }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x008a }
            com.google.firebase.iid.ag r0 = (com.google.firebase.iid.C17896ag) r0     // Catch:{ all -> 0x008a }
            com.google.firebase.iid.ai r1 = r4.f49743e     // Catch:{ all -> 0x008a }
            int r2 = android.os.Binder.getCallingUid()     // Catch:{ all -> 0x008a }
            int r3 = android.os.Process.myUid()     // Catch:{ all -> 0x008a }
            if (r2 != r3) goto L_0x0044
            com.google.firebase.iid.zzb r2 = r1.f49736a     // Catch:{ all -> 0x008a }
            android.content.Intent r3 = r0.f49730a     // Catch:{ all -> 0x008a }
            boolean r2 = r2.zzc(r3)     // Catch:{ all -> 0x008a }
            if (r2 == 0) goto L_0x0037
            r0.mo34738a()     // Catch:{ all -> 0x008a }
            goto L_0x0001
        L_0x0037:
            com.google.firebase.iid.zzb r2 = r1.f49736a     // Catch:{ all -> 0x008a }
            java.util.concurrent.ExecutorService r2 = r2.zzi     // Catch:{ all -> 0x008a }
            com.google.firebase.iid.aj r3 = new com.google.firebase.iid.aj     // Catch:{ all -> 0x008a }
            r3.<init>(r1, r0)     // Catch:{ all -> 0x008a }
            r2.execute(r3)     // Catch:{ all -> 0x008a }
            goto L_0x0001
        L_0x0044:
            java.lang.SecurityException r0 = new java.lang.SecurityException     // Catch:{ all -> 0x008a }
            java.lang.String r1 = "Binding only allowed within app"
            r0.<init>(r1)     // Catch:{ all -> 0x008a }
            throw r0     // Catch:{ all -> 0x008a }
        L_0x004c:
            java.lang.String r0 = "EnhancedIntentService"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x008a }
            r1 = 1
            if (r0 == 0) goto L_0x0068
            boolean r0 = r4.f49744f     // Catch:{ all -> 0x008a }
            r0 = r0 ^ r1
            r2 = 39
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x008a }
            r3.<init>(r2)     // Catch:{ all -> 0x008a }
            java.lang.String r2 = "binder is dead. start connection? "
            r3.append(r2)     // Catch:{ all -> 0x008a }
            r3.append(r0)     // Catch:{ all -> 0x008a }
        L_0x0068:
            boolean r0 = r4.f49744f     // Catch:{ all -> 0x008a }
            if (r0 != 0) goto L_0x0086
            r4.f49744f = r1     // Catch:{ all -> 0x008a }
            com.google.android.gms.common.stats.a r0 = com.google.android.gms.common.stats.C15497a.m32246a()     // Catch:{ SecurityException -> 0x0080 }
            android.content.Context r1 = r4.f49739a     // Catch:{ SecurityException -> 0x0080 }
            android.content.Intent r2 = r4.f49740b     // Catch:{ SecurityException -> 0x0080 }
            r3 = 65
            boolean r0 = r0.mo28515a(r1, r2, r4, r3)     // Catch:{ SecurityException -> 0x0080 }
            if (r0 == 0) goto L_0x0080
            monitor-exit(r4)
            return
        L_0x0080:
            r0 = 0
            r4.f49744f = r0     // Catch:{ all -> 0x008a }
            r4.m43882b()     // Catch:{ all -> 0x008a }
        L_0x0086:
            monitor-exit(r4)
            return
        L_0x0088:
            monitor-exit(r4)
            return
        L_0x008a:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C17900ak.m43881a():void");
    }

    /* renamed from: b */
    private final void m43882b() {
        while (!this.f49742d.isEmpty()) {
            ((C17896ag) this.f49742d.poll()).mo34738a();
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this) {
            this.f49744f = false;
            this.f49743e = (C17898ai) iBinder;
            if (iBinder == null) {
                m43882b();
            } else {
                m43881a();
            }
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        m43881a();
    }
}
