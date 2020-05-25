package com.p683ss.android.ugc.aweme.app.launch;

import android.app.Activity;
import com.bytedance.ies.ugc.p694a.C11014d;
import com.bytedance.ies.ugc.p694a.C11016e.C11019c;
import com.p683ss.android.ugc.aweme.app.application.C23018b;
import com.p683ss.android.ugc.aweme.app.p1373d.C23062a;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.lego.C35895e;
import com.p683ss.android.ugc.aweme.p1341an.C22574a;
import com.ss.android.ugc.trill.R;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.app.launch.a */
public final class C23113a {

    /* renamed from: a */
    public static final C23113a f61539a = new C23113a();

    /* renamed from: com.ss.android.ugc.aweme.app.launch.a$a */
    public static final class C23114a implements C35895e {
        /* renamed from: a */
        public final void mo47849a(String str) {
            C52711k.m112240b(str, "label");
            C22574a.m55738f().mo46917a(str, false);
        }

        /* renamed from: b */
        public final void mo47850b(String str) {
            C52711k.m112240b(str, "label");
            C22574a.m55738f().mo46921b(str, false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.launch.a$b */
    public static final class C23115b extends C52712l implements C52671b<C11014d, C52860x> {
        public static final C23115b INSTANCE = new C23115b();

        C23115b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C11014d dVar = (C11014d) obj;
            C52711k.m112240b(dVar, "$receiver");
            dVar.f29586e = Integer.valueOf(R.string.ip);
            String str = "trill";
            C52711k.m112240b(str, "<set-?>");
            dVar.f29587f = str;
            String str2 = "tiktok";
            C52711k.m112240b(str2, "<set-?>");
            dVar.f29589h = str2;
            dVar.f29583b = false;
            String str3 = "16.0.41";
            C52711k.m112240b(str3, "<set-?>");
            dVar.f29588g = str3;
            dVar.f29590i = 160041;
            String str4 = C23062a.f61432a;
            C52711k.m112240b(str4, "<set-?>");
            dVar.f29591j = str4;
            dVar.f29592k = C23018b.f61359a;
            dVar.f29593l = 1;
            dVar.f29584c = new C11019c() {
                /* renamed from: a */
                public final boolean mo19907a(Activity activity) {
                    if (activity != null && !(activity instanceof AmeActivity)) {
                        return true;
                    }
                    return false;
                }
            };
            return C52860x.f131107a;
        }
    }

    private C23113a() {
    }
}
