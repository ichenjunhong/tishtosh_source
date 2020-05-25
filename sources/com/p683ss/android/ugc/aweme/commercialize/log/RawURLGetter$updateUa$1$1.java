package com.p683ss.android.ugc.aweme.commercialize.log;

import android.content.Context;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.RawURLGetter$updateUa$1$1 */
public final class RawURLGetter$updateUa$1$1 implements LegoTask {
    RawURLGetter$updateUa$1$1() {
    }

    public final C35896f process() {
        return C35894d.m81063a(this);
    }

    public final C35898h type() {
        return C35898h.IDLE;
    }

    public final void run(Context context) {
        C52711k.m112240b(context, "context");
        C32458a.m75144a("AD_USER_AGENT_KEY");
        RawURLGetter.f68768b.mo53490c().edit().putString("ad_user_agent_sp", RawURLGetter.f68768b.mo53489b()).apply();
    }
}
