package com.krypton.autogen.daggerproxy;

import com.p683ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper;
import dagger.p2651a.C52867d;
import dagger.p2651a.C52869f;

public final class _Awemenotice_apiModule_ProvideNotificationClickHelperFactory implements C52867d<NotificationClickHelper> {

    /* renamed from: a */
    private final _Awemenotice_apiModule f50183a;

    public final NotificationClickHelper get() {
        return provideInstance(this.f50183a);
    }

    public _Awemenotice_apiModule_ProvideNotificationClickHelperFactory(_Awemenotice_apiModule _awemenotice_apimodule) {
        this.f50183a = _awemenotice_apimodule;
    }

    public static _Awemenotice_apiModule_ProvideNotificationClickHelperFactory create(_Awemenotice_apiModule _awemenotice_apimodule) {
        return new _Awemenotice_apiModule_ProvideNotificationClickHelperFactory(_awemenotice_apimodule);
    }

    public static NotificationClickHelper provideInstance(_Awemenotice_apiModule _awemenotice_apimodule) {
        return proxyProvideNotificationClickHelper(_awemenotice_apimodule);
    }

    public static NotificationClickHelper proxyProvideNotificationClickHelper(_Awemenotice_apiModule _awemenotice_apimodule) {
        return (NotificationClickHelper) C52869f.m112471a(_awemenotice_apimodule.provideNotificationClickHelper(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
