package com.p683ss.android.ugc.aweme.requesttask.idle;

import android.content.Context;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.lego.C35889c;
import com.p683ss.android.ugc.aweme.lego.C35897g;
import com.p683ss.android.ugc.aweme.setting.C41581bc;
import com.p683ss.android.ugc.aweme.setting.C41585bd;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.requesttask.idle.h */
public final class C41258h implements C35889c {
    /* renamed from: a */
    public final C35897g mo46246a() {
        if (!C41585bd.f105313a.getBoolean("key_has_setting", false)) {
            return C35897g.NORMAL;
        }
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            Boolean disableDelayFetchShareSettingRequest = b.getDisableDelayFetchShareSettingRequest();
            C52711k.m112236a((Object) disableDelayFetchShareSettingRequest, "SettingsReader.get().dis…yFetchShareSettingRequest");
            if (disableDelayFetchShareSettingRequest.booleanValue()) {
                return C35897g.NORMAL;
            }
        } catch (Exception unused) {
        }
        return C35897g.IDLE;
    }

    /* renamed from: a */
    public final void mo46247a(Context context, boolean z) {
        C52711k.m112240b(context, "context");
        C41581bc.m91416a().mo85361b();
    }
}
