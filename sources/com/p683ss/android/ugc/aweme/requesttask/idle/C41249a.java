package com.p683ss.android.ugc.aweme.requesttask.idle;

import android.content.Context;
import com.bytedance.p558e.C9741d;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.lego.C35889c;
import com.p683ss.android.ugc.aweme.lego.C35897g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.requesttask.idle.a */
public final class C41249a implements C35889c {
    /* renamed from: a */
    public final C35897g mo46246a() {
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            Boolean disableDelayAbSdkRequest = b.getDisableDelayAbSdkRequest();
            C52711k.m112236a((Object) disableDelayAbSdkRequest, "SettingsReader.get().disableDelayAbSdkRequest");
            if (disableDelayAbSdkRequest.booleanValue()) {
                if (C9741d.m19512a()) {
                    return C35897g.IDLE;
                }
                return C35897g.NORMAL;
            }
        } catch (Exception unused) {
        }
        return C35897g.IDLE;
    }

    /* renamed from: a */
    public final void mo46247a(Context context, boolean z) {
        C52711k.m112240b(context, "context");
        C9741d.m19513b();
    }
}
