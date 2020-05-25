package com.p683ss.android.ugc.aweme.utils;

import com.bytedance.keva.Keva;
import com.p683ss.android.VEHook;
import com.p683ss.android.ttve.nativePort.C20129b;
import com.p683ss.android.ttve.nativePort.C20129b.C20132c;

/* renamed from: com.ss.android.ugc.aweme.utils.gk */
public final class C47919gk {

    /* renamed from: a */
    public static final Keva f120509a = Keva.getRepo("repo_ve_hook");

    /* renamed from: b */
    static String[] f120510b;

    /* renamed from: c */
    public static final C47919gk f120511c = new C47919gk();

    /* renamed from: com.ss.android.ugc.aweme.utils.gk$a */
    static final class C47920a implements C20132c {

        /* renamed from: a */
        public static final C47920a f120512a = new C47920a();

        C47920a() {
        }

        /* renamed from: a */
        public final void mo42621a(String[] strArr) {
            C47919gk gkVar = C47919gk.f120511c;
            C47919gk.f120510b = strArr;
            if (C47919gk.m103683a()) {
                C47919gk.m103685c();
            }
        }
    }

    private C47919gk() {
    }

    /* renamed from: b */
    public static void m103684b() {
        C20129b.m49681a((C20132c) C47920a.f120512a);
    }

    /* renamed from: a */
    public static boolean m103683a() {
        return f120509a.getBoolean("key_ve_hook_switch", false);
    }

    /* renamed from: c */
    public static void m103685c() {
        String[] strArr = f120510b;
        if (strArr != null) {
            VEHook.hook(strArr, VEHook.HOOK_TYPE_PLT);
        }
    }
}
