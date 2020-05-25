package com.p683ss.android.ugc.aweme.feed.utils;

import android.text.TextUtils;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.feed.experiment.C30222b;
import com.p683ss.android.ugc.aweme.feed.experiment.LongPressEnterMaskLayerExperiment;
import com.p683ss.android.ugc.aweme.main.C36666k;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.utils.u */
public final class C31212u {

    /* renamed from: a */
    public static final C31212u f81656a = new C31212u();

    private C31212u() {
    }

    /* renamed from: a */
    public static final boolean m72893a(String str) {
        C52711k.m112240b(str, "eventType");
        CharSequence charSequence = str;
        if (TextUtils.equals(charSequence, "homepage_hot")) {
            return true;
        }
        C36666k b = C23794bh.m58388b();
        C52711k.m112236a((Object) b, "LegacyServiceUtils.getMainPageExperimentService()");
        if ((!b.mo75669a() || !TextUtils.equals(charSequence, "homepage_follow")) && !C30222b.m70959a()) {
            return C10181b.m20511a().mo18172a(LongPressEnterMaskLayerExperiment.class, true, "show_global_multi_func", 31744, false);
        }
        return true;
    }
}
