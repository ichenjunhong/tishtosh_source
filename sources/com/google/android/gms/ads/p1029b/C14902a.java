package com.google.android.gms.ads.p1029b;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.SystemClock;
import com.google.android.gms.common.C15203a;
import com.google.android.gms.common.C15369c;
import com.google.android.gms.common.C15373d;
import com.google.android.gms.common.C15382e;
import com.google.android.gms.common.C15384g;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.stats.C15497a;
import com.google.android.gms.internal.p1040a.C15558c;
import com.google.android.gms.internal.p1040a.C15559d;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.ads.b.a */
public class C14902a {

    /* renamed from: a */
    private C15203a f38434a;

    /* renamed from: b */
    private C15558c f38435b;

    /* renamed from: c */
    private boolean f38436c;

    /* renamed from: d */
    private final Object f38437d;

    /* renamed from: e */
    private C14904b f38438e;

    /* renamed from: f */
    private final Context f38439f;

    /* renamed from: g */
    private final boolean f38440g;

    /* renamed from: h */
    private final long f38441h;

    /* renamed from: com.google.android.gms.ads.b.a$a */
    public static final class C14903a {

        /* renamed from: a */
        public final String f38442a;

        /* renamed from: b */
        public final boolean f38443b;

        public C14903a(String str, boolean z) {
            this.f38442a = str;
            this.f38443b = z;
        }

        public final String toString() {
            String str = this.f38442a;
            boolean z = this.f38443b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    /* renamed from: com.google.android.gms.ads.b.a$b */
    static class C14904b extends Thread {

        /* renamed from: a */
        CountDownLatch f38444a = new CountDownLatch(1);

        /* renamed from: b */
        boolean f38445b = false;

        /* renamed from: c */
        private WeakReference<C14902a> f38446c;

        /* renamed from: d */
        private long f38447d;

        public C14904b(C14902a aVar, long j) {
            this.f38446c = new WeakReference<>(aVar);
            this.f38447d = j;
            start();
        }

        /* renamed from: a */
        private final void m30586a() {
            C14902a aVar = (C14902a) this.f38446c.get();
            if (aVar != null) {
                aVar.mo27309c();
                this.f38445b = true;
            }
        }

        public final void run() {
            try {
                if (!this.f38444a.await(this.f38447d, TimeUnit.MILLISECONDS)) {
                    m30586a();
                }
            } catch (InterruptedException unused) {
                m30586a();
            }
        }
    }

    public C14902a(Context context) {
        this(context, 30000, false, false);
    }

    private C14902a(Context context, long j, boolean z, boolean z2) {
        this.f38437d = new Object();
        C15464q.m32123a(context);
        if (z) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
        }
        this.f38439f = context;
        this.f38436c = false;
        this.f38441h = j;
        this.f38440g = z2;
    }

    /* renamed from: a */
    public static C14903a m30575a(Context context) throws IOException, IllegalStateException, C15373d, C15382e {
        C14906c cVar = new C14906c(context);
        boolean a = cVar.mo27316a("gads:ad_id_app_context:enabled", false);
        float a2 = cVar.mo27314a("gads:ad_id_app_context:ping_ratio", 0.0f);
        String a3 = cVar.mo27315a("gads:ad_id_use_shared_preference:experiment_id", "");
        C14902a aVar = new C14902a(context, -1, a, cVar.mo27316a("gads:ad_id_use_persistent_service:enabled", false));
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aVar.m30578a(false);
            C14903a b = aVar.mo27308b();
            aVar.m30579a(b, a, a2, SystemClock.elapsedRealtime() - elapsedRealtime, a3, null);
            aVar.mo27309c();
            return b;
        } catch (Throwable th) {
            aVar.mo27309c();
            throw th;
        }
    }

    /* renamed from: a */
    private static C15203a m30576a(Context context, boolean z) throws IOException, C15373d, C15382e {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            int isGooglePlayServicesAvailable = C15369c.getInstance().isGooglePlayServicesAvailable(context, C15384g.f39685b);
            if (isGooglePlayServicesAvailable == 0 || isGooglePlayServicesAvailable == 2) {
                String str = z ? "com.google.android.gms.ads.identifier.service.PERSISTENT_START" : "com.google.android.gms.ads.identifier.service.START";
                C15203a aVar = new C15203a();
                Intent intent = new Intent(str);
                intent.setPackage("com.google.android.gms");
                try {
                    if (C15497a.m32246a().mo28515a(context, intent, aVar, 1)) {
                        return aVar;
                    }
                    throw new IOException("Connection failure");
                } catch (Throwable th) {
                    throw new IOException(th);
                }
            } else {
                throw new IOException("Google Play services not available");
            }
        } catch (NameNotFoundException unused) {
            throw new C15373d(9);
        }
    }

    /* renamed from: a */
    private final void m30578a(boolean z) throws IOException, IllegalStateException, C15373d, C15382e {
        C15464q.m32136c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f38436c) {
                mo27309c();
            }
            this.f38434a = m30576a(this.f38439f, this.f38440g);
            this.f38435b = m30577a(this.f38439f, this.f38434a);
            this.f38436c = true;
            if (z) {
                m30581d();
            }
        }
    }

    /* renamed from: a */
    private final boolean m30579a(C14903a aVar, boolean z, float f, long j, String str, Throwable th) {
        if (Math.random() > ((double) f)) {
            return false;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("app_context", z ? "1" : "0");
        if (aVar != null) {
            hashMap.put("limit_ad_tracking", aVar.f38443b ? "1" : "0");
        }
        if (!(aVar == null || aVar.f38442a == null)) {
            hashMap.put("ad_id_size", Integer.toString(aVar.f38442a.length()));
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        if (str != null && !str.isEmpty()) {
            hashMap.put("experiment_id", str);
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j));
        new C14905b(this, hashMap).start();
        return true;
    }

    /* renamed from: b */
    public static boolean m30580b(Context context) throws IOException, C15373d, C15382e {
        C14906c cVar = new C14906c(context);
        C14902a aVar = new C14902a(context, -1, cVar.mo27316a("gads:ad_id_app_context:enabled", false), cVar.mo27316a("com.google.android.gms.ads.identifier.service.PERSISTENT_START", false));
        try {
            aVar.m30578a(false);
            return aVar.m30582e();
        } finally {
            aVar.mo27309c();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|(3:5|6|7)|8|9|(1:11)|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0013 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001b  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m30581d() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f38437d
            monitor-enter(r0)
            com.google.android.gms.ads.b.a$b r1 = r6.f38438e     // Catch:{ all -> 0x0026 }
            if (r1 == 0) goto L_0x0013
            com.google.android.gms.ads.b.a$b r1 = r6.f38438e     // Catch:{ all -> 0x0026 }
            java.util.concurrent.CountDownLatch r1 = r1.f38444a     // Catch:{ all -> 0x0026 }
            r1.countDown()     // Catch:{ all -> 0x0026 }
            com.google.android.gms.ads.b.a$b r1 = r6.f38438e     // Catch:{ InterruptedException -> 0x0013 }
            r1.join()     // Catch:{ InterruptedException -> 0x0013 }
        L_0x0013:
            long r1 = r6.f38441h     // Catch:{ all -> 0x0026 }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0024
            com.google.android.gms.ads.b.a$b r1 = new com.google.android.gms.ads.b.a$b     // Catch:{ all -> 0x0026 }
            long r2 = r6.f38441h     // Catch:{ all -> 0x0026 }
            r1.<init>(r6, r2)     // Catch:{ all -> 0x0026 }
            r6.f38438e = r1     // Catch:{ all -> 0x0026 }
        L_0x0024:
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            return
        L_0x0026:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.p1029b.C14902a.m30581d():void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:39|40|41) */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0059, code lost:
        throw new java.io.IOException("Remote exception");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0052 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m30582e() throws java.io.IOException {
        /*
            r3 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            com.google.android.gms.common.internal.C15464q.m32136c(r0)
            monitor-enter(r3)
            boolean r0 = r3.f38436c     // Catch:{ all -> 0x005a }
            if (r0 != 0) goto L_0x003d
            java.lang.Object r0 = r3.f38437d     // Catch:{ all -> 0x005a }
            monitor-enter(r0)     // Catch:{ all -> 0x005a }
            com.google.android.gms.ads.b.a$b r1 = r3.f38438e     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x0032
            com.google.android.gms.ads.b.a$b r1 = r3.f38438e     // Catch:{ all -> 0x003a }
            boolean r1 = r1.f38445b     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x0032
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            r0 = 0
            r3.m30578a(r0)     // Catch:{ Exception -> 0x0029 }
            boolean r0 = r3.f38436c     // Catch:{ all -> 0x005a }
            if (r0 == 0) goto L_0x0021
            goto L_0x003d
        L_0x0021:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x005a }
            java.lang.String r1 = "AdvertisingIdClient cannot reconnect."
            r0.<init>(r1)     // Catch:{ all -> 0x005a }
            throw r0     // Catch:{ all -> 0x005a }
        L_0x0029:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x005a }
            java.lang.String r2 = "AdvertisingIdClient cannot reconnect."
            r1.<init>(r2, r0)     // Catch:{ all -> 0x005a }
            throw r1     // Catch:{ all -> 0x005a }
        L_0x0032:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x003a }
            java.lang.String r2 = "AdvertisingIdClient is not connected."
            r1.<init>(r2)     // Catch:{ all -> 0x003a }
            throw r1     // Catch:{ all -> 0x003a }
        L_0x003a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            throw r1     // Catch:{ all -> 0x005a }
        L_0x003d:
            com.google.android.gms.common.a r0 = r3.f38434a     // Catch:{ all -> 0x005a }
            com.google.android.gms.common.internal.C15464q.m32123a(r0)     // Catch:{ all -> 0x005a }
            com.google.android.gms.internal.a.c r0 = r3.f38435b     // Catch:{ all -> 0x005a }
            com.google.android.gms.common.internal.C15464q.m32123a(r0)     // Catch:{ all -> 0x005a }
            com.google.android.gms.internal.a.c r0 = r3.f38435b     // Catch:{ RemoteException -> 0x0052 }
            boolean r0 = r0.mo28547b()     // Catch:{ RemoteException -> 0x0052 }
            monitor-exit(r3)     // Catch:{ all -> 0x005a }
            r3.m30581d()
            return r0
        L_0x0052:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x005a }
            java.lang.String r1 = "Remote exception"
            r0.<init>(r1)     // Catch:{ all -> 0x005a }
            throw r0     // Catch:{ all -> 0x005a }
        L_0x005a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x005a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.p1029b.C14902a.m30582e():boolean");
    }

    /* renamed from: a */
    public final void mo27307a() throws IOException, IllegalStateException, C15373d, C15382e {
        m30578a(true);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:39|40|41) */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0065, code lost:
        throw new java.io.IOException("Remote exception");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x005e */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.p1029b.C14902a.C14903a mo27308b() throws java.io.IOException {
        /*
            r4 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            com.google.android.gms.common.internal.C15464q.m32136c(r0)
            monitor-enter(r4)
            boolean r0 = r4.f38436c     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x003d
            java.lang.Object r0 = r4.f38437d     // Catch:{ all -> 0x0066 }
            monitor-enter(r0)     // Catch:{ all -> 0x0066 }
            com.google.android.gms.ads.b.a$b r1 = r4.f38438e     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x0032
            com.google.android.gms.ads.b.a$b r1 = r4.f38438e     // Catch:{ all -> 0x003a }
            boolean r1 = r1.f38445b     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x0032
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            r0 = 0
            r4.m30578a(r0)     // Catch:{ Exception -> 0x0029 }
            boolean r0 = r4.f38436c     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x0021
            goto L_0x003d
        L_0x0021:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "AdvertisingIdClient cannot reconnect."
            r0.<init>(r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x0029:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0066 }
            java.lang.String r2 = "AdvertisingIdClient cannot reconnect."
            r1.<init>(r2, r0)     // Catch:{ all -> 0x0066 }
            throw r1     // Catch:{ all -> 0x0066 }
        L_0x0032:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x003a }
            java.lang.String r2 = "AdvertisingIdClient is not connected."
            r1.<init>(r2)     // Catch:{ all -> 0x003a }
            throw r1     // Catch:{ all -> 0x003a }
        L_0x003a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            throw r1     // Catch:{ all -> 0x0066 }
        L_0x003d:
            com.google.android.gms.common.a r0 = r4.f38434a     // Catch:{ all -> 0x0066 }
            com.google.android.gms.common.internal.C15464q.m32123a(r0)     // Catch:{ all -> 0x0066 }
            com.google.android.gms.internal.a.c r0 = r4.f38435b     // Catch:{ all -> 0x0066 }
            com.google.android.gms.common.internal.C15464q.m32123a(r0)     // Catch:{ all -> 0x0066 }
            com.google.android.gms.ads.b.a$a r0 = new com.google.android.gms.ads.b.a$a     // Catch:{ RemoteException -> 0x005e }
            com.google.android.gms.internal.a.c r1 = r4.f38435b     // Catch:{ RemoteException -> 0x005e }
            java.lang.String r1 = r1.mo28545a()     // Catch:{ RemoteException -> 0x005e }
            com.google.android.gms.internal.a.c r2 = r4.f38435b     // Catch:{ RemoteException -> 0x005e }
            r3 = 1
            boolean r2 = r2.mo28546a(r3)     // Catch:{ RemoteException -> 0x005e }
            r0.<init>(r1, r2)     // Catch:{ RemoteException -> 0x005e }
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            r4.m30581d()
            return r0
        L_0x005e:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "Remote exception"
            r0.<init>(r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.p1029b.C14902a.mo27308b():com.google.android.gms.ads.b.a$a");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0028, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo27309c() {
        /*
            r2 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            com.google.android.gms.common.internal.C15464q.m32136c(r0)
            monitor-enter(r2)
            android.content.Context r0 = r2.f38439f     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x0027
            com.google.android.gms.common.a r0 = r2.f38434a     // Catch:{ all -> 0x0029 }
            if (r0 != 0) goto L_0x000f
            goto L_0x0027
        L_0x000f:
            boolean r0 = r2.f38436c     // Catch:{ Throwable -> 0x001d }
            if (r0 == 0) goto L_0x001d
            com.google.android.gms.common.stats.C15497a.m32246a()     // Catch:{ Throwable -> 0x001d }
            android.content.Context r0 = r2.f38439f     // Catch:{ Throwable -> 0x001d }
            com.google.android.gms.common.a r1 = r2.f38434a     // Catch:{ Throwable -> 0x001d }
            com.google.android.gms.common.stats.C15497a.m32247a(r0, r1)     // Catch:{ Throwable -> 0x001d }
        L_0x001d:
            r0 = 0
            r2.f38436c = r0     // Catch:{ all -> 0x0029 }
            r0 = 0
            r2.f38435b = r0     // Catch:{ all -> 0x0029 }
            r2.f38434a = r0     // Catch:{ all -> 0x0029 }
            monitor-exit(r2)     // Catch:{ all -> 0x0029 }
            return
        L_0x0027:
            monitor-exit(r2)     // Catch:{ all -> 0x0029 }
            return
        L_0x0029:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0029 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.p1029b.C14902a.mo27309c():void");
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        mo27309c();
        super.finalize();
    }

    /* renamed from: a */
    private static C15558c m30577a(Context context, C15203a aVar) throws IOException {
        try {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            C15464q.m32136c("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
            if (!aVar.f39255a) {
                aVar.f39255a = true;
                IBinder iBinder = (IBinder) aVar.f39256b.poll(10000, timeUnit);
                if (iBinder == null) {
                    throw new TimeoutException("Timed out waiting for the service connection");
                } else if (iBinder == null) {
                    return null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    return queryLocalInterface instanceof C15558c ? (C15558c) queryLocalInterface : new C15559d(iBinder);
                }
            } else {
                throw new IllegalStateException("Cannot call get on this connection more than once");
            }
        } catch (InterruptedException unused) {
            throw new IOException("Interrupted exception");
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }
}
