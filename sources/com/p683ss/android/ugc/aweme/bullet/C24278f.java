package com.p683ss.android.ugc.aweme.bullet;

import com.bytedance.ies.bullet.p628b.p633e.C10287f;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.dfbase.C27532a;
import com.p683ss.android.ugc.aweme.dfbase.C27558m;
import com.p683ss.android.ugc.aweme.dfbase.C27559n;
import com.p683ss.android.ugc.aweme.dfbase.p1630b.C27538a.C27540a;
import com.p683ss.android.ugc.aweme.dfbase.p1631c.C27548d;
import com.p683ss.android.ugc.aweme.net.C37743a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.f */
public final class C24278f implements C10287f {

    /* renamed from: a */
    public static final C24278f f64410a = new C24278f();

    /* renamed from: b */
    private static boolean f64411b;

    /* renamed from: c */
    private static final boolean f64412c = C52711k.m112239a((Object) C37743a.m84244a(), (Object) "arm64-v8a");

    /* renamed from: com.ss.android.ugc.aweme.bullet.f$a */
    public static final class C24279a implements C27559n {
        C24279a() {
        }

        /* renamed from: b */
        public final void mo50034b(boolean z) {
        }

        /* renamed from: a */
        public final void mo50033a(boolean z) {
            C24278f.f64410a.mo50032c();
        }
    }

    private C24278f() {
    }

    /* renamed from: a */
    public final void mo18338a() {
        C27540a a = new C27540a().mo55989a("df_rn_kit").mo55990a(false).mo55991b(true).mo55988a(1);
        C52711k.m112236a((Object) a, "DynamicTask.ConfigBuilde…y.BACKGROUND_SILENT_CALL)");
        C27532a aVar = new C27532a(a);
        aVar.mo55967a(new C24279a());
        aVar.mo55969b();
    }

    /* renamed from: b */
    public final boolean mo18339b() {
        if (!C27532a.m66172c()) {
            return true;
        }
        boolean a = C27558m.m66225a("df_rn_kit");
        if (a && !f64411b) {
            f64411b = mo50032c();
        }
        if (!a || !f64411b) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo50032c() {
        C27548d.m66217a(C11010c.m22280a());
        try {
            if (!f64412c) {
                C27558m.m66224a("df_rn_kit", "gnustl_shared");
                C27558m.m66224a("df_rn_kit", "icu_common");
            }
            C27558m.m66224a("df_rn_kit", "jsc");
            C27558m.m66224a("df_rn_kit", "reactnativejni");
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
