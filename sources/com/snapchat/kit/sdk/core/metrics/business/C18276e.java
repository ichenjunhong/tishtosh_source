package com.snapchat.kit.sdk.core.metrics.business;

import com.bytedance.sysoptimizer.BuildConfig;
import com.snapchat.kit.sdk.core.metrics.model.KitType;
import com.snapchat.kit.sdk.core.metrics.model.LoginKitAuthComplete;
import com.snapchat.kit.sdk.core.metrics.model.LoginKitAuthStart;
import com.snapchat.kit.sdk.core.metrics.model.LoginKitEventBase;
import com.snapchat.kit.sdk.core.metrics.model.LoginKitEventBase.Builder;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.metrics.model.ServerEventData;

/* renamed from: com.snapchat.kit.sdk.core.metrics.business.e */
public final class C18276e {

    /* renamed from: a */
    private final KitEventBaseFactory f50469a;

    /* renamed from: b */
    private LoginKitEventBase m44490b() {
        return new Builder().kit_event_base(this.f50469a.createKitEventBase(KitType.LOGIN_KIT, BuildConfig.VERSION_NAME)).build();
    }

    /* renamed from: a */
    public final ServerEvent mo36434a() {
        return m44489a(new ServerEventData.Builder().login_kit_auth_start(new LoginKitAuthStart.Builder().log_kit_event_base(m44490b()).build()).build());
    }

    C18276e(KitEventBaseFactory kitEventBaseFactory) {
        this.f50469a = kitEventBaseFactory;
    }

    /* renamed from: a */
    private static ServerEvent m44489a(ServerEventData serverEventData) {
        return new ServerEvent.Builder().event_data(serverEventData).build();
    }

    /* renamed from: a */
    public final ServerEvent mo36435a(boolean z) {
        return m44489a(new ServerEventData.Builder().login_kit_auth_complete(new LoginKitAuthComplete.Builder().log_kit_event_base(m44490b()).is_success(Boolean.valueOf(z)).build()).build());
    }
}
