package com.p683ss.android.ugc.aweme.requesttask.idle;

import android.content.Context;
import com.p683ss.android.account.token.C18500a;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.lego.C35889c;
import com.p683ss.android.ugc.aweme.lego.C35897g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.requesttask.idle.m */
public final class C41264m implements C35889c {
    /* renamed from: a */
    public final C35897g mo46246a() {
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            Boolean disableDelayTokenBeatRequest = b.getDisableDelayTokenBeatRequest();
            C52711k.m112236a((Object) disableDelayTokenBeatRequest, "SettingsReader.get().disableDelayTokenBeatRequest");
            if (disableDelayTokenBeatRequest.booleanValue()) {
                return C35897g.NORMAL;
            }
        } catch (Exception unused) {
        }
        return C35897g.IDLE;
    }

    /* renamed from: a */
    public final void mo46247a(Context context, boolean z) {
        C52711k.m112240b(context, "context");
        try {
            C18500a.m44768a();
        } catch (Exception unused) {
        }
    }
}
