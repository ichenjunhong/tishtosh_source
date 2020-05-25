package com.p683ss.android.ugc.asve.sandbox;

import android.arch.lifecycle.C0184k;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Process;
import android.os.RemoteException;
import com.bef.effectsdk.C2592c;
import com.p683ss.android.ugc.asve.C20315a;
import com.p683ss.android.ugc.asve.C20317b;
import com.p683ss.android.ugc.asve.C20370d;
import com.p683ss.android.ugc.asve.C20377e;
import com.p683ss.android.ugc.asve.context.C20363h;
import com.p683ss.android.ugc.asve.p1241e.C20391c;
import com.p683ss.android.ugc.asve.p1241e.C20391c.C20392a;
import com.p683ss.android.ugc.asve.p1241e.C20394e;
import com.p683ss.android.ugc.asve.recorder.C20483d;
import com.p683ss.android.ugc.asve.recorder.C20484e;
import com.p683ss.android.ugc.asve.sandbox.C20803n.C20804a;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20584a.C20585a;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20584a.C20586b;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20584a.C20587c;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20584a.C20588d;
import com.p683ss.android.ugc.asve.sandbox.p1250a.C20584a.C20589e;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20721u;
import com.p683ss.android.ugc.asve.sandbox.p1251b.C20721u.C20722a;
import com.p683ss.android.ugc.asve.sandbox.wrap.ASSandBoxRecorderContextWrapper;
import com.p683ss.android.ugc.asve.sandbox.wrap.C20819b;
import com.p683ss.android.ugc.asve.sandbox.wrap.C20822c;
import com.p683ss.android.ugc.asve.sandbox.wrap.C20828e;
import com.p683ss.android.ugc.asve.sandbox.wrap.SandBoxASContextWrapper;
import com.p683ss.android.vesdk.VEListener.C50538b;
import java.util.LinkedHashMap;
import java.util.Map;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.asve.sandbox.b */
public final class C20652b {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f56504a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C20652b.class), "isOnSandBoxProcess", "isOnSandBoxProcess()Z"))};

    /* renamed from: b */
    static final long f56505b = 86400000;

    /* renamed from: c */
    static C20809p f56506c = null;

    /* renamed from: d */
    static boolean f56507d = false;

    /* renamed from: e */
    static int f56508e = 0;

    /* renamed from: f */
    static long f56509f = 0;

    /* renamed from: g */
    public static final C20652b f56510g = new C20652b();

    /* renamed from: h */
    private static final String f56511h = f56511h;

    /* renamed from: i */
    private static final C52668f f56512i = C52732g.m112285a(C20653a.f56515a);
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static C20803n f56513j;

    /* renamed from: k */
    private static final C20654b f56514k = new C20654b();

    /* renamed from: com.ss.android.ugc.asve.sandbox.b$a */
    static final class C20653a extends C52712l implements C52670a<Boolean> {

        /* renamed from: a */
        public static final C20653a f56515a = new C20653a();

        C20653a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            boolean z;
            String packageName = C20315a.m50093b().getPackageName();
            Context b = C20315a.m50093b();
            C52711k.m112240b(b, "$this$getCurrentProcessName");
            int myPid = Process.myPid();
            CharSequence a = C20394e.m50599a(b, myPid);
            if (a.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                a = C20394e.m50600b(b, myPid);
            }
            String str = (String) a;
            StringBuilder sb = new StringBuilder();
            sb.append(packageName);
            sb.append(":assandbox");
            return Boolean.valueOf(C52711k.m112239a((Object) sb.toString(), (Object) str));
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.b$b */
    public static final class C20654b implements ServiceConnection {

        /* renamed from: com.ss.android.ugc.asve.sandbox.b$b$a */
        static final class C20655a implements DeathRecipient {

            /* renamed from: a */
            final /* synthetic */ C20654b f56516a;

            C20655a(C20654b bVar) {
                this.f56516a = bVar;
            }

            public final void binderDied() {
                try {
                    C20652b.f56513j = null;
                    C20317b.f55815a.mo42962c("asve process died, do some clear and restore work");
                    C20809p pVar = C20652b.f56506c;
                    if (pVar != null) {
                        pVar.mo44156a();
                    }
                } catch (Exception unused) {
                }
                Map linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("sandbox_service_duration", String.valueOf(System.currentTimeMillis() - C20652b.f56509f));
                linkedHashMap.put("sandbox_state", String.valueOf(C20652b.f56508e));
                C20483d d = C20315a.m50092a().mo43150d();
                if (d != null) {
                    d.mo43439a("sandbox_quit_unusual", linkedHashMap);
                }
                C20652b.f56508e = 0;
                C20652b.m51995d();
                if (C20652b.f56507d && C20392a.m50597a(C20315a.m50093b()).mo43225c()) {
                    C20652b.f56510g.mo43787b();
                }
            }
        }

        /* renamed from: com.ss.android.ugc.asve.sandbox.b$b$b */
        public static final class C20656b extends C20722a {
            C20656b() {
            }

            /* renamed from: a */
            public final void mo43792a() {
            }
        }

        C20654b() {
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            C52711k.m112240b(componentName, LeakCanaryFileProvider.f132049i);
            C20652b.f56513j = null;
            C20652b.m51993a(0);
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C20800m mVar;
            C20828e eVar;
            C20819b bVar;
            C20779f fVar;
            C52711k.m112240b(componentName, LeakCanaryFileProvider.f132049i);
            C52711k.m112240b(iBinder, "service");
            C20652b bVar2 = C20652b.f56510g;
            C20652b.f56509f = System.currentTimeMillis();
            C20652b.m51993a(1);
            try {
                C20652b.f56513j = C20804a.m53072a(iBinder);
                iBinder.linkToDeath(new C20655a(this), 0);
                if (C20652b.f56513j != null) {
                    C20803n a = C20652b.f56513j;
                    if (a != null) {
                        SandBoxASContextWrapper sandBoxASContextWrapper = new SandBoxASContextWrapper(C20315a.m50092a());
                        C2592c f = C20315a.m50092a().mo43152f();
                        if (f != null) {
                            C52711k.m112240b(f, "$this$proxy");
                            mVar = new C20585a(f);
                        } else {
                            mVar = null;
                        }
                        C20800m mVar2 = mVar;
                        C20370d b = C20315a.m50092a().mo43148b();
                        C52711k.m112240b(b, "$this$proxy");
                        C20822c bVar3 = new C20586b(b);
                        C20483d d = C20315a.m50092a().mo43150d();
                        if (d != null) {
                            C52711k.m112240b(d, "$this$proxy");
                            eVar = new C20587c(d);
                        } else {
                            eVar = null;
                        }
                        C20828e eVar2 = eVar;
                        C50538b e = C20315a.m50092a().mo43151e();
                        if (e != null) {
                            C52711k.m112240b(e, "$this$proxy");
                            bVar = new C20588d(e);
                        } else {
                            bVar = null;
                        }
                        C20819b bVar4 = bVar;
                        C20377e c = C20315a.m50092a().mo43149c();
                        if (c != null) {
                            C52711k.m112240b(c, "$this$proxy");
                            fVar = new C20589e(c);
                        } else {
                            fVar = null;
                        }
                        a.mo43722a(sandBoxASContextWrapper, mVar2, bVar3, eVar2, bVar4, fVar);
                    }
                    C20803n a2 = C20652b.f56513j;
                    if (a2 != null) {
                        a2.mo43721a((C20721u) new C20656b());
                    }
                }
            } catch (Exception unused) {
                C20652b.m51993a(0);
                C20652b.m51995d();
                C20652b.f56513j = null;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.b$c */
    static final class C20657c implements Runnable {

        /* renamed from: a */
        public static final C20657c f56517a = new C20657c();

        C20657c() {
        }

        public final void run() {
            long currentTimeMillis = System.currentTimeMillis();
            C20391c a = C20392a.m50597a(C20315a.m50093b());
            long b = a.mo43223b();
            if (b > 0 && currentTimeMillis - b < C20652b.f56505b) {
                a.mo43222a(true);
            }
            a.f55919a.edit().putLong("key_sandbox_crash_time", currentTimeMillis).apply();
        }
    }

    private C20652b() {
    }

    /* renamed from: c */
    public final boolean mo43788c() {
        return ((Boolean) f56512i.getValue()).booleanValue();
    }

    /* renamed from: a */
    public static final String m51992a() {
        return f56511h;
    }

    /* renamed from: d */
    public static void m51995d() {
        C20317b.f55815a.mo42962c("asve process died, mark time ");
        C20315a.m50092a().mo43147a().submit(C20657c.f56517a);
    }

    /* renamed from: e */
    private static void m51996e() {
        Intent intent = new Intent();
        intent.setClass(C20315a.m50093b(), SandBoxRemoteCoreService.class);
        C20315a.m50093b().bindService(intent, f56514k, 1);
    }

    /* renamed from: b */
    public final void mo43787b() {
        if (!mo43788c()) {
            m51996e();
            return;
        }
        throw new IllegalStateException("current process is already sanbox!!");
    }

    /* renamed from: a */
    public static void m51993a(int i) {
        f56508e = i;
    }

    /* renamed from: a */
    public final boolean mo43786a(Context context) {
        C52711k.m112240b(context, "context");
        C20391c a = C20392a.m50597a(C20315a.m50093b());
        if (!a.mo43225c() && System.currentTimeMillis() - a.mo43223b() > f56505b) {
            a.mo43222a(false);
        }
        Context applicationContext = context.getApplicationContext();
        C52711k.m112236a((Object) applicationContext, "context.applicationContext");
        return C20392a.m50597a(applicationContext).mo43225c();
    }

    /* renamed from: a */
    public static C20484e m51990a(C20363h hVar, C0184k kVar) {
        C20797l lVar;
        C52711k.m112240b(hVar, "recorderContext");
        f56506c = hVar.mo43131o();
        C20317b.f55815a.mo42962c("createSandboxRecorder begin ");
        ASSandBoxRecorderContextWrapper aSSandBoxRecorderContextWrapper = new ASSandBoxRecorderContextWrapper(hVar);
        C20317b.f55815a.mo42962c("createSandboxRecorder covert context success  ");
        SandBoxRecorderImpl sandBoxRecorderImpl = null;
        try {
            C20803n nVar = f56513j;
            if (nVar != null) {
                lVar = nVar.mo43719a(aSSandBoxRecorderContextWrapper);
            } else {
                lVar = null;
            }
            try {
                f56508e = 3;
                C20317b.f55815a.mo42962c("createSandboxRecorder remote end ");
            } catch (RemoteException unused) {
            }
        } catch (RemoteException unused2) {
            lVar = null;
        }
        if (lVar != null) {
            sandBoxRecorderImpl = new SandBoxRecorderImpl(lVar, hVar, kVar);
        }
        return sandBoxRecorderImpl;
    }
}
