package com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import com.p683ss.android.ugc.aweme.utils.C47759cc;
import com.p683ss.android.ugc.aweme.utils.GsonProvider;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.l */
public final class C31341l extends C31338j {
    /* renamed from: a */
    public final String mo64209a() {
        return "abnor_record";
    }

    /* renamed from: c */
    public final String mo64212c() {
        GsonProvider a = C47759cc.m103382a();
        C52711k.m112236a((Object) a, "GsonProvider.get()");
        String b = a.getGson().mo34889b(mo64223d());
        C52711k.m112236a((Object) b, "GsonProvider.get().gson.…Json(loadFeedbackInfos())");
        return b;
    }
}
