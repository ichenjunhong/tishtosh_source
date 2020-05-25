package com.p683ss.android.ugc.aweme.initializer;

import android.content.Context;
import com.p683ss.android.ugc.aweme.services.superentrance.ISuperEntrancePrivacyService;

/* renamed from: com.ss.android.ugc.aweme.initializer.c */
final /* synthetic */ class C35690c implements ISuperEntrancePrivacyService {

    /* renamed from: a */
    static final ISuperEntrancePrivacyService f91647a = new C35690c();

    private C35690c() {
    }

    public final boolean hasPrivacyPermission(Context context) {
        return AVServiceProxyImpl.lambda$superEntrancePrivacyService$1$AVServiceProxyImpl(context);
    }
}
