package com.p683ss.android.ugc.aweme.requesttask.idle;

import android.content.Context;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.C23104i;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.lego.C35889c;
import com.p683ss.android.ugc.aweme.lego.C35897g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.requesttask.idle.j */
public final class C41261j implements C35889c {
    /* renamed from: a */
    public final C35897g mo46246a() {
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            Boolean disableDelayFetchUserRequest = b.getDisableDelayFetchUserRequest();
            C52711k.m112236a((Object) disableDelayFetchUserRequest, "SettingsReader.get().disableDelayFetchUserRequest");
            if (disableDelayFetchUserRequest.booleanValue()) {
                return C35897g.NORMAL;
            }
        } catch (Exception unused) {
        }
        return C35897g.NORMAL;
    }

    /* renamed from: a */
    public final void mo46247a(Context context, boolean z) {
        C52711k.m112240b(context, "context");
        IAccountUserService a = C20902b.m53242a();
        C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
        if (a.isLogin()) {
            C20902b.m53242a().queryUser();
            C20902b.m53242a().refreshPassportUserInfo();
            C23104i.m56672a();
        }
    }
}
