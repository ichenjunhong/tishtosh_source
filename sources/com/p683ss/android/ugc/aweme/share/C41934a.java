package com.p683ss.android.ugc.aweme.share;

import com.bytedance.ies.C10174a;
import com.google.gson.C18085o;
import com.google.gson.C18088r;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.a */
public final class C41934a {

    /* renamed from: a */
    public static int f106129a;

    /* renamed from: b */
    public static final C41935a f106130b = new C41935a(null);

    /* renamed from: com.ss.android.ugc.aweme.share.a$a */
    public static final class C41935a {
        private C41935a() {
        }

        /* renamed from: a */
        public final boolean mo86045a() {
            Boolean bool;
            boolean z;
            try {
                IESSettingsProxy b = C32816h.m75716b();
                C52711k.m112236a((Object) b, "SettingsReader.get()");
                bool = b.getSilentShareConfigurable();
            } catch (C10174a unused) {
                bool = Boolean.valueOf(true);
            }
            C52711k.m112236a((Object) bool, "abValue");
            if (bool.booleanValue()) {
                if (C41934a.f106129a != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    return true;
                }
            }
            return false;
        }

        public /* synthetic */ C41935a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public final void mo86044a(C18085o oVar) {
            C52711k.m112240b(oVar, "json");
            C18085o e = oVar.mo35025e("data");
            if (e != null) {
                C41934a.f106129a = m91881a(e, "tt_publish_enhancement", 0);
            }
        }

        /* renamed from: a */
        private static int m91881a(C18085o oVar, String str, int i) {
            try {
                C18088r c = oVar.mo35023c(str);
                if (c == null) {
                    return 0;
                }
                if (!c.mo35030a()) {
                    return c.mo34910g();
                }
                if (c.mo34911h()) {
                    return 1;
                }
                return 0;
            } catch (Exception unused) {
                return 0;
            }
        }
    }

    /* renamed from: a */
    public static final void m91879a(C18085o oVar) {
        f106130b.mo86044a(oVar);
    }

    /* renamed from: a */
    public static final boolean m91880a() {
        return f106130b.mo86045a();
    }
}
