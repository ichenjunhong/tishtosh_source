package com.p683ss.android.message;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.os.Build.VERSION;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.C9415i;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.p683ss.android.message.C19450b.C19451a;
import com.p683ss.android.message.p1186a.p1187a.C19409a;
import com.p683ss.android.message.p1186a.p1187a.C19411c;
import com.p683ss.android.message.p1186a.p1187a.C19412d;
import com.p683ss.android.message.p1186a.p1187a.C19412d.C19415a;
import com.p683ss.android.message.p1191b.C19456b;
import com.p683ss.android.pushmanager.p1204a.C19667d;
import com.p683ss.android.pushmanager.setting.C19709a;
import com.p683ss.android.pushmanager.setting.C19710b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.message.NotifyService */
public class NotifyService extends Service implements C9382a {

    /* renamed from: f */
    static volatile int f53603f = 0;

    /* renamed from: p */
    private static volatile boolean f53604p = false;

    /* renamed from: q */
    private static volatile String f53605q = "";

    /* renamed from: r */
    private static volatile boolean f53606r = true;

    /* renamed from: s */
    private static volatile boolean f53607s = false;

    /* renamed from: t */
    private static volatile String f53608t = "";

    /* renamed from: u */
    private static volatile boolean f53609u = true;

    /* renamed from: a */
    public C19479g f53610a;

    /* renamed from: b */
    public C9381g f53611b = new C9381g(Looper.getMainLooper(), this);

    /* renamed from: c */
    boolean f53612c = false;

    /* renamed from: d */
    C19412d f53613d = null;

    /* renamed from: e */
    public Map<Long, C19409a> f53614e = new HashMap();

    /* renamed from: g */
    boolean f53615g = true;

    /* renamed from: h */
    ContentObserver f53616h = new ContentObserver(this.f53611b) {
        public final void onChange(boolean z) {
            C19710b.m48173a();
            NotifyService notifyService = NotifyService.this;
            long c = (long) C19667d.m48045a().mo41018b().mo41049c();
            boolean k = C19710b.m48173a().mo41102k();
            if (k != NotifyService.f53603f) {
                NotifyService.f53603f = k ? 1 : 0;
                if (notifyService.f53614e != null) {
                    C19411c cVar = (C19411c) notifyService.f53614e.get(Long.valueOf(c));
                    if (cVar != null) {
                        cVar.f53656f = k;
                        notifyService.f53614e.put(Long.valueOf(c), cVar);
                        notifyService.mo40470a();
                    }
                }
            }
            notifyService.mo40472b();
        }
    };

    /* renamed from: i */
    ContentObserver f53617i = new ContentObserver(this.f53611b) {
        public final void onChange(boolean z) {
            C19710b.m48173a();
            NotifyService.this.mo40473c();
        }
    };

    /* renamed from: j */
    ContentObserver f53618j = new ContentObserver(this.f53611b) {
        public final void onChange(boolean z) {
            C19710b.m48173a();
            NotifyService.m47484d();
        }
    };

    /* renamed from: k */
    ContentObserver f53619k = new ContentObserver(this.f53611b) {
        public final void onChange(boolean z) {
            NotifyService.this.mo40474e();
        }
    };

    /* renamed from: l */
    ContentObserver f53620l = new ContentObserver(this.f53611b) {
        public final void onChange(boolean z) {
            NotifyService.this.f53610a.mo40619c();
        }
    };

    /* renamed from: m */
    ContentObserver f53621m = new ContentObserver(this.f53611b) {
        public final void onChange(boolean z) {
            NotifyService.this.mo40475f();
        }
    };

    /* renamed from: n */
    ContentObserver f53622n = new ContentObserver(this.f53611b) {
        public final void onChange(boolean z) {
            C19710b.m48173a();
            NotifyService.m47485g();
            NotifyService.this.f53610a.mo40619c();
        }
    };

    /* renamed from: o */
    ContentObserver f53623o = new ContentObserver(this.f53611b) {
        public final void onChange(boolean z) {
            C19710b.m48173a();
            NotifyService.this.mo40476h();
        }
    };

    /* renamed from: v */
    private C19451a f53624v = new C19451a() {
        /* renamed from: b */
        public final void mo40483b(C19472c cVar) {
        }

        /* renamed from: a */
        public final void mo40482a(final C19472c cVar) {
            NotifyService.this.f53611b.post(new Runnable() {
                /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
                /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x006c */
                /* JADX WARNING: Removed duplicated region for block: B:14:0x0072 A[Catch:{ Exception -> 0x0076 }] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r7 = this;
                        com.ss.android.message.NotifyService$1 r0 = com.p683ss.android.message.NotifyService.C193931.this     // Catch:{ Exception -> 0x0076 }
                        com.ss.android.message.c r1 = r3     // Catch:{ Exception -> 0x0076 }
                        if (r1 == 0) goto L_0x0075
                        long r2 = r1.mo40604c()     // Catch:{ Exception | NullPointerException -> 0x006c }
                        com.ss.android.message.NotifyService r4 = com.p683ss.android.message.NotifyService.this     // Catch:{ Exception | NullPointerException -> 0x006c }
                        java.util.Map<java.lang.Long, com.ss.android.message.a.a.a> r4 = r4.f53614e     // Catch:{ Exception | NullPointerException -> 0x006c }
                        if (r4 == 0) goto L_0x002d
                        com.ss.android.message.NotifyService r4 = com.p683ss.android.message.NotifyService.this     // Catch:{ Exception | NullPointerException -> 0x006c }
                        java.util.Map<java.lang.Long, com.ss.android.message.a.a.a> r4 = r4.f53614e     // Catch:{ Exception | NullPointerException -> 0x006c }
                        java.lang.Long r5 = java.lang.Long.valueOf(r2)     // Catch:{ Exception | NullPointerException -> 0x006c }
                        boolean r4 = r4.containsKey(r5)     // Catch:{ Exception | NullPointerException -> 0x006c }
                        if (r4 == 0) goto L_0x002d
                        com.ss.android.message.NotifyService r4 = com.p683ss.android.message.NotifyService.this     // Catch:{ Exception | NullPointerException -> 0x006c }
                        java.util.Map<java.lang.Long, com.ss.android.message.a.a.a> r4 = r4.f53614e     // Catch:{ Exception | NullPointerException -> 0x006c }
                        java.lang.Long r5 = java.lang.Long.valueOf(r2)     // Catch:{ Exception | NullPointerException -> 0x006c }
                        java.lang.Object r4 = r4.get(r5)     // Catch:{ Exception | NullPointerException -> 0x006c }
                        com.ss.android.message.a.a.c r4 = (com.p683ss.android.message.p1186a.p1187a.C19411c) r4     // Catch:{ Exception | NullPointerException -> 0x006c }
                        goto L_0x0032
                    L_0x002d:
                        com.ss.android.message.a.a.c r4 = new com.ss.android.message.a.a.c     // Catch:{ Exception | NullPointerException -> 0x006c }
                        r4.<init>()     // Catch:{ Exception | NullPointerException -> 0x006c }
                    L_0x0032:
                        long r5 = r1.mo40604c()     // Catch:{ Exception | NullPointerException -> 0x006c }
                        r4.f53654d = r5     // Catch:{ Exception | NullPointerException -> 0x006c }
                        java.lang.String r5 = r1.mo40605d()     // Catch:{ Exception | NullPointerException -> 0x006c }
                        r4.f53651a = r5     // Catch:{ Exception | NullPointerException -> 0x006c }
                        java.lang.String r5 = r1.mo40606e()     // Catch:{ Exception | NullPointerException -> 0x006c }
                        r4.f53652b = r5     // Catch:{ Exception | NullPointerException -> 0x006c }
                        java.lang.String r5 = r1.mo40607f()     // Catch:{ Exception | NullPointerException -> 0x006c }
                        r4.f53653c = r5     // Catch:{ Exception | NullPointerException -> 0x006c }
                        boolean r5 = r1.mo40602a()     // Catch:{ Exception | NullPointerException -> 0x006c }
                        r4.f53655e = r5     // Catch:{ Exception | NullPointerException -> 0x006c }
                        int r5 = r1.mo40603b()     // Catch:{ Exception | NullPointerException -> 0x006c }
                        r4.f53656f = r5     // Catch:{ Exception | NullPointerException -> 0x006c }
                        java.lang.String r1 = r1.mo40608g()     // Catch:{ Exception | NullPointerException -> 0x006c }
                        r4.f53657g = r1     // Catch:{ Exception | NullPointerException -> 0x006c }
                        com.ss.android.message.NotifyService r1 = com.p683ss.android.message.NotifyService.this     // Catch:{ Exception | NullPointerException -> 0x006c }
                        java.util.Map<java.lang.Long, com.ss.android.message.a.a.a> r1 = r1.f53614e     // Catch:{ Exception | NullPointerException -> 0x006c }
                        java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ Exception | NullPointerException -> 0x006c }
                        r1.put(r2, r4)     // Catch:{ Exception | NullPointerException -> 0x006c }
                        com.ss.android.message.NotifyService r1 = com.p683ss.android.message.NotifyService.this     // Catch:{ Exception | NullPointerException -> 0x006c }
                        r1.mo40470a()     // Catch:{ Exception | NullPointerException -> 0x006c }
                    L_0x006c:
                        com.ss.android.message.NotifyService r0 = com.p683ss.android.message.NotifyService.this     // Catch:{ Exception -> 0x0076 }
                        java.util.Map<java.lang.Long, com.ss.android.message.a.a.a> r1 = r0.f53614e     // Catch:{ Exception -> 0x0076 }
                        if (r1 == 0) goto L_0x0075
                        r0.mo40472b()     // Catch:{ Exception -> 0x0076 }
                    L_0x0075:
                        return
                    L_0x0076:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.message.NotifyService.C193931.C193941.run():void");
                }
            });
        }
    };

    /* renamed from: w */
    private HandlerThread f53625w = new HandlerThread("NotifyService");

    /* renamed from: x */
    private volatile Looper f53626x;

    public void handleMsg(Message message) {
    }

    /* renamed from: e */
    public final void mo40474e() {
        C19710b.m48173a();
        f53606r = true;
    }

    /* renamed from: d */
    public static void m47484d() {
        try {
            String d = C19710b.m48173a().mo41095d();
            if (!C9431p.m18664a(d) && !d.equals(f53605q)) {
                f53605q = d;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: g */
    public static void m47485g() {
        try {
            String f = C19710b.m48173a().mo41097f();
            if (!C9431p.m18664a(f) && !f.equals(f53608t)) {
                f53608t = f;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: f */
    public final void mo40475f() {
        try {
            boolean b = C19710b.m48173a().mo41093b();
            f53607s = b;
            if (b) {
                stopSelf();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: h */
    public final void mo40476h() {
        boolean g = C19710b.m48173a().mo41098g();
        if (g != f53609u) {
            f53609u = g;
        }
        if (f53609u) {
            if (VERSION.SDK_INT >= 21) {
                PushJobService.m47498a(this);
            }
        } else if (VERSION.SDK_INT >= 21) {
            PushJobService.m47499b(this);
        }
    }

    public void onCreate() {
        super.onCreate();
        this.f53625w.start();
        this.f53626x = this.f53625w.getLooper();
        this.f53611b = new C9381g(this.f53626x, this);
        this.f53611b.post(new Runnable() {
            /* JADX WARNING: Can't wrap try/catch for region: R(27:0|1|(1:3)|4|5|(1:7)|8|9|10|(2:12|(1:14)(2:15|(3:19|(1:24)(1:23)|(1:26))))|27|28|29|30|31|32|(1:34)(1:35)|36|37|(1:39)|40|(6:42|43|44|(1:46)(2:47|(1:49)(2:50|(1:52)(4:53|(1:55)|56|(2:58|59))))|60|61)|62|63|(1:65)|66|71) */
            /* JADX WARNING: Can't wrap try/catch for region: R(3:67|68|69) */
            /* JADX WARNING: Can't wrap try/catch for region: R(6:42|43|44|(1:46)(2:47|(1:49)(2:50|(1:52)(4:53|(1:55)|56|(2:58|59))))|60|61) */
            /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
                com.p683ss.android.message.p1191b.C19456b.m47610a(r0.getApplicationContext());
             */
            /* JADX WARNING: Code restructure failed: missing block: B:69:0x02a1, code lost:
                return;
             */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x007f */
            /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0130 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x016f */
            /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x0274 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:62:0x0279 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x029a */
            /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
            /* JADX WARNING: Removed duplicated region for block: B:34:0x0150 A[Catch:{ Throwable -> 0x016f }] */
            /* JADX WARNING: Removed duplicated region for block: B:35:0x0154 A[Catch:{ Throwable -> 0x016f }] */
            /* JADX WARNING: Removed duplicated region for block: B:39:0x0175 A[Catch:{ Throwable -> 0x0279 }] */
            /* JADX WARNING: Removed duplicated region for block: B:42:0x01a8 A[Catch:{ Throwable -> 0x0279 }] */
            /* JADX WARNING: Removed duplicated region for block: B:65:0x0283 A[Catch:{ Throwable -> 0x02a1 }] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r10 = this;
                    com.ss.android.message.NotifyService r0 = com.p683ss.android.message.NotifyService.this     // Catch:{  }
                    com.ss.android.message.g r1 = new com.ss.android.message.g     // Catch:{  }
                    r1.<init>(r0)     // Catch:{  }
                    r0.f53610a = r1     // Catch:{  }
                    boolean r1 = com.bytedance.common.utility.C9415i.m18635b()     // Catch:{  }
                    if (r1 == 0) goto L_0x0016
                    android.content.Context r1 = r0.getApplicationContext()     // Catch:{  }
                    com.p683ss.android.pushmanager.p1204a.C19670f.m48061a(r1)     // Catch:{  }
                L_0x0016:
                    com.ss.android.push.daemon.c r1 = com.p683ss.android.push.daemon.C19633c.m47982a(r0)     // Catch:{ Throwable -> 0x029a }
                    r1.mo40945a()     // Catch:{ Throwable -> 0x029a }
                    com.ss.android.pushmanager.a.c$a r1 = com.p683ss.android.pushmanager.p1204a.C19664c.m48033a()     // Catch:{ Throwable -> 0x029a }
                    if (r1 == 0) goto L_0x0026
                    r1.mo41008a(r0)     // Catch:{ Throwable -> 0x029a }
                L_0x0026:
                    r1 = 0
                    r2 = 1
                    com.ss.android.pushmanager.setting.b r3 = com.p683ss.android.pushmanager.setting.C19710b.m48173a()     // Catch:{ Throwable -> 0x007f }
                    boolean r3 = r3.mo41108r()     // Catch:{ Throwable -> 0x007f }
                    if (r3 == 0) goto L_0x007f
                    int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x007f }
                    r4 = 18
                    if (r3 >= r4) goto L_0x0043
                    r3 = -2048(0xfffffffffffff800, float:NaN)
                    android.app.Notification r4 = new android.app.Notification     // Catch:{ Throwable -> 0x007f }
                    r4.<init>()     // Catch:{ Throwable -> 0x007f }
                    r0.startForeground(r3, r4)     // Catch:{ Throwable -> 0x007f }
                    goto L_0x007f
                L_0x0043:
                    int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x007f }
                    if (r3 < r4) goto L_0x007f
                    int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x007f }
                    r4 = 24
                    if (r3 >= r4) goto L_0x007f
                    boolean r3 = com.p683ss.android.message.p1191b.C19464g.m47642c()     // Catch:{ Throwable -> 0x007f }
                    if (r3 == 0) goto L_0x005b
                    boolean r3 = com.p683ss.android.message.p1191b.C19464g.m47640b()     // Catch:{ Throwable -> 0x007f }
                    if (r3 == 0) goto L_0x005b
                    r3 = 1
                    goto L_0x005c
                L_0x005b:
                    r3 = 0
                L_0x005c:
                    if (r3 != 0) goto L_0x007f
                    android.app.Notification$Builder r3 = new android.app.Notification$Builder     // Catch:{ Throwable -> 0x007f }
                    android.content.Context r4 = r0.getApplicationContext()     // Catch:{ Throwable -> 0x007f }
                    r3.<init>(r4)     // Catch:{ Throwable -> 0x007f }
                    r4 = 2131955411(0x7f130ed3, float:1.9547349E38)
                    android.app.Notification$Builder r3 = r3.setSmallIcon(r4)     // Catch:{ Throwable -> 0x007f }
                    android.app.Notification r3 = r3.build()     // Catch:{ Throwable -> 0x007f }
                    android.content.Intent r4 = new android.content.Intent     // Catch:{ Throwable -> 0x007f }
                    java.lang.Class<com.ss.android.message.NotifyIntentService> r5 = com.p683ss.android.message.NotifyIntentService.class
                    r4.<init>(r0, r5)     // Catch:{ Throwable -> 0x007f }
                    r0.startService(r4)     // Catch:{ Throwable -> 0x007f }
                    r0.startForeground(r2, r3)     // Catch:{ Throwable -> 0x007f }
                L_0x007f:
                    com.ss.android.pushmanager.setting.b r3 = com.p683ss.android.pushmanager.setting.C19710b.m48173a()     // Catch:{ Throwable -> 0x016f }
                    com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider$b r3 = r3.f54262b     // Catch:{ Throwable -> 0x016f }
                    java.lang.String r4 = "push_apps"
                    java.lang.String r5 = ""
                    java.lang.String r3 = r3.mo41081a(r4, r5)     // Catch:{ Throwable -> 0x016f }
                    r0.mo40471a(r3)     // Catch:{ Throwable -> 0x016f }
                    com.ss.android.message.a.a.d r3 = new com.ss.android.message.a.a.d     // Catch:{ Throwable -> 0x016f }
                    com.ss.android.pushmanager.a.d r4 = com.p683ss.android.pushmanager.p1204a.C19667d.m48045a()     // Catch:{ Throwable -> 0x016f }
                    com.ss.android.pushmanager.d r4 = r4.mo41018b()     // Catch:{ Throwable -> 0x016f }
                    int r4 = r4.mo41049c()     // Catch:{ Throwable -> 0x016f }
                    long r4 = (long) r4     // Catch:{ Throwable -> 0x016f }
                    android.content.Context r6 = r0.getApplicationContext()     // Catch:{ Throwable -> 0x016f }
                    r3.<init>(r4, r6)     // Catch:{ Throwable -> 0x016f }
                    r0.f53613d = r3     // Catch:{ Throwable -> 0x016f }
                    android.content.ContentResolver r3 = r0.getContentResolver()     // Catch:{ Throwable -> 0x0130 }
                    java.lang.String r4 = "allow_self_push_enable"
                    java.lang.String r5 = "boolean"
                    android.net.Uri r4 = com.p683ss.android.pushmanager.setting.PushMultiProcessSharedProvider.m48145a(r0, r4, r5)     // Catch:{ Throwable -> 0x0130 }
                    android.database.ContentObserver r5 = r0.f53616h     // Catch:{ Throwable -> 0x0130 }
                    r3.registerContentObserver(r4, r2, r5)     // Catch:{ Throwable -> 0x0130 }
                    android.content.ContentResolver r3 = r0.getContentResolver()     // Catch:{ Throwable -> 0x0130 }
                    java.lang.String r4 = "push_notify_enable"
                    java.lang.String r5 = "boolean"
                    android.net.Uri r4 = com.p683ss.android.pushmanager.setting.PushMultiProcessSharedProvider.m48145a(r0, r4, r5)     // Catch:{ Throwable -> 0x0130 }
                    android.database.ContentObserver r5 = r0.f53617i     // Catch:{ Throwable -> 0x0130 }
                    r3.registerContentObserver(r4, r2, r5)     // Catch:{ Throwable -> 0x0130 }
                    android.content.ContentResolver r3 = r0.getContentResolver()     // Catch:{ Throwable -> 0x0130 }
                    java.lang.String r4 = "loc"
                    java.lang.String r5 = "string"
                    android.net.Uri r4 = com.p683ss.android.pushmanager.setting.PushMultiProcessSharedProvider.m48145a(r0, r4, r5)     // Catch:{ Throwable -> 0x0130 }
                    android.database.ContentObserver r5 = r0.f53618j     // Catch:{ Throwable -> 0x0130 }
                    r3.registerContentObserver(r4, r2, r5)     // Catch:{ Throwable -> 0x0130 }
                    android.content.ContentResolver r3 = r0.getContentResolver()     // Catch:{ Throwable -> 0x0130 }
                    java.lang.String r4 = "allow_network"
                    java.lang.String r5 = "boolean"
                    android.net.Uri r4 = com.p683ss.android.pushmanager.setting.PushMultiProcessSharedProvider.m48145a(r0, r4, r5)     // Catch:{ Throwable -> 0x0130 }
                    android.database.ContentObserver r5 = r0.f53619k     // Catch:{ Throwable -> 0x0130 }
                    r3.registerContentObserver(r4, r2, r5)     // Catch:{ Throwable -> 0x0130 }
                    android.content.ContentResolver r3 = r0.getContentResolver()     // Catch:{ Throwable -> 0x0130 }
                    java.lang.String r4 = "ssids"
                    java.lang.String r5 = "string"
                    android.net.Uri r4 = com.p683ss.android.pushmanager.setting.PushMultiProcessSharedProvider.m48145a(r0, r4, r5)     // Catch:{ Throwable -> 0x0130 }
                    android.database.ContentObserver r5 = r0.f53620l     // Catch:{ Throwable -> 0x0130 }
                    r3.registerContentObserver(r4, r2, r5)     // Catch:{ Throwable -> 0x0130 }
                    android.content.ContentResolver r3 = r0.getContentResolver()     // Catch:{ Throwable -> 0x0130 }
                    java.lang.String r4 = "shut_push_on_stop_service"
                    java.lang.String r5 = "boolean"
                    android.net.Uri r4 = com.p683ss.android.pushmanager.setting.PushMultiProcessSharedProvider.m48145a(r0, r4, r5)     // Catch:{ Throwable -> 0x0130 }
                    android.database.ContentObserver r5 = r0.f53621m     // Catch:{ Throwable -> 0x0130 }
                    r3.registerContentObserver(r4, r2, r5)     // Catch:{ Throwable -> 0x0130 }
                    android.content.ContentResolver r3 = r0.getContentResolver()     // Catch:{ Throwable -> 0x0130 }
                    java.lang.String r4 = "uninstall_question_url"
                    java.lang.String r5 = "string"
                    android.net.Uri r4 = com.p683ss.android.pushmanager.setting.PushMultiProcessSharedProvider.m48145a(r0, r4, r5)     // Catch:{ Throwable -> 0x0130 }
                    android.database.ContentObserver r5 = r0.f53622n     // Catch:{ Throwable -> 0x0130 }
                    r3.registerContentObserver(r4, r2, r5)     // Catch:{ Throwable -> 0x0130 }
                    android.content.ContentResolver r3 = r0.getContentResolver()     // Catch:{ Throwable -> 0x0130 }
                    java.lang.String r4 = "allow_push_job_service"
                    java.lang.String r5 = "boolean"
                    android.net.Uri r4 = com.p683ss.android.pushmanager.setting.PushMultiProcessSharedProvider.m48145a(r0, r4, r5)     // Catch:{ Throwable -> 0x0130 }
                    android.database.ContentObserver r5 = r0.f53623o     // Catch:{ Throwable -> 0x0130 }
                    r3.registerContentObserver(r4, r2, r5)     // Catch:{ Throwable -> 0x0130 }
                L_0x0130:
                    r0.mo40474e()     // Catch:{ Throwable -> 0x016f }
                    com.p683ss.android.message.NotifyService.m47484d()     // Catch:{ Throwable -> 0x016f }
                    r0.mo40473c()     // Catch:{ Throwable -> 0x016f }
                    r0.mo40475f()     // Catch:{ Throwable -> 0x016f }
                    com.p683ss.android.message.NotifyService.m47485g()     // Catch:{ Throwable -> 0x016f }
                    r0.mo40476h()     // Catch:{ Throwable -> 0x016f }
                    com.ss.android.message.sswo.a r3 = com.p683ss.android.message.sswo.C19495a.m47729a(r0)     // Catch:{ Throwable -> 0x016f }
                    com.ss.android.pushmanager.setting.b r4 = com.p683ss.android.pushmanager.setting.C19710b.m48173a()     // Catch:{ Throwable -> 0x016f }
                    boolean r4 = r4.mo41104n()     // Catch:{ Throwable -> 0x016f }
                    if (r4 != 0) goto L_0x0154
                    r3.mo40651a()     // Catch:{ Throwable -> 0x016f }
                    goto L_0x016f
                L_0x0154:
                    android.content.IntentFilter r4 = new android.content.IntentFilter     // Catch:{ Throwable -> 0x016f }
                    r4.<init>()     // Catch:{ Throwable -> 0x016f }
                    java.lang.String r5 = "android.intent.action.SCREEN_OFF"
                    r4.addAction(r5)     // Catch:{ Throwable -> 0x016f }
                    java.lang.String r5 = "android.intent.action.SCREEN_ON"
                    r4.addAction(r5)     // Catch:{ Throwable -> 0x016f }
                    java.lang.String r5 = "android.intent.action.USER_PRESENT"
                    r4.addAction(r5)     // Catch:{ Throwable -> 0x016f }
                    android.content.Context r5 = r3.f53843a     // Catch:{ Throwable -> 0x016f }
                    com.ss.android.message.sswo.SswoReceiver r3 = r3.f53844b     // Catch:{ Throwable -> 0x016f }
                    r5.registerReceiver(r3, r4)     // Catch:{ Throwable -> 0x016f }
                L_0x016f:
                    android.content.Context r3 = r0.getApplicationContext()     // Catch:{ Throwable -> 0x0279 }
                    if (r3 == 0) goto L_0x0199
                    r4 = 3
                    java.lang.String[] r5 = new java.lang.String[r4]     // Catch:{ Throwable -> 0x0279 }
                    java.lang.String r6 = "lockFile"
                    r5[r1] = r6     // Catch:{ Throwable -> 0x0279 }
                    java.lang.String r6 = "lockFile1"
                    r5[r2] = r6     // Catch:{ Throwable -> 0x0279 }
                    java.lang.String r6 = "lockFile2"
                    r7 = 2
                    r5[r7] = r6     // Catch:{ Throwable -> 0x0279 }
                    com.p683ss.android.pushmanager.p1204a.C19670f.m48063a(r3, r5)     // Catch:{ Throwable -> 0x0279 }
                    java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ Throwable -> 0x0279 }
                    java.lang.String r5 = "observerFile"
                    r4[r1] = r5     // Catch:{ Throwable -> 0x0279 }
                    java.lang.String r1 = "observerFile1"
                    r4[r2] = r1     // Catch:{ Throwable -> 0x0279 }
                    java.lang.String r1 = "observerFile2"
                    r4[r7] = r1     // Catch:{ Throwable -> 0x0279 }
                    com.p683ss.android.pushmanager.p1204a.C19670f.m48063a(r3, r4)     // Catch:{ Throwable -> 0x0279 }
                L_0x0199:
                    com.ss.android.message.g r1 = r0.f53610a     // Catch:{ Throwable -> 0x0279 }
                    r1.mo40618b()     // Catch:{ Throwable -> 0x0279 }
                    com.ss.android.pushmanager.setting.b r1 = com.p683ss.android.pushmanager.setting.C19710b.m48173a()     // Catch:{ Throwable -> 0x0279 }
                    boolean r1 = r1.mo41110t()     // Catch:{ Throwable -> 0x0279 }
                    if (r1 == 0) goto L_0x0279
                    com.ss.android.message.g r1 = r0.f53610a     // Catch:{ Throwable -> 0x0279 }
                    int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{  }
                    r3 = 21
                    if (r2 < r3) goto L_0x01b2
                    goto L_0x0274
                L_0x01b2:
                    com.ss.android.pushmanager.setting.b r2 = com.p683ss.android.pushmanager.setting.C19710b.m48173a()     // Catch:{  }
                    boolean r2 = r2.mo41110t()     // Catch:{  }
                    if (r2 != 0) goto L_0x01be
                    goto L_0x0274
                L_0x01be:
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{  }
                    r2.<init>()     // Catch:{  }
                    android.content.Context r3 = r1.f53800a     // Catch:{  }
                    android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()     // Catch:{  }
                    java.lang.String r3 = r3.dataDir     // Catch:{  }
                    r2.append(r3)     // Catch:{  }
                    java.lang.String r3 = "/lib"
                    r2.append(r3)     // Catch:{  }
                    java.lang.String r2 = r2.toString()     // Catch:{  }
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{  }
                    r3.<init>()     // Catch:{  }
                    r3.append(r2)     // Catch:{  }
                    java.lang.String r2 = "/libsupervisor.so"
                    r3.append(r2)     // Catch:{  }
                    java.lang.String r2 = r3.toString()     // Catch:{  }
                    android.content.Context r3 = r1.f53800a     // Catch:{  }
                    java.lang.String r3 = r3.getPackageName()     // Catch:{  }
                    java.lang.Class<com.ss.android.message.NotifyService> r4 = com.p683ss.android.message.NotifyService.class
                    java.lang.String r4 = r4.getName()     // Catch:{  }
                    android.content.Context r5 = r1.f53800a     // Catch:{  }
                    java.lang.String r5 = com.p683ss.android.common.util.C18920g.m46051b(r5)     // Catch:{  }
                    android.content.Context r6 = r1.f53800a     // Catch:{  }
                    android.content.Context r6 = r6.getApplicationContext()     // Catch:{  }
                    java.lang.String r6 = com.p683ss.android.pushmanager.p1204a.C19670f.m48061a(r6)     // Catch:{  }
                    if (r6 != 0) goto L_0x0207
                    goto L_0x0274
                L_0x0207:
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{  }
                    r7.<init>()     // Catch:{  }
                    r7.append(r3)     // Catch:{  }
                    long r8 = android.os.SystemClock.elapsedRealtime()     // Catch:{  }
                    r7.append(r8)     // Catch:{  }
                    java.lang.String r7 = r7.toString()     // Catch:{  }
                    java.lang.String r7 = com.bytedance.common.utility.C9395d.m18571a(r7)     // Catch:{  }
                    r1.f53802c = r7     // Catch:{  }
                    android.content.Context r7 = r1.f53800a     // Catch:{  }
                    java.lang.String r7 = com.p683ss.android.message.p1191b.C19470k.m47651a(r7)     // Catch:{  }
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{  }
                    r8.<init>()     // Catch:{  }
                    r8.append(r2)     // Catch:{  }
                    java.lang.String r2 = " "
                    r8.append(r2)     // Catch:{  }
                    r8.append(r3)     // Catch:{  }
                    java.lang.String r2 = " "
                    r8.append(r2)     // Catch:{  }
                    r8.append(r4)     // Catch:{  }
                    java.lang.String r2 = " "
                    r8.append(r2)     // Catch:{  }
                    r8.append(r5)     // Catch:{  }
                    java.lang.String r2 = " "
                    r8.append(r2)     // Catch:{  }
                    r8.append(r6)     // Catch:{  }
                    java.lang.String r2 = " "
                    r8.append(r2)     // Catch:{  }
                    java.lang.String r1 = r1.f53802c     // Catch:{  }
                    r8.append(r1)     // Catch:{  }
                    java.lang.String r1 = " "
                    r8.append(r1)     // Catch:{  }
                    if (r7 == 0) goto L_0x0262
                    r8.append(r7)     // Catch:{  }
                L_0x0262:
                    java.lang.String r1 = r8.toString()     // Catch:{  }
                    boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{  }
                    if (r2 != 0) goto L_0x0274
                    java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch:{ Throwable -> 0x0274 }
                    r3 = 0
                    r2.exec(r1, r3, r3)     // Catch:{ Throwable -> 0x0274 }
                L_0x0274:
                    com.ss.android.message.g r1 = r0.f53610a     // Catch:{ Throwable -> 0x0279 }
                    r1.mo40619c()     // Catch:{ Throwable -> 0x0279 }
                L_0x0279:
                    com.ss.android.pushmanager.e r1 = com.p683ss.android.pushmanager.C19700f.m48124a()     // Catch:{ Throwable -> 0x02a1 }
                    com.ss.android.message.e r1 = r1.mo41061e()     // Catch:{ Throwable -> 0x02a1 }
                    if (r1 == 0) goto L_0x028e
                    com.ss.android.pushmanager.e r1 = com.p683ss.android.pushmanager.C19700f.m48124a()     // Catch:{ Throwable -> 0x02a1 }
                    com.ss.android.message.e r1 = r1.mo41061e()     // Catch:{ Throwable -> 0x02a1 }
                    r1.mo40615a(r0)     // Catch:{ Throwable -> 0x02a1 }
                L_0x028e:
                    com.ss.android.pushmanager.j r1 = com.p683ss.android.pushmanager.C19704j.m48136b()     // Catch:{ Throwable -> 0x02a1 }
                    android.content.Context r0 = r0.getApplicationContext()     // Catch:{ Throwable -> 0x02a1 }
                    r1.mo40615a(r0)     // Catch:{ Throwable -> 0x02a1 }
                    goto L_0x02a2
                L_0x029a:
                    android.content.Context r0 = r0.getApplicationContext()     // Catch:{ Exception -> 0x02a2 }
                    com.p683ss.android.message.p1191b.C19456b.m47610a(r0)     // Catch:{ Exception -> 0x02a2 }
                L_0x02a1:
                    return
                L_0x02a2:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.message.NotifyService.C194036.run():void");
            }
        });
    }

    /* renamed from: i */
    private void m47486i() {
        try {
            getContentResolver().unregisterContentObserver(this.f53616h);
            getContentResolver().unregisterContentObserver(this.f53617i);
            getContentResolver().unregisterContentObserver(this.f53618j);
            getContentResolver().unregisterContentObserver(this.f53619k);
            getContentResolver().unregisterContentObserver(this.f53620l);
            getContentResolver().unregisterContentObserver(this.f53621m);
            getContentResolver().unregisterContentObserver(this.f53622n);
            getContentResolver().unregisterContentObserver(this.f53623o);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x004b */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo40470a() {
        /*
            r7 = this;
            monitor-enter(r7)
            java.lang.String r0 = ""
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004b }
            r1.<init>()     // Catch:{ Exception -> 0x004b }
            java.util.Map<java.lang.Long, com.ss.android.message.a.a.a> r2 = r7.f53614e     // Catch:{ Exception -> 0x004b }
            java.util.Set r2 = r2.entrySet()     // Catch:{ Exception -> 0x004b }
            r3 = 0
            java.util.Iterator r4 = r2.iterator()     // Catch:{ Exception -> 0x004b }
        L_0x0013:
            boolean r5 = r4.hasNext()     // Catch:{ Exception -> 0x004b }
            if (r5 == 0) goto L_0x0046
            java.lang.Object r5 = r4.next()     // Catch:{ Exception -> 0x004b }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ Exception -> 0x004b }
            java.lang.Object r5 = r5.getValue()     // Catch:{ Exception -> 0x004b }
            com.ss.android.message.a.a.a r5 = (com.p683ss.android.message.p1186a.p1187a.C19409a) r5     // Catch:{ Exception -> 0x004b }
            if (r5 == 0) goto L_0x0013
            int r6 = r2.size()     // Catch:{ Exception -> 0x004b }
            int r6 = r6 + -1
            if (r3 == r6) goto L_0x003c
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x004b }
            r1.append(r5)     // Catch:{ Exception -> 0x004b }
            java.lang.String r5 = "@"
            r1.append(r5)     // Catch:{ Exception -> 0x004b }
            goto L_0x0043
        L_0x003c:
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x004b }
            r1.append(r5)     // Catch:{ Exception -> 0x004b }
        L_0x0043:
            int r3 = r3 + 1
            goto L_0x0013
        L_0x0046:
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x004b }
            r0 = r1
        L_0x004b:
            boolean r1 = com.bytedance.common.utility.C9431p.m18664a(r0)     // Catch:{ all -> 0x0066 }
            if (r1 != 0) goto L_0x0064
            com.ss.android.pushmanager.setting.b r1 = com.p683ss.android.pushmanager.setting.C19710b.m48173a()     // Catch:{ all -> 0x0066 }
            com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider$b r1 = r1.f54262b     // Catch:{ all -> 0x0066 }
            com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider$a r1 = r1.mo41080a()     // Catch:{ all -> 0x0066 }
            java.lang.String r2 = "push_apps"
            com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider$a r0 = r1.mo41074a(r2, r0)     // Catch:{ all -> 0x0066 }
            r0.mo41076a()     // Catch:{ all -> 0x0066 }
        L_0x0064:
            monitor-exit(r7)
            return
        L_0x0066:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.message.NotifyService.mo40470a():void");
    }

    /* renamed from: b */
    public final void mo40472b() {
        int i;
        if (C9415i.m18635b()) {
            StringBuilder sb = new StringBuilder("doPushStart mPushApps Contains ");
            if (this.f53614e == null) {
                i = 0;
            } else {
                i = this.f53614e.size();
            }
            sb.append(i);
        }
        if (!C19710b.m48173a().mo41102k()) {
            try {
                if (this.f53613d != null) {
                    this.f53613d.mo40511a();
                }
            } catch (Exception unused) {
            }
        } else {
            if (!(this.f53613d == null || this.f53614e == null || this.f53614e.isEmpty())) {
                for (C19409a a : this.f53614e.values()) {
                    m47483a(a);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo40473c() {
        long c = (long) C19667d.m48045a().mo41018b().mo41049c();
        Boolean valueOf = Boolean.valueOf(C19710b.m48173a().mo41094c());
        if (valueOf.booleanValue() != f53604p) {
            if (this.f53614e != null) {
                C19411c cVar = (C19411c) this.f53614e.get(Long.valueOf(c));
                if (cVar != null) {
                    cVar.f53655e = C19710b.m48173a().mo41094c();
                    this.f53614e.put(Long.valueOf(c), cVar);
                    mo40470a();
                }
            }
            f53604p = valueOf.booleanValue();
            if (this.f53613d != null) {
                this.f53613d.mo40514a(getApplicationContext(), (C19415a) new C19415a() {
                    /* renamed from: a */
                    public final void mo40495a() {
                        NotifyService.this.mo40472b();
                    }
                });
            }
            if (C19710b.m48173a().mo41101j()) {
                stopSelf();
                try {
                    C19456b.m47610a(getApplicationContext());
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0040 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0021 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002e A[Catch:{ Exception -> 0x0040 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0044 A[Catch:{ Exception -> 0x0056 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDestroy() {
        /*
            r2 = this;
            super.onDestroy()
            r0 = 1
            r2.f53612c = r0     // Catch:{ Exception -> 0x0056 }
            com.ss.android.message.a.a.d r0 = r2.f53613d     // Catch:{ Exception -> 0x0056 }
            if (r0 == 0) goto L_0x0012
            com.ss.android.message.a.a.d r0 = r2.f53613d     // Catch:{ Exception -> 0x0056 }
            r0.mo40511a()     // Catch:{ Exception -> 0x0056 }
            r0 = 0
            r2.f53613d = r0     // Catch:{ Exception -> 0x0056 }
        L_0x0012:
            r2.m47486i()     // Catch:{ Exception -> 0x0056 }
            com.ss.android.message.sswo.a r0 = com.p683ss.android.message.sswo.C19495a.m47729a(r2)     // Catch:{ Exception -> 0x0056 }
            r0.mo40651a()     // Catch:{ Exception -> 0x0056 }
            com.ss.android.message.g r0 = r2.f53610a     // Catch:{ Exception -> 0x0021 }
            r0.mo40617a()     // Catch:{ Exception -> 0x0021 }
        L_0x0021:
            com.p683ss.android.message.log.C19489a.m47717a()     // Catch:{ Exception -> 0x0056 }
            com.ss.android.pushmanager.e r0 = com.p683ss.android.pushmanager.C19700f.m48124a()     // Catch:{ Exception -> 0x0040 }
            com.ss.android.message.e r0 = r0.mo41061e()     // Catch:{ Exception -> 0x0040 }
            if (r0 == 0) goto L_0x0039
            com.ss.android.pushmanager.e r0 = com.p683ss.android.pushmanager.C19700f.m48124a()     // Catch:{ Exception -> 0x0040 }
            com.ss.android.message.e r0 = r0.mo41061e()     // Catch:{ Exception -> 0x0040 }
            r0.mo40614a()     // Catch:{ Exception -> 0x0040 }
        L_0x0039:
            com.ss.android.pushmanager.j r0 = com.p683ss.android.pushmanager.C19704j.m48136b()     // Catch:{ Exception -> 0x0040 }
            r0.mo40614a()     // Catch:{ Exception -> 0x0040 }
        L_0x0040:
            android.os.HandlerThread r0 = r2.f53625w     // Catch:{ Exception -> 0x0056 }
            if (r0 == 0) goto L_0x0055
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0056 }
            r1 = 18
            if (r0 < r1) goto L_0x0050
            android.os.HandlerThread r0 = r2.f53625w     // Catch:{ Exception -> 0x0056 }
            r0.quitSafely()     // Catch:{ Exception -> 0x0056 }
            goto L_0x0056
        L_0x0050:
            android.os.HandlerThread r0 = r2.f53625w     // Catch:{ Exception -> 0x0056 }
            r0.quit()     // Catch:{ Exception -> 0x0056 }
        L_0x0055:
            return
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.message.NotifyService.onDestroy():void");
    }

    public IBinder onBind(Intent intent) {
        return this.f53624v;
    }

    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    /* renamed from: a */
    private void m47483a(C19409a aVar) {
        if (this.f53613d != null && aVar != null) {
            this.f53613d.mo40515a(aVar, (Context) this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo40471a(java.lang.String r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = com.bytedance.common.utility.C9431p.m18664a(r8)     // Catch:{ all -> 0x0072 }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r7)
            return
        L_0x0009:
            java.util.Map<java.lang.Long, com.ss.android.message.a.a.a> r0 = r7.f53614e     // Catch:{ Exception -> 0x0070 }
            r0.clear()     // Catch:{ Exception -> 0x0070 }
            java.lang.String r0 = "@"
            java.lang.String[] r8 = r8.split(r0)     // Catch:{ Exception -> 0x0070 }
            if (r8 == 0) goto L_0x006e
            int r0 = r8.length     // Catch:{ Exception -> 0x0070 }
            r1 = 0
            r2 = 0
        L_0x0019:
            if (r2 >= r0) goto L_0x006e
            r3 = r8[r2]     // Catch:{ Exception -> 0x0070 }
            com.ss.android.message.a.a.c r4 = new com.ss.android.message.a.a.c     // Catch:{ Exception -> 0x0070 }
            r4.<init>()     // Catch:{ Exception -> 0x0070 }
            if (r3 == 0) goto L_0x005e
            java.lang.String r5 = "\\|"
            java.lang.String[] r3 = r3.split(r5)     // Catch:{ Exception -> 0x0070 }
            if (r3 == 0) goto L_0x005e
            int r5 = r3.length     // Catch:{ Exception -> 0x0070 }
            r6 = 7
            if (r5 != r6) goto L_0x005e
            r5 = r3[r1]     // Catch:{ Exception -> 0x0070 }
            r4.f53651a = r5     // Catch:{ Exception -> 0x0070 }
            r5 = 1
            r5 = r3[r5]     // Catch:{ Exception -> 0x0070 }
            r4.f53652b = r5     // Catch:{ Exception -> 0x0070 }
            r5 = 2
            r5 = r3[r5]     // Catch:{ Exception -> 0x0070 }
            r4.f53653c = r5     // Catch:{ Exception -> 0x0070 }
            r5 = 3
            r5 = r3[r5]     // Catch:{ Exception -> 0x0070 }
            long r5 = java.lang.Long.parseLong(r5)     // Catch:{ Exception -> 0x0070 }
            r4.f53654d = r5     // Catch:{ Exception -> 0x0070 }
            r5 = 4
            r5 = r3[r5]     // Catch:{ Exception -> 0x0070 }
            boolean r5 = java.lang.Boolean.parseBoolean(r5)     // Catch:{ Exception -> 0x0070 }
            r4.f53655e = r5     // Catch:{ Exception -> 0x0070 }
            r5 = 5
            r5 = r3[r5]     // Catch:{ Exception -> 0x0070 }
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ Exception -> 0x0070 }
            r4.f53656f = r5     // Catch:{ Exception -> 0x0070 }
            r5 = 6
            r3 = r3[r5]     // Catch:{ Exception -> 0x0070 }
            r4.f53657g = r3     // Catch:{ Exception -> 0x0070 }
        L_0x005e:
            java.util.Map<java.lang.Long, com.ss.android.message.a.a.a> r3 = r7.f53614e     // Catch:{ Exception -> 0x0070 }
            long r5 = r4.mo40507d()     // Catch:{ Exception -> 0x0070 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x0070 }
            r3.put(r5, r4)     // Catch:{ Exception -> 0x0070 }
            int r2 = r2 + 1
            goto L_0x0019
        L_0x006e:
            monitor-exit(r7)
            return
        L_0x0070:
            monitor-exit(r7)
            return
        L_0x0072:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.message.NotifyService.mo40471a(java.lang.String):void");
    }

    public int onStartCommand(final Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        this.f53611b.post(new Runnable() {
            /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0020 */
            /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
            /* JADX WARNING: Removed duplicated region for block: B:10:0x0024 A[Catch:{ Exception -> 0x0100 }] */
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0029 A[SYNTHETIC, Splitter:B:12:0x0029] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r7 = this;
                    com.ss.android.message.NotifyService r0 = com.p683ss.android.message.NotifyService.this     // Catch:{ Exception -> 0x0100 }
                    android.content.Intent r1 = r2     // Catch:{ Exception -> 0x0100 }
                    com.ss.android.pushmanager.e r2 = com.p683ss.android.pushmanager.C19700f.m48124a()     // Catch:{ Throwable -> 0x0020 }
                    com.ss.android.message.e r2 = r2.mo41061e()     // Catch:{ Throwable -> 0x0020 }
                    if (r2 == 0) goto L_0x0019
                    com.ss.android.pushmanager.e r2 = com.p683ss.android.pushmanager.C19700f.m48124a()     // Catch:{ Throwable -> 0x0020 }
                    com.ss.android.message.e r2 = r2.mo41061e()     // Catch:{ Throwable -> 0x0020 }
                    r2.mo40616a(r1)     // Catch:{ Throwable -> 0x0020 }
                L_0x0019:
                    com.ss.android.pushmanager.j r2 = com.p683ss.android.pushmanager.C19704j.m48136b()     // Catch:{ Throwable -> 0x0020 }
                    r2.mo40616a(r1)     // Catch:{ Throwable -> 0x0020 }
                L_0x0020:
                    boolean r2 = r0.f53615g     // Catch:{ Exception -> 0x0100 }
                    if (r2 == 0) goto L_0x0027
                    r2 = 0
                    r0.f53615g = r2     // Catch:{ Exception -> 0x0100 }
                L_0x0027:
                    if (r1 == 0) goto L_0x00fb
                    android.os.Bundle r1 = r1.getExtras()     // Catch:{  }
                    com.p683ss.android.pushmanager.setting.C19710b.m48173a()     // Catch:{  }
                    com.ss.android.pushmanager.setting.b r2 = com.p683ss.android.pushmanager.setting.C19710b.m48173a()     // Catch:{  }
                    boolean r2 = r2.mo41101j()     // Catch:{  }
                    if (r2 == 0) goto L_0x0043
                    android.content.Context r0 = r0.getApplicationContext()     // Catch:{  }
                    com.p683ss.android.message.p1191b.C19456b.m47610a(r0)     // Catch:{  }
                    goto L_0x00ff
                L_0x0043:
                    if (r1 == 0) goto L_0x00fb
                    java.lang.String r2 = "push_heart_beat"
                    boolean r2 = r1.getBoolean(r2)     // Catch:{  }
                    if (r2 == 0) goto L_0x009a
                    com.ss.android.message.a.a.d r1 = r0.f53613d     // Catch:{  }
                    if (r1 == 0) goto L_0x0100
                    com.ss.android.message.a.a.d r1 = r0.f53613d     // Catch:{  }
                    android.content.Context r2 = r0.getApplicationContext()     // Catch:{  }
                    com.ss.android.message.NotifyService$8 r3 = new com.ss.android.message.NotifyService$8     // Catch:{  }
                    r3.<init>()     // Catch:{  }
                    if (r2 == 0) goto L_0x0100
                    com.ss.android.pushmanager.setting.b r0 = com.p683ss.android.pushmanager.setting.C19710b.m48173a()     // Catch:{  }
                    boolean r0 = r0.mo41102k()     // Catch:{  }
                    if (r0 == 0) goto L_0x0100
                    com.ss.android.message.a.b.d r0 = r1.f53661b     // Catch:{  }
                    if (r0 == 0) goto L_0x0096
                    com.ss.android.message.a.b.d r0 = r1.f53661b     // Catch:{  }
                    com.ss.android.message.a.b.b r0 = r0.mo40545d()     // Catch:{  }
                    int r0 = r0.getStateValue()     // Catch:{  }
                    com.ss.android.message.a.b.b r2 = com.p683ss.android.message.p1186a.p1188b.C19447b.SOCKET_CONNECTED     // Catch:{  }
                    int r2 = r2.getStateValue()     // Catch:{  }
                    if (r0 < r2) goto L_0x0096
                    com.ss.android.message.a.b.d r0 = r1.f53661b     // Catch:{  }
                    com.ss.android.message.a.b.b r0 = r0.mo40545d()     // Catch:{  }
                    int r0 = r0.getStateValue()     // Catch:{  }
                    com.ss.android.message.a.b.b r2 = com.p683ss.android.message.p1186a.p1188b.C19447b.SOCKET_DISCONNECTING     // Catch:{  }
                    int r2 = r2.getStateValue()     // Catch:{  }
                    if (r0 >= r2) goto L_0x0096
                    com.ss.android.message.a.b.d r0 = r1.f53661b     // Catch:{ Exception -> 0x00ff }
                    r0.mo40544c()     // Catch:{ Exception -> 0x00ff }
                    goto L_0x00ff
                L_0x0096:
                    r3.mo40495a()     // Catch:{  }
                    goto L_0x0100
                L_0x009a:
                    java.lang.String r2 = "remove_app"
                    boolean r2 = r1.getBoolean(r2)     // Catch:{  }
                    if (r2 == 0) goto L_0x00fb
                    java.lang.String r2 = "remove_app_package"
                    java.lang.String r1 = r1.getString(r2)     // Catch:{  }
                    boolean r2 = com.bytedance.common.utility.C9431p.m18664a(r1)     // Catch:{  }
                    if (r2 != 0) goto L_0x0100
                    java.util.Map<java.lang.Long, com.ss.android.message.a.a.a> r2 = r0.f53614e     // Catch:{  }
                    java.util.Collection r2 = r2.values()     // Catch:{  }
                    java.util.Iterator r2 = r2.iterator()     // Catch:{  }
                L_0x00b8:
                    boolean r3 = r2.hasNext()     // Catch:{  }
                    if (r3 == 0) goto L_0x0100
                    java.lang.Object r3 = r2.next()     // Catch:{  }
                    com.ss.android.message.a.a.a r3 = (com.p683ss.android.message.p1186a.p1187a.C19409a) r3     // Catch:{  }
                    java.lang.String r4 = r3.mo40509f()     // Catch:{  }
                    boolean r4 = r1.equals(r4)     // Catch:{  }
                    if (r4 == 0) goto L_0x00b8
                    long r3 = r3.mo40507d()     // Catch:{  }
                    com.ss.android.message.a.a.d r5 = r0.f53613d     // Catch:{  }
                    if (r5 == 0) goto L_0x00b8
                    com.ss.android.message.a.a.d r5 = r0.f53613d     // Catch:{  }
                    java.util.Map<java.lang.Long, com.ss.android.message.a.a.a> r6 = r5.f53660a     // Catch:{  }
                    java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{  }
                    r6.remove(r3)     // Catch:{  }
                    java.util.Map<java.lang.Long, com.ss.android.message.a.a.a> r3 = r5.f53660a     // Catch:{  }
                    if (r3 == 0) goto L_0x00f7
                    java.util.Map<java.lang.Long, com.ss.android.message.a.a.a> r3 = r5.f53660a     // Catch:{  }
                    boolean r3 = r3.isEmpty()     // Catch:{  }
                    if (r3 == 0) goto L_0x00ee
                    goto L_0x00f7
                L_0x00ee:
                    com.ss.android.message.a.a.d$2 r3 = new com.ss.android.message.a.a.d$2     // Catch:{  }
                    r3.<init>(r0)     // Catch:{  }
                    r5.mo40514a(r0, r3)     // Catch:{  }
                    goto L_0x00b8
                L_0x00f7:
                    r5.mo40511a()     // Catch:{  }
                    goto L_0x00b8
                L_0x00fb:
                    r0.mo40472b()     // Catch:{  }
                    goto L_0x0100
                L_0x00ff:
                    return
                L_0x0100:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.message.NotifyService.C194047.run():void");
            }
        });
        C19709a a = C19709a.m48167a();
        Boolean valueOf = Boolean.valueOf(true);
        if (a.f54258a.getBoolean("is_notify_service_stick", valueOf.booleanValue())) {
            return 1;
        }
        return 0;
    }
}
