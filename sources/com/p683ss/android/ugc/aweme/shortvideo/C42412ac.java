package com.p683ss.android.ugc.aweme.shortvideo;

import android.support.p030v4.p040os.C0958a.C0959a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.shortvideo.model.BehaviorType;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import com.p683ss.android.ugc.aweme.utils.C47858ep;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ac */
final /* synthetic */ class C42412ac implements C0959a {

    /* renamed from: a */
    private final C42402ab f107294a;

    C42412ac(C42402ab abVar) {
        this.f107294a = abVar;
    }

    /* renamed from: a */
    public final void mo2943a() {
        C42402ab abVar = this.f107294a;
        if (abVar.f111186c == 1 && abVar.mo86495b()) {
            C23569o.m57776a("aweme_movie_publish_error_rate_parallel", -39993, (JSONObject) null);
            C47702b.f120193a.mo94984a("parallel_publish_result", C23089d.m56640a().mo47826a("status", -39993).mo47829a("retry_publish", abVar.f111188e ? "1" : "0").mo47829a("publish_id", abVar.f111187d).f61491a);
            String str = abVar.f111187d;
            C52711k.m112240b(str, "publishId");
            C47858ep.m103506a(C47858ep.f120423d, str, BehaviorType.CANCEL, "WT", "-39993", null, 16, null);
        }
    }
}
