package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.android.gms.common.util.p1039a.C15508b;
import com.google.android.gms.p1033b.C15179g;
import com.google.android.gms.p1033b.C15180h;
import com.google.android.gms.p1033b.C15183j;
import com.google.firebase.C17844a;
import com.google.firebase.C17855b;
import com.google.firebase.p1072a.C17846b;
import com.google.firebase.p1072a.C17848d;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.lancet.p1151a.C18970b;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FirebaseInstanceId {

    /* renamed from: a */
    static C17942z f49695a;

    /* renamed from: g */
    private static final long f49696g = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: h */
    private static ScheduledThreadPoolExecutor f49697h;

    /* renamed from: b */
    final Executor f49698b;

    /* renamed from: c */
    public final C17855b f49699c;

    /* renamed from: d */
    public final C17933q f49700d;

    /* renamed from: e */
    C17916b f49701e;

    /* renamed from: f */
    final C17936t f49702f;

    /* renamed from: i */
    private final C17894ae f49703i;

    /* renamed from: j */
    private boolean f49704j;

    /* renamed from: k */
    private final C17886a f49705k;

    /* renamed from: com.google.firebase.iid.FirebaseInstanceId$a */
    class C17886a {

        /* renamed from: b */
        private final boolean f49707b = m43858c();

        /* renamed from: c */
        private final C17848d f49708c;

        /* renamed from: d */
        private C17846b<C17844a> f49709d;

        /* renamed from: e */
        private Boolean f49710e = m43857b();

        C17886a(C17848d dVar) {
            this.f49708c = dVar;
            if (this.f49710e == null && this.f49707b) {
                this.f49709d = new C17908as(this);
                dVar.mo34668a(C17844a.class, this.f49709d);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final synchronized boolean mo34724a() {
            if (this.f49710e == null) {
                return this.f49707b && FirebaseInstanceId.this.f49699c.mo34682d();
            }
            return this.f49710e.booleanValue();
        }

        /* renamed from: b */
        private final Boolean m43857b() {
            ApplicationInfo applicationInfo;
            Context a = FirebaseInstanceId.this.f49699c.mo34679a();
            SharedPreferences a2 = C35807d.m80935a(a, "com.google.firebase.messaging", 0);
            if (a2.contains("auto_init")) {
                return Boolean.valueOf(a2.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = a.getPackageManager();
                if (packageManager != null) {
                    String packageName = a.getPackageName();
                    if (TextUtils.equals(packageName, C11010c.m22280a().getPackageName())) {
                        if (C18970b.f52271a == null) {
                            C18970b.f52271a = packageManager.getApplicationInfo(packageName, 128);
                        }
                        applicationInfo = C18970b.f52271a;
                    } else {
                        applicationInfo = packageManager.getApplicationInfo(packageName, 128);
                    }
                    if (!(applicationInfo == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_messaging_auto_init_enabled"))) {
                        return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
                    }
                }
            } catch (NameNotFoundException unused) {
            }
            return null;
        }

        /* renamed from: c */
        private final boolean m43858c() {
            try {
                Class.forName("com.google.firebase.messaging.a");
                return true;
            } catch (ClassNotFoundException unused) {
                Context a = FirebaseInstanceId.this.f49699c.mo34679a();
                Intent intent = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent.setPackage(a.getPackageName());
                ResolveInfo resolveService = a.getPackageManager().resolveService(intent, 0);
                if (resolveService == null || resolveService.serviceInfo == null) {
                    return false;
                }
                return true;
            }
        }
    }

    /* renamed from: a */
    public static FirebaseInstanceId m43841a() {
        return getInstance(C17855b.m43787c());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final boolean mo34723h() {
        return true;
    }

    public static FirebaseInstanceId getInstance(C17855b bVar) {
        return (FirebaseInstanceId) bVar.mo34680a(FirebaseInstanceId.class);
    }

    FirebaseInstanceId(C17855b bVar, C17848d dVar) {
        this(bVar, new C17933q(bVar.mo34679a()), C17901al.m43885b(), C17901al.m43885b(), dVar);
    }

    private FirebaseInstanceId(C17855b bVar, C17933q qVar, Executor executor, Executor executor2, C17848d dVar) {
        if (C17933q.m43949a(bVar) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (f49695a == null) {
                    f49695a = new C17942z(bVar.mo34679a());
                }
            }
            this.f49699c = bVar;
            this.f49700d = qVar;
            if (this.f49701e == null) {
                C17916b bVar2 = (C17916b) bVar.mo34680a(C17916b.class);
                if (bVar2 == null || !bVar2.mo34753a()) {
                    this.f49701e = new C17909at(bVar, qVar, executor);
                } else {
                    this.f49701e = bVar2;
                }
            }
            this.f49701e = this.f49701e;
            this.f49698b = executor2;
            this.f49703i = new C17894ae(f49695a);
            this.f49705k = new C17886a(dVar);
            this.f49702f = new C17936t(executor);
            if (this.f49705k.mo34724a()) {
                mo34719b();
                return;
            }
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    /* renamed from: b */
    public final void mo34719b() {
        C17890aa e = mo34721e();
        if (!mo34723h() || e == null || e.mo34729b(this.f49700d.mo34783b()) || this.f49703i.mo34735a()) {
            mo34720c();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo34718a(boolean z) {
        this.f49704j = z;
    }

    /* renamed from: c */
    public final synchronized void mo34720c() {
        if (!this.f49704j) {
            mo34717a(0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo34717a(long j) {
        C17891ab abVar = new C17891ab(this, this.f49700d, this.f49703i, Math.min(Math.max(30, j << 1), f49696g));
        m43842a((Runnable) abVar, j);
        this.f49704j = true;
    }

    /* renamed from: a */
    static void m43842a(Runnable runnable, long j) {
        synchronized (FirebaseInstanceId.class) {
            if (f49697h == null) {
                f49697h = new ScheduledThreadPoolExecutor(1, new C15508b("FirebaseInstanceId"));
            }
            f49697h.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    /* renamed from: d */
    public static String m43845d() {
        return C17933q.m43950a(f49695a.mo34796b("").f49775a);
    }

    /* renamed from: a */
    public final C15179g<C17888a> mo34715a(String str, String str2) {
        String b = m43844b(str2);
        C15180h hVar = new C15180h();
        Executor executor = this.f49698b;
        C17905ap apVar = new C17905ap(this, str, str2, hVar, b);
        executor.execute(apVar);
        return hVar.f39202a;
    }

    /* renamed from: e */
    public final C17890aa mo34721e() {
        return m43843b(C17933q.m43949a(this.f49699c), "*");
    }

    /* renamed from: b */
    static C17890aa m43843b(String str, String str2) {
        return f49695a.mo34792a("", str, str2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <T> T mo34716a(C15179g<T> gVar) throws IOException {
        try {
            return C15183j.m31397a(gVar, 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    mo34722g();
                }
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e);
            }
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    /* renamed from: a */
    public final synchronized C15179g<Void> mo34714a(String str) {
        C15179g<Void> a;
        a = this.f49703i.mo34734a(str);
        mo34720c();
        return a;
    }

    /* renamed from: f */
    static boolean m43846f() {
        return Log.isLoggable("FirebaseInstanceId", 3) || (VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseInstanceId", 3));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final synchronized void mo34722g() {
        f49695a.mo34797b();
        if (this.f49705k.mo34724a()) {
            mo34720c();
        }
    }

    /* renamed from: b */
    private static String m43844b(String str) {
        return (str.isEmpty() || str.equalsIgnoreCase("fcm") || str.equalsIgnoreCase("gcm")) ? "*" : str;
    }
}
