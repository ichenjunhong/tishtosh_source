package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.stats.C15497a;
import com.google.android.gms.internal.p1044e.C16483a;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: com.google.firebase.iid.g */
final class C17923g implements ServiceConnection {

    /* renamed from: a */
    int f49782a;

    /* renamed from: b */
    final Messenger f49783b;

    /* renamed from: c */
    C17928l f49784c;

    /* renamed from: d */
    final Queue<C17930n<?>> f49785d;

    /* renamed from: e */
    final SparseArray<C17930n<?>> f49786e;

    /* renamed from: f */
    final /* synthetic */ C17921e f49787f;

    private C17923g(C17921e eVar) {
        this.f49787f = eVar;
        this.f49783b = new Messenger(new C16483a(Looper.getMainLooper(), new C17924h(this)));
        this.f49785d = new ArrayDeque();
        this.f49786e = new SparseArray<>();
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0064, code lost:
        return true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo34768a(com.google.firebase.iid.C17930n r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f49782a     // Catch:{ all -> 0x007e }
            r1 = 0
            r2 = 1
            switch(r0) {
                case 0: goto L_0x001e;
                case 1: goto L_0x0017;
                case 2: goto L_0x000d;
                case 3: goto L_0x000b;
                case 4: goto L_0x000b;
                default: goto L_0x0008;
            }     // Catch:{ all -> 0x007e }
        L_0x0008:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ all -> 0x007e }
            goto L_0x0065
        L_0x000b:
            monitor-exit(r5)
            return r1
        L_0x000d:
            java.util.Queue<com.google.firebase.iid.n<?>> r0 = r5.f49785d     // Catch:{ all -> 0x007e }
            r0.add(r6)     // Catch:{ all -> 0x007e }
            r5.m43933c()     // Catch:{ all -> 0x007e }
            monitor-exit(r5)
            return r2
        L_0x0017:
            java.util.Queue<com.google.firebase.iid.n<?>> r0 = r5.f49785d     // Catch:{ all -> 0x007e }
            r0.add(r6)     // Catch:{ all -> 0x007e }
            monitor-exit(r5)
            return r2
        L_0x001e:
            java.util.Queue<com.google.firebase.iid.n<?>> r0 = r5.f49785d     // Catch:{ all -> 0x007e }
            r0.add(r6)     // Catch:{ all -> 0x007e }
            int r6 = r5.f49782a     // Catch:{ all -> 0x007e }
            if (r6 != 0) goto L_0x0029
            r6 = 1
            goto L_0x002a
        L_0x0029:
            r6 = 0
        L_0x002a:
            com.google.android.gms.common.internal.C15464q.m32129a(r6)     // Catch:{ all -> 0x007e }
            r5.f49782a = r2     // Catch:{ all -> 0x007e }
            android.content.Intent r6 = new android.content.Intent     // Catch:{ all -> 0x007e }
            java.lang.String r0 = "com.google.android.c2dm.intent.REGISTER"
            r6.<init>(r0)     // Catch:{ all -> 0x007e }
            java.lang.String r0 = "com.google.android.gms"
            r6.setPackage(r0)     // Catch:{ all -> 0x007e }
            com.google.android.gms.common.stats.a r0 = com.google.android.gms.common.stats.C15497a.m32246a()     // Catch:{ all -> 0x007e }
            com.google.firebase.iid.e r3 = r5.f49787f     // Catch:{ all -> 0x007e }
            android.content.Context r3 = r3.f49778b     // Catch:{ all -> 0x007e }
            boolean r6 = r0.mo28515a(r3, r6, r5, r2)     // Catch:{ all -> 0x007e }
            if (r6 != 0) goto L_0x0051
            java.lang.String r6 = "Unable to bind to service"
            r5.mo34766a(r1, r6)     // Catch:{ all -> 0x007e }
            goto L_0x0063
        L_0x0051:
            com.google.firebase.iid.e r6 = r5.f49787f     // Catch:{ all -> 0x007e }
            java.util.concurrent.ScheduledExecutorService r6 = r6.f49779c     // Catch:{ all -> 0x007e }
            com.google.firebase.iid.i r0 = new com.google.firebase.iid.i     // Catch:{ all -> 0x007e }
            r0.<init>(r5)     // Catch:{ all -> 0x007e }
            r3 = 30
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x007e }
            r6.schedule(r0, r3, r1)     // Catch:{ all -> 0x007e }
        L_0x0063:
            monitor-exit(r5)
            return r2
        L_0x0065:
            int r0 = r5.f49782a     // Catch:{ all -> 0x007e }
            r1 = 26
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x007e }
            r2.<init>(r1)     // Catch:{ all -> 0x007e }
            java.lang.String r1 = "Unknown state: "
            r2.append(r1)     // Catch:{ all -> 0x007e }
            r2.append(r0)     // Catch:{ all -> 0x007e }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x007e }
            r6.<init>(r0)     // Catch:{ all -> 0x007e }
            throw r6     // Catch:{ all -> 0x007e }
        L_0x007e:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C17923g.mo34768a(com.google.firebase.iid.n):boolean");
    }

    /* JADX INFO: used method not loaded: com.google.firebase.iid.n.a(com.google.firebase.iid.o):null, types can be incorrect */
    /* JADX INFO: used method not loaded: com.google.firebase.iid.n.a(android.os.Bundle):null, types can be incorrect */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (r5.getBoolean("unsupported", false) == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        r1.mo34778a(new com.google.firebase.iid.C17931o(4, "Not supported by GmsCore"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
        r1.mo34776a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        r5 = r5.getData();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo34767a(android.os.Message r5) {
        /*
            r4 = this;
            int r0 = r5.arg1
            monitor-enter(r4)
            android.util.SparseArray<com.google.firebase.iid.n<?>> r1 = r4.f49786e     // Catch:{ all -> 0x0036 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0036 }
            com.google.firebase.iid.n r1 = (com.google.firebase.iid.C17930n) r1     // Catch:{ all -> 0x0036 }
            r2 = 1
            if (r1 != 0) goto L_0x0010
            monitor-exit(r4)     // Catch:{ all -> 0x0036 }
            return r2
        L_0x0010:
            android.util.SparseArray<com.google.firebase.iid.n<?>> r3 = r4.f49786e     // Catch:{ all -> 0x0036 }
            r3.remove(r0)     // Catch:{ all -> 0x0036 }
            r4.mo34764a()     // Catch:{ all -> 0x0036 }
            monitor-exit(r4)     // Catch:{ all -> 0x0036 }
            android.os.Bundle r5 = r5.getData()
            java.lang.String r0 = "unsupported"
            r3 = 0
            boolean r0 = r5.getBoolean(r0, r3)
            if (r0 == 0) goto L_0x0032
            com.google.firebase.iid.o r5 = new com.google.firebase.iid.o
            r0 = 4
            java.lang.String r3 = "Not supported by GmsCore"
            r5.<init>(r0, r3)
            r1.mo34778a(r5)
            goto L_0x0035
        L_0x0032:
            r1.mo34776a(r5)
        L_0x0035:
            return r2
        L_0x0036:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0036 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C17923g.mo34767a(android.os.Message):boolean");
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            mo34766a(0, "Null service connection");
            return;
        }
        try {
            this.f49784c = new C17928l(iBinder);
            this.f49782a = 2;
            m43933c();
        } catch (RemoteException e) {
            mo34766a(0, e.getMessage());
        }
    }

    /* renamed from: c */
    private final void m43933c() {
        this.f49787f.f49779c.execute(new C17926j(this));
    }

    public final synchronized void onServiceDisconnected(ComponentName componentName) {
        mo34766a(2, "Service disconnected");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo34766a(int i, String str) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String str2 = "Disconnected: ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                new String(str2);
            }
        }
        switch (this.f49782a) {
            case 0:
                throw new IllegalStateException();
            case 1:
            case 2:
                this.f49782a = 4;
                C15497a.m32246a();
                C15497a.m32247a(this.f49787f.f49778b, this);
                C17931o oVar = new C17931o(i, str);
                for (C17930n a : this.f49785d) {
                    a.mo34778a(oVar);
                }
                this.f49785d.clear();
                for (int i2 = 0; i2 < this.f49786e.size(); i2++) {
                    ((C17930n) this.f49786e.valueAt(i2)).mo34778a(oVar);
                }
                this.f49786e.clear();
                return;
            case 3:
                this.f49782a = 4;
                return;
            case 4:
                return;
            default:
                int i3 = this.f49782a;
                StringBuilder sb = new StringBuilder(26);
                sb.append("Unknown state: ");
                sb.append(i3);
                throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo34764a() {
        if (this.f49782a == 2 && this.f49785d.isEmpty() && this.f49786e.size() == 0) {
            this.f49782a = 3;
            C15497a.m32246a();
            C15497a.m32247a(this.f49787f.f49778b, this);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final synchronized void mo34769b() {
        if (this.f49782a == 1) {
            mo34766a(1, "Timed out while binding");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo34765a(int i) {
        C17930n nVar = (C17930n) this.f49786e.get(i);
        if (nVar != null) {
            this.f49786e.remove(i);
            nVar.mo34778a(new C17931o(3, "Timed out waiting for response"));
            mo34764a();
        }
    }
}
