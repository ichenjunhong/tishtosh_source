package com.bytedance.crash;

import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.crash.C9616k;
import com.bytedance.crash.nativecrash.NativeImpl;
import com.bytedance.crash.p540b.C9553a;
import com.bytedance.crash.p540b.C9555b;
import com.bytedance.crash.p540b.C9559e;
import com.bytedance.crash.p542d.C9572a;
import com.bytedance.crash.p548h.C9599a;
import com.bytedance.crash.p548h.C9601c;
import com.bytedance.crash.p548h.C9603d;
import com.bytedance.crash.p548h.C9603d.C9605a;
import com.bytedance.crash.p549i.C9609b;
import com.bytedance.crash.p550j.C9614b;
import com.bytedance.crash.p551k.C9617a;
import com.bytedance.crash.p551k.C9636b;
import com.bytedance.crash.p551k.C9649f;
import com.bytedance.crash.p551k.p552a.C9628f;
import com.bytedance.crash.p554m.C9672d;
import com.bytedance.crash.p554m.C9678f;
import com.bytedance.crash.p555n.C9705m;
import com.bytedance.news.common.service.manager.C12401c;
import com.bytedance.services.apm.api.IFdCheck;
import java.io.File;
import java.util.Map;
import java.util.Random;

/* renamed from: com.bytedance.crash.j */
public final class C9610j {

    /* renamed from: a */
    static boolean f26205a;

    /* renamed from: b */
    static boolean f26206b;

    /* renamed from: c */
    public static volatile boolean f26207c;

    /* renamed from: d */
    private static boolean f26208d;

    /* renamed from: e */
    private static boolean f26209e;

    /* renamed from: f */
    private static boolean f26210f;

    /* renamed from: a */
    public static boolean m19136a() {
        return f26208d;
    }

    /* renamed from: a */
    public static void m19135a(Map<? extends String, ? extends String> map) {
        if (map != null && !map.isEmpty()) {
            C9616k.m19150b().f26025c.putAll(map);
        }
    }

    /* renamed from: b */
    public static C9636b m19137b() {
        return C9616k.m19156h();
    }

    /* renamed from: c */
    public static boolean m19139c() {
        if (C9599a.m19109b() || NativeImpl.m19469a()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m19140d() {
        boolean z;
        Boolean bool = (Boolean) C9599a.f26176e.get();
        if (bool == null || !bool.booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        if (z || NativeImpl.m19469a()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m19134a(String str) {
        if (NativeImpl.f26446a) {
            NativeImpl.doDumpHprof(str);
        }
    }

    /* renamed from: a */
    public static void m19132a(C9544a aVar, C9571d dVar) {
        C9616k.m19150b().mo17356a(aVar, dVar);
    }

    /* renamed from: b */
    public static void m19138b(C9544a aVar, C9571d dVar) {
        if (aVar != null) {
            C9616k.m19150b().mo17356a(aVar, dVar);
        }
    }

    /* renamed from: a */
    public static synchronized void m19127a(Context context, C9588g gVar) {
        synchronized (C9610j.class) {
            C9616k.m19149a(true);
            m19130a(context, gVar, true, false, true, true);
        }
    }

    /* renamed from: a */
    public static void m19133a(C9598h hVar, C9571d dVar) {
        C9551b b = C9616k.m19150b();
        switch (C95521.f26032a[dVar.ordinal()]) {
            case 1:
                b.f26026d.add(hVar);
                b.f26027e.add(hVar);
                b.f26028f.add(hVar);
                b.f26029g.add(hVar);
                return;
            case 2:
                b.f26029g.add(hVar);
                return;
            case 3:
                b.f26027e.add(hVar);
                return;
            case 4:
                b.f26026d.add(hVar);
                return;
            case 5:
                b.f26028f.add(hVar);
                break;
        }
    }

    /* renamed from: a */
    public static synchronized void m19128a(Context context, C9588g gVar, int i, String str) {
        synchronized (C9610j.class) {
            C9616k.m19149a(true);
            C9616k.f26234h = 2033;
            C9616k.f26235i = str;
            m19130a(context, gVar, true, true, true, true);
        }
    }

    /* renamed from: a */
    public static synchronized void m19129a(Context context, C9588g gVar, boolean z, boolean z2, boolean z3) {
        synchronized (C9610j.class) {
            m19130a(context, gVar, true, true, true, true);
        }
    }

    /* renamed from: a */
    private static synchronized void m19130a(Context context, C9588g gVar, boolean z, boolean z2, boolean z3, boolean z4) {
        synchronized (C9610j.class) {
            m19131a(context, gVar, z, z2, z3, z4, 0);
        }
    }

    /* renamed from: a */
    private static synchronized void m19131a(Context context, C9588g gVar, boolean z, boolean z2, boolean z3, boolean z4, long j) {
        String str;
        Application application;
        Context context2 = context;
        synchronized (C9610j.class) {
            if (C9616k.m19155g() != null) {
                application = C9616k.m19155g();
            } else if (context2 instanceof Application) {
                application = (Application) context2;
                if (application.getBaseContext() == null) {
                    throw new IllegalArgumentException("初始化时传入的Application还未attach, 请在init时传入attachBaseContext的参数, 并在init之前手动调用Npth.setApplication(Application).");
                }
            } else {
                try {
                    application = (Application) context.getApplicationContext();
                    if (application == null) {
                        throw new IllegalArgumentException(str);
                    } else if (application.getBaseContext() != null) {
                        context2 = application.getBaseContext();
                    }
                } finally {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("初始化时传入了baseContext, 导致无法获取Application实例, 请在init之前手动调用Npth.setApplication(Application).");
                }
            }
            m19126a(application, context2, gVar, z, z2, z3, z4, 0);
        }
    }

    /* renamed from: a */
    private static synchronized void m19126a(Application application, Context context, C9588g gVar, boolean z, boolean z2, boolean z3, final boolean z4, long j) {
        String str;
        synchronized (C9610j.class) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (!f26208d) {
                if (context == null || application == null) {
                    throw new IllegalArgumentException("context or Application must be not null.");
                } else if (gVar != null) {
                    C9616k.f26229c = System.currentTimeMillis();
                    C9616k.f26227a = context;
                    C9616k.f26228b = application;
                    C9616k.f26231e = new C9617a(C9616k.f26227a, gVar);
                    StringBuilder sb = new StringBuilder();
                    sb.append(Long.toHexString(new Random().nextLong()));
                    sb.append("U");
                    C9616k.f26233g = sb.toString();
                    if (z || z2) {
                        C9599a a = C9599a.m19103a();
                        if (z2) {
                            a.f26179a = new C9614b(context);
                        }
                        if (z) {
                            a.f26180b = new C9601c(context);
                        }
                        f26209e = true;
                    }
                    if (z3) {
                        if (!NativeImpl.f26446a) {
                            NativeImpl.f26446a = C9609b.m19125a(C9616k.m19154f(), "npth");
                        }
                        boolean z5 = NativeImpl.f26446a;
                        if (z5) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(C9705m.m19403f(context));
                            sb2.append("/CrashLogNative");
                            String sb3 = sb2.toString();
                            if (new File(context.getApplicationInfo().nativeLibraryDir, "libnpth_dumper.so").exists()) {
                                str = context.getApplicationInfo().nativeLibraryDir;
                            } else {
                                str = new File(context.getFilesDir(), "npth_lib/").getAbsolutePath();
                                NativeImpl.f26447b = true;
                            }
                            NativeImpl.doStart(VERSION.SDK_INT, str, sb3, C9616k.m19153e(), C9616k.f26236j);
                        }
                        f26210f = z5;
                        if (!z5) {
                            f26206b = true;
                        }
                    }
                    f26208d = true;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        f26207c = true;
                        NativeImpl.m19473c();
                    }
                    C9649f.m19247b().mo17510a((Runnable) new Runnable() {
                        public final void run() {
                            int i;
                            if (!C9610j.f26207c) {
                                new Handler(Looper.getMainLooper()).post(new Runnable() {
                                    public final void run() {
                                        C9610j.f26207c = true;
                                        NativeImpl.m19473c();
                                    }
                                });
                            }
                            boolean z = z4;
                            Context f = C9616k.m19154f();
                            C9628f.m19195a();
                            C9649f.m19247b().mo17509a(new Runnable() {
                                public final void run() {
                                    if (NativeImpl.f26447b) {
                                        File file = new File(C9616k.m19154f().getFilesDir(), "npth_lib/libnpth_dumper.so");
                                        file.getParentFile().mkdirs();
                                        if (file.exists()) {
                                            file.delete();
                                        }
                                        C9609b.m19124a(C9616k.m19154f(), "npth_dumper", file);
                                    }
                                }
                            });
                            if (!NativeImpl.f26446a) {
                                i = -1;
                            } else {
                                i = NativeImpl.doCreateCallbackThread();
                            }
                            if (NativeImpl.f26446a) {
                                try {
                                    String e = C9616k.m19153e();
                                    File e2 = C9705m.m19400e(C9616k.m19154f());
                                    e2.mkdirs();
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(e2.getPath());
                                    sb.append("/native_");
                                    sb.append(e);
                                    sb.append(".atmp");
                                    NativeImpl.doSetAlogConfigPath(sb.toString());
                                } catch (Throwable unused) {
                                }
                            }
                            if (C9610j.f26206b) {
                                C9577e.m18999a().mo17383a("NativeLibraryLoad faild");
                            } else if (i < 0) {
                                C9577e.m18999a().mo17383a("createCallbackThread faild");
                            }
                            C9572a.m18984a().mo17368a(f);
                            C9649f.m19247b().mo17510a((Runnable) new C9678f(f), 0);
                            if (z) {
                                C9553a aVar = C9559e.m18967a(f).f26061a;
                                if (!aVar.f26037c) {
                                    aVar.f26035a = new C9555b(aVar);
                                    aVar.f26038e = C9616k.m19157i();
                                    aVar.f26037c = true;
                                }
                                C9610j.f26205a = z;
                            }
                            C9672d a = C9672d.m19294a();
                            if (C9672d.f26384a.isEmpty()) {
                                a.f26387c.mo17510a(a.f26388d, 30000);
                            } else {
                                a.f26387c.mo17509a(a.f26388d);
                            }
                            if (!C9603d.f26198a) {
                                C9603d.f26198a = true;
                                C9649f.m19247b().mo17510a((Runnable) new C9605a(), 60000);
                            }
                            new Thread(new Runnable() {
                                public final void run() {
                                    try {
                                        if (NativeImpl.f26446a) {
                                            try {
                                                NativeImpl.doStartAnrMonitor(VERSION.SDK_INT);
                                            } catch (Throwable unused) {
                                            }
                                        }
                                    } catch (Throwable unused2) {
                                    }
                                }
                            }, "NPTH-AnrMonitor").start();
                            try {
                                C12401c.m24977a(IFdCheck.class, new Npth$2());
                            } catch (Throwable unused2) {
                            }
                        }
                    }, 0);
                    StringBuilder sb4 = new StringBuilder("Npth.init takes ");
                    sb4.append(SystemClock.uptimeMillis() - uptimeMillis);
                    sb4.append(" ms.");
                } else {
                    throw new IllegalArgumentException("params must be not null.");
                }
            }
        }
    }
}
