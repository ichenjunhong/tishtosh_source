package com.p683ss.android.ugc.asve;

import android.content.Context;
import com.bef.effectsdk.C2592c;
import com.p683ss.android.ugc.asve.context.C20358e;
import com.p683ss.android.ugc.asve.recorder.C20483d;
import com.p683ss.android.vesdk.C50630ak;
import com.p683ss.android.vesdk.C50712l;
import com.p683ss.android.vesdk.C50720o;
import com.p683ss.android.vesdk.C50791x;
import com.p683ss.android.vesdk.VEListener.C50538b;
import com.p683ss.android.vesdk.VEListener.C50551o;
import com.p683ss.android.vesdk.VEListener.C50556t;
import java.util.Map;
import java.util.Map.Entry;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.f */
public final class C20400f {

    /* renamed from: a */
    public static final C20400f f55930a = new C20400f();

    /* renamed from: b */
    private static boolean f55931b;

    /* renamed from: com.ss.android.ugc.asve.f$a */
    static final class C20401a implements C50791x {

        /* renamed from: a */
        final /* synthetic */ C20370d f55932a;

        C20401a(C20370d dVar) {
            this.f55932a = dVar;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo43229a(int i, String str) {
            switch (i) {
                case 0:
                    C20370d dVar = this.f55932a;
                    C52711k.m112236a((Object) str, "msg");
                    dVar.mo42962c(str);
                    return;
                case 1:
                    C20370d dVar2 = this.f55932a;
                    C52711k.m112236a((Object) str, "msg");
                    dVar2.mo42962c(str);
                    return;
                case 2:
                    C20370d dVar3 = this.f55932a;
                    C52711k.m112236a((Object) str, "msg");
                    dVar3.mo42963d(str);
                    return;
                case 3:
                    C20370d dVar4 = this.f55932a;
                    C52711k.m112236a((Object) str, "msg");
                    dVar4.mo42960a(str);
                    return;
                case 4:
                    C20370d dVar5 = this.f55932a;
                    C52711k.m112236a((Object) str, "msg");
                    dVar5.mo42961b(str);
                    break;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.asve.f$b */
    static final class C20402b implements C50551o {

        /* renamed from: a */
        final /* synthetic */ C20358e f55933a;

        C20402b(C20358e eVar) {
            this.f55933a = eVar;
        }

        /* renamed from: a */
        public final void mo43230a(Throwable th) {
            C20483d d = this.f55933a.mo43150d();
            if (d != null) {
                C52711k.m112236a((Object) th, "it");
                d.mo43440a(th, "vesdk");
            }
        }
    }

    private C20400f() {
    }

    /* renamed from: a */
    public final synchronized void mo43228a() {
        if (!f55931b) {
            f55931b = true;
            C20358e a = C20315a.m50092a();
            C20370d b = C20315a.m50092a().mo43148b();
            b.mo42963d("AVEnv initVESDK start");
            Map C = C20315a.m50092a().mo43146C();
            if (C != null) {
                C50712l a2 = C50712l.m109659a();
                for (Entry entry : C.entrySet()) {
                    a2.mo99230a((String) entry.getKey(), entry.getValue());
                }
            }
            C50630ak.m109164a(true);
            C2592c f = a.mo43152f();
            if (f != null) {
                C50630ak.m109157a(f);
            }
            C50538b e = a.mo43151e();
            if (e != null) {
                C50630ak.m109158a(e);
            }
            C50630ak.m109155a(a.mo43155i().ordinal());
            C50630ak.m109169b(a.mo43157k());
            C50630ak.m109156a((Context) C20315a.m50093b(), a.mo43158l().getAbsolutePath());
            C50630ak.m109172e(a.mo43144A());
            C50630ak.m109173f(a.mo43164r());
            C50630ak.m109171d(a.mo43145B());
            int m = a.mo43159m();
            if (m > 0) {
                C50720o.m109689c(m);
            }
            if (true ^ C52711k.m112239a((Object) a.mo43172z(), (Object) "")) {
                C50630ak.m109167b(a.mo43172z());
            }
            C50630ak.m109165a(a.mo43160n(), a.mo43161o());
            C50630ak.m109166a(a.mo43160n(), 40, 1070);
            C50630ak.m109170c(a.mo43162p());
            C50630ak.m109163a(a.mo43163q().getAbsolutePath());
            C50630ak.m109174g(a.mo43165s());
            C50630ak.m109162a((C50791x) new C20401a(b));
            C50630ak.m109159a((C50551o) new C20402b(a));
            b.mo42963d("AVEnv initVESDK end");
            C50630ak.m109161a(a.mo43170x());
            C50630ak.m109160a((C50556t) a.mo43150d());
        }
    }
}
