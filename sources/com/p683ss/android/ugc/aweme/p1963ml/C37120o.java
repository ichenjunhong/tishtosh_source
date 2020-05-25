package com.p683ss.android.ugc.aweme.p1963ml;

import android.text.TextUtils;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.p1963ml.p1964ab.SmartPreloadExperiment.C37101a;
import com.p683ss.android.ugc.aweme.player.C38847b;
import com.p683ss.android.ugc.aweme.player.p2051ab.abs.PlayerAbSmartPreloadUseLastPredictExp;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.ml.o */
public final class C37120o {

    /* renamed from: a */
    public C37122p f94768a = new C37122p(new C37098a(C37101a.m83332a()));

    /* renamed from: b */
    private boolean f94769b = true;

    /* renamed from: com.ss.android.ugc.aweme.ml.o$a */
    static class C37121a {

        /* renamed from: a */
        static final C37120o f94770a = new C37120o();
    }

    /* renamed from: a */
    public static C37120o m83349a() {
        return C37121a.f94770a;
    }

    /* renamed from: b */
    public final boolean mo76392b() {
        return this.f94768a.mo40665b();
    }

    /* renamed from: c */
    public final String mo76393c() {
        if (!TextUtils.isEmpty(this.f94768a.f94771e) || !this.f94769b) {
            return this.f94768a.f94771e;
        }
        return C38847b.f98942b.mo78826a();
    }

    public C37120o() {
        boolean z = true;
        if (C10181b.m20511a().mo18168a(PlayerAbSmartPreloadUseLastPredictExp.class, true, "player_smart_preload_v2_use_last_predict", 31744, 0) != 1) {
            z = false;
        }
        this.f94769b = z;
    }

    /* renamed from: d */
    public final float mo76394d() {
        if (this.f94768a.f94772f != -1.0f || !this.f94769b) {
            return this.f94768a.f94772f;
        }
        C38847b bVar = C38847b.f98942b;
        String str = "KEY_SMART_PRELOAD_V2_LAST_PREDICT_PROBILITY";
        C52711k.m112240b(str, "key");
        return C38847b.f98941a.getFloat(str, -1.0f);
    }
}
