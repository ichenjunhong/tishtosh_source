package com.p683ss.android.ugc.aweme.greenscreen;

import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.C23569o;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.greenscreen.a */
public abstract class C32870a implements C32919r {
    /* renamed from: a */
    public void mo69768a(Integer num, String str) {
        if (num != null) {
            C23569o.m57776a("aweme_greenscreen_image_rate", num.intValue(), C23088c.m56631a().mo47824a("errorMsg", str).mo47825b());
        }
    }

    /* renamed from: a */
    public void mo69769a(String str, String str2, Long l) {
        C52711k.m112240b(str, "imagePath");
        C52711k.m112240b(str2, "imageName");
        if (l != null) {
            C23569o.m57776a("aweme_greenscreen_image_rate", 0, C23088c.m56631a().mo47823a("duration", Long.valueOf(l.longValue())).mo47825b());
        }
    }
}
